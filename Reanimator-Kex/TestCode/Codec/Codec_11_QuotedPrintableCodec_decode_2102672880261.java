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
import org.apache.commons.codec.DecoderException;
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class QuotedPrintableCodec_decode_2102672880261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191172;
     Object enum1;

    public QuotedPrintableCodec_decode_2102672880261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191172 = newInstance(Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec"));
        Class<? extends Object> term192174 = Class.forName((String) "java.util.Locale$IsoCountryCode");
        Field term192173 = ((Class) term192174).getDeclaredField((String) "PART1_ALPHA2");
        ((Field) term192173).setAccessible(true);
        enum1 = ((Field) term192173).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = enum1;
        try {
            callMethod(klass, "decode", argTypes, term191172, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


