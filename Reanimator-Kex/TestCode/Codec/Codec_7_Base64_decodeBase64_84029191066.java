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

public class Base64_decodeBase64_84029191066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10522;

    public Base64_decodeBase64_84029191066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10522 = (byte[]) newByteArray(7);
        setByteElement(term10522, 0, (byte) -78);
        setByteElement(term10522, 1, (byte) 57);
        setByteElement(term10522, 2, (byte) 73);
        setByteElement(term10522, 4, (byte) 75);
        setByteElement(term10522, 5, (byte) 81);
        setByteElement(term10522, 6, (byte) -83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "decodeBase64", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term10522));
    }

};


