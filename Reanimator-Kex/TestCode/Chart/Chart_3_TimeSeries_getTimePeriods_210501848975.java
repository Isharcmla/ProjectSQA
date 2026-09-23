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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_getTimePeriods_210501848975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1638;
     Object term9342;
     Object term9338;

    public TimeSeries_getTimePeriods_210501848975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1663 = new ArrayList();
        term1638 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1683 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1684 = (Object[]) newArray("java.lang.Object", 0);
        Object term1685 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1686 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1687 = newInstance(Class.forName("java.lang.Object"));
        setField(term1638, term1638.getClass(), "domain", "idgaQsnJpQ");
        setField(term1638, term1638.getClass(), "range", "VgZnGoIFwQ");
        setField(term1638, term1638.getClass(), "timePeriodClass", null);
        setField(term1638, term1638.getClass(), "data", term1663);
        setIntField(term1638, term1638.getClass(), "maximumItemCount", -117576464);
        setLongField(term1638, term1638.getClass(), "maximumItemAge", 8428634514691209827L);
        setDoubleField(term1638, term1638.getClass(), "minY", 0.5279279537140873);
        setDoubleField(term1638, term1638.getClass(), "maxY", 0.3202192021706908);
        setField(term1638, term1638.getClass(), "key", null);
        setField(term1638, term1638.getClass(), "description", "jUbSRrkrYZ");
        setField(term1683, term1683.getClass(), "listenerList", term1684);
        setField(term1638, term1638.getClass(), "listeners", term1683);
        setField(term1686, term1686.getClass(), "map", null);
        setField(term1685, term1685.getClass(), "map", term1686);
        setField(term1685, term1685.getClass(), "source", term1687);
        setField(term1638, term1638.getClass(), "propertyChangeSupport", term1685);
        setBooleanField(term1638, term1638.getClass(), "notify", false);
        ArrayList term9347 = new ArrayList();
        term9342 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term9351 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9352 = (Object[]) newArray("java.lang.Object", 0);
        Object term9353 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term9354 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term9355 = newInstance(Class.forName("java.lang.Object"));
        setField(term9342, term9342.getClass(), "domain", "idgaQsnJpQ");
        setField(term9342, term9342.getClass(), "range", "VgZnGoIFwQ");
        setField(term9342, term9342.getClass(), "timePeriodClass", null);
        setField(term9342, term9342.getClass(), "data", term9347);
        setIntField(term9342, term9342.getClass(), "maximumItemCount", -117576464);
        setLongField(term9342, term9342.getClass(), "maximumItemAge", 8428634514691209827L);
        setDoubleField(term9342, term9342.getClass(), "minY", 0.5279279537140873);
        setDoubleField(term9342, term9342.getClass(), "maxY", 0.3202192021706908);
        setField(term9342, term9342.getClass(), "key", null);
        setField(term9342, term9342.getClass(), "description", "jUbSRrkrYZ");
        setField(term9351, term9351.getClass(), "listenerList", term9352);
        setField(term9342, term9342.getClass(), "listeners", term9351);
        setField(term9354, term9354.getClass(), "map", null);
        setField(term9353, term9353.getClass(), "map", term9354);
        setField(term9353, term9353.getClass(), "source", term9355);
        setField(term9342, term9342.getClass(), "propertyChangeSupport", term9353);
        setBooleanField(term9342, term9342.getClass(), "notify", false);
        term9338 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTimePeriods", argTypes, term1638, args);
        assertTrue(recursiveEquals(term1638, term9342));
        assertTrue(recursiveEquals(retValue, term9338));
    }

};


