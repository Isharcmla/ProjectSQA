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
import java.lang.Integer;

public class NumberUtils_max_21880732897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term657;
     Object term659;
     Object term661;

    public NumberUtils_max_21880732897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term657 = new Integer(-655067527);
        term659 = new Integer(-6029667);
        term661 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term657;
        args[1] = term659;
        args[2] = term661;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term657, -655067527));
        assertTrue(recursiveEquals(term659, -6029667));
        assertTrue(recursiveEquals(term661, -2068769794));
        assertTrue(recursiveEquals(retValue, -6029667));
    }

};


