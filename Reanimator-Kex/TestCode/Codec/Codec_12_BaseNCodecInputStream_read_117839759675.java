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

public class BaseNCodecInputStream_read_117839759675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79754;

    public BaseNCodecInputStream_read_117839759675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79754 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term79553 = (byte[]) newByteArray(8);
        Object term79836 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term79563 = (byte[]) newByteArray(8);
        setField(term79754, term79754.getClass(), "singleByte", term79553);
        setField(term79836, term79836.getClass(), "buffer", term79563);
        setIntField(term79836, term79836.getClass(), "pos", 0);
        setIntField(term79836, term79836.getClass(), "readPos", 0);
        setField(term79754, term79754.getClass(), "baseNCodec", term79836);
        setBooleanField(term79754, term79754.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term79754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


