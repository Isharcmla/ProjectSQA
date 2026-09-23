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

public class StringUtils_getBytesUtf8_3833359826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5534;

    public StringUtils_getBytesUtf8_3833359826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5534 = (byte[]) newByteArray(10);
        setByteElement(term5534, 0, (byte) 104);
        setByteElement(term5534, 1, (byte) 82);
        setByteElement(term5534, 2, (byte) 78);
        setByteElement(term5534, 3, (byte) 83);
        setByteElement(term5534, 4, (byte) 122);
        setByteElement(term5534, 5, (byte) 89);
        setByteElement(term5534, 6, (byte) 89);
        setByteElement(term5534, 7, (byte) 73);
        setByteElement(term5534, 8, (byte) 114);
        setByteElement(term5534, 9, (byte) 99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        Object retValue = callMethod(klass, "getBytesUtf8", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5534));
    }

};


