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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BZip2CompressorInputStream_setupNoRandPartC_72833159769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18808;

    public BZip2CompressorInputStream_setupNoRandPartC_72833159769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18808 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term18808, term18808.getClass(), "last", 0);
        setIntField(term18808, term18808.getClass(), "origPtr", 0);
        setIntField(term18808, term18808.getClass(), "blockSize100k", 0);
        setBooleanField(term18808, term18808.getClass(), "blockRandomised", false);
        setIntField(term18808, term18808.getClass(), "bsBuff", 0);
        setIntField(term18808, term18808.getClass(), "bsLive", 0);
        setField(term18808, term18808.getClass(), "crc", null);
        setIntField(term18808, term18808.getClass(), "nInUse", 0);
        setField(term18808, term18808.getClass(), "in", null);
        setBooleanField(term18808, term18808.getClass(), "decompressConcatenated", false);
        setIntField(term18808, term18808.getClass(), "currentState", 0);
        setIntField(term18808, term18808.getClass(), "storedBlockCRC", 0);
        setIntField(term18808, term18808.getClass(), "storedCombinedCRC", 0);
        setIntField(term18808, term18808.getClass(), "computedBlockCRC", 0);
        setIntField(term18808, term18808.getClass(), "computedCombinedCRC", 0);
        setIntField(term18808, term18808.getClass(), "su_count", 0);
        setIntField(term18808, term18808.getClass(), "su_ch2", 0);
        setIntField(term18808, term18808.getClass(), "su_chPrev", 0);
        setIntField(term18808, term18808.getClass(), "su_i2", 0);
        setIntField(term18808, term18808.getClass(), "su_j2", 0);
        setIntField(term18808, term18808.getClass(), "su_rNToGo", 0);
        setIntField(term18808, term18808.getClass(), "su_rTPos", 0);
        setIntField(term18808, term18808.getClass(), "su_tPos", 0);
        setCharField(term18808, term18808.getClass(), "su_z", (char) 0);
        setField(term18808, term18808.getClass(), "data", null);
        setLongField(term18808, term18808.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setupNoRandPartC", argTypes, term18808, args);
    }

};


