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

public class BaseNCodecInputStream_read_117839759651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38717;

    public BaseNCodecInputStream_read_117839759651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38717 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term38559 = (byte[]) newByteArray(8);
        Object term38799 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term38569 = (byte[]) newByteArray(8);
        setField(term38717, term38717.getClass(), "singleByte", term38559);
        setField(term38799, term38799.getClass(), "buffer", term38569);
        setField(term38717, term38717.getClass(), "baseNCodec", term38799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term38717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


