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

public class StringUtils_getBytesUtf16_29028241929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4870;

    public StringUtils_getBytesUtf16_29028241929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4870 = (byte[]) newByteArray(22);
        setByteElement(term4870, 0, (byte) -2);
        setByteElement(term4870, 1, (byte) -1);
        setByteElement(term4870, 3, (byte) 77);
        setByteElement(term4870, 5, (byte) 106);
        setByteElement(term4870, 7, (byte) 71);
        setByteElement(term4870, 9, (byte) 89);
        setByteElement(term4870, 11, (byte) 83);
        setByteElement(term4870, 13, (byte) 82);
        setByteElement(term4870, 15, (byte) 75);
        setByteElement(term4870, 17, (byte) 84);
        setByteElement(term4870, 19, (byte) 78);
        setByteElement(term4870, 21, (byte) 70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        Object retValue = callMethod(klass, "getBytesUtf16", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4870));
    }

};


