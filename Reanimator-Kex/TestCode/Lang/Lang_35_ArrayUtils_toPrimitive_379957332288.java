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

public class ArrayUtils_toPrimitive_379957332288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1279;
     Object term1296;
     Object term14669;
     Object term14642;

    public ArrayUtils_toPrimitive_379957332288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term1280 = new Float(0.5523636F);
        Float term1282 = new Float(0.8564069F);
        Float term1284 = new Float(0.5446086F);
        Float term1286 = new Float(0.5254275F);
        Float term1288 = new Float(0.2857073F);
        Float term1290 = new Float(0.6880585F);
        Float term1292 = new Float(0.40176582F);
        Float term1294 = new Float(0.8783184F);
        term1279 = (Object[]) newArray("java.lang.Float", 8);
        setElement(term1279, 0, term1280);
        setElement(term1279, 1, term1282);
        setElement(term1279, 2, term1284);
        setElement(term1279, 3, term1286);
        setElement(term1279, 4, term1288);
        setElement(term1279, 5, term1290);
        setElement(term1279, 6, term1292);
        setElement(term1279, 7, term1294);
        term1296 = new Float(0.75592405F);
        Float term14670 = new Float(0.5523636F);
        Float term14671 = new Float(0.8564069F);
        Float term14672 = new Float(0.5446086F);
        Float term14673 = new Float(0.5254275F);
        Float term14674 = new Float(0.2857073F);
        Float term14675 = new Float(0.6880585F);
        Float term14676 = new Float(0.40176582F);
        Float term14677 = new Float(0.8783184F);
        term14669 = (Object[]) newArray("java.lang.Float", 8);
        setElement(term14669, 0, term14670);
        setElement(term14669, 1, term14671);
        setElement(term14669, 2, term14672);
        setElement(term14669, 3, term14673);
        setElement(term14669, 4, term14674);
        setElement(term14669, 5, term14675);
        setElement(term14669, 6, term14676);
        setElement(term14669, 7, term14677);
        term14642 = (float[]) newFloatArray(8);
        setFloatElement(term14642, 0, 0.5523636F);
        setFloatElement(term14642, 1, 0.8564069F);
        setFloatElement(term14642, 2, 0.5446086F);
        setFloatElement(term14642, 3, 0.5254275F);
        setFloatElement(term14642, 4, 0.2857073F);
        setFloatElement(term14642, 5, 0.6880585F);
        setFloatElement(term14642, 6, 0.40176582F);
        setFloatElement(term14642, 7, 0.8783184F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Float"), 0).getClass();
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term1279;
        args[1] = term1296;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1279, term14669));
        assertTrue(recursiveEquals(term1296, 0.75592405F));
        assertTrue(recursiveEquals(retValue, term14642));
    }

};


