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
import java.lang.Double;
import java.lang.Integer;

public class Gamma_regularizedGammaP_787377139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object term11;
     Object term13;

    public Gamma_regularizedGammaP_787377139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new Double(0.544608645520025);
        term9 = new Double(0.28570734989730284);
        term11 = new Double(0.40176586625454525);
        term13 = new Integer(568599855);
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
        args[0] = term7;
        args[1] = term9;
        args[2] = term11;
        args[3] = term13;
        Object retValue = callMethod(klass, "regularizedGammaP", argTypes, null, args);
        assertTrue(recursiveEquals(term7, 0.544608645520025));
        assertTrue(recursiveEquals(term9, 0.28570734989730284));
        assertTrue(recursiveEquals(term11, 0.40176586625454525));
        assertTrue(recursiveEquals(term13, 568599855));
        assertTrue(recursiveEquals(retValue, 0.5066009562386772));
    }

};


