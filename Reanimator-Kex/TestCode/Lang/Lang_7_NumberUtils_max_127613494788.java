package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;
import java.lang.Short;

public class NumberUtils_max_127613494788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;
     Object term615;
     Object term617;

    public NumberUtils_max_127613494788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613 = new Short((short) 7097);
        term615 = new Short((short) -16335);
        term617 = new Short((short) -5174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = short.class;
        argTypes[1] = short.class;
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term613;
        args[1] = term615;
        args[2] = term617;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term613, (short) 7097));
        assertTrue(recursiveEquals(term615, (short) -16335));
        assertTrue(recursiveEquals(term617, (short) -5174));
        assertTrue(recursiveEquals(retValue, (short) 7097));
    }

};


