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

public class TimeSeries_hashCode_385992267102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4030;

    public TimeSeries_hashCode_385992267102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4055 = new ArrayList();
        term4030 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4075 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4076 = (Object[]) newArray("java.lang.Object", 0);
        Object term4077 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4078 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4079 = newInstance(Class.forName("java.lang.Object"));
        setField(term4030, term4030.getClass(), "domain", "wzsPSPcRdj");
        setField(term4030, term4030.getClass(), "range", "kGMQdqJYyB");
        setField(term4030, term4030.getClass(), "timePeriodClass", null);
        setField(term4030, term4030.getClass(), "data", term4055);
        setIntField(term4030, term4030.getClass(), "maximumItemCount", 1596070772);
        setLongField(term4030, term4030.getClass(), "maximumItemAge", -5788180182343976541L);
        setDoubleField(term4030, term4030.getClass(), "minY", 0.268304014379393);
        setDoubleField(term4030, term4030.getClass(), "maxY", 0.7171972879282721);
        setField(term4030, term4030.getClass(), "key", null);
        setField(term4030, term4030.getClass(), "description", "XJJNClzHRf");
        setField(term4075, term4075.getClass(), "listenerList", term4076);
        setField(term4030, term4030.getClass(), "listeners", term4075);
        setField(term4078, term4078.getClass(), "map", null);
        setField(term4077, term4077.getClass(), "map", term4078);
        setField(term4077, term4077.getClass(), "source", term4079);
        setField(term4030, term4030.getClass(), "propertyChangeSupport", term4077);
        setBooleanField(term4030, term4030.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term4030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


