package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_setupRandPartC_189075111875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28305;

    public BZip2CompressorInputStream_setupRandPartC_189075111875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28305 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term28409 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setIntField(term28305, term28305.getClass(), "su_j2", 0);
        setCharField(term28305, term28305.getClass(), "su_z", (char) 0);
        setIntField(term28305, term28305.getClass(), "currentState", 0);
        setIntField(term28305, term28305.getClass(), "su_i2", 2147483646);
        setIntField(term28305, term28305.getClass(), "su_count", 0);
        setIntField(term28305, term28305.getClass(), "last", 2147483646);
        setIntField(term28409, term28409.getClass(), "globalCrc", -1);
        setField(term28305, term28305.getClass(), "crc", term28409);
        setIntField(term28305, term28305.getClass(), "computedBlockCRC", 0);
        setIntField(term28305, term28305.getClass(), "storedBlockCRC", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setupRandPartC", argTypes, term28305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


