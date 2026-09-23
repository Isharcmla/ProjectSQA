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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205336;
     Object term203670;
     Object term205437;
     Object term205438;
     Object term205416;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205336 = newInstance(Class.forName("java.util.BitSet"));
        term203670 = (byte[]) newByteArray(4);
        term205437 = newInstance(Class.forName("java.util.BitSet"));
        setField(term205437, term205437.getClass(), "words", null);
        setIntField(term205437, term205437.getClass(), "wordsInUse", 0);
        setBooleanField(term205437, term205437.getClass(), "sizeIsSticky", false);
        term205438 = (byte[]) newByteArray(4);
        term205416 = (byte[]) newByteArray(12);
        setByteElement(term205416, 0, (byte) 61);
        setByteElement(term205416, 1, (byte) 48);
        setByteElement(term205416, 2, (byte) 48);
        setByteElement(term205416, 3, (byte) 61);
        setByteElement(term205416, 4, (byte) 48);
        setByteElement(term205416, 5, (byte) 48);
        setByteElement(term205416, 6, (byte) 61);
        setByteElement(term205416, 7, (byte) 48);
        setByteElement(term205416, 8, (byte) 48);
        setByteElement(term205416, 9, (byte) 61);
        setByteElement(term205416, 10, (byte) 48);
        setByteElement(term205416, 11, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term205336;
        args[1] = term203670;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term205336, term205437));
        assertTrue(recursiveEquals(term203670, term205438));
        assertTrue(recursiveEquals(retValue, term205416));
    }

};


