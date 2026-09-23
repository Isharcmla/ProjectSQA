package org.apache.commons.codec.net;

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
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.net.EqualityUtils.*;

public class QuotedPrintableCodec_encode_1092762296193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117639;
     Object term115022;
     Object term117714;
     Object term117715;
     Object term117706;

    public QuotedPrintableCodec_encode_1092762296193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117639 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term115022 = (byte[]) newByteArray(2);
        setByteElement(term115022, 1, (byte) -116);
        term117714 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term117714, term117714.getClass(), "charset", null);
        term117715 = (byte[]) newByteArray(2);
        setByteElement(term117715, 1, (byte) -116);
        term117706 = (byte[]) newByteArray(6);
        setByteElement(term117706, 0, (byte) 61);
        setByteElement(term117706, 1, (byte) 48);
        setByteElement(term117706, 2, (byte) 48);
        setByteElement(term117706, 3, (byte) 61);
        setByteElement(term117706, 4, (byte) 56);
        setByteElement(term117706, 5, (byte) 67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term115022;
        Object retValue = callMethod(klass, "encode", argTypes, term117639, args);
        assertTrue(recursiveEquals(term117639, term117714));
        assertTrue(recursiveEquals(term115022, term117715));
        assertTrue(recursiveEquals(retValue, term117706));
    }

};


