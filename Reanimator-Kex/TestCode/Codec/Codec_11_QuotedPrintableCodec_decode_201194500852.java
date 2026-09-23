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

public class QuotedPrintableCodec_decode_201194500852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14977;
     Object term15386;

    public QuotedPrintableCodec_decode_201194500852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14977 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term15386 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term15386, term15386.getClass(), "charset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "decode", argTypes, term14977, args);
        assertTrue(recursiveEquals(term14977, term15386));
        assertTrue(recursiveEquals(retValue, null));
    }

};


