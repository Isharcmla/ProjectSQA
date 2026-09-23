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
import org.apache.commons.codec.DecoderException;
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QuotedPrintableCodec_decodeQuotedPrintable_1991853293229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161427;

    public QuotedPrintableCodec_decodeQuotedPrintable_1991853293229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161427 = (byte[]) newByteArray(32);
        setByteElement(term161427, 0, (byte) -128);
        setByteElement(term161427, 2, (byte) 61);
        setByteElement(term161427, 3, (byte) -128);
        setByteElement(term161427, 4, (byte) -128);
        setByteElement(term161427, 5, (byte) -128);
        setByteElement(term161427, 6, (byte) -128);
        setByteElement(term161427, 7, (byte) -128);
        setByteElement(term161427, 8, (byte) -128);
        setByteElement(term161427, 9, (byte) -128);
        setByteElement(term161427, 10, (byte) -128);
        setByteElement(term161427, 11, (byte) -128);
        setByteElement(term161427, 12, (byte) -128);
        setByteElement(term161427, 13, (byte) -128);
        setByteElement(term161427, 14, (byte) -128);
        setByteElement(term161427, 15, (byte) -128);
        setByteElement(term161427, 16, (byte) -128);
        setByteElement(term161427, 17, (byte) -128);
        setByteElement(term161427, 18, (byte) -128);
        setByteElement(term161427, 19, (byte) -128);
        setByteElement(term161427, 20, (byte) -128);
        setByteElement(term161427, 21, (byte) -128);
        setByteElement(term161427, 22, (byte) -128);
        setByteElement(term161427, 23, (byte) -128);
        setByteElement(term161427, 24, (byte) -128);
        setByteElement(term161427, 25, (byte) -128);
        setByteElement(term161427, 26, (byte) -128);
        setByteElement(term161427, 27, (byte) -128);
        setByteElement(term161427, 28, (byte) -128);
        setByteElement(term161427, 29, (byte) -128);
        setByteElement(term161427, 30, (byte) -128);
        setByteElement(term161427, 31, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term161427;
        try {
            callMethod(klass, "decodeQuotedPrintable", argTypes, null, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


