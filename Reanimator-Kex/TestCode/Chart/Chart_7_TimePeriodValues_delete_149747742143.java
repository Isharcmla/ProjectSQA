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

public class TimePeriodValues_delete_149747742143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264;
     Object term1317;
     Object term1319;
     Object term6425;

    public TimePeriodValues_delete_149747742143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1289 = new ArrayList();
        term1264 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1311 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1312 = (Object[]) newArray("java.lang.Object", 0);
        Object term1313 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1314 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1315 = newInstance(Class.forName("java.lang.Object"));
        setField(term1264, term1264.getClass(), "domain", "ieCtQFdkii");
        setField(term1264, term1264.getClass(), "range", "dEnhdmILtU");
        setField(term1264, term1264.getClass(), "data", term1289);
        setIntField(term1264, term1264.getClass(), "minStartIndex", -556405712);
        setIntField(term1264, term1264.getClass(), "maxStartIndex", -1772434990);
        setIntField(term1264, term1264.getClass(), "minMiddleIndex", -1845499264);
        setIntField(term1264, term1264.getClass(), "maxMiddleIndex", -505439934);
        setIntField(term1264, term1264.getClass(), "minEndIndex", -344842608);
        setIntField(term1264, term1264.getClass(), "maxEndIndex", 941650513);
        setField(term1264, term1264.getClass(), "key", null);
        setField(term1264, term1264.getClass(), "description", "hoicvmsovO");
        setField(term1311, term1311.getClass(), "listenerList", term1312);
        setField(term1264, term1264.getClass(), "listeners", term1311);
        setField(term1314, term1314.getClass(), "map", null);
        setField(term1313, term1313.getClass(), "map", term1314);
        setField(term1313, term1313.getClass(), "source", term1315);
        setField(term1264, term1264.getClass(), "propertyChangeSupport", term1313);
        setBooleanField(term1264, term1264.getClass(), "notify", false);
        term1317 = new Integer(444029505);
        term1319 = new Integer(-1034506028);
        ArrayList term6430 = new ArrayList();
        term6425 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term6434 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6435 = (Object[]) newArray("java.lang.Object", 0);
        Object term6436 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6437 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6438 = newInstance(Class.forName("java.lang.Object"));
        setField(term6425, term6425.getClass(), "domain", "ieCtQFdkii");
        setField(term6425, term6425.getClass(), "range", "dEnhdmILtU");
        setField(term6425, term6425.getClass(), "data", term6430);
        setIntField(term6425, term6425.getClass(), "minStartIndex", -1);
        setIntField(term6425, term6425.getClass(), "maxStartIndex", -1);
        setIntField(term6425, term6425.getClass(), "minMiddleIndex", -1);
        setIntField(term6425, term6425.getClass(), "maxMiddleIndex", -1);
        setIntField(term6425, term6425.getClass(), "minEndIndex", -1);
        setIntField(term6425, term6425.getClass(), "maxEndIndex", -1);
        setField(term6425, term6425.getClass(), "key", null);
        setField(term6425, term6425.getClass(), "description", "hoicvmsovO");
        setField(term6434, term6434.getClass(), "listenerList", term6435);
        setField(term6425, term6425.getClass(), "listeners", term6434);
        setField(term6437, term6437.getClass(), "map", null);
        setField(term6436, term6436.getClass(), "map", term6437);
        setField(term6436, term6436.getClass(), "source", term6438);
        setField(term6425, term6425.getClass(), "propertyChangeSupport", term6436);
        setBooleanField(term6425, term6425.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1317;
        args[1] = term1319;
        callMethod(klass, "delete", argTypes, term1264, args);
        assertTrue(recursiveEquals(term1264, term6425));
        assertTrue(recursiveEquals(term1317, 444029505));
        assertTrue(recursiveEquals(term1319, -1034506028));
    }

};


