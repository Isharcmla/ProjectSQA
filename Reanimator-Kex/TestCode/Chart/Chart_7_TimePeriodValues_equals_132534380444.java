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

public class TimePeriodValues_equals_132534380444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1351;
     Object term1404;
     Object term6556;
     Object term6570;

    public TimePeriodValues_equals_132534380444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1376 = new ArrayList();
        term1351 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1398 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1399 = (Object[]) newArray("java.lang.Object", 0);
        Object term1400 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1401 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1402 = newInstance(Class.forName("java.lang.Object"));
        setField(term1351, term1351.getClass(), "domain", "fhkbdRViHi");
        setField(term1351, term1351.getClass(), "range", "uWHnvSvaPl");
        setField(term1351, term1351.getClass(), "data", term1376);
        setIntField(term1351, term1351.getClass(), "minStartIndex", -1263114719);
        setIntField(term1351, term1351.getClass(), "maxStartIndex", -894662986);
        setIntField(term1351, term1351.getClass(), "minMiddleIndex", 304775596);
        setIntField(term1351, term1351.getClass(), "maxMiddleIndex", -1347665717);
        setIntField(term1351, term1351.getClass(), "minEndIndex", -1888585309);
        setIntField(term1351, term1351.getClass(), "maxEndIndex", 683666002);
        setField(term1351, term1351.getClass(), "key", null);
        setField(term1351, term1351.getClass(), "description", "kBdSllIBVz");
        setField(term1398, term1398.getClass(), "listenerList", term1399);
        setField(term1351, term1351.getClass(), "listeners", term1398);
        setField(term1401, term1401.getClass(), "map", null);
        setField(term1400, term1400.getClass(), "map", term1401);
        setField(term1400, term1400.getClass(), "source", term1402);
        setField(term1351, term1351.getClass(), "propertyChangeSupport", term1400);
        setBooleanField(term1351, term1351.getClass(), "notify", false);
        term1404 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term6561 = new ArrayList();
        term6556 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term6565 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6566 = (Object[]) newArray("java.lang.Object", 0);
        Object term6567 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6568 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6569 = newInstance(Class.forName("java.lang.Object"));
        setField(term6556, term6556.getClass(), "domain", "fhkbdRViHi");
        setField(term6556, term6556.getClass(), "range", "uWHnvSvaPl");
        setField(term6556, term6556.getClass(), "data", term6561);
        setIntField(term6556, term6556.getClass(), "minStartIndex", -1263114719);
        setIntField(term6556, term6556.getClass(), "maxStartIndex", -894662986);
        setIntField(term6556, term6556.getClass(), "minMiddleIndex", 304775596);
        setIntField(term6556, term6556.getClass(), "maxMiddleIndex", -1347665717);
        setIntField(term6556, term6556.getClass(), "minEndIndex", -1888585309);
        setIntField(term6556, term6556.getClass(), "maxEndIndex", 683666002);
        setField(term6556, term6556.getClass(), "key", null);
        setField(term6556, term6556.getClass(), "description", "kBdSllIBVz");
        setField(term6565, term6565.getClass(), "listenerList", term6566);
        setField(term6556, term6556.getClass(), "listeners", term6565);
        setField(term6568, term6568.getClass(), "map", null);
        setField(term6567, term6567.getClass(), "map", term6568);
        setField(term6567, term6567.getClass(), "source", term6569);
        setField(term6556, term6556.getClass(), "propertyChangeSupport", term6567);
        setBooleanField(term6556, term6556.getClass(), "notify", false);
        term6570 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1404;
        Object retValue = callMethod(klass, "equals", argTypes, term1351, args);
        assertTrue(recursiveEquals(term1351, term6556));
        assertTrue(recursiveEquals(term1404, term6570));
        assertTrue(recursiveEquals(retValue, false));
    }

};


