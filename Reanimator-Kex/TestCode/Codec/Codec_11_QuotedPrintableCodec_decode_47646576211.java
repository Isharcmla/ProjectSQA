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

public class QuotedPrintableCodec_decode_47646576211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123862;
     Object term122505;
     Object term149585;
     Object term149586;
     Object term149581;

    public QuotedPrintableCodec_decode_47646576211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123862 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term122505 = (byte[]) newByteArray(2);
        setByteElement(term122505, 0, (byte) -128);
        term149585 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term149585, term149585.getClass(), "charset", null);
        term149586 = (byte[]) newByteArray(2);
        setByteElement(term149586, 0, (byte) -128);
        term149581 = (byte[]) newByteArray(2);
        setByteElement(term149581, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term122505;
        Object retValue = callMethod(klass, "decode", argTypes, term123862, args);
        assertTrue(recursiveEquals(term123862, term149585));
        assertTrue(recursiveEquals(term122505, term149586));
        assertTrue(recursiveEquals(retValue, term149581));
    }

};


