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

public class QuotedPrintableCodec_encodeQuotedPrintable_485635518149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81568;
     Object term81676;
     Object term81670;

    public QuotedPrintableCodec_encodeQuotedPrintable_485635518149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81568 = (byte[]) newByteArray(1);
        term81676 = (byte[]) newByteArray(1);
        term81670 = (byte[]) newByteArray(3);
        setByteElement(term81670, 0, (byte) 61);
        setByteElement(term81670, 1, (byte) 48);
        setByteElement(term81670, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.BitSet");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81568;
        Object retValue = callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term81568, term81676));
        assertTrue(recursiveEquals(retValue, term81670));
    }

};


