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

public class Base64_encodeBase64URLSafe_21933451189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49363;

    public Base64_encodeBase64URLSafe_21933451189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49363 = (byte[]) newByteArray(72);
        setByteElement(term49363, 0, (byte) 1);
        setByteElement(term49363, 1, (byte) 41);
        setByteElement(term49363, 2, (byte) 32);
        setByteElement(term49363, 3, (byte) 9);
        setByteElement(term49363, 4, (byte) 25);
        setByteElement(term49363, 6, (byte) 1);
        setByteElement(term49363, 7, (byte) 1);
        setByteElement(term49363, 8, (byte) 3);
        setByteElement(term49363, 9, (byte) 5);
        setByteElement(term49363, 10, (byte) 1);
        setByteElement(term49363, 11, (byte) 64);
        setByteElement(term49363, 12, (byte) -1);
        setByteElement(term49363, 13, (byte) -1);
        setByteElement(term49363, 14, (byte) -1);
        setByteElement(term49363, 15, (byte) -1);
        setByteElement(term49363, 16, (byte) -1);
        setByteElement(term49363, 17, (byte) -1);
        setByteElement(term49363, 18, (byte) -1);
        setByteElement(term49363, 19, (byte) -1);
        setByteElement(term49363, 20, (byte) -1);
        setByteElement(term49363, 21, (byte) -1);
        setByteElement(term49363, 22, (byte) -1);
        setByteElement(term49363, 23, (byte) -1);
        setByteElement(term49363, 24, (byte) -1);
        setByteElement(term49363, 25, (byte) -1);
        setByteElement(term49363, 26, (byte) -1);
        setByteElement(term49363, 27, (byte) -1);
        setByteElement(term49363, 28, (byte) -1);
        setByteElement(term49363, 29, (byte) -1);
        setByteElement(term49363, 30, (byte) -1);
        setByteElement(term49363, 31, (byte) -1);
        setByteElement(term49363, 32, (byte) -1);
        setByteElement(term49363, 33, (byte) -1);
        setByteElement(term49363, 34, (byte) -1);
        setByteElement(term49363, 35, (byte) -1);
        setByteElement(term49363, 36, (byte) -1);
        setByteElement(term49363, 37, (byte) -1);
        setByteElement(term49363, 38, (byte) -1);
        setByteElement(term49363, 39, (byte) -1);
        setByteElement(term49363, 40, (byte) -1);
        setByteElement(term49363, 41, (byte) -1);
        setByteElement(term49363, 42, (byte) -1);
        setByteElement(term49363, 43, (byte) -1);
        setByteElement(term49363, 44, (byte) -1);
        setByteElement(term49363, 45, (byte) -1);
        setByteElement(term49363, 46, (byte) -1);
        setByteElement(term49363, 47, (byte) -1);
        setByteElement(term49363, 48, (byte) -1);
        setByteElement(term49363, 49, (byte) -1);
        setByteElement(term49363, 50, (byte) -1);
        setByteElement(term49363, 51, (byte) -1);
        setByteElement(term49363, 52, (byte) -1);
        setByteElement(term49363, 53, (byte) -1);
        setByteElement(term49363, 54, (byte) -1);
        setByteElement(term49363, 55, (byte) -1);
        setByteElement(term49363, 56, (byte) -1);
        setByteElement(term49363, 57, (byte) -1);
        setByteElement(term49363, 58, (byte) -1);
        setByteElement(term49363, 59, (byte) -1);
        setByteElement(term49363, 60, (byte) -1);
        setByteElement(term49363, 61, (byte) -1);
        setByteElement(term49363, 62, (byte) -1);
        setByteElement(term49363, 63, (byte) -1);
        setByteElement(term49363, 64, (byte) -1);
        setByteElement(term49363, 65, (byte) -1);
        setByteElement(term49363, 66, (byte) -1);
        setByteElement(term49363, 67, (byte) -1);
        setByteElement(term49363, 68, (byte) -1);
        setByteElement(term49363, 69, (byte) -1);
        setByteElement(term49363, 70, (byte) -1);
        setByteElement(term49363, 71, (byte) -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term49363;
        callMethod(klass, "encodeBase64URLSafe", argTypes, null, args);
    }

};


