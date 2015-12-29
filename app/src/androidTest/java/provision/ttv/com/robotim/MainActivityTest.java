package provision.ttv.com.robotim;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.robotium.solo.Solo;

import junit.framework.Assert;

/**
 * @author dien.tv
 * @version 1.0 on 12/29/2015.
 * @Copyright (c) 2015 Transcosmos Technologic Arts.
 * @To-Do List.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity activity;

    Solo solo;
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        activity=getActivity();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testName() throws Exception {
        solo.unlockScreen();
        TextView tv = (TextView) solo.getView(R.id.tv);
        String result = tv.getText().toString();
        assertEquals(result, "Hello World!");
    }

    public void testSum(){
        Assert.assertEquals(4, activity.sum(3,1));
    }
}
