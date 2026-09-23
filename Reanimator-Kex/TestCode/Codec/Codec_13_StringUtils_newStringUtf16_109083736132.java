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

public class StringUtils_newStringUtf16_109083736132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3038;
     Object term14426;

    public StringUtils_newStringUtf16_109083736132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3038 = (byte[]) newByteArray(3);
        setByteElement(term3038, 0, (byte) 78);
        setByteElement(term3038, 1, (byte) 87);
        setByteElement(term3038, 2, (byte) 121);
        term14426 = (byte[]) newByteArray(3);
        setByteElement(term14426, 0, (byte) 78);
        setByteElement(term14426, 1, (byte) 87);
        setByteElement(term14426, 2, (byte) 121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3038;
        Object retValue = callMethod(klass, "newStringUtf16", argTypes, null, args);
        assertTrue(recursiveEquals(term3038, term14426));
        assertTrue(recursiveEquals(retValue, "WN\uFFFD\uFFFF"));
    }

};


