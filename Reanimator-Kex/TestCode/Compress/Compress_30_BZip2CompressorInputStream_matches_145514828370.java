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

public class BZip2CompressorInputStream_matches_145514828370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18832;
     Object term18856;

    public BZip2CompressorInputStream_matches_145514828370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18832 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term18832, term18832.getClass(), "last", 0);
        setIntField(term18832, term18832.getClass(), "origPtr", 0);
        setIntField(term18832, term18832.getClass(), "blockSize100k", 0);
        setBooleanField(term18832, term18832.getClass(), "blockRandomised", false);
        setIntField(term18832, term18832.getClass(), "bsBuff", 0);
        setIntField(term18832, term18832.getClass(), "bsLive", 0);
        setField(term18832, term18832.getClass(), "crc", null);
        setIntField(term18832, term18832.getClass(), "nInUse", 0);
        setField(term18832, term18832.getClass(), "in", null);
        setBooleanField(term18832, term18832.getClass(), "decompressConcatenated", false);
        setIntField(term18832, term18832.getClass(), "currentState", 0);
        setIntField(term18832, term18832.getClass(), "storedBlockCRC", 0);
        setIntField(term18832, term18832.getClass(), "storedCombinedCRC", 0);
        setIntField(term18832, term18832.getClass(), "computedBlockCRC", 0);
        setIntField(term18832, term18832.getClass(), "computedCombinedCRC", 0);
        setIntField(term18832, term18832.getClass(), "su_count", 0);
        setIntField(term18832, term18832.getClass(), "su_ch2", 0);
        setIntField(term18832, term18832.getClass(), "su_chPrev", 0);
        setIntField(term18832, term18832.getClass(), "su_i2", 0);
        setIntField(term18832, term18832.getClass(), "su_j2", 0);
        setIntField(term18832, term18832.getClass(), "su_rNToGo", 0);
        setIntField(term18832, term18832.getClass(), "su_rTPos", 0);
        setIntField(term18832, term18832.getClass(), "su_tPos", 0);
        setCharField(term18832, term18832.getClass(), "su_z", (char) 0);
        setField(term18832, term18832.getClass(), "data", null);
        setLongField(term18832, term18832.getClass(), "bytesRead", 0L);
        term18856 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18856;
        callMethod(klass, "matches", argTypes, term18832, args);
    }

};


