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

public class QuotedPrintableCodec_encode_1051885544253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185122;
     Object term185000;
     Object term185142;
     Object term185143;
     Object term185140;

    public QuotedPrintableCodec_encode_1051885544253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185122 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term185000 = (byte[]) newByteArray(0);
        term185142 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term185142, term185142.getClass(), "charset", null);
        term185143 = (byte[]) newByteArray(0);
        term185140 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term185000;
        Object retValue = callMethod(klass, "encode", argTypes, term185122, args);
        assertTrue(recursiveEquals(term185122, term185142));
        assertTrue(recursiveEquals(term185000, term185143));
        assertTrue(recursiveEquals(retValue, term185140));
    }

};


