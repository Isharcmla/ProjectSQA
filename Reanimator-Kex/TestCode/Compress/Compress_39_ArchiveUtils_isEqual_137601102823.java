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

public class ArchiveUtils_isEqual_137601102823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term171;
     Object term1362;
     Object term1363;

    public ArchiveUtils_isEqual_137601102823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = (byte[]) newByteArray(7);
        setByteElement(term163, 0, (byte) 98);
        setByteElement(term163, 1, (byte) 67);
        setByteElement(term163, 2, (byte) 66);
        setByteElement(term163, 3, (byte) -121);
        setByteElement(term163, 4, (byte) -119);
        setByteElement(term163, 5, (byte) 71);
        setByteElement(term163, 6, (byte) 80);
        term171 = (byte[]) newByteArray(1);
        setByteElement(term171, 0, (byte) 42);
        term1362 = (byte[]) newByteArray(7);
        setByteElement(term1362, 0, (byte) 98);
        setByteElement(term1362, 1, (byte) 67);
        setByteElement(term1362, 2, (byte) 66);
        setByteElement(term1362, 3, (byte) -121);
        setByteElement(term1362, 4, (byte) -119);
        setByteElement(term1362, 5, (byte) 71);
        setByteElement(term1362, 6, (byte) 80);
        term1363 = (byte[]) newByteArray(1);
        setByteElement(term1363, 0, (byte) 42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ArchiveUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term163;
        args[1] = term171;
        callMethod(klass, "isEqual", argTypes, null, args);
        assertTrue(recursiveEquals(term163, term1362));
        assertTrue(recursiveEquals(term171, term1363));
    }

};


