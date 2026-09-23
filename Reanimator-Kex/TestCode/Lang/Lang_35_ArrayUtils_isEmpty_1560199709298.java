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

public class ArrayUtils_isEmpty_1560199709298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1355;
     Object term14865;

    public ArrayUtils_isEmpty_1560199709298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1355 = (byte[]) newByteArray(5);
        setByteElement(term1355, 0, (byte) -85);
        setByteElement(term1355, 1, (byte) -22);
        setByteElement(term1355, 2, (byte) 93);
        setByteElement(term1355, 3, (byte) 69);
        setByteElement(term1355, 4, (byte) -74);
        term14865 = (byte[]) newByteArray(5);
        setByteElement(term14865, 0, (byte) -85);
        setByteElement(term14865, 1, (byte) -22);
        setByteElement(term14865, 2, (byte) 93);
        setByteElement(term14865, 3, (byte) 69);
        setByteElement(term14865, 4, (byte) -74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1355;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1355, term14865));
        assertTrue(recursiveEquals(retValue, false));
    }

};


