package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Double;
import java.lang.Integer;

public class MathUtils_equalsIncludingNaN_18679860884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term65;
     Object term67;

    public MathUtils_equalsIncludingNaN_18679860884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = new Double(0.9828442029246764);
        term65 = new Double(0.2779719046761513);
        term67 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term63;
        args[1] = term65;
        args[2] = term67;
        Object retValue = callMethod(klass, "equalsIncludingNaN", argTypes, null, args);
        assertTrue(recursiveEquals(term63, 0.9828442029246764));
        assertTrue(recursiveEquals(term65, 0.2779719046761513));
        assertTrue(recursiveEquals(term67, -522618178));
        assertTrue(recursiveEquals(retValue, false));
    }

};


