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

public class BaseNCodecInputStream_read_117839759699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121885;

    public BaseNCodecInputStream_read_117839759699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121885 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term121684 = (byte[]) newByteArray(8);
        Object term121967 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term121694 = (byte[]) newByteArray(8);
        setField(term121885, term121885.getClass(), "singleByte", term121684);
        setField(term121967, term121967.getClass(), "buffer", term121694);
        setIntField(term121967, term121967.getClass(), "pos", 0);
        setIntField(term121967, term121967.getClass(), "readPos", 0);
        setField(term121885, term121885.getClass(), "baseNCodec", term121967);
        setBooleanField(term121885, term121885.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term121885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


