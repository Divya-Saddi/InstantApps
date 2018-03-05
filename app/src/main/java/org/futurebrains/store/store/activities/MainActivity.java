package org.futurebrains.store.store.activities;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import org.futurebrains.store.store.R;
import org.futurebrains.store.store.fragments.ExploreFragment;
import org.futurebrains.store.store.fragments.HomeFragment;
import org.futurebrains.store.store.utils.BottomNavigationHelper;
import org.futurebrains.store.store.utils.PopulateData;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{   private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView mNavigationView;
    private BottomNavigationView mBottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
        {  Window w = getWindow(); // in Activity's onCreate() for instance
             w.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        super.onCreate(savedInstanceState);
//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
//        ActionBar actionBar = (ActionBar)findViewById(R.id.appbar);
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#330000ff")));
//        actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#550000ff")));

        setContentView(R.layout.activity_main);
        findViewById();

        setSupportActionBar(mToolbar);

        // setting ActionBarDrawerToggle

        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        BottomNavigationHelper.disableShiftMode(mBottomNavigation);

        mBottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mNavigationView.setNavigationItemSelectedListener(this);


    }

    private void findViewById()
    {   mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mBottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
    }


    private void replaceFragment(Fragment fragment)
    {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, fragment);
        ft.commit();
    }

    @Override
    public void onBackPressed()
    {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START))
        {  mDrawerLayout.closeDrawer(GravityCompat.START); }
        else {  super.onBackPressed();  }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener()
    {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            Fragment fragment;
            Bundle bundle = new Bundle();
            PopulateData data = new PopulateData(MainActivity.this);

            switch (item.getItemId())
            {
                case R.id.navigation_home:
                    {   fragment = new HomeFragment();
                        bundle.putParcelableArrayList("appsList", data.getTotalApps());
                        bundle.putParcelableArrayList("topAppsList",data.getTopApps());
                        fragment.setArguments(bundle);
                    }break;
                case R.id.navigation_explore:
                    {  fragment = new ExploreFragment();
                        bundle.putParcelableArrayList("TotalAppsList", data.getTotalApps());
                       fragment.setArguments(bundle);
                    }break;
                default: return false;

            }
            replaceFragment(fragment);
            return true;
        }
    };
}
