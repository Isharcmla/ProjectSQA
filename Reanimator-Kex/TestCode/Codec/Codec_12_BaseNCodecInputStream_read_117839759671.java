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

public class BaseNCodecInputStream_read_117839759671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78438;

    public BaseNCodecInputStream_read_117839759671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78438 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32InputStream"));
        byte[] term78288 = (byte[]) newByteArray(8);
        Object term78520 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term78298 = (byte[]) newByteArray(8);
        setField(term78438, term78438.getClass(), "singleByte", term78288);
        setField(term78520, term78520.getClass(), "buffer", term78298);
        setField(term78438, term78438.getClass(), "baseNCodec", term78520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term78438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


