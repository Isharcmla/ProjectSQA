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

public class BZip2CompressorInputStream_setupNoRandPartB_728330636235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176796;

    public BZip2CompressorInputStream_setupNoRandPartB_728330636235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176796 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term176900 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setIntField(term176796, term176796.getClass(), "su_ch2", -1);
        setIntField(term176796, term176796.getClass(), "su_chPrev", 0);
        setIntField(term176796, term176796.getClass(), "su_count", 0);
        setIntField(term176796, term176796.getClass(), "su_i2", -2147483647);
        setIntField(term176796, term176796.getClass(), "last", -2147483648);
        setIntField(term176796, term176796.getClass(), "currentState", 0);
        setIntField(term176900, term176900.getClass(), "globalCrc", -1);
        setField(term176796, term176796.getClass(), "crc", term176900);
        setIntField(term176796, term176796.getClass(), "computedBlockCRC", 0);
        setIntField(term176796, term176796.getClass(), "storedBlockCRC", 0);
        setIntField(term176796, term176796.getClass(), "computedCombinedCRC", 0);
        setIntField(term176796, term176796.getClass(), "bsLive", 8);
        setIntField(term176796, term176796.getClass(), "bsBuff", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setupNoRandPartB", argTypes, term176796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


