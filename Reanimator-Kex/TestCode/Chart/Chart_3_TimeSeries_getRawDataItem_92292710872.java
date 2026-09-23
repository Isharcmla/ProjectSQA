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

public class TimeSeries_getRawDataItem_92292710872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1393;

    public TimeSeries_getRawDataItem_92292710872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1418 = new ArrayList();
        term1393 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1438 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1439 = (Object[]) newArray("java.lang.Object", 0);
        Object term1440 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1441 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1442 = newInstance(Class.forName("java.lang.Object"));
        setField(term1393, term1393.getClass(), "domain", "tPlsykYBqO");
        setField(term1393, term1393.getClass(), "range", "bLPjGVBhlX");
        setField(term1393, term1393.getClass(), "timePeriodClass", null);
        setField(term1393, term1393.getClass(), "data", term1418);
        setIntField(term1393, term1393.getClass(), "maximumItemCount", 1048535127);
        setLongField(term1393, term1393.getClass(), "maximumItemAge", 5127676408959197577L);
        setDoubleField(term1393, term1393.getClass(), "minY", 0.2852810965221698);
        setDoubleField(term1393, term1393.getClass(), "maxY", 0.6300849762307866);
        setField(term1393, term1393.getClass(), "key", null);
        setField(term1393, term1393.getClass(), "description", "whBvTVIIlC");
        setField(term1438, term1438.getClass(), "listenerList", term1439);
        setField(term1393, term1393.getClass(), "listeners", term1438);
        setField(term1441, term1441.getClass(), "map", null);
        setField(term1440, term1440.getClass(), "map", term1441);
        setField(term1440, term1440.getClass(), "source", term1442);
        setField(term1393, term1393.getClass(), "propertyChangeSupport", term1440);
        setBooleanField(term1393, term1393.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRawDataItem", argTypes, term1393, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


