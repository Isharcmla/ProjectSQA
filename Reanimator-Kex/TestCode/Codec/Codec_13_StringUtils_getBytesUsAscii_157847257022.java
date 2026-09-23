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

public class StringUtils_getBytesUsAscii_157847257022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4962;

    public StringUtils_getBytesUsAscii_157847257022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4962 = (byte[]) newByteArray(10);
        setByteElement(term4962, 0, (byte) 106);
        setByteElement(term4962, 1, (byte) 74);
        setByteElement(term4962, 2, (byte) 67);
        setByteElement(term4962, 3, (byte) 90);
        setByteElement(term4962, 4, (byte) 112);
        setByteElement(term4962, 5, (byte) 86);
        setByteElement(term4962, 6, (byte) 109);
        setByteElement(term4962, 7, (byte) 97);
        setByteElement(term4962, 8, (byte) 110);
        setByteElement(term4962, 9, (byte) 87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "getBytesUsAscii", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4962));
    }

};


