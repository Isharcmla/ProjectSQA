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

public class TimeSeries_delete_98918037081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2965;

    public TimeSeries_delete_98918037081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2990 = new ArrayList();
        term2965 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3008 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3009 = (Object[]) newArray("java.lang.Object", 0);
        Object term3010 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3011 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3012 = newInstance(Class.forName("java.lang.Object"));
        setField(term2965, term2965.getClass(), "domain", "WHcwFgsGFC");
        setField(term2965, term2965.getClass(), "range", "HzqpegHiRq");
        setField(term2965, term2965.getClass(), "timePeriodClass", null);
        setField(term2965, term2965.getClass(), "data", term2990);
        setIntField(term2965, term2965.getClass(), "maximumItemCount", 767834723);
        setLongField(term2965, term2965.getClass(), "maximumItemAge", -8708192233349544946L);
        setField(term2965, term2965.getClass(), "key", null);
        setField(term2965, term2965.getClass(), "description", "jwsfVjMoJT");
        setField(term3008, term3008.getClass(), "listenerList", term3009);
        setField(term2965, term2965.getClass(), "listeners", term3008);
        setField(term3011, term3011.getClass(), "map", null);
        setField(term3010, term3010.getClass(), "map", term3011);
        setField(term3010, term3010.getClass(), "source", term3012);
        setField(term2965, term2965.getClass(), "propertyChangeSupport", term3010);
        setBooleanField(term2965, term2965.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "delete", argTypes, term2965, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


