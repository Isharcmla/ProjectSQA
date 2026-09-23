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

public class ArrayUtils_isEmpty_288549449298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;
     Object term14882;

    public ArrayUtils_isEmpty_288549449298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1381 = (float[]) newFloatArray(8);
        setFloatElement(term1381, 0, 0.068145275F);
        setFloatElement(term1381, 1, 0.10667074F);
        setFloatElement(term1381, 2, 0.9571234F);
        setFloatElement(term1381, 3, 0.114929974F);
        setFloatElement(term1381, 4, 0.30926234F);
        setFloatElement(term1381, 5, 0.37161416F);
        setFloatElement(term1381, 6, 0.022591352F);
        setFloatElement(term1381, 7, 0.6805867F);
        term14882 = (float[]) newFloatArray(8);
        setFloatElement(term14882, 0, 0.068145275F);
        setFloatElement(term14882, 1, 0.10667074F);
        setFloatElement(term14882, 2, 0.9571234F);
        setFloatElement(term14882, 3, 0.114929974F);
        setFloatElement(term14882, 4, 0.30926234F);
        setFloatElement(term14882, 5, 0.37161416F);
        setFloatElement(term14882, 6, 0.022591352F);
        setFloatElement(term14882, 7, 0.6805867F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1381;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1381, term14882));
        assertTrue(recursiveEquals(retValue, false));
    }

};


