package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class Period_minusWeeks_1043470448330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162459;
     Object term162668;
     Object term162665;

    public Period_minusWeeks_1043470448330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162459 = newInstance(Class.forName("org.joda.time.Period"));
        term162668 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term162668, term162668.getClass(), "iType", null);
        setField(term162668, term162668.getClass(), "iValues", null);
        term162665 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term162665, term162665.getClass(), "iType", null);
        setField(term162665, term162665.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusWeeks", argTypes, term162459, args);
        assertTrue(recursiveEquals(term162459, term162668));
        assertTrue(recursiveEquals(retValue, term162665));
    }

};


