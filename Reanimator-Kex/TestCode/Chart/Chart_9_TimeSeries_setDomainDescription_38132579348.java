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

public class TimeSeries_setDomainDescription_38132579348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term4910;

    public TimeSeries_setDomainDescription_38132579348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term149 = new ArrayList();
        term124 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term167 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term168 = (Object[]) newArray("java.lang.Object", 0);
        Object term169 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term170 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term171 = newInstance(Class.forName("java.lang.Object"));
        setField(term124, term124.getClass(), "domain", "SzjVpOQTyS");
        setField(term124, term124.getClass(), "range", "MjGYSRKTNF");
        setField(term124, term124.getClass(), "timePeriodClass", null);
        setField(term124, term124.getClass(), "data", term149);
        setIntField(term124, term124.getClass(), "maximumItemCount", 1162663216);
        setLongField(term124, term124.getClass(), "maximumItemAge", 6375119433582206027L);
        setField(term124, term124.getClass(), "key", null);
        setField(term124, term124.getClass(), "description", "hRNSzYYIrc");
        setField(term167, term167.getClass(), "listenerList", term168);
        setField(term124, term124.getClass(), "listeners", term167);
        setField(term170, term170.getClass(), "map", null);
        setField(term169, term169.getClass(), "map", term170);
        setField(term169, term169.getClass(), "source", term171);
        setField(term124, term124.getClass(), "propertyChangeSupport", term169);
        setBooleanField(term124, term124.getClass(), "notify", false);
        ArrayList term4915 = new ArrayList();
        term4910 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4919 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4920 = (Object[]) newArray("java.lang.Object", 0);
        Object term4921 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4922 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4923 = newInstance(Class.forName("java.lang.Object"));
        setField(term4910, term4910.getClass(), "domain", "NRdvgJlhkX");
        setField(term4910, term4910.getClass(), "range", "MjGYSRKTNF");
        setField(term4910, term4910.getClass(), "timePeriodClass", null);
        setField(term4910, term4910.getClass(), "data", term4915);
        setIntField(term4910, term4910.getClass(), "maximumItemCount", 1162663216);
        setLongField(term4910, term4910.getClass(), "maximumItemAge", 6375119433582206027L);
        setField(term4910, term4910.getClass(), "key", null);
        setField(term4910, term4910.getClass(), "description", "hRNSzYYIrc");
        setField(term4919, term4919.getClass(), "listenerList", term4920);
        setField(term4910, term4910.getClass(), "listeners", term4919);
        setField(term4922, term4922.getClass(), "map", null);
        setField(term4921, term4921.getClass(), "map", term4922);
        setField(term4921, term4921.getClass(), "source", term4923);
        setField(term4910, term4910.getClass(), "propertyChangeSupport", term4921);
        setBooleanField(term4910, term4910.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setDomainDescription", argTypes, term124, args);
        assertTrue(recursiveEquals(term124, term4910));
    }

};


