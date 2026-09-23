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

public class BaseNCodecInputStream_read_1178397596115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127408;

    public BaseNCodecInputStream_read_1178397596115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127408 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term126599 = (byte[]) newByteArray(128);
        Object term127490 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term126729 = (byte[]) newByteArray(128);
        setField(term127408, term127408.getClass(), "singleByte", term126599);
        setField(term127490, term127490.getClass(), "buffer", term126729);
        setIntField(term127490, term127490.getClass(), "pos", 0);
        setIntField(term127490, term127490.getClass(), "readPos", 0);
        setField(term127408, term127408.getClass(), "baseNCodec", term127490);
        setBooleanField(term127408, term127408.getClass(), "doEncode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term127408, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


