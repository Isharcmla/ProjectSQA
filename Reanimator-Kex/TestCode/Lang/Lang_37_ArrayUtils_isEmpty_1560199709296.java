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

public class ArrayUtils_isEmpty_1560199709296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1353;
     Object term14825;

    public ArrayUtils_isEmpty_1560199709296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1353 = (byte[]) newByteArray(5);
        setByteElement(term1353, 0, (byte) -85);
        setByteElement(term1353, 1, (byte) -22);
        setByteElement(term1353, 2, (byte) 93);
        setByteElement(term1353, 3, (byte) 69);
        setByteElement(term1353, 4, (byte) -74);
        term14825 = (byte[]) newByteArray(5);
        setByteElement(term14825, 0, (byte) -85);
        setByteElement(term14825, 1, (byte) -22);
        setByteElement(term14825, 2, (byte) 93);
        setByteElement(term14825, 3, (byte) 69);
        setByteElement(term14825, 4, (byte) -74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1353;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1353, term14825));
        assertTrue(recursiveEquals(retValue, false));
    }

};


