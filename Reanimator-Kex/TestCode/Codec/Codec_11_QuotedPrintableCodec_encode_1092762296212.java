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

public class QuotedPrintableCodec_encode_1092762296212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125005;
     Object term123866;
     Object term149850;
     Object term149851;
     Object term149810;

    public QuotedPrintableCodec_encode_1092762296212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125005 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term123866 = (byte[]) newByteArray(32);
        setByteElement(term123866, 1, (byte) -112);
        setByteElement(term123866, 2, (byte) -128);
        setByteElement(term123866, 3, (byte) 57);
        setByteElement(term123866, 4, (byte) 57);
        setByteElement(term123866, 5, (byte) 57);
        setByteElement(term123866, 6, (byte) 57);
        setByteElement(term123866, 7, (byte) 57);
        setByteElement(term123866, 8, (byte) 57);
        setByteElement(term123866, 9, (byte) 57);
        setByteElement(term123866, 10, (byte) 57);
        setByteElement(term123866, 11, (byte) 57);
        setByteElement(term123866, 12, (byte) 57);
        setByteElement(term123866, 13, (byte) 57);
        setByteElement(term123866, 14, (byte) 57);
        setByteElement(term123866, 15, (byte) 57);
        setByteElement(term123866, 16, (byte) 57);
        setByteElement(term123866, 17, (byte) 57);
        setByteElement(term123866, 18, (byte) 57);
        setByteElement(term123866, 19, (byte) 57);
        setByteElement(term123866, 20, (byte) 57);
        setByteElement(term123866, 21, (byte) 57);
        setByteElement(term123866, 22, (byte) 57);
        setByteElement(term123866, 23, (byte) 57);
        setByteElement(term123866, 24, (byte) 57);
        setByteElement(term123866, 25, (byte) 57);
        setByteElement(term123866, 26, (byte) 57);
        setByteElement(term123866, 27, (byte) 57);
        setByteElement(term123866, 28, (byte) 57);
        setByteElement(term123866, 29, (byte) 57);
        setByteElement(term123866, 30, (byte) 57);
        setByteElement(term123866, 31, (byte) 57);
        term149850 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term149850, term149850.getClass(), "charset", null);
        term149851 = (byte[]) newByteArray(32);
        setByteElement(term149851, 1, (byte) -112);
        setByteElement(term149851, 2, (byte) -128);
        setByteElement(term149851, 3, (byte) 57);
        setByteElement(term149851, 4, (byte) 57);
        setByteElement(term149851, 5, (byte) 57);
        setByteElement(term149851, 6, (byte) 57);
        setByteElement(term149851, 7, (byte) 57);
        setByteElement(term149851, 8, (byte) 57);
        setByteElement(term149851, 9, (byte) 57);
        setByteElement(term149851, 10, (byte) 57);
        setByteElement(term149851, 11, (byte) 57);
        setByteElement(term149851, 12, (byte) 57);
        setByteElement(term149851, 13, (byte) 57);
        setByteElement(term149851, 14, (byte) 57);
        setByteElement(term149851, 15, (byte) 57);
        setByteElement(term149851, 16, (byte) 57);
        setByteElement(term149851, 17, (byte) 57);
        setByteElement(term149851, 18, (byte) 57);
        setByteElement(term149851, 19, (byte) 57);
        setByteElement(term149851, 20, (byte) 57);
        setByteElement(term149851, 21, (byte) 57);
        setByteElement(term149851, 22, (byte) 57);
        setByteElement(term149851, 23, (byte) 57);
        setByteElement(term149851, 24, (byte) 57);
        setByteElement(term149851, 25, (byte) 57);
        setByteElement(term149851, 26, (byte) 57);
        setByteElement(term149851, 27, (byte) 57);
        setByteElement(term149851, 28, (byte) 57);
        setByteElement(term149851, 29, (byte) 57);
        setByteElement(term149851, 30, (byte) 57);
        setByteElement(term149851, 31, (byte) 57);
        term149810 = (byte[]) newByteArray(38);
        setByteElement(term149810, 0, (byte) 61);
        setByteElement(term149810, 1, (byte) 48);
        setByteElement(term149810, 2, (byte) 48);
        setByteElement(term149810, 3, (byte) 61);
        setByteElement(term149810, 4, (byte) 57);
        setByteElement(term149810, 5, (byte) 48);
        setByteElement(term149810, 6, (byte) 61);
        setByteElement(term149810, 7, (byte) 56);
        setByteElement(term149810, 8, (byte) 48);
        setByteElement(term149810, 9, (byte) 57);
        setByteElement(term149810, 10, (byte) 57);
        setByteElement(term149810, 11, (byte) 57);
        setByteElement(term149810, 12, (byte) 57);
        setByteElement(term149810, 13, (byte) 57);
        setByteElement(term149810, 14, (byte) 57);
        setByteElement(term149810, 15, (byte) 57);
        setByteElement(term149810, 16, (byte) 57);
        setByteElement(term149810, 17, (byte) 57);
        setByteElement(term149810, 18, (byte) 57);
        setByteElement(term149810, 19, (byte) 57);
        setByteElement(term149810, 20, (byte) 57);
        setByteElement(term149810, 21, (byte) 57);
        setByteElement(term149810, 22, (byte) 57);
        setByteElement(term149810, 23, (byte) 57);
        setByteElement(term149810, 24, (byte) 57);
        setByteElement(term149810, 25, (byte) 57);
        setByteElement(term149810, 26, (byte) 57);
        setByteElement(term149810, 27, (byte) 57);
        setByteElement(term149810, 28, (byte) 57);
        setByteElement(term149810, 29, (byte) 57);
        setByteElement(term149810, 30, (byte) 57);
        setByteElement(term149810, 31, (byte) 57);
        setByteElement(term149810, 32, (byte) 57);
        setByteElement(term149810, 33, (byte) 57);
        setByteElement(term149810, 34, (byte) 57);
        setByteElement(term149810, 35, (byte) 57);
        setByteElement(term149810, 36, (byte) 57);
        setByteElement(term149810, 37, (byte) 57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term123866;
        Object retValue = callMethod(klass, "encode", argTypes, term125005, args);
        assertTrue(recursiveEquals(term125005, term149850));
        assertTrue(recursiveEquals(term123866, term149851));
        assertTrue(recursiveEquals(retValue, term149810));
    }

};


