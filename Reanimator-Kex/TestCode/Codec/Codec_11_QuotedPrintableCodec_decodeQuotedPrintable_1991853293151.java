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

public class QuotedPrintableCodec_decodeQuotedPrintable_1991853293151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81682;

    public QuotedPrintableCodec_decodeQuotedPrintable_1991853293151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81682 = (byte[]) newByteArray(2);
        setByteElement(term81682, 1, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term81682;
        try {
            callMethod(klass, "decodeQuotedPrintable", argTypes, null, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


