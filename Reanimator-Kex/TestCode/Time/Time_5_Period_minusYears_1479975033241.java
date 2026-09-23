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

public class Period_minusYears_1479975033241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118002;
     Object term118008;
     Object term118005;

    public Period_minusYears_1479975033241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118002 = newInstance(Class.forName("org.joda.time.Period"));
        term118008 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term118008, term118008.getClass(), "iType", null);
        setField(term118008, term118008.getClass(), "iValues", null);
        term118005 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term118005, term118005.getClass(), "iType", null);
        setField(term118005, term118005.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusYears", argTypes, term118002, args);
        assertTrue(recursiveEquals(term118002, term118008));
        assertTrue(recursiveEquals(retValue, term118005));
    }

};


