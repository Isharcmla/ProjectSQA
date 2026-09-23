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

public class QuotedPrintableCodec_decode_2102672880157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86738;
     Object term86577;
     Object term87314;
     Object term87315;
     Object term87310;

    public QuotedPrintableCodec_decode_2102672880157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86738 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term86577 = (byte[]) newByteArray(1);
        term87314 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term87314, term87314.getClass(), "charset", null);
        term87315 = (byte[]) newByteArray(1);
        term87310 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term86577;
        Object retValue = callMethod(klass, "decode", argTypes, term86738, args);
        assertTrue(recursiveEquals(term86738, term87314));
        assertTrue(recursiveEquals(term86577, term87315));
        assertTrue(recursiveEquals(retValue, term87310));
    }

};


