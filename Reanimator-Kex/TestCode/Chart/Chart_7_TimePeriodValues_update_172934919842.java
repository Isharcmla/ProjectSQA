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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimePeriodValues_update_172934919842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;
     Object term1232;

    public TimePeriodValues_update_172934919842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1204 = new ArrayList();
        term1179 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1226 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1227 = (Object[]) newArray("java.lang.Object", 0);
        Object term1228 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1229 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1230 = newInstance(Class.forName("java.lang.Object"));
        setField(term1179, term1179.getClass(), "domain", "ffYhPOzlUs");
        setField(term1179, term1179.getClass(), "range", "MLqYREekMl");
        setField(term1179, term1179.getClass(), "data", term1204);
        setIntField(term1179, term1179.getClass(), "minStartIndex", -481533957);
        setIntField(term1179, term1179.getClass(), "maxStartIndex", 1240914516);
        setIntField(term1179, term1179.getClass(), "minMiddleIndex", -1465035361);
        setIntField(term1179, term1179.getClass(), "maxMiddleIndex", 1090617576);
        setIntField(term1179, term1179.getClass(), "minEndIndex", -1547384488);
        setIntField(term1179, term1179.getClass(), "maxEndIndex", 1442160736);
        setField(term1179, term1179.getClass(), "key", null);
        setField(term1179, term1179.getClass(), "description", "ytSBIKXogI");
        setField(term1226, term1226.getClass(), "listenerList", term1227);
        setField(term1179, term1179.getClass(), "listeners", term1226);
        setField(term1229, term1229.getClass(), "map", null);
        setField(term1228, term1228.getClass(), "map", term1229);
        setField(term1228, term1228.getClass(), "source", term1230);
        setField(term1179, term1179.getClass(), "propertyChangeSupport", term1228);
        setBooleanField(term1179, term1179.getClass(), "notify", true);
        term1232 = new Integer(1114000454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term1232;
        args[1] = null;
        try {
            callMethod(klass, "update", argTypes, term1179, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


