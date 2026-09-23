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
import java.lang.OutOfMemoryError;
import static org.apache.commons.codec.net.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class QuotedPrintableCodec_encodeQuotedPrintable_120132191316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term25;

    public QuotedPrintableCodec_encodeQuotedPrintable_120132191316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        term25 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        byte[] term26 = (byte[]) newByteArray(32);
        setField(term25, term25.getClass(), "buf", term26);
        setIntField(term25, term25.getClass(), "count", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.net.QuotedPrintableCodec");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.io.ByteArrayOutputStream");
        Object[] args = new Object[2];
        args[0] = term23;
        args[1] = term25;
        try {
            callMethod(klass, "encodeQuotedPrintable", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


