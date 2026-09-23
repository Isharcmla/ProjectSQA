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

public class ArrayUtils_isEmpty_288549449300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1383;
     Object term14916;

    public ArrayUtils_isEmpty_288549449300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1383 = (float[]) newFloatArray(8);
        setFloatElement(term1383, 0, 0.068145275F);
        setFloatElement(term1383, 1, 0.10667074F);
        setFloatElement(term1383, 2, 0.9571234F);
        setFloatElement(term1383, 3, 0.114929974F);
        setFloatElement(term1383, 4, 0.30926234F);
        setFloatElement(term1383, 5, 0.37161416F);
        setFloatElement(term1383, 6, 0.022591352F);
        setFloatElement(term1383, 7, 0.6805867F);
        term14916 = (float[]) newFloatArray(8);
        setFloatElement(term14916, 0, 0.068145275F);
        setFloatElement(term14916, 1, 0.10667074F);
        setFloatElement(term14916, 2, 0.9571234F);
        setFloatElement(term14916, 3, 0.114929974F);
        setFloatElement(term14916, 4, 0.30926234F);
        setFloatElement(term14916, 5, 0.37161416F);
        setFloatElement(term14916, 6, 0.022591352F);
        setFloatElement(term14916, 7, 0.6805867F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1383;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1383, term14916));
        assertTrue(recursiveEquals(retValue, false));
    }

};


