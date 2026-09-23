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

public class QuotedPrintableCodec_encode_1092762296225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159435;
     Object term158662;
     Object term159872;
     Object term159873;
     Object term159846;

    public QuotedPrintableCodec_encode_1092762296225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159435 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term158662 = (byte[]) newByteArray(8);
        term159872 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term159872, term159872.getClass(), "charset", null);
        term159873 = (byte[]) newByteArray(8);
        term159846 = (byte[]) newByteArray(24);
        setByteElement(term159846, 0, (byte) 61);
        setByteElement(term159846, 1, (byte) 48);
        setByteElement(term159846, 2, (byte) 48);
        setByteElement(term159846, 3, (byte) 61);
        setByteElement(term159846, 4, (byte) 48);
        setByteElement(term159846, 5, (byte) 48);
        setByteElement(term159846, 6, (byte) 61);
        setByteElement(term159846, 7, (byte) 48);
        setByteElement(term159846, 8, (byte) 48);
        setByteElement(term159846, 9, (byte) 61);
        setByteElement(term159846, 10, (byte) 48);
        setByteElement(term159846, 11, (byte) 48);
        setByteElement(term159846, 12, (byte) 61);
        setByteElement(term159846, 13, (byte) 48);
        setByteElement(term159846, 14, (byte) 48);
        setByteElement(term159846, 15, (byte) 61);
        setByteElement(term159846, 16, (byte) 48);
        setByteElement(term159846, 17, (byte) 48);
        setByteElement(term159846, 18, (byte) 61);
        setByteElement(term159846, 19, (byte) 48);
        setByteElement(term159846, 20, (byte) 48);
        setByteElement(term159846, 21, (byte) 61);
        setByteElement(term159846, 22, (byte) 48);
        setByteElement(term159846, 23, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term158662;
        Object retValue = callMethod(klass, "encode", argTypes, term159435, args);
        assertTrue(recursiveEquals(term159435, term159872));
        assertTrue(recursiveEquals(term158662, term159873));
        assertTrue(recursiveEquals(retValue, term159846));
    }

};


