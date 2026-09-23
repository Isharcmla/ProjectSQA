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
import java.lang.Integer;

public class TimeSeries_setMaximumItemCount_137819694254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;
     Object term691;
     Object term5751;

    public TimeSeries_setMaximumItemCount_137819694254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term667 = new ArrayList();
        term642 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term685 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term686 = (Object[]) newArray("java.lang.Object", 0);
        Object term687 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term688 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term689 = newInstance(Class.forName("java.lang.Object"));
        setField(term642, term642.getClass(), "domain", "AijpHYOFuy");
        setField(term642, term642.getClass(), "range", "SbAoxhfrkn");
        setField(term642, term642.getClass(), "timePeriodClass", null);
        setField(term642, term642.getClass(), "data", term667);
        setIntField(term642, term642.getClass(), "maximumItemCount", -2038273078);
        setLongField(term642, term642.getClass(), "maximumItemAge", 6811161968424632369L);
        setField(term642, term642.getClass(), "key", null);
        setField(term642, term642.getClass(), "description", "kuTXqwMtDB");
        setField(term685, term685.getClass(), "listenerList", term686);
        setField(term642, term642.getClass(), "listeners", term685);
        setField(term688, term688.getClass(), "map", null);
        setField(term687, term687.getClass(), "map", term688);
        setField(term687, term687.getClass(), "source", term689);
        setField(term642, term642.getClass(), "propertyChangeSupport", term687);
        setBooleanField(term642, term642.getClass(), "notify", true);
        term691 = new Integer(1227103734);
        ArrayList term5756 = new ArrayList();
        term5751 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5760 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5761 = (Object[]) newArray("java.lang.Object", 0);
        Object term5762 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5763 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5764 = newInstance(Class.forName("java.lang.Object"));
        setField(term5751, term5751.getClass(), "domain", "AijpHYOFuy");
        setField(term5751, term5751.getClass(), "range", "SbAoxhfrkn");
        setField(term5751, term5751.getClass(), "timePeriodClass", null);
        setField(term5751, term5751.getClass(), "data", term5756);
        setIntField(term5751, term5751.getClass(), "maximumItemCount", 1227103734);
        setLongField(term5751, term5751.getClass(), "maximumItemAge", 6811161968424632369L);
        setField(term5751, term5751.getClass(), "key", null);
        setField(term5751, term5751.getClass(), "description", "kuTXqwMtDB");
        setField(term5760, term5760.getClass(), "listenerList", term5761);
        setField(term5751, term5751.getClass(), "listeners", term5760);
        setField(term5763, term5763.getClass(), "map", null);
        setField(term5762, term5762.getClass(), "map", term5763);
        setField(term5762, term5762.getClass(), "source", term5764);
        setField(term5751, term5751.getClass(), "propertyChangeSupport", term5762);
        setBooleanField(term5751, term5751.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term691;
        callMethod(klass, "setMaximumItemCount", argTypes, term642, args);
        assertTrue(recursiveEquals(term642, term5751));
        assertTrue(recursiveEquals(term691, 1227103734));
    }

};


