package org.apache.commons.math.special;

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
import static org.apache.commons.math.special.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.special.EqualityUtils.*;

public class Gamma_regularizedGammaQ_7873675237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Gamma_regularizedGammaQ_7873675237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.special.Gamma");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 4.785168854179005E307;
        args[1] = 9.885378878666845E-88;
        args[2] = 3.8691080991527405;
        args[3] = 57088;
        Object retValue = callMethod(klass, "regularizedGammaQ", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


