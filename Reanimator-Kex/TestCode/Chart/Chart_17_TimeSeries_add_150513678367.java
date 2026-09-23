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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_add_150513678367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1758;
     Object term1807;

    public TimeSeries_add_150513678367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1783 = new ArrayList();
        term1758 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1801 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1802 = (Object[]) newArray("java.lang.Object", 0);
        Object term1803 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1804 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1805 = newInstance(Class.forName("java.lang.Object"));
        setField(term1758, term1758.getClass(), "domain", "PkWMRdJcBb");
        setField(term1758, term1758.getClass(), "range", "jSpAteRute");
        setField(term1758, term1758.getClass(), "timePeriodClass", null);
        setField(term1758, term1758.getClass(), "data", term1783);
        setIntField(term1758, term1758.getClass(), "maximumItemCount", 1135664017);
        setLongField(term1758, term1758.getClass(), "maximumItemAge", 8059786003080744426L);
        setField(term1758, term1758.getClass(), "key", null);
        setField(term1758, term1758.getClass(), "description", "swZVeJAxjt");
        setField(term1801, term1801.getClass(), "listenerList", term1802);
        setField(term1758, term1758.getClass(), "listeners", term1801);
        setField(term1804, term1804.getClass(), "map", null);
        setField(term1803, term1803.getClass(), "map", term1804);
        setField(term1803, term1803.getClass(), "source", term1805);
        setField(term1758, term1758.getClass(), "propertyChangeSupport", term1803);
        setBooleanField(term1758, term1758.getClass(), "notify", true);
        term1807 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term1807, term1807.getClass(), "period", null);
        setField(term1807, term1807.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term1807;
        try {
            callMethod(klass, "add", argTypes, term1758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


