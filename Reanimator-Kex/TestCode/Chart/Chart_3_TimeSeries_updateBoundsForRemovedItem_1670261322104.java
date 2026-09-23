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

public class TimeSeries_updateBoundsForRemovedItem_1670261322104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4194;
     Object term4245;
     Object term17328;
     Object term17342;

    public TimeSeries_updateBoundsForRemovedItem_1670261322104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4219 = new ArrayList();
        term4194 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4239 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4240 = (Object[]) newArray("java.lang.Object", 0);
        Object term4241 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4242 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4243 = newInstance(Class.forName("java.lang.Object"));
        setField(term4194, term4194.getClass(), "domain", "BjugTaMcxJ");
        setField(term4194, term4194.getClass(), "range", "vGiuZVPJNH");
        setField(term4194, term4194.getClass(), "timePeriodClass", null);
        setField(term4194, term4194.getClass(), "data", term4219);
        setIntField(term4194, term4194.getClass(), "maximumItemCount", -1371869594);
        setLongField(term4194, term4194.getClass(), "maximumItemAge", -1154553077993834885L);
        setDoubleField(term4194, term4194.getClass(), "minY", 0.509895859167191);
        setDoubleField(term4194, term4194.getClass(), "maxY", 0.07417792024383196);
        setField(term4194, term4194.getClass(), "key", null);
        setField(term4194, term4194.getClass(), "description", "tlzpzIjMib");
        setField(term4239, term4239.getClass(), "listenerList", term4240);
        setField(term4194, term4194.getClass(), "listeners", term4239);
        setField(term4242, term4242.getClass(), "map", null);
        setField(term4241, term4241.getClass(), "map", term4242);
        setField(term4241, term4241.getClass(), "source", term4243);
        setField(term4194, term4194.getClass(), "propertyChangeSupport", term4241);
        setBooleanField(term4194, term4194.getClass(), "notify", false);
        term4245 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term4245, term4245.getClass(), "period", null);
        setField(term4245, term4245.getClass(), "value", null);
        setBooleanField(term4245, term4245.getClass(), "selected", false);
        ArrayList term17333 = new ArrayList();
        term17328 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term17337 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term17338 = (Object[]) newArray("java.lang.Object", 0);
        Object term17339 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term17340 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term17341 = newInstance(Class.forName("java.lang.Object"));
        setField(term17328, term17328.getClass(), "domain", "BjugTaMcxJ");
        setField(term17328, term17328.getClass(), "range", "vGiuZVPJNH");
        setField(term17328, term17328.getClass(), "timePeriodClass", null);
        setField(term17328, term17328.getClass(), "data", term17333);
        setIntField(term17328, term17328.getClass(), "maximumItemCount", -1371869594);
        setLongField(term17328, term17328.getClass(), "maximumItemAge", -1154553077993834885L);
        setDoubleField(term17328, term17328.getClass(), "minY", 0.509895859167191);
        setDoubleField(term17328, term17328.getClass(), "maxY", 0.07417792024383196);
        setField(term17328, term17328.getClass(), "key", null);
        setField(term17328, term17328.getClass(), "description", "tlzpzIjMib");
        setField(term17337, term17337.getClass(), "listenerList", term17338);
        setField(term17328, term17328.getClass(), "listeners", term17337);
        setField(term17340, term17340.getClass(), "map", null);
        setField(term17339, term17339.getClass(), "map", term17340);
        setField(term17339, term17339.getClass(), "source", term17341);
        setField(term17328, term17328.getClass(), "propertyChangeSupport", term17339);
        setBooleanField(term17328, term17328.getClass(), "notify", false);
        term17342 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term17342, term17342.getClass(), "period", null);
        setField(term17342, term17342.getClass(), "value", null);
        setBooleanField(term17342, term17342.getClass(), "selected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term4245;
        callMethod(klass, "updateBoundsForRemovedItem", argTypes, term4194, args);
        assertTrue(recursiveEquals(term4194, term17328));
        assertTrue(recursiveEquals(term4245, term17342));
    }

};


