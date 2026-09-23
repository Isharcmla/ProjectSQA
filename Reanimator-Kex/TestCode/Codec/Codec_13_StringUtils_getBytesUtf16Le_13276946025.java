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

public class StringUtils_getBytesUtf16Le_13276946025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5413;

    public StringUtils_getBytesUtf16Le_13276946025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5413 = (byte[]) newByteArray(20);
        setByteElement(term5413, 0, (byte) 77);
        setByteElement(term5413, 2, (byte) 106);
        setByteElement(term5413, 4, (byte) 71);
        setByteElement(term5413, 6, (byte) 89);
        setByteElement(term5413, 8, (byte) 83);
        setByteElement(term5413, 10, (byte) 82);
        setByteElement(term5413, 12, (byte) 75);
        setByteElement(term5413, 14, (byte) 84);
        setByteElement(term5413, 16, (byte) 78);
        setByteElement(term5413, 18, (byte) 70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        Object retValue = callMethod(klass, "getBytesUtf16Le", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5413));
    }

};


