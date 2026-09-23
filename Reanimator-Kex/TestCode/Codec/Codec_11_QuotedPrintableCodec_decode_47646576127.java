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

public class QuotedPrintableCodec_decode_47646576127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61130;
     Object term60630;
     Object term61143;
     Object term61144;
     Object term61140;

    public QuotedPrintableCodec_decode_47646576127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61130 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term60630 = (byte[]) newByteArray(1);
        setByteElement(term60630, 0, (byte) -128);
        term61143 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term61143, term61143.getClass(), "charset", null);
        term61144 = (byte[]) newByteArray(1);
        setByteElement(term61144, 0, (byte) -128);
        term61140 = (byte[]) newByteArray(1);
        setByteElement(term61140, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term60630;
        Object retValue = callMethod(klass, "decode", argTypes, term61130, args);
        assertTrue(recursiveEquals(term61130, term61143));
        assertTrue(recursiveEquals(term60630, term61144));
        assertTrue(recursiveEquals(retValue, term61140));
    }

};


