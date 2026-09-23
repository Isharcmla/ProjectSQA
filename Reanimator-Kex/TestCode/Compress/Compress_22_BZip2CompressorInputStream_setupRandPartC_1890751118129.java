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
import java.io.IOException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_setupRandPartC_1890751118129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62459;

    public BZip2CompressorInputStream_setupRandPartC_1890751118129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62459 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term62563 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term62713 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term62459, term62459.getClass(), "su_j2", 0);
        setCharField(term62459, term62459.getClass(), "su_z", (char) 0);
        setIntField(term62459, term62459.getClass(), "currentState", 0);
        setIntField(term62459, term62459.getClass(), "su_i2", 2147483646);
        setIntField(term62459, term62459.getClass(), "su_count", 0);
        setIntField(term62459, term62459.getClass(), "last", 2147483646);
        setIntField(term62563, term62563.getClass(), "globalCrc", -1);
        setField(term62459, term62459.getClass(), "crc", term62563);
        setIntField(term62459, term62459.getClass(), "computedBlockCRC", 0);
        setIntField(term62459, term62459.getClass(), "storedBlockCRC", 0);
        setIntField(term62459, term62459.getClass(), "computedCombinedCRC", 0);
        setIntField(term62459, term62459.getClass(), "bsLive", 7);
        setIntField(term62459, term62459.getClass(), "bsBuff", 0);
        setField(term62459, term62459.getClass(), "in", term62713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setupRandPartC", argTypes, term62459, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


