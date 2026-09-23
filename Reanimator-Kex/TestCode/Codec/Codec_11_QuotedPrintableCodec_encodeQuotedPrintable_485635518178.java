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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101971;
     Object term101881;
     Object term102144;
     Object term102145;
     Object term102139;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101971 = newInstance(Class.forName("java.util.BitSet"));
        term101881 = (byte[]) newByteArray(0);
        term102144 = newInstance(Class.forName("java.util.BitSet"));
        setField(term102144, term102144.getClass(), "words", null);
        setIntField(term102144, term102144.getClass(), "wordsInUse", 0);
        setBooleanField(term102144, term102144.getClass(), "sizeIsSticky", false);
        term102145 = (byte[]) newByteArray(0);
        term102139 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term101971;
        args[1] = term101881;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term101971, term102144));
        assertTrue(recursiveEquals(term101881, term102145));
        assertTrue(recursiveEquals(retValue, term102139));
    }

};


