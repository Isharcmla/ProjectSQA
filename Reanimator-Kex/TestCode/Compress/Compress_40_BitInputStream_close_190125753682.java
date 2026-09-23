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

public class BitInputStream_close_190125753682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20095;
     Object term21557;

    public BitInputStream_close_190125753682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20095 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term20245 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term20395 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term20245, term20245.getClass(), "in", term20395);
        setField(term20095, term20095.getClass(), "in", term20245);
        term21557 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term21558 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term21558, term21558.getClass(), "last", 0);
        setIntField(term21558, term21558.getClass(), "origPtr", 0);
        setIntField(term21558, term21558.getClass(), "blockSize100k", 0);
        setBooleanField(term21558, term21558.getClass(), "blockRandomised", false);
        setIntField(term21558, term21558.getClass(), "bsBuff", 0);
        setIntField(term21558, term21558.getClass(), "bsLive", 0);
        setField(term21558, term21558.getClass(), "crc", null);
        setIntField(term21558, term21558.getClass(), "nInUse", 0);
        setField(term21558, term21558.getClass(), "in", null);
        setBooleanField(term21558, term21558.getClass(), "decompressConcatenated", false);
        setIntField(term21558, term21558.getClass(), "currentState", 0);
        setIntField(term21558, term21558.getClass(), "storedBlockCRC", 0);
        setIntField(term21558, term21558.getClass(), "storedCombinedCRC", 0);
        setIntField(term21558, term21558.getClass(), "computedBlockCRC", 0);
        setIntField(term21558, term21558.getClass(), "computedCombinedCRC", 0);
        setIntField(term21558, term21558.getClass(), "su_count", 0);
        setIntField(term21558, term21558.getClass(), "su_ch2", 0);
        setIntField(term21558, term21558.getClass(), "su_chPrev", 0);
        setIntField(term21558, term21558.getClass(), "su_i2", 0);
        setIntField(term21558, term21558.getClass(), "su_j2", 0);
        setIntField(term21558, term21558.getClass(), "su_rNToGo", 0);
        setIntField(term21558, term21558.getClass(), "su_rTPos", 0);
        setIntField(term21558, term21558.getClass(), "su_tPos", 0);
        setCharField(term21558, term21558.getClass(), "su_z", (char) 0);
        setField(term21558, term21558.getClass(), "data", null);
        setLongField(term21558, term21558.getClass(), "bytesRead", 0L);
        setField(term21557, term21557.getClass(), "in", term21558);
        setField(term21557, term21557.getClass(), "byteOrder", null);
        setLongField(term21557, term21557.getClass(), "bitsCached", 0L);
        setIntField(term21557, term21557.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term20095, args);
        assertTrue(recursiveEquals(term20095, term21557));
    }

};


