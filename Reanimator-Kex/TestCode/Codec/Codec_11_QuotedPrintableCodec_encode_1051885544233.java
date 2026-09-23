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
import org.apache.commons.codec.EncoderException;
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QuotedPrintableCodec_encode_1051885544233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166502;
     Object term166606;

    public QuotedPrintableCodec_encode_1051885544233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166502 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term166606 = newInstance(Class.forName("org.apache.commons.codec.language.ColognePhonetic"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term166606;
        try {
            callMethod(klass, "encode", argTypes, term166502, args);
            assertTrue(false);
        }
        catch (EncoderException e) {
        }

    }

};


