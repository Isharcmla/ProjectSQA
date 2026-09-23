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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class QuotedPrintableCodec_encodeQuotedPrintable_48563551817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term97;

    public QuotedPrintableCodec_encodeQuotedPrintable_48563551817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("java.util.BitSet"));
        long[] term93 = (long[]) newLongArray(1);
        setField(term92, term92.getClass(), "words", term93);
        setIntField(term92, term92.getClass(), "wordsInUse", 1484323161);
        setBooleanField(term92, term92.getClass(), "sizeIsSticky", false);
        term97 = (byte[]) newByteArray(5);
        setByteElement(term97, 0, (byte) 47);
        setByteElement(term97, 1, (byte) 48);
        setByteElement(term97, 2, (byte) 89);
        setByteElement(term97, 3, (byte) 75);
        setByteElement(term97, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term92;
        args[1] = term97;
        try {
            callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


