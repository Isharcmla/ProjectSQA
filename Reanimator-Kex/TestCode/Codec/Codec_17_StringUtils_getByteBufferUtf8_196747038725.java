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

public class StringUtils_getByteBufferUtf8_196747038725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3564;

    public StringUtils_getByteBufferUtf8_196747038725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3564 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term3565 = (byte[]) newByteArray(10);
        setByteElement(term3565, 0, (byte) 77);
        setByteElement(term3565, 1, (byte) 117);
        setByteElement(term3565, 2, (byte) 76);
        setByteElement(term3565, 3, (byte) 99);
        setByteElement(term3565, 4, (byte) 103);
        setByteElement(term3565, 5, (byte) 81);
        setByteElement(term3565, 6, (byte) 72);
        setByteElement(term3565, 7, (byte) 103);
        setByteElement(term3565, 8, (byte) 113);
        setByteElement(term3565, 9, (byte) 122);
        setField(term3564, term3564.getClass(), "hb", term3565);
        setIntField(term3564, term3564.getClass(), "offset", 0);
        setBooleanField(term3564, term3564.getClass(), "isReadOnly", false);
        setBooleanField(term3564, term3564.getClass(), "bigEndian", true);
        setBooleanField(term3564, term3564.getClass(), "nativeByteOrder", false);
        setIntField(term3564, term3564.getClass(), "mark", -1);
        setIntField(term3564, term3564.getClass(), "position", 0);
        setIntField(term3564, term3564.getClass(), "limit", 10);
        setIntField(term3564, term3564.getClass(), "capacity", 10);
        setLongField(term3564, term3564.getClass(), "address", 16L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        Object retValue = callMethod(klass, "getByteBufferUtf8", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3564));
    }

};


