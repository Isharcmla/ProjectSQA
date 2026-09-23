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

public class TimeSeries_addOrUpdate_33781815590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3035;

    public TimeSeries_addOrUpdate_33781815590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3060 = new ArrayList();
        term3035 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3080 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3081 = (Object[]) newArray("java.lang.Object", 0);
        Object term3082 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3083 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3084 = newInstance(Class.forName("java.lang.Object"));
        setField(term3035, term3035.getClass(), "domain", "WHcwFgsGFC");
        setField(term3035, term3035.getClass(), "range", "HzqpegHiRq");
        setField(term3035, term3035.getClass(), "timePeriodClass", null);
        setField(term3035, term3035.getClass(), "data", term3060);
        setIntField(term3035, term3035.getClass(), "maximumItemCount", -602026508);
        setLongField(term3035, term3035.getClass(), "maximumItemAge", 1439298019805881866L);
        setDoubleField(term3035, term3035.getClass(), "minY", 0.6047137830113202);
        setDoubleField(term3035, term3035.getClass(), "maxY", 0.6767213143579776);
        setField(term3035, term3035.getClass(), "key", null);
        setField(term3035, term3035.getClass(), "description", "jwsfVjMoJT");
        setField(term3080, term3080.getClass(), "listenerList", term3081);
        setField(term3035, term3035.getClass(), "listeners", term3080);
        setField(term3083, term3083.getClass(), "map", null);
        setField(term3082, term3082.getClass(), "map", term3083);
        setField(term3082, term3082.getClass(), "source", term3084);
        setField(term3035, term3035.getClass(), "propertyChangeSupport", term3082);
        setBooleanField(term3035, term3035.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "addOrUpdate", argTypes, term3035, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


