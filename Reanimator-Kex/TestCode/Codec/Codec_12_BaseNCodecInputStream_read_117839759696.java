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

public class BaseNCodecInputStream_read_117839759696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120738;

    public BaseNCodecInputStream_read_117839759696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120738 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term120588 = (byte[]) newByteArray(8);
        Object term120820 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term120598 = (byte[]) newByteArray(8);
        setField(term120738, term120738.getClass(), "singleByte", term120588);
        setField(term120820, term120820.getClass(), "buffer", term120598);
        setField(term120738, term120738.getClass(), "baseNCodec", term120820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term120738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


