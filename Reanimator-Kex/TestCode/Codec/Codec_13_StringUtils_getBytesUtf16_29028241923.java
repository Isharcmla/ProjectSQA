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

public class StringUtils_getBytesUtf16_29028241923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5087;

    public StringUtils_getBytesUtf16_29028241923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5087 = (byte[]) newByteArray(22);
        setByteElement(term5087, 0, (byte) -2);
        setByteElement(term5087, 1, (byte) -1);
        setByteElement(term5087, 3, (byte) 69);
        setByteElement(term5087, 5, (byte) 71);
        setByteElement(term5087, 7, (byte) 116);
        setByteElement(term5087, 9, (byte) 68);
        setByteElement(term5087, 11, (byte) 73);
        setByteElement(term5087, 13, (byte) 82);
        setByteElement(term5087, 15, (byte) 98);
        setByteElement(term5087, 17, (byte) 83);
        setByteElement(term5087, 19, (byte) 83);
        setByteElement(term5087, 21, (byte) 98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        Object retValue = callMethod(klass, "getBytesUtf16", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term5087));
    }

};


