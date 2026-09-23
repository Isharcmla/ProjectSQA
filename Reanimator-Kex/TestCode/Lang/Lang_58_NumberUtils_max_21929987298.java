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

public class NumberUtils_max_21929987298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;
     Object term665;
     Object term667;

    public NumberUtils_max_21929987298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term663 = new Short((short) -16335);
        term665 = new Short((short) -5174);
        term667 = new Short((short) -1725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = short.class;
        argTypes[1] = short.class;
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term663;
        args[1] = term665;
        args[2] = term667;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term663, (short) -16335));
        assertTrue(recursiveEquals(term665, (short) -5174));
        assertTrue(recursiveEquals(term667, (short) -1725));
        assertTrue(recursiveEquals(retValue, (short) -1725));
    }

};


