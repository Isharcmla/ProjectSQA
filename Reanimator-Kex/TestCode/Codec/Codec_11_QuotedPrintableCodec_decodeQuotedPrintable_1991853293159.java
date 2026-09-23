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

public class QuotedPrintableCodec_decodeQuotedPrintable_1991853293159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87319;
     Object term87627;
     Object term87623;

    public QuotedPrintableCodec_decodeQuotedPrintable_1991853293159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87319 = (byte[]) newByteArray(1);
        setByteElement(term87319, 0, (byte) -128);
        term87627 = (byte[]) newByteArray(1);
        setByteElement(term87627, 0, (byte) -128);
        term87623 = (byte[]) newByteArray(1);
        setByteElement(term87623, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term87319;
        Object retValue = callMethod(klass, "decodeQuotedPrintable", argTypes, null, args);
        assertTrue(recursiveEquals(term87319, term87627));
        assertTrue(recursiveEquals(retValue, term87623));
    }

};


