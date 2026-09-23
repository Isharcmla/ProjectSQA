package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Boolean;

public class ArchiveUtils_isEqual_137487921824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term188;
     Object term194;
     Object term1402;
     Object term1403;

    public ArchiveUtils_isEqual_137487921824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = (byte[]) newByteArray(6);
        setByteElement(term181, 0, (byte) 72);
        setByteElement(term181, 1, (byte) 111);
        setByteElement(term181, 2, (byte) 99);
        setByteElement(term181, 3, (byte) -12);
        setByteElement(term181, 4, (byte) -61);
        setByteElement(term181, 5, (byte) -85);
        term188 = (byte[]) newByteArray(5);
        setByteElement(term188, 0, (byte) -22);
        setByteElement(term188, 1, (byte) 93);
        setByteElement(term188, 2, (byte) 69);
        setByteElement(term188, 3, (byte) -74);
        setByteElement(term188, 4, (byte) -123);
        term194 = new Boolean(false);
        term1402 = (byte[]) newByteArray(6);
        setByteElement(term1402, 0, (byte) 72);
        setByteElement(term1402, 1, (byte) 111);
        setByteElement(term1402, 2, (byte) 99);
        setByteElement(term1402, 3, (byte) -12);
        setByteElement(term1402, 4, (byte) -61);
        setByteElement(term1402, 5, (byte) -85);
        term1403 = (byte[]) newByteArray(5);
        setByteElement(term1403, 0, (byte) -22);
        setByteElement(term1403, 1, (byte) 93);
        setByteElement(term1403, 2, (byte) 69);
        setByteElement(term1403, 3, (byte) -74);
        setByteElement(term1403, 4, (byte) -123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term181;
        args[1] = term188;
        args[2] = term194;
        callMethod(klass, "isEqual", argTypes, null, args);
        assertTrue(recursiveEquals(term181, term1402));
        assertTrue(recursiveEquals(term188, term1403));
        assertTrue(recursiveEquals(term194, false));
    }

};


