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

public class BaseNCodecInputStream_read_1178397596109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124835;

    public BaseNCodecInputStream_read_1178397596109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124835 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term124685 = (byte[]) newByteArray(8);
        Object term124917 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term124695 = (byte[]) newByteArray(8);
        setField(term124835, term124835.getClass(), "singleByte", term124685);
        setField(term124917, term124917.getClass(), "buffer", term124695);
        setField(term124835, term124835.getClass(), "baseNCodec", term124917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term124835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


