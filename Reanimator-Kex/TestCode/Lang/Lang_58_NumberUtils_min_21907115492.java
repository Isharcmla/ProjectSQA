package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;
import java.lang.Short;

public class NumberUtils_min_21907115492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;
     Object term629;
     Object term631;

    public NumberUtils_min_21907115492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627 = new Short((short) 21075);
        term629 = new Short((short) -2742);
        term631 = new Short((short) 7097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = short.class;
        argTypes[1] = short.class;
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term627;
        args[1] = term629;
        args[2] = term631;
        Object retValue = callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term627, (short) 21075));
        assertTrue(recursiveEquals(term629, (short) -2742));
        assertTrue(recursiveEquals(term631, (short) 7097));
        assertTrue(recursiveEquals(retValue, (short) -2742));
    }

};


