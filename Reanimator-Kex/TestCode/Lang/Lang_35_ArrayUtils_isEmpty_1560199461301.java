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

public class ArrayUtils_isEmpty_1560199461301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1400;
     Object term14952;

    public ArrayUtils_isEmpty_1560199461301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1400 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term1400, 0, true);
        setBooleanElement(term1400, 1, true);
        setBooleanElement(term1400, 3, true);
        term14952 = (boolean[]) newBooleanArray(5);
        setBooleanElement(term14952, 0, true);
        setBooleanElement(term14952, 1, true);
        setBooleanElement(term14952, 3, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1400;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1400, term14952));
        assertTrue(recursiveEquals(retValue, false));
    }

};


