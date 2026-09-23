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

public class QuotedPrintableCodec_decodeQuotedPrintable_199185329318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term1128;
     Object term1118;

    public QuotedPrintableCodec_decodeQuotedPrintable_199185329318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = (byte[]) newByteArray(4);
        setByteElement(term109, 0, (byte) -58);
        setByteElement(term109, 1, (byte) -29);
        setByteElement(term109, 2, (byte) -54);
        setByteElement(term109, 3, (byte) -10);
        term1128 = (byte[]) newByteArray(4);
        setByteElement(term1128, 0, (byte) -58);
        setByteElement(term1128, 1, (byte) -29);
        setByteElement(term1128, 2, (byte) -54);
        setByteElement(term1128, 3, (byte) -10);
        term1118 = (byte[]) newByteArray(4);
        setByteElement(term1118, 0, (byte) -58);
        setByteElement(term1118, 1, (byte) -29);
        setByteElement(term1118, 2, (byte) -54);
        setByteElement(term1118, 3, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term109;
        Object retValue = callMethod(klass, "decodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term109, term1128));
        assertTrue(recursiveEquals(retValue, term1118));
    }

};


