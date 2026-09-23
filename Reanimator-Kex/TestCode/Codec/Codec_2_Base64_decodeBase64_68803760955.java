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

public class Base64_decodeBase64_68803760955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1684;
     Object term8055;
     Object term8053;

    public Base64_decodeBase64_68803760955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1684 = (byte[]) newByteArray(5);
        setByteElement(term1684, 0, (byte) -112);
        setByteElement(term1684, 1, (byte) 81);
        setByteElement(term1684, 2, (byte) 65);
        setByteElement(term1684, 3, (byte) -44);
        setByteElement(term1684, 4, (byte) 33);
        term8055 = (byte[]) newByteArray(5);
        setByteElement(term8055, 0, (byte) -112);
        setByteElement(term8055, 1, (byte) 81);
        setByteElement(term8055, 2, (byte) 65);
        setByteElement(term8055, 3, (byte) -44);
        setByteElement(term8055, 4, (byte) 33);
        term8053 = (byte[]) newByteArray(1);
        setByteElement(term8053, 0, (byte) 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1684;
        Object retValue = callMethod(klass, "decodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(term1684, term8055));
        assertTrue(recursiveEquals(retValue, term8053));
    }

};


