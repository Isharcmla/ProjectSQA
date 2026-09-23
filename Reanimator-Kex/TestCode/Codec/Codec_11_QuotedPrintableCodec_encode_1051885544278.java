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

public class QuotedPrintableCodec_encode_1051885544278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205629;
     Object term205460;
     Object term207519;
     Object term207520;
     Object term207513;

    public QuotedPrintableCodec_encode_1051885544278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205629 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term205460 = (byte[]) newByteArray(1);
        term207519 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term207519, term207519.getClass(), "charset", null);
        term207520 = (byte[]) newByteArray(1);
        term207513 = (byte[]) newByteArray(3);
        setByteElement(term207513, 0, (byte) 61);
        setByteElement(term207513, 1, (byte) 48);
        setByteElement(term207513, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term205460;
        Object retValue = callMethod(klass, "encode", argTypes, term205629, args);
        assertTrue(recursiveEquals(term205629, term207519));
        assertTrue(recursiveEquals(term205460, term207520));
        assertTrue(recursiveEquals(retValue, term207513));
    }

};


