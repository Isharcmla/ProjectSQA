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

public class TimePeriodValues_hashCode_876657129135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27842;
     Object term27950;

    public TimePeriodValues_hashCode_876657129135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27932 = new ArrayList();
        term27842 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term27842, term27842.getClass(), "domain", "");
        setField(term27842, term27842.getClass(), "range", null);
        setField(term27842, term27842.getClass(), "data", term27932);
        ArrayList term27953 = new ArrayList();
        term27950 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term27950, term27950.getClass(), "domain", "");
        setField(term27950, term27950.getClass(), "range", null);
        setField(term27950, term27950.getClass(), "data", term27953);
        setIntField(term27950, term27950.getClass(), "minStartIndex", 0);
        setIntField(term27950, term27950.getClass(), "maxStartIndex", 0);
        setIntField(term27950, term27950.getClass(), "minMiddleIndex", 0);
        setIntField(term27950, term27950.getClass(), "maxMiddleIndex", 0);
        setIntField(term27950, term27950.getClass(), "minEndIndex", 0);
        setIntField(term27950, term27950.getClass(), "maxEndIndex", 0);
        setField(term27950, term27950.getClass(), "key", null);
        setField(term27950, term27950.getClass(), "description", null);
        setField(term27950, term27950.getClass(), "listeners", null);
        setField(term27950, term27950.getClass(), "propertyChangeSupport", null);
        setBooleanField(term27950, term27950.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27842, args);
        assertTrue(recursiveEquals(term27842, term27950));
        assertTrue(recursiveEquals(retValue, 594823321));
    }

};


