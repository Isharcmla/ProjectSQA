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

public class QuotedPrintableCodec_decode_47646576282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210017;
     Object term207822;
     Object term213502;
     Object term213503;
     Object term213497;

    public QuotedPrintableCodec_decode_47646576282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210017 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term207822 = (byte[]) newByteArray(3);
        setByteElement(term207822, 0, (byte) -128);
        term213502 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term213502, term213502.getClass(), "charset", null);
        term213503 = (byte[]) newByteArray(3);
        setByteElement(term213503, 0, (byte) -128);
        term213497 = (byte[]) newByteArray(3);
        setByteElement(term213497, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term207822;
        Object retValue = callMethod(klass, "decode", argTypes, term210017, args);
        assertTrue(recursiveEquals(term210017, term213502));
        assertTrue(recursiveEquals(term207822, term213503));
        assertTrue(recursiveEquals(retValue, term213497));
    }

};


