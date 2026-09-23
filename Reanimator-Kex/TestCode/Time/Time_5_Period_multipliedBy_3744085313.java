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

public class Period_multipliedBy_3744085313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153701;
     Object term156052;
     Object term156050;

    public Period_multipliedBy_3744085313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153701 = newInstance(Class.forName("org.joda.time.Period"));
        term156052 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term156052, term156052.getClass(), "iType", null);
        setField(term156052, term156052.getClass(), "iValues", null);
        term156050 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term156050, term156050.getClass(), "iType", null);
        setField(term156050, term156050.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "multipliedBy", argTypes, term153701, args);
        assertTrue(recursiveEquals(term153701, term156052));
        assertTrue(recursiveEquals(retValue, term156050));
    }

};


