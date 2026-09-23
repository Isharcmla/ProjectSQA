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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100697;
     Object term99783;
     Object term100759;
     Object term100760;
     Object term100746;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100697 = newInstance(Class.forName("java.util.BitSet"));
        term99783 = (byte[]) newByteArray(2);
        setByteElement(term99783, 1, (byte) -128);
        term100759 = newInstance(Class.forName("java.util.BitSet"));
        setField(term100759, term100759.getClass(), "words", null);
        setIntField(term100759, term100759.getClass(), "wordsInUse", 0);
        setBooleanField(term100759, term100759.getClass(), "sizeIsSticky", false);
        term100760 = (byte[]) newByteArray(2);
        setByteElement(term100760, 1, (byte) -128);
        term100746 = (byte[]) newByteArray(6);
        setByteElement(term100746, 0, (byte) 61);
        setByteElement(term100746, 1, (byte) 48);
        setByteElement(term100746, 2, (byte) 48);
        setByteElement(term100746, 3, (byte) 61);
        setByteElement(term100746, 4, (byte) 56);
        setByteElement(term100746, 5, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term100697;
        args[1] = term99783;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term100697, term100759));
        assertTrue(recursiveEquals(term99783, term100760));
        assertTrue(recursiveEquals(retValue, term100746));
    }

};


