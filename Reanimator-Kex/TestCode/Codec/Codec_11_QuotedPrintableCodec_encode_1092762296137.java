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

public class QuotedPrintableCodec_encode_1092762296137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70040;
     Object term69871;
     Object term70103;
     Object term70104;
     Object term70098;

    public QuotedPrintableCodec_encode_1092762296137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70040 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term69871 = (byte[]) newByteArray(1);
        term70103 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term70103, term70103.getClass(), "charset", null);
        term70104 = (byte[]) newByteArray(1);
        term70098 = (byte[]) newByteArray(3);
        setByteElement(term70098, 0, (byte) 61);
        setByteElement(term70098, 1, (byte) 48);
        setByteElement(term70098, 2, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term69871;
        Object retValue = callMethod(klass, "encode", argTypes, term70040, args);
        assertTrue(recursiveEquals(term70040, term70103));
        assertTrue(recursiveEquals(term69871, term70104));
        assertTrue(recursiveEquals(retValue, term70098));
    }

};


