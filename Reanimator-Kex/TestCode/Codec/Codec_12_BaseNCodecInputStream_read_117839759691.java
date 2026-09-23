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

public class BaseNCodecInputStream_read_117839759691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118738;

    public BaseNCodecInputStream_read_117839759691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118738 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term117929 = (byte[]) newByteArray(128);
        Object term118820 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term118059 = (byte[]) newByteArray(128);
        setField(term118738, term118738.getClass(), "singleByte", term117929);
        setField(term118820, term118820.getClass(), "buffer", term118059);
        setIntField(term118820, term118820.getClass(), "pos", 0);
        setIntField(term118820, term118820.getClass(), "readPos", 0);
        setField(term118738, term118738.getClass(), "baseNCodec", term118820);
        setBooleanField(term118738, term118738.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term118738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


