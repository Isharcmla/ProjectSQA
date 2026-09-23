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

public class TimeSeries_createCopy_1994343888100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3867;

    public TimeSeries_createCopy_1994343888100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3892 = new ArrayList();
        term3867 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3912 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3913 = (Object[]) newArray("java.lang.Object", 0);
        Object term3914 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3915 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3916 = newInstance(Class.forName("java.lang.Object"));
        setField(term3867, term3867.getClass(), "domain", "kNqaJKIATy");
        setField(term3867, term3867.getClass(), "range", "vKQukfbJUd");
        setField(term3867, term3867.getClass(), "timePeriodClass", null);
        setField(term3867, term3867.getClass(), "data", term3892);
        setIntField(term3867, term3867.getClass(), "maximumItemCount", 493620644);
        setLongField(term3867, term3867.getClass(), "maximumItemAge", -4443169559037975007L);
        setDoubleField(term3867, term3867.getClass(), "minY", 0.39286935532362843);
        setDoubleField(term3867, term3867.getClass(), "maxY", 0.11577948268926874);
        setField(term3867, term3867.getClass(), "key", null);
        setField(term3867, term3867.getClass(), "description", "lFRJFUMVbx");
        setField(term3912, term3912.getClass(), "listenerList", term3913);
        setField(term3867, term3867.getClass(), "listeners", term3912);
        setField(term3915, term3915.getClass(), "map", null);
        setField(term3914, term3914.getClass(), "map", term3915);
        setField(term3914, term3914.getClass(), "source", term3916);
        setField(term3867, term3867.getClass(), "propertyChangeSupport", term3914);
        setBooleanField(term3867, term3867.getClass(), "notify", false);
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
            callMethod(klass, "createCopy", argTypes, term3867, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


