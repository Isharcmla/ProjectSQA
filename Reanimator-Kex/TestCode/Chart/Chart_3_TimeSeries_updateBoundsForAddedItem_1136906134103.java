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

public class TimeSeries_updateBoundsForAddedItem_1136906134103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4111;
     Object term4162;
     Object term17199;
     Object term17213;

    public TimeSeries_updateBoundsForAddedItem_1136906134103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4136 = new ArrayList();
        term4111 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term4156 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4157 = (Object[]) newArray("java.lang.Object", 0);
        Object term4158 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term4159 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4160 = newInstance(Class.forName("java.lang.Object"));
        setField(term4111, term4111.getClass(), "domain", "iikZEapDlu");
        setField(term4111, term4111.getClass(), "range", "nhoHrZfnIN");
        setField(term4111, term4111.getClass(), "timePeriodClass", null);
        setField(term4111, term4111.getClass(), "data", term4136);
        setIntField(term4111, term4111.getClass(), "maximumItemCount", 97029295);
        setLongField(term4111, term4111.getClass(), "maximumItemAge", 2936323121573284007L);
        setDoubleField(term4111, term4111.getClass(), "minY", 0.9006361024877096);
        setDoubleField(term4111, term4111.getClass(), "maxY", 0.5644914462415626);
        setField(term4111, term4111.getClass(), "key", null);
        setField(term4111, term4111.getClass(), "description", "ZkMALXpEAZ");
        setField(term4156, term4156.getClass(), "listenerList", term4157);
        setField(term4111, term4111.getClass(), "listeners", term4156);
        setField(term4159, term4159.getClass(), "map", null);
        setField(term4158, term4158.getClass(), "map", term4159);
        setField(term4158, term4158.getClass(), "source", term4160);
        setField(term4111, term4111.getClass(), "propertyChangeSupport", term4158);
        setBooleanField(term4111, term4111.getClass(), "notify", false);
        term4162 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term4162, term4162.getClass(), "period", null);
        setField(term4162, term4162.getClass(), "value", null);
        setBooleanField(term4162, term4162.getClass(), "selected", false);
        ArrayList term17204 = new ArrayList();
        term17199 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term17208 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term17209 = (Object[]) newArray("java.lang.Object", 0);
        Object term17210 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term17211 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term17212 = newInstance(Class.forName("java.lang.Object"));
        setField(term17199, term17199.getClass(), "domain", "iikZEapDlu");
        setField(term17199, term17199.getClass(), "range", "nhoHrZfnIN");
        setField(term17199, term17199.getClass(), "timePeriodClass", null);
        setField(term17199, term17199.getClass(), "data", term17204);
        setIntField(term17199, term17199.getClass(), "maximumItemCount", 97029295);
        setLongField(term17199, term17199.getClass(), "maximumItemAge", 2936323121573284007L);
        setDoubleField(term17199, term17199.getClass(), "minY", 0.9006361024877096);
        setDoubleField(term17199, term17199.getClass(), "maxY", 0.5644914462415626);
        setField(term17199, term17199.getClass(), "key", null);
        setField(term17199, term17199.getClass(), "description", "ZkMALXpEAZ");
        setField(term17208, term17208.getClass(), "listenerList", term17209);
        setField(term17199, term17199.getClass(), "listeners", term17208);
        setField(term17211, term17211.getClass(), "map", null);
        setField(term17210, term17210.getClass(), "map", term17211);
        setField(term17210, term17210.getClass(), "source", term17212);
        setField(term17199, term17199.getClass(), "propertyChangeSupport", term17210);
        setBooleanField(term17199, term17199.getClass(), "notify", false);
        term17213 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term17213, term17213.getClass(), "period", null);
        setField(term17213, term17213.getClass(), "value", null);
        setBooleanField(term17213, term17213.getClass(), "selected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        Object[] args = new Object[1];
        args[0] = term4162;
        callMethod(klass, "updateBoundsForAddedItem", argTypes, term4111, args);
        assertTrue(recursiveEquals(term4111, term17199));
        assertTrue(recursiveEquals(term4162, term17213));
    }

};


