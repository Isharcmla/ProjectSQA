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

public class StringUtils_getBytesUtf16Le_13276946031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5200;

    public StringUtils_getBytesUtf16Le_13276946031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5200 = (byte[]) newByteArray(20);
        setByteElement(term5200, 0, (byte) 82);
        setByteElement(term5200, 2, (byte) 77);
        setByteElement(term5200, 4, (byte) 70);
        setByteElement(term5200, 6, (byte) 73);
        setByteElement(term5200, 8, (byte) 115);
        setByteElement(term5200, 10, (byte) 89);
        setByteElement(term5200, 12, (byte) 71);
        setByteElement(term5200, 14, (byte) 103);
        setByteElement(term5200, 16, (byte) 110);
        setByteElement(term5200, 18, (byte) 101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        Object retValue = callMethod(klass, "getBytesUtf16Le", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5200));
    }

};


