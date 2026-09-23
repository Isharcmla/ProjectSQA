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
import java.lang.Double;

public class TimeSeries_addOrUpdate_177816134576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2562;
     Object term2611;

    public TimeSeries_addOrUpdate_177816134576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2587 = new ArrayList();
        term2562 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2605 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2606 = (Object[]) newArray("java.lang.Object", 0);
        Object term2607 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2608 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2609 = newInstance(Class.forName("java.lang.Object"));
        setField(term2562, term2562.getClass(), "domain", "xIeFjkHkOe");
        setField(term2562, term2562.getClass(), "range", "SdCKLMIYnX");
        setField(term2562, term2562.getClass(), "timePeriodClass", null);
        setField(term2562, term2562.getClass(), "data", term2587);
        setIntField(term2562, term2562.getClass(), "maximumItemCount", -1530420153);
        setLongField(term2562, term2562.getClass(), "maximumItemAge", 5262507301787091109L);
        setField(term2562, term2562.getClass(), "key", null);
        setField(term2562, term2562.getClass(), "description", "OJJtVNPyKZ");
        setField(term2605, term2605.getClass(), "listenerList", term2606);
        setField(term2562, term2562.getClass(), "listeners", term2605);
        setField(term2608, term2608.getClass(), "map", null);
        setField(term2607, term2607.getClass(), "map", term2608);
        setField(term2607, term2607.getClass(), "source", term2609);
        setField(term2562, term2562.getClass(), "propertyChangeSupport", term2607);
        setBooleanField(term2562, term2562.getClass(), "notify", false);
        term2611 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2611;
        try {
            callMethod(klass, "addOrUpdate", argTypes, term2562, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


