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

public class QuotedPrintableCodec_encode_114261341621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;
     Object term1492;

    public QuotedPrintableCodec_encode_114261341621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term160, term160.getClass(), "charset", "UTF-8");
        term1492 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term1492, term1492.getClass(), "charset", "UTF-8");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "encode", argTypes, term160, args);
        assertTrue(recursiveEquals(term160, term1492));
        assertTrue(recursiveEquals(retValue, "sjlJAEtRrb"));
    }

};


