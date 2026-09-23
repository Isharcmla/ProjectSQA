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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190466;
     Object term188080;
     Object term190519;
     Object term190520;
     Object term190510;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190466 = newInstance(Class.forName("java.util.BitSet"));
        term188080 = (byte[]) newByteArray(1);
        setByteElement(term188080, 0, (byte) 11);
        term190519 = newInstance(Class.forName("java.util.BitSet"));
        setField(term190519, term190519.getClass(), "words", null);
        setIntField(term190519, term190519.getClass(), "wordsInUse", 0);
        setBooleanField(term190519, term190519.getClass(), "sizeIsSticky", false);
        term190520 = (byte[]) newByteArray(1);
        setByteElement(term190520, 0, (byte) 11);
        term190510 = (byte[]) newByteArray(3);
        setByteElement(term190510, 0, (byte) 61);
        setByteElement(term190510, 1, (byte) 48);
        setByteElement(term190510, 2, (byte) 66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term190466;
        args[1] = term188080;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term190466, term190519));
        assertTrue(recursiveEquals(term188080, term190520));
        assertTrue(recursiveEquals(retValue, term190510));
    }

};


