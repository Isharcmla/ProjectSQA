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

public class ArrayUtils_reverse_137131888213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;
     Object term12227;

    public ArrayUtils_reverse_137131888213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420 = (byte[]) newByteArray(4);
        setByteElement(term420, 0, (byte) 78);
        setByteElement(term420, 1, (byte) 87);
        setByteElement(term420, 2, (byte) 121);
        setByteElement(term420, 3, (byte) -99);
        term12227 = (byte[]) newByteArray(4);
        setByteElement(term12227, 0, (byte) -99);
        setByteElement(term12227, 1, (byte) 121);
        setByteElement(term12227, 2, (byte) 87);
        setByteElement(term12227, 3, (byte) 78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term420;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term420, term12227));
    }

};


