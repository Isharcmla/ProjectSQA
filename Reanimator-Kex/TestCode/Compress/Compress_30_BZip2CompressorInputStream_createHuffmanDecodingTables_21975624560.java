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
import java.lang.Integer;

public class BZip2CompressorInputStream_createHuffmanDecodingTables_21975624560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18586;
     Object term18610;
     Object term18612;

    public BZip2CompressorInputStream_createHuffmanDecodingTables_21975624560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18586 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term18586, term18586.getClass(), "last", 0);
        setIntField(term18586, term18586.getClass(), "origPtr", 0);
        setIntField(term18586, term18586.getClass(), "blockSize100k", 0);
        setBooleanField(term18586, term18586.getClass(), "blockRandomised", false);
        setIntField(term18586, term18586.getClass(), "bsBuff", 0);
        setIntField(term18586, term18586.getClass(), "bsLive", 0);
        setField(term18586, term18586.getClass(), "crc", null);
        setIntField(term18586, term18586.getClass(), "nInUse", 0);
        setField(term18586, term18586.getClass(), "in", null);
        setBooleanField(term18586, term18586.getClass(), "decompressConcatenated", false);
        setIntField(term18586, term18586.getClass(), "currentState", 0);
        setIntField(term18586, term18586.getClass(), "storedBlockCRC", 0);
        setIntField(term18586, term18586.getClass(), "storedCombinedCRC", 0);
        setIntField(term18586, term18586.getClass(), "computedBlockCRC", 0);
        setIntField(term18586, term18586.getClass(), "computedCombinedCRC", 0);
        setIntField(term18586, term18586.getClass(), "su_count", 0);
        setIntField(term18586, term18586.getClass(), "su_ch2", 0);
        setIntField(term18586, term18586.getClass(), "su_chPrev", 0);
        setIntField(term18586, term18586.getClass(), "su_i2", 0);
        setIntField(term18586, term18586.getClass(), "su_j2", 0);
        setIntField(term18586, term18586.getClass(), "su_rNToGo", 0);
        setIntField(term18586, term18586.getClass(), "su_rTPos", 0);
        setIntField(term18586, term18586.getClass(), "su_tPos", 0);
        setCharField(term18586, term18586.getClass(), "su_z", (char) 0);
        setField(term18586, term18586.getClass(), "data", null);
        setLongField(term18586, term18586.getClass(), "bytesRead", 0L);
        term18610 = new Integer(0);
        term18612 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term18610;
        args[1] = term18612;
        callMethod(klass, "createHuffmanDecodingTables", argTypes, term18586, args);
    }

};


