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

public class ArrayUtils_toPrimitive_379957332286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268;
     Object term1285;
     Object term14623;
     Object term14596;

    public ArrayUtils_toPrimitive_379957332286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term1269 = new Float(0.5523636F);
        Float term1271 = new Float(0.8564069F);
        Float term1273 = new Float(0.5446086F);
        Float term1275 = new Float(0.5254275F);
        Float term1277 = new Float(0.2857073F);
        Float term1279 = new Float(0.6880585F);
        Float term1281 = new Float(0.40176582F);
        Float term1283 = new Float(0.8783184F);
        term1268 = (Object[]) newArray("java.lang.Float", 8);
        setElement(term1268, 0, term1269);
        setElement(term1268, 1, term1271);
        setElement(term1268, 2, term1273);
        setElement(term1268, 3, term1275);
        setElement(term1268, 4, term1277);
        setElement(term1268, 5, term1279);
        setElement(term1268, 6, term1281);
        setElement(term1268, 7, term1283);
        term1285 = new Float(0.75592405F);
        Float term14624 = new Float(0.5523636F);
        Float term14625 = new Float(0.8564069F);
        Float term14626 = new Float(0.5446086F);
        Float term14627 = new Float(0.5254275F);
        Float term14628 = new Float(0.2857073F);
        Float term14629 = new Float(0.6880585F);
        Float term14630 = new Float(0.40176582F);
        Float term14631 = new Float(0.8783184F);
        term14623 = (Object[]) newArray("java.lang.Float", 8);
        setElement(term14623, 0, term14624);
        setElement(term14623, 1, term14625);
        setElement(term14623, 2, term14626);
        setElement(term14623, 3, term14627);
        setElement(term14623, 4, term14628);
        setElement(term14623, 5, term14629);
        setElement(term14623, 6, term14630);
        setElement(term14623, 7, term14631);
        term14596 = (float[]) newFloatArray(8);
        setFloatElement(term14596, 0, 0.5523636F);
        setFloatElement(term14596, 1, 0.8564069F);
        setFloatElement(term14596, 2, 0.5446086F);
        setFloatElement(term14596, 3, 0.5254275F);
        setFloatElement(term14596, 4, 0.2857073F);
        setFloatElement(term14596, 5, 0.6880585F);
        setFloatElement(term14596, 6, 0.40176582F);
        setFloatElement(term14596, 7, 0.8783184F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Float"), 0).getClass();
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term1268;
        args[1] = term1285;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1268, term14623));
        assertTrue(recursiveEquals(term1285, 0.75592405F));
        assertTrue(recursiveEquals(retValue, term14596));
    }

};


