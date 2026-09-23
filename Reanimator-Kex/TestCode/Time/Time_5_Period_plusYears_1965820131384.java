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

public class Period_plusYears_1965820131384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187968;
     Object term188695;
     Object term188693;

    public Period_plusYears_1965820131384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187968 = newInstance(Class.forName("org.joda.time.Period"));
        term188695 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term188695, term188695.getClass(), "iType", null);
        setField(term188695, term188695.getClass(), "iValues", null);
        term188693 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term188693, term188693.getClass(), "iType", null);
        setField(term188693, term188693.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusYears", argTypes, term187968, args);
        assertTrue(recursiveEquals(term187968, term188695));
        assertTrue(recursiveEquals(retValue, term188693));
    }

};


