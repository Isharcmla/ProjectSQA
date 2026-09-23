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

public class ArrayUtils_toPrimitive_1774267454287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1270;
     Object term14614;
     Object term14600;

    public ArrayUtils_toPrimitive_1774267454287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term1271 = new Float(0.13238746F);
        Float term1273 = new Float(0.2707036F);
        Float term1275 = new Float(0.3455959F);
        Float term1277 = new Float(0.09123778F);
        term1270 = (Object[]) newArray("java.lang.Float", 4);
        setElement(term1270, 0, term1271);
        setElement(term1270, 1, term1273);
        setElement(term1270, 2, term1275);
        setElement(term1270, 3, term1277);
        Float term14615 = new Float(0.13238746F);
        Float term14616 = new Float(0.2707036F);
        Float term14617 = new Float(0.3455959F);
        Float term14618 = new Float(0.09123778F);
        term14614 = (Object[]) newArray("java.lang.Float", 4);
        setElement(term14614, 0, term14615);
        setElement(term14614, 1, term14616);
        setElement(term14614, 2, term14617);
        setElement(term14614, 3, term14618);
        term14600 = (float[]) newFloatArray(4);
        setFloatElement(term14600, 0, 0.13238746F);
        setFloatElement(term14600, 1, 0.2707036F);
        setFloatElement(term14600, 2, 0.3455959F);
        setFloatElement(term14600, 3, 0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Float"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1270;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1270, term14614));
        assertTrue(recursiveEquals(retValue, term14600));
    }

};


