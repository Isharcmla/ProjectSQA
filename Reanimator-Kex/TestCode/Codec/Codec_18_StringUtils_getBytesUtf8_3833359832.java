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

public class StringUtils_getBytesUtf8_3833359832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5321;

    public StringUtils_getBytesUtf8_3833359832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5321 = (byte[]) newByteArray(10);
        setByteElement(term5321, 0, (byte) 78);
        setByteElement(term5321, 1, (byte) 82);
        setByteElement(term5321, 2, (byte) 100);
        setByteElement(term5321, 3, (byte) 118);
        setByteElement(term5321, 4, (byte) 103);
        setByteElement(term5321, 5, (byte) 74);
        setByteElement(term5321, 6, (byte) 108);
        setByteElement(term5321, 7, (byte) 104);
        setByteElement(term5321, 8, (byte) 107);
        setByteElement(term5321, 9, (byte) 88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        Object retValue = callMethod(klass, "getBytesUtf8", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5321));
    }

};


