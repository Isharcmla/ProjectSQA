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

public class TimePeriodValues_getRangeDescription_152130154431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object term3359;

    public TimePeriodValues_getRangeDescription_152130154431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term258 = new ArrayList();
        term233 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term280 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term281 = (Object[]) newArray("java.lang.Object", 0);
        Object term282 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term283 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term284 = newInstance(Class.forName("java.lang.Object"));
        setField(term233, term233.getClass(), "domain", "uuaPigETmJ");
        setField(term233, term233.getClass(), "range", "MxlszYVzRf");
        setField(term233, term233.getClass(), "data", term258);
        setIntField(term233, term233.getClass(), "minStartIndex", 1134449235);
        setIntField(term233, term233.getClass(), "maxStartIndex", -883034806);
        setIntField(term233, term233.getClass(), "minMiddleIndex", 1585847225);
        setIntField(term233, term233.getClass(), "maxMiddleIndex", 597278769);
        setIntField(term233, term233.getClass(), "minEndIndex", -1685132342);
        setIntField(term233, term233.getClass(), "maxEndIndex", -1456670397);
        setField(term233, term233.getClass(), "key", null);
        setField(term233, term233.getClass(), "description", "LQFpaHEwXR");
        setField(term280, term280.getClass(), "listenerList", term281);
        setField(term233, term233.getClass(), "listeners", term280);
        setField(term283, term283.getClass(), "map", null);
        setField(term282, term282.getClass(), "map", term283);
        setField(term282, term282.getClass(), "source", term284);
        setField(term233, term233.getClass(), "propertyChangeSupport", term282);
        setBooleanField(term233, term233.getClass(), "notify", false);
        ArrayList term3364 = new ArrayList();
        term3359 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term3368 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3369 = (Object[]) newArray("java.lang.Object", 0);
        Object term3370 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3371 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3372 = newInstance(Class.forName("java.lang.Object"));
        setField(term3359, term3359.getClass(), "domain", "uuaPigETmJ");
        setField(term3359, term3359.getClass(), "range", "MxlszYVzRf");
        setField(term3359, term3359.getClass(), "data", term3364);
        setIntField(term3359, term3359.getClass(), "minStartIndex", 1134449235);
        setIntField(term3359, term3359.getClass(), "maxStartIndex", -883034806);
        setIntField(term3359, term3359.getClass(), "minMiddleIndex", 1585847225);
        setIntField(term3359, term3359.getClass(), "maxMiddleIndex", 597278769);
        setIntField(term3359, term3359.getClass(), "minEndIndex", -1685132342);
        setIntField(term3359, term3359.getClass(), "maxEndIndex", -1456670397);
        setField(term3359, term3359.getClass(), "key", null);
        setField(term3359, term3359.getClass(), "description", "LQFpaHEwXR");
        setField(term3368, term3368.getClass(), "listenerList", term3369);
        setField(term3359, term3359.getClass(), "listeners", term3368);
        setField(term3371, term3371.getClass(), "map", null);
        setField(term3370, term3370.getClass(), "map", term3371);
        setField(term3370, term3370.getClass(), "source", term3372);
        setField(term3359, term3359.getClass(), "propertyChangeSupport", term3370);
        setBooleanField(term3359, term3359.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRangeDescription", argTypes, term233, args);
        assertTrue(recursiveEquals(term233, term3359));
        assertTrue(recursiveEquals(retValue, "MxlszYVzRf"));
    }

};


