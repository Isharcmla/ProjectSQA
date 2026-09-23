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

public class TimeSeries_getIndex_114897265764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519;

    public TimeSeries_getIndex_114897265764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1544 = new ArrayList();
        term1519 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1562 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1563 = (Object[]) newArray("java.lang.Object", 0);
        Object term1564 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1565 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1566 = newInstance(Class.forName("java.lang.Object"));
        setField(term1519, term1519.getClass(), "domain", "oVgzLbrsFr");
        setField(term1519, term1519.getClass(), "range", "vQVyKLdtaz");
        setField(term1519, term1519.getClass(), "timePeriodClass", null);
        setField(term1519, term1519.getClass(), "data", term1544);
        setIntField(term1519, term1519.getClass(), "maximumItemCount", -6029667);
        setLongField(term1519, term1519.getClass(), "maximumItemAge", -4920224193275732920L);
        setField(term1519, term1519.getClass(), "key", null);
        setField(term1519, term1519.getClass(), "description", "OWKQODBLzb");
        setField(term1562, term1562.getClass(), "listenerList", term1563);
        setField(term1519, term1519.getClass(), "listeners", term1562);
        setField(term1565, term1565.getClass(), "map", null);
        setField(term1564, term1564.getClass(), "map", term1565);
        setField(term1564, term1564.getClass(), "source", term1566);
        setField(term1519, term1519.getClass(), "propertyChangeSupport", term1564);
        setBooleanField(term1519, term1519.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getIndex", argTypes, term1519, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


