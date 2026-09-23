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

public class StringUtils_getBytesUtf16Be_13306737030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5042;

    public StringUtils_getBytesUtf16Be_13306737030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5042 = (byte[]) newByteArray(20);
        setByteElement(term5042, 1, (byte) 104);
        setByteElement(term5042, 3, (byte) 82);
        setByteElement(term5042, 5, (byte) 78);
        setByteElement(term5042, 7, (byte) 83);
        setByteElement(term5042, 9, (byte) 122);
        setByteElement(term5042, 11, (byte) 89);
        setByteElement(term5042, 13, (byte) 89);
        setByteElement(term5042, 15, (byte) 73);
        setByteElement(term5042, 17, (byte) 114);
        setByteElement(term5042, 19, (byte) 99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        Object retValue = callMethod(klass, "getBytesUtf16Be", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5042));
    }

};


