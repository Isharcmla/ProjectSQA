package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Float;

public class ArrayUtils_toPrimitive_1774267454285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term14568;
     Object term14554;

    public ArrayUtils_toPrimitive_1774267454285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term1260 = new Float(0.13238746F);
        Float term1262 = new Float(0.2707036F);
        Float term1264 = new Float(0.3455959F);
        Float term1266 = new Float(0.09123778F);
        term1259 = (Object[]) newArray("java.lang.Float", 4);
        setElement(term1259, 0, term1260);
        setElement(term1259, 1, term1262);
        setElement(term1259, 2, term1264);
        setElement(term1259, 3, term1266);
        Float term14569 = new Float(0.13238746F);
        Float term14570 = new Float(0.2707036F);
        Float term14571 = new Float(0.3455959F);
        Float term14572 = new Float(0.09123778F);
        term14568 = (Object[]) newArray("java.lang.Float", 4);
        setElement(term14568, 0, term14569);
        setElement(term14568, 1, term14570);
        setElement(term14568, 2, term14571);
        setElement(term14568, 3, term14572);
        term14554 = (float[]) newFloatArray(4);
        setFloatElement(term14554, 0, 0.13238746F);
        setFloatElement(term14554, 1, 0.2707036F);
        setFloatElement(term14554, 2, 0.3455959F);
        setFloatElement(term14554, 3, 0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Float"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1259;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1259, term14568));
        assertTrue(recursiveEquals(retValue, term14554));
    }

};


