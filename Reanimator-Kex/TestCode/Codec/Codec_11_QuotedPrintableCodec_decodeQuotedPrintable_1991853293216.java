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

public class QuotedPrintableCodec_decodeQuotedPrintable_1991853293216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129489;

    public QuotedPrintableCodec_decodeQuotedPrintable_1991853293216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129489 = (byte[]) newByteArray(64);
        setByteElement(term129489, 0, (byte) -128);
        setByteElement(term129489, 3, (byte) 61);
        setByteElement(term129489, 4, (byte) -128);
        setByteElement(term129489, 5, (byte) -128);
        setByteElement(term129489, 6, (byte) -128);
        setByteElement(term129489, 7, (byte) -128);
        setByteElement(term129489, 8, (byte) -128);
        setByteElement(term129489, 9, (byte) -128);
        setByteElement(term129489, 10, (byte) -128);
        setByteElement(term129489, 11, (byte) -128);
        setByteElement(term129489, 12, (byte) -128);
        setByteElement(term129489, 13, (byte) -128);
        setByteElement(term129489, 14, (byte) -128);
        setByteElement(term129489, 15, (byte) -128);
        setByteElement(term129489, 16, (byte) -128);
        setByteElement(term129489, 17, (byte) -128);
        setByteElement(term129489, 18, (byte) -128);
        setByteElement(term129489, 19, (byte) -128);
        setByteElement(term129489, 20, (byte) -128);
        setByteElement(term129489, 21, (byte) -128);
        setByteElement(term129489, 22, (byte) -128);
        setByteElement(term129489, 23, (byte) -128);
        setByteElement(term129489, 24, (byte) -128);
        setByteElement(term129489, 25, (byte) -128);
        setByteElement(term129489, 26, (byte) -128);
        setByteElement(term129489, 27, (byte) -128);
        setByteElement(term129489, 28, (byte) -128);
        setByteElement(term129489, 29, (byte) -128);
        setByteElement(term129489, 30, (byte) -128);
        setByteElement(term129489, 31, (byte) -128);
        setByteElement(term129489, 32, (byte) -128);
        setByteElement(term129489, 33, (byte) -128);
        setByteElement(term129489, 34, (byte) -128);
        setByteElement(term129489, 35, (byte) -128);
        setByteElement(term129489, 36, (byte) -128);
        setByteElement(term129489, 37, (byte) -128);
        setByteElement(term129489, 38, (byte) -128);
        setByteElement(term129489, 39, (byte) -128);
        setByteElement(term129489, 40, (byte) -128);
        setByteElement(term129489, 41, (byte) -128);
        setByteElement(term129489, 42, (byte) -128);
        setByteElement(term129489, 43, (byte) -128);
        setByteElement(term129489, 44, (byte) -128);
        setByteElement(term129489, 45, (byte) -128);
        setByteElement(term129489, 46, (byte) -128);
        setByteElement(term129489, 47, (byte) -128);
        setByteElement(term129489, 48, (byte) -128);
        setByteElement(term129489, 49, (byte) -128);
        setByteElement(term129489, 50, (byte) -128);
        setByteElement(term129489, 51, (byte) -128);
        setByteElement(term129489, 52, (byte) -128);
        setByteElement(term129489, 53, (byte) -128);
        setByteElement(term129489, 54, (byte) -128);
        setByteElement(term129489, 55, (byte) -128);
        setByteElement(term129489, 56, (byte) -128);
        setByteElement(term129489, 57, (byte) -128);
        setByteElement(term129489, 58, (byte) -128);
        setByteElement(term129489, 59, (byte) -128);
        setByteElement(term129489, 60, (byte) -128);
        setByteElement(term129489, 61, (byte) -128);
        setByteElement(term129489, 62, (byte) -128);
        setByteElement(term129489, 63, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term129489;
        try {
            callMethod(klass, "decodeQuotedPrintable", argTypes, null, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


