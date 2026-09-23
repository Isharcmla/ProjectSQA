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

public class QuotedPrintableCodec_encode_1092762296180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102135;
     Object term101973;
     Object term103116;
     Object term103117;
     Object term103114;

    public QuotedPrintableCodec_encode_1092762296180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102135 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term101973 = (byte[]) newByteArray(0);
        term103116 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term103116, term103116.getClass(), "charset", null);
        term103117 = (byte[]) newByteArray(0);
        term103114 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term101973;
        Object retValue = callMethod(klass, "encode", argTypes, term102135, args);
        assertTrue(recursiveEquals(term102135, term103116));
        assertTrue(recursiveEquals(term101973, term103117));
        assertTrue(recursiveEquals(retValue, term103114));
    }

};


