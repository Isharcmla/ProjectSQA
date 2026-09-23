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

public class TimeSeries_getDataItem_170955740070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1229;

    public TimeSeries_getDataItem_170955740070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1254 = new ArrayList();
        term1229 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1274 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1275 = (Object[]) newArray("java.lang.Object", 0);
        Object term1276 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1277 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1278 = newInstance(Class.forName("java.lang.Object"));
        setField(term1229, term1229.getClass(), "domain", "ieCtQFdkii");
        setField(term1229, term1229.getClass(), "range", "dEnhdmILtU");
        setField(term1229, term1229.getClass(), "timePeriodClass", null);
        setField(term1229, term1229.getClass(), "data", term1254);
        setIntField(term1229, term1229.getClass(), "maximumItemCount", -1685132342);
        setLongField(term1229, term1229.getClass(), "maximumItemAge", -872011222785455006L);
        setDoubleField(term1229, term1229.getClass(), "minY", 0.10667076642995188);
        setDoubleField(term1229, term1229.getClass(), "maxY", 0.11493000848982304);
        setField(term1229, term1229.getClass(), "key", null);
        setField(term1229, term1229.getClass(), "description", "hoicvmsovO");
        setField(term1274, term1274.getClass(), "listenerList", term1275);
        setField(term1229, term1229.getClass(), "listeners", term1274);
        setField(term1277, term1277.getClass(), "map", null);
        setField(term1276, term1276.getClass(), "map", term1277);
        setField(term1276, term1276.getClass(), "source", term1278);
        setField(term1229, term1229.getClass(), "propertyChangeSupport", term1276);
        setBooleanField(term1229, term1229.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getDataItem", argTypes, term1229, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


