package org.jfree.data.time;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_createCopy_199434388885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3289;

    public TimeSeries_createCopy_199434388885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3314 = new ArrayList();
        term3289 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3332 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3333 = (Object[]) newArray("java.lang.Object", 0);
        Object term3334 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3335 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3336 = newInstance(Class.forName("java.lang.Object"));
        setField(term3289, term3289.getClass(), "domain", "WzFopsaDuG");
        setField(term3289, term3289.getClass(), "range", "PapWxkhEWe");
        setField(term3289, term3289.getClass(), "timePeriodClass", null);
        setField(term3289, term3289.getClass(), "data", term3314);
        setIntField(term3289, term3289.getClass(), "maximumItemCount", -14890619);
        setLongField(term3289, term3289.getClass(), "maximumItemAge", -6292278961887936280L);
        setField(term3289, term3289.getClass(), "key", null);
        setField(term3289, term3289.getClass(), "description", "smnHEqRFRx");
        setField(term3332, term3332.getClass(), "listenerList", term3333);
        setField(term3289, term3289.getClass(), "listeners", term3332);
        setField(term3335, term3335.getClass(), "map", null);
        setField(term3334, term3334.getClass(), "map", term3335);
        setField(term3334, term3334.getClass(), "source", term3336);
        setField(term3289, term3289.getClass(), "propertyChangeSupport", term3334);
        setBooleanField(term3289, term3289.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createCopy", argTypes, term3289, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


