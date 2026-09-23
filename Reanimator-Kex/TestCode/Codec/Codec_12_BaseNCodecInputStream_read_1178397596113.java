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

public class BaseNCodecInputStream_read_1178397596113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126151;

    public BaseNCodecInputStream_read_1178397596113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126151 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        byte[] term125950 = (byte[]) newByteArray(8);
        Object term126233 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term125960 = (byte[]) newByteArray(8);
        setField(term126151, term126151.getClass(), "singleByte", term125950);
        setField(term126233, term126233.getClass(), "buffer", term125960);
        setIntField(term126233, term126233.getClass(), "pos", 0);
        setIntField(term126233, term126233.getClass(), "readPos", 0);
        setField(term126151, term126151.getClass(), "baseNCodec", term126233);
        setBooleanField(term126151, term126151.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term126151, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


