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

public class QuotedPrintableCodec_decode_47646576248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179462;
     Object term179234;

    public QuotedPrintableCodec_decode_47646576248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179462 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term179234 = (byte[]) newByteArray(64);
        setByteElement(term179234, 0, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term179234;
        try {
            callMethod(klass, "decode", argTypes, term179462, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


