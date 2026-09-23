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

public class QuotedPrintableCodec_decode_47646576139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71672;
     Object term70111;
     Object term71775;
     Object term71776;
     Object term71757;

    public QuotedPrintableCodec_decode_47646576139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71672 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term70111 = (byte[]) newByteArray(16);
        setByteElement(term70111, 0, (byte) -128);
        setByteElement(term70111, 1, (byte) -128);
        setByteElement(term70111, 2, (byte) -128);
        setByteElement(term70111, 3, (byte) -128);
        term71775 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term71775, term71775.getClass(), "charset", null);
        term71776 = (byte[]) newByteArray(16);
        setByteElement(term71776, 0, (byte) -128);
        setByteElement(term71776, 1, (byte) -128);
        setByteElement(term71776, 2, (byte) -128);
        setByteElement(term71776, 3, (byte) -128);
        term71757 = (byte[]) newByteArray(16);
        setByteElement(term71757, 0, (byte) -128);
        setByteElement(term71757, 1, (byte) -128);
        setByteElement(term71757, 2, (byte) -128);
        setByteElement(term71757, 3, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70111;
        Object retValue = callMethod(klass, "decode", argTypes, term71672, args);
        assertTrue(recursiveEquals(term71672, term71775));
        assertTrue(recursiveEquals(term70111, term71776));
        assertTrue(recursiveEquals(retValue, term71757));
    }

};


