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

public class StringUtils_getBytesIso88591_136963852626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3796;

    public StringUtils_getBytesIso88591_136963852626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3796 = (byte[]) newByteArray(10);
        setByteElement(term3796, 0, (byte) 120);
        setByteElement(term3796, 1, (byte) 120);
        setByteElement(term3796, 2, (byte) 116);
        setByteElement(term3796, 3, (byte) 108);
        setByteElement(term3796, 4, (byte) 80);
        setByteElement(term3796, 5, (byte) 119);
        setByteElement(term3796, 6, (byte) 68);
        setByteElement(term3796, 7, (byte) 89);
        setByteElement(term3796, 8, (byte) 70);
        setByteElement(term3796, 9, (byte) 115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        Object retValue = callMethod(klass, "getBytesIso8859_1", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3796));
    }

};


