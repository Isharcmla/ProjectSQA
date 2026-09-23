package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Long;

public class NumberUtils_minimum_148051387730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;
     Object term225;
     Object term227;

    public NumberUtils_minimum_148051387730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = new Long(2442117782898005296L);
        term225 = new Long(6375119433582206027L);
        term227 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term223;
        args[1] = term225;
        args[2] = term227;
        Object retValue = callMethod(klass, "minimum", argTypes, null, args);
        assertTrue(recursiveEquals(term223, 2442117782898005296L));
        assertTrue(recursiveEquals(term225, 6375119433582206027L));
        assertTrue(recursiveEquals(term227, -8257434502486459194L));
        assertTrue(recursiveEquals(retValue, -8257434502486459194L));
    }

};


