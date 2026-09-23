package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class BitInputStream_close_190125753625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3263;
     Object term4260;

    public BitInputStream_close_190125753625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3263 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term3413 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term3263, term3263.getClass(), "in", term3413);
        term4260 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term4261 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term4261, term4261.getClass(), "last", 0);
        setIntField(term4261, term4261.getClass(), "origPtr", 0);
        setIntField(term4261, term4261.getClass(), "blockSize100k", 0);
        setBooleanField(term4261, term4261.getClass(), "blockRandomised", false);
        setIntField(term4261, term4261.getClass(), "bsBuff", 0);
        setIntField(term4261, term4261.getClass(), "bsLive", 0);
        setField(term4261, term4261.getClass(), "crc", null);
        setIntField(term4261, term4261.getClass(), "nInUse", 0);
        setField(term4261, term4261.getClass(), "in", null);
        setBooleanField(term4261, term4261.getClass(), "decompressConcatenated", false);
        setIntField(term4261, term4261.getClass(), "currentState", 0);
        setIntField(term4261, term4261.getClass(), "storedBlockCRC", 0);
        setIntField(term4261, term4261.getClass(), "storedCombinedCRC", 0);
        setIntField(term4261, term4261.getClass(), "computedBlockCRC", 0);
        setIntField(term4261, term4261.getClass(), "computedCombinedCRC", 0);
        setIntField(term4261, term4261.getClass(), "su_count", 0);
        setIntField(term4261, term4261.getClass(), "su_ch2", 0);
        setIntField(term4261, term4261.getClass(), "su_chPrev", 0);
        setIntField(term4261, term4261.getClass(), "su_i2", 0);
        setIntField(term4261, term4261.getClass(), "su_j2", 0);
        setIntField(term4261, term4261.getClass(), "su_rNToGo", 0);
        setIntField(term4261, term4261.getClass(), "su_rTPos", 0);
        setIntField(term4261, term4261.getClass(), "su_tPos", 0);
        setCharField(term4261, term4261.getClass(), "su_z", (char) 0);
        setField(term4261, term4261.getClass(), "data", null);
        setLongField(term4261, term4261.getClass(), "bytesRead", 0L);
        setField(term4260, term4260.getClass(), "in", term4261);
        setField(term4260, term4260.getClass(), "byteOrder", null);
        setLongField(term4260, term4260.getClass(), "bitsCached", 0L);
        setIntField(term4260, term4260.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term3263, args);
        assertTrue(recursiveEquals(term3263, term4260));
    }

};


