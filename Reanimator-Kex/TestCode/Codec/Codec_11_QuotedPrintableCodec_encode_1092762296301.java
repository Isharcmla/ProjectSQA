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

public class QuotedPrintableCodec_encode_1092762296301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231669;
     Object term231386;
     Object term231732;
     Object term231733;
     Object term231727;

    public QuotedPrintableCodec_encode_1092762296301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231669 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term231386 = (byte[]) newByteArray(1);
        term231732 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term231732, term231732.getClass(), "charset", null);
        term231733 = (byte[]) newByteArray(1);
        term231727 = (byte[]) newByteArray(3);
        setByteElement(term231727, 0, (byte) 61);
        setByteElement(term231727, 1, (byte) 48);
        setByteElement(term231727, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term231386;
        Object retValue = callMethod(klass, "encode", argTypes, term231669, args);
        assertTrue(recursiveEquals(term231669, term231732));
        assertTrue(recursiveEquals(term231386, term231733));
        assertTrue(recursiveEquals(retValue, term231727));
    }

};


