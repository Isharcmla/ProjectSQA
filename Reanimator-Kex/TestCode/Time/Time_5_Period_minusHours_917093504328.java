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

public class Period_minusHours_917093504328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162404;
     Object term162465;
     Object term162462;

    public Period_minusHours_917093504328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162404 = newInstance(Class.forName("org.joda.time.Period"));
        term162465 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term162465, term162465.getClass(), "iType", null);
        setField(term162465, term162465.getClass(), "iValues", null);
        term162462 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term162462, term162462.getClass(), "iType", null);
        setField(term162462, term162462.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusHours", argTypes, term162404, args);
        assertTrue(recursiveEquals(term162404, term162465));
        assertTrue(recursiveEquals(retValue, term162462));
    }

};


