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

public class QuotedPrintableCodec_encode_105188554486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23175;
     Object term23059;
     Object term24046;
     Object term24047;
     Object term24044;

    public QuotedPrintableCodec_encode_105188554486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23175 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term23059 = (byte[]) newByteArray(0);
        term24046 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term24046, term24046.getClass(), "charset", null);
        term24047 = (byte[]) newByteArray(0);
        term24044 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23059;
        Object retValue = callMethod(klass, "encode", argTypes, term23175, args);
        assertTrue(recursiveEquals(term23175, term24046));
        assertTrue(recursiveEquals(term23059, term24047));
        assertTrue(recursiveEquals(retValue, term24044));
    }

};


