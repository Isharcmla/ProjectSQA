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

public class ArrayUtils_clone_335220415184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term10729;
     Object term10715;

    public ArrayUtils_clone_335220415184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = (byte[]) newByteArray(6);
        setByteElement(term65, 0, (byte) 47);
        setByteElement(term65, 1, (byte) 48);
        setByteElement(term65, 2, (byte) 89);
        setByteElement(term65, 3, (byte) 75);
        setByteElement(term65, 4, (byte) 18);
        setByteElement(term65, 5, (byte) -58);
        term10729 = (byte[]) newByteArray(6);
        setByteElement(term10729, 0, (byte) 47);
        setByteElement(term10729, 1, (byte) 48);
        setByteElement(term10729, 2, (byte) 89);
        setByteElement(term10729, 3, (byte) 75);
        setByteElement(term10729, 4, (byte) 18);
        setByteElement(term10729, 5, (byte) -58);
        term10715 = (byte[]) newByteArray(6);
        setByteElement(term10715, 0, (byte) 47);
        setByteElement(term10715, 1, (byte) 48);
        setByteElement(term10715, 2, (byte) 89);
        setByteElement(term10715, 3, (byte) 75);
        setByteElement(term10715, 4, (byte) 18);
        setByteElement(term10715, 5, (byte) -58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term65;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term65, term10729));
        assertTrue(recursiveEquals(retValue, term10715));
    }

};


