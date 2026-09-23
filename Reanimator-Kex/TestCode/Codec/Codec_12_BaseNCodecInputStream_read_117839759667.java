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

public class BaseNCodecInputStream_read_117839759667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77191;

    public BaseNCodecInputStream_read_117839759667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77191 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term77041 = (byte[]) newByteArray(8);
        Object term77273 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term77051 = (byte[]) newByteArray(8);
        setField(term77191, term77191.getClass(), "singleByte", term77041);
        setField(term77273, term77273.getClass(), "buffer", term77051);
        setField(term77191, term77191.getClass(), "baseNCodec", term77273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term77191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


