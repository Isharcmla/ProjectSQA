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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseNCodecInputStream_read_117839759673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79083;

    public BaseNCodecInputStream_read_117839759673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79083 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term78886 = (byte[]) newByteArray(8);
        Object term79165 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term78896 = (byte[]) newByteArray(8);
        setField(term79083, term79083.getClass(), "singleByte", term78886);
        setField(term79165, term79165.getClass(), "buffer", term78896);
        setIntField(term79165, term79165.getClass(), "pos", -33554561);
        setIntField(term79165, term79165.getClass(), "readPos", 33554816);
        setField(term79083, term79083.getClass(), "baseNCodec", term79165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term79083, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


