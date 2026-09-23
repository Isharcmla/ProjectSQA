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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95314;
     Object term95218;
     Object term99104;
     Object term99105;
     Object term99095;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95314 = newInstance(Class.forName("java.util.BitSet"));
        term95218 = (byte[]) newByteArray(1);
        setByteElement(term95218, 0, (byte) -128);
        term99104 = newInstance(Class.forName("java.util.BitSet"));
        setField(term99104, term99104.getClass(), "words", null);
        setIntField(term99104, term99104.getClass(), "wordsInUse", 0);
        setBooleanField(term99104, term99104.getClass(), "sizeIsSticky", false);
        term99105 = (byte[]) newByteArray(1);
        setByteElement(term99105, 0, (byte) -128);
        term99095 = (byte[]) newByteArray(3);
        setByteElement(term99095, 0, (byte) 61);
        setByteElement(term99095, 1, (byte) 56);
        setByteElement(term99095, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term95314;
        args[1] = term95218;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term95314, term99104));
        assertTrue(recursiveEquals(term95218, term99105));
        assertTrue(recursiveEquals(retValue, term99095));
    }

};


