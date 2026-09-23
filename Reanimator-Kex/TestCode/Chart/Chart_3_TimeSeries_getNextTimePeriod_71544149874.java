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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_getNextTimePeriod_71544149874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1557;

    public TimeSeries_getNextTimePeriod_71544149874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1582 = new ArrayList();
        term1557 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1602 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1603 = (Object[]) newArray("java.lang.Object", 0);
        Object term1604 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1605 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1606 = newInstance(Class.forName("java.lang.Object"));
        setField(term1557, term1557.getClass(), "domain", "oVgzLbrsFr");
        setField(term1557, term1557.getClass(), "range", "vQVyKLdtaz");
        setField(term1557, term1557.getClass(), "timePeriodClass", null);
        setField(term1557, term1557.getClass(), "data", term1582);
        setIntField(term1557, term1557.getClass(), "maximumItemCount", -2068769794);
        setLongField(term1557, term1557.getClass(), "maximumItemAge", -4920224193275732920L);
        setDoubleField(term1557, term1557.getClass(), "minY", 0.3587267442738795);
        setDoubleField(term1557, term1557.getClass(), "maxY", 0.07802449704920456);
        setField(term1557, term1557.getClass(), "key", null);
        setField(term1557, term1557.getClass(), "description", "OWKQODBLzb");
        setField(term1602, term1602.getClass(), "listenerList", term1603);
        setField(term1557, term1557.getClass(), "listeners", term1602);
        setField(term1605, term1605.getClass(), "map", null);
        setField(term1604, term1604.getClass(), "map", term1605);
        setField(term1604, term1604.getClass(), "source", term1606);
        setField(term1557, term1557.getClass(), "propertyChangeSupport", term1604);
        setBooleanField(term1557, term1557.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextTimePeriod", argTypes, term1557, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


