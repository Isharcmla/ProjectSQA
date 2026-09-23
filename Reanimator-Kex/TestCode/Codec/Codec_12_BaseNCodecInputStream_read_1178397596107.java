package org.apache.commons.codec.binary;

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
import java.lang.NullPointerException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseNCodecInputStream_read_1178397596107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124324;

    public BaseNCodecInputStream_read_1178397596107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124324 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term124187 = (byte[]) newByteArray(1);
        Object term124406 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setField(term124324, term124324.getClass(), "singleByte", term124187);
        setField(term124406, term124406.getClass(), "buffer", null);
        setField(term124324, term124324.getClass(), "baseNCodec", term124406);
        setBooleanField(term124324, term124324.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term124324, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


