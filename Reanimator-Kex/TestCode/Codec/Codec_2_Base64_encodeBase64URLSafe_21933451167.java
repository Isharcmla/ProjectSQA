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

public class Base64_encodeBase64URLSafe_21933451167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10151;
     Object term12592;
     Object term12575;

    public Base64_encodeBase64URLSafe_21933451167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10151 = (byte[]) newByteArray(12);
        term12592 = (byte[]) newByteArray(12);
        term12575 = (byte[]) newByteArray(16);
        setByteElement(term12575, 0, (byte) 65);
        setByteElement(term12575, 1, (byte) 65);
        setByteElement(term12575, 2, (byte) 65);
        setByteElement(term12575, 3, (byte) 65);
        setByteElement(term12575, 4, (byte) 65);
        setByteElement(term12575, 5, (byte) 65);
        setByteElement(term12575, 6, (byte) 65);
        setByteElement(term12575, 7, (byte) 65);
        setByteElement(term12575, 8, (byte) 65);
        setByteElement(term12575, 9, (byte) 65);
        setByteElement(term12575, 10, (byte) 65);
        setByteElement(term12575, 11, (byte) 65);
        setByteElement(term12575, 12, (byte) 65);
        setByteElement(term12575, 13, (byte) 65);
        setByteElement(term12575, 14, (byte) 65);
        setByteElement(term12575, 15, (byte) 65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10151;
        Object retValue = callMethod(klass, "encodeBase64URLSafe", argTypes, null, args);
        assertTrue(recursiveEquals(term10151, term12592));
        assertTrue(recursiveEquals(retValue, term12575));
    }

};


