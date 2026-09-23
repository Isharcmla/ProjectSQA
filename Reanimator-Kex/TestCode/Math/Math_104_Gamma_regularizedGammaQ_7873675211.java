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

public class Gamma_regularizedGammaQ_7873675211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term21;
     Object term23;
     Object term25;

    public Gamma_regularizedGammaQ_7873675211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = new Double(0.6076495596892013);
        term21 = new Double(0.37773193782763337);
        term23 = new Double(0.8474802076607362);
        term25 = new Integer(1162663216);
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
        args[0] = term19;
        args[1] = term21;
        args[2] = term23;
        args[3] = term25;
        Object retValue = callMethod(klass, "regularizedGammaQ", argTypes, null, args);
        assertTrue(recursiveEquals(term19, 0.6076495596892013));
        assertTrue(recursiveEquals(term21, 0.37773193782763337));
        assertTrue(recursiveEquals(term23, 0.8474802076607362));
        assertTrue(recursiveEquals(term25, 1162663216));
        assertTrue(recursiveEquals(retValue, 0.4762188061848537));
    }

};


