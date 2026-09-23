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

public class BZip2CompressorInputStream_setupNoRandPartB_728330636393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488903;

    public BZip2CompressorInputStream_setupNoRandPartB_728330636393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488903 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term489007 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setIntField(term488903, term488903.getClass(), "su_ch2", -1);
        setIntField(term488903, term488903.getClass(), "su_chPrev", 0);
        setIntField(term488903, term488903.getClass(), "su_count", 0);
        setIntField(term488903, term488903.getClass(), "su_i2", -2147483647);
        setIntField(term488903, term488903.getClass(), "last", -2147483648);
        setIntField(term488903, term488903.getClass(), "currentState", 0);
        setIntField(term489007, term489007.getClass(), "globalCrc", -1);
        setField(term488903, term488903.getClass(), "crc", term489007);
        setIntField(term488903, term488903.getClass(), "computedBlockCRC", 0);
        setIntField(term488903, term488903.getClass(), "storedBlockCRC", 0);
        setIntField(term488903, term488903.getClass(), "computedCombinedCRC", 0);
        setIntField(term488903, term488903.getClass(), "bsLive", 69470480);
        setIntField(term488903, term488903.getClass(), "bsBuff", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setupNoRandPartB", argTypes, term488903, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


