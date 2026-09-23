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

public class QuotedPrintableCodec_decode_210267288053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15383;
     Object term15267;
     Object term15397;
     Object term15398;
     Object term15395;

    public QuotedPrintableCodec_decode_210267288053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15383 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        term15267 = (byte[]) newByteArray(0);
        term15397 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        setField(term15397, term15397.getClass(), "charset", null);
        term15398 = (byte[]) newByteArray(0);
        term15395 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15267;
        Object retValue = callMethod(klass, "decode", argTypes, term15383, args);
        assertTrue(recursiveEquals(term15383, term15397));
        assertTrue(recursiveEquals(term15267, term15398));
        assertTrue(recursiveEquals(retValue, term15395));
    }

};


