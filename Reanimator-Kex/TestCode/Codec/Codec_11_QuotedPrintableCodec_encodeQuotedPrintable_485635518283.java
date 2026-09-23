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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213478;
     Object term210022;
     Object term213572;
     Object term213573;
     Object term213559;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213478 = newInstance(Class.forName("java.util.BitSet"));
        term210022 = (byte[]) newByteArray(2);
        setByteElement(term210022, 0, (byte) 12);
        setByteElement(term210022, 1, (byte) 3);
        term213572 = newInstance(Class.forName("java.util.BitSet"));
        setField(term213572, term213572.getClass(), "words", null);
        setIntField(term213572, term213572.getClass(), "wordsInUse", 0);
        setBooleanField(term213572, term213572.getClass(), "sizeIsSticky", false);
        term213573 = (byte[]) newByteArray(2);
        setByteElement(term213573, 0, (byte) 12);
        setByteElement(term213573, 1, (byte) 3);
        term213559 = (byte[]) newByteArray(6);
        setByteElement(term213559, 0, (byte) 61);
        setByteElement(term213559, 1, (byte) 48);
        setByteElement(term213559, 2, (byte) 67);
        setByteElement(term213559, 3, (byte) 61);
        setByteElement(term213559, 4, (byte) 48);
        setByteElement(term213559, 5, (byte) 51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term213478;
        args[1] = term210022;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term213478, term213572));
        assertTrue(recursiveEquals(term210022, term213573));
        assertTrue(recursiveEquals(retValue, term213559));
    }

};


