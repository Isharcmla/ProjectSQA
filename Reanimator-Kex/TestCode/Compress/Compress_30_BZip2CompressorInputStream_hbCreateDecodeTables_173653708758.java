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

public class BZip2CompressorInputStream_hbCreateDecodeTables_173653708758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18532;
     Object term18556;
     Object term18558;
     Object term18560;

    public BZip2CompressorInputStream_hbCreateDecodeTables_173653708758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18532 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term18532, term18532.getClass(), "last", 0);
        setIntField(term18532, term18532.getClass(), "origPtr", 0);
        setIntField(term18532, term18532.getClass(), "blockSize100k", 0);
        setBooleanField(term18532, term18532.getClass(), "blockRandomised", false);
        setIntField(term18532, term18532.getClass(), "bsBuff", 0);
        setIntField(term18532, term18532.getClass(), "bsLive", 0);
        setField(term18532, term18532.getClass(), "crc", null);
        setIntField(term18532, term18532.getClass(), "nInUse", 0);
        setField(term18532, term18532.getClass(), "in", null);
        setBooleanField(term18532, term18532.getClass(), "decompressConcatenated", false);
        setIntField(term18532, term18532.getClass(), "currentState", 0);
        setIntField(term18532, term18532.getClass(), "storedBlockCRC", 0);
        setIntField(term18532, term18532.getClass(), "storedCombinedCRC", 0);
        setIntField(term18532, term18532.getClass(), "computedBlockCRC", 0);
        setIntField(term18532, term18532.getClass(), "computedCombinedCRC", 0);
        setIntField(term18532, term18532.getClass(), "su_count", 0);
        setIntField(term18532, term18532.getClass(), "su_ch2", 0);
        setIntField(term18532, term18532.getClass(), "su_chPrev", 0);
        setIntField(term18532, term18532.getClass(), "su_i2", 0);
        setIntField(term18532, term18532.getClass(), "su_j2", 0);
        setIntField(term18532, term18532.getClass(), "su_rNToGo", 0);
        setIntField(term18532, term18532.getClass(), "su_rTPos", 0);
        setIntField(term18532, term18532.getClass(), "su_tPos", 0);
        setCharField(term18532, term18532.getClass(), "su_z", (char) 0);
        setField(term18532, term18532.getClass(), "data", null);
        setLongField(term18532, term18532.getClass(), "bytesRead", 0L);
        term18556 = new Integer(0);
        term18558 = new Integer(0);
        term18560 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = Array.newInstance(char.class, 0).getClass();
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term18556;
        args[5] = term18558;
        args[6] = term18560;
        callMethod(klass, "hbCreateDecodeTables", argTypes, term18532, args);
    }

};


