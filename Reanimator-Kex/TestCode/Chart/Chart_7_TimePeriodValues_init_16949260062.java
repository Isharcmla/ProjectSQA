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
import java.lang.Object;
import java.util.ArrayList;

public class TimePeriodValues_init_16949260062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9364;
     Object term9581;
     Object term9593;

    public TimePeriodValues_init_16949260062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9318 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        term9364 = newInstance(Class.forName("java.math.BigInteger"));
        ArrayList term9586 = new ArrayList();
        term9581 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term9588 = newInstance(Class.forName("java.math.BigInteger"));
        Object term9589 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9590 = (Object[]) newArray("java.lang.Object", 0);
        Object term9591 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term9592 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term9581, term9581.getClass(), "domain", "Time");
        setField(term9581, term9581.getClass(), "range", "Value");
        setField(term9581, term9581.getClass(), "data", term9586);
        setIntField(term9581, term9581.getClass(), "minStartIndex", -1);
        setIntField(term9581, term9581.getClass(), "maxStartIndex", -1);
        setIntField(term9581, term9581.getClass(), "minMiddleIndex", -1);
        setIntField(term9581, term9581.getClass(), "maxMiddleIndex", -1);
        setIntField(term9581, term9581.getClass(), "minEndIndex", -1);
        setIntField(term9581, term9581.getClass(), "maxEndIndex", -1);
        setIntField(term9588, term9588.getClass(), "signum", 0);
        setField(term9588, term9588.getClass(), "mag", null);
        setIntField(term9588, term9588.getClass(), "bitCountPlusOne", 0);
        setIntField(term9588, term9588.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9588, term9588.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9588, term9588.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9581, term9581.getClass(), "key", term9588);
        setField(term9581, term9581.getClass(), "description", null);
        setField(term9589, term9589.getClass(), "listenerList", term9590);
        setField(term9581, term9581.getClass(), "listeners", term9589);
        setField(term9592, term9592.getClass(), "map", null);
        setField(term9591, term9591.getClass(), "map", term9592);
        setField(term9591, term9591.getClass(), "source", term9581);
        setField(term9581, term9581.getClass(), "propertyChangeSupport", term9591);
        setBooleanField(term9581, term9581.getClass(), "notify", true);
        term9593 = newInstance(Class.forName("java.math.BigInteger"));
        setIntField(term9593, term9593.getClass(), "signum", 0);
        setField(term9593, term9593.getClass(), "mag", null);
        setIntField(term9593, term9593.getClass(), "bitCountPlusOne", 0);
        setIntField(term9593, term9593.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9593, term9593.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9593, term9593.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term9364;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9581));
        assertTrue(recursiveEquals(term9364, term9593));
    }

};


