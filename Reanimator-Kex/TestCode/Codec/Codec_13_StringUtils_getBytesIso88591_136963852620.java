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

public class StringUtils_getBytesIso88591_136963852620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3492;

    public StringUtils_getBytesIso88591_136963852620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3492 = (byte[]) newByteArray(10);
        setByteElement(term3492, 0, (byte) 115);
        setByteElement(term3492, 1, (byte) 106);
        setByteElement(term3492, 2, (byte) 108);
        setByteElement(term3492, 3, (byte) 74);
        setByteElement(term3492, 4, (byte) 65);
        setByteElement(term3492, 5, (byte) 69);
        setByteElement(term3492, 6, (byte) 116);
        setByteElement(term3492, 7, (byte) 82);
        setByteElement(term3492, 8, (byte) 114);
        setByteElement(term3492, 9, (byte) 98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "getBytesIso8859_1", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3492));
    }

};


