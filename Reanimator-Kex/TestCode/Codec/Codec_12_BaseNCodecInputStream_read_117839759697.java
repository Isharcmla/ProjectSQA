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

public class BaseNCodecInputStream_read_117839759697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120975;

    public BaseNCodecInputStream_read_117839759697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120975 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term120838 = (byte[]) newByteArray(1);
        Object term121057 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setField(term120975, term120975.getClass(), "singleByte", term120838);
        setField(term121057, term121057.getClass(), "buffer", null);
        setField(term120975, term120975.getClass(), "baseNCodec", term121057);
        setBooleanField(term120975, term120975.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term120975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


