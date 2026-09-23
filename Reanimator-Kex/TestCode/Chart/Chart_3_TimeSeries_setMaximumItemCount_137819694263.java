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

public class TimeSeries_setMaximumItemCount_137819694263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term656;
     Object term707;
     Object term6389;

    public TimeSeries_setMaximumItemCount_137819694263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term681 = new ArrayList();
        term656 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term701 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term702 = (Object[]) newArray("java.lang.Object", 0);
        Object term703 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term704 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term705 = newInstance(Class.forName("java.lang.Object"));
        setField(term656, term656.getClass(), "domain", "AijpHYOFuy");
        setField(term656, term656.getClass(), "range", "SbAoxhfrkn");
        setField(term656, term656.getClass(), "timePeriodClass", null);
        setField(term656, term656.getClass(), "data", term681);
        setIntField(term656, term656.getClass(), "maximumItemCount", -2038273078);
        setLongField(term656, term656.getClass(), "maximumItemAge", 6811161968424632369L);
        setDoubleField(term656, term656.getClass(), "minY", 0.7031006357544823);
        setDoubleField(term656, term656.getClass(), "maxY", 0.9527281779865117);
        setField(term656, term656.getClass(), "key", null);
        setField(term656, term656.getClass(), "description", "kuTXqwMtDB");
        setField(term701, term701.getClass(), "listenerList", term702);
        setField(term656, term656.getClass(), "listeners", term701);
        setField(term704, term704.getClass(), "map", null);
        setField(term703, term703.getClass(), "map", term704);
        setField(term703, term703.getClass(), "source", term705);
        setField(term656, term656.getClass(), "propertyChangeSupport", term703);
        setBooleanField(term656, term656.getClass(), "notify", true);
        term707 = new Integer(1227103734);
        ArrayList term6394 = new ArrayList();
        term6389 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term6398 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6399 = (Object[]) newArray("java.lang.Object", 0);
        Object term6400 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6401 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6402 = newInstance(Class.forName("java.lang.Object"));
        setField(term6389, term6389.getClass(), "domain", "AijpHYOFuy");
        setField(term6389, term6389.getClass(), "range", "SbAoxhfrkn");
        setField(term6389, term6389.getClass(), "timePeriodClass", null);
        setField(term6389, term6389.getClass(), "data", term6394);
        setIntField(term6389, term6389.getClass(), "maximumItemCount", 1227103734);
        setLongField(term6389, term6389.getClass(), "maximumItemAge", 6811161968424632369L);
        setDoubleField(term6389, term6389.getClass(), "minY", 0.7031006357544823);
        setDoubleField(term6389, term6389.getClass(), "maxY", 0.9527281779865117);
        setField(term6389, term6389.getClass(), "key", null);
        setField(term6389, term6389.getClass(), "description", "kuTXqwMtDB");
        setField(term6398, term6398.getClass(), "listenerList", term6399);
        setField(term6389, term6389.getClass(), "listeners", term6398);
        setField(term6401, term6401.getClass(), "map", null);
        setField(term6400, term6400.getClass(), "map", term6401);
        setField(term6400, term6400.getClass(), "source", term6402);
        setField(term6389, term6389.getClass(), "propertyChangeSupport", term6400);
        setBooleanField(term6389, term6389.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term707;
        callMethod(klass, "setMaximumItemCount", argTypes, term656, args);
        assertTrue(recursiveEquals(term656, term6389));
        assertTrue(recursiveEquals(term707, 1227103734));
    }

};


