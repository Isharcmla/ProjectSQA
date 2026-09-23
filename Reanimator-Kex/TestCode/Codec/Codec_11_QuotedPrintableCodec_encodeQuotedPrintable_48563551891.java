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

public class QuotedPrintableCodec_encodeQuotedPrintable_48563551891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25805;
     Object term25707;
     Object term25858;
     Object term25859;
     Object term25849;

    public QuotedPrintableCodec_encodeQuotedPrintable_48563551891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25805 = newInstance(Class.forName("java.util.BitSet"));
        term25707 = (byte[]) newByteArray(1);
        term25858 = newInstance(Class.forName("java.util.BitSet"));
        setField(term25858, term25858.getClass(), "words", null);
        setIntField(term25858, term25858.getClass(), "wordsInUse", 0);
        setBooleanField(term25858, term25858.getClass(), "sizeIsSticky", false);
        term25859 = (byte[]) newByteArray(1);
        term25849 = (byte[]) newByteArray(3);
        setByteElement(term25849, 0, (byte) 61);
        setByteElement(term25849, 1, (byte) 48);
        setByteElement(term25849, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term25805;
        args[1] = term25707;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term25805, term25858));
        assertTrue(recursiveEquals(term25707, term25859));
        assertTrue(recursiveEquals(retValue, term25849));
    }

};


