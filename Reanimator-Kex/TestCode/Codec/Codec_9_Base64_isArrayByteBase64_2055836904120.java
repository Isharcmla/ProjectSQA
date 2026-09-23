package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base64_isArrayByteBase64_2055836904120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60830;
     Object term97445;

    public Base64_isArrayByteBase64_2055836904120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60830 = (byte[]) newByteArray(8);
        setByteElement(term60830, 0, (byte) 61);
        setByteElement(term60830, 1, (byte) 61);
        setByteElement(term60830, 2, (byte) 61);
        setByteElement(term60830, 3, (byte) 61);
        setByteElement(term60830, 4, (byte) 61);
        setByteElement(term60830, 5, (byte) 61);
        setByteElement(term60830, 6, (byte) 61);
        setByteElement(term60830, 7, (byte) 61);
        term97445 = (byte[]) newByteArray(8);
        setByteElement(term97445, 0, (byte) 61);
        setByteElement(term97445, 1, (byte) 61);
        setByteElement(term97445, 2, (byte) 61);
        setByteElement(term97445, 3, (byte) 61);
        setByteElement(term97445, 4, (byte) 61);
        setByteElement(term97445, 5, (byte) 61);
        setByteElement(term97445, 6, (byte) 61);
        setByteElement(term97445, 7, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term60830;
        callMethod(klass, "isArrayByteBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term60830, term97445));
    }

};


