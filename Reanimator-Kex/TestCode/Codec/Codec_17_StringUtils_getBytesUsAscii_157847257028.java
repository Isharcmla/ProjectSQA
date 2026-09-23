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

public class StringUtils_getBytesUsAscii_157847257028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4745;

    public StringUtils_getBytesUsAscii_157847257028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4745 = (byte[]) newByteArray(10);
        setByteElement(term4745, 0, (byte) 83);
        setByteElement(term4745, 1, (byte) 122);
        setByteElement(term4745, 2, (byte) 106);
        setByteElement(term4745, 3, (byte) 86);
        setByteElement(term4745, 4, (byte) 112);
        setByteElement(term4745, 5, (byte) 79);
        setByteElement(term4745, 6, (byte) 81);
        setByteElement(term4745, 7, (byte) 84);
        setByteElement(term4745, 8, (byte) 121);
        setByteElement(term4745, 9, (byte) 83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        Object retValue = callMethod(klass, "getBytesUsAscii", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4745));
    }

};


