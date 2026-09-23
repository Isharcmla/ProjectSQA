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

public class BZip2CompressorInputStream_recvDecodingTables_137545303459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18562;

    public BZip2CompressorInputStream_recvDecodingTables_137545303459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18562 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term18562, term18562.getClass(), "last", 0);
        setIntField(term18562, term18562.getClass(), "origPtr", 0);
        setIntField(term18562, term18562.getClass(), "blockSize100k", 0);
        setBooleanField(term18562, term18562.getClass(), "blockRandomised", false);
        setIntField(term18562, term18562.getClass(), "bsBuff", 0);
        setIntField(term18562, term18562.getClass(), "bsLive", 0);
        setField(term18562, term18562.getClass(), "crc", null);
        setIntField(term18562, term18562.getClass(), "nInUse", 0);
        setField(term18562, term18562.getClass(), "in", null);
        setBooleanField(term18562, term18562.getClass(), "decompressConcatenated", false);
        setIntField(term18562, term18562.getClass(), "currentState", 0);
        setIntField(term18562, term18562.getClass(), "storedBlockCRC", 0);
        setIntField(term18562, term18562.getClass(), "storedCombinedCRC", 0);
        setIntField(term18562, term18562.getClass(), "computedBlockCRC", 0);
        setIntField(term18562, term18562.getClass(), "computedCombinedCRC", 0);
        setIntField(term18562, term18562.getClass(), "su_count", 0);
        setIntField(term18562, term18562.getClass(), "su_ch2", 0);
        setIntField(term18562, term18562.getClass(), "su_chPrev", 0);
        setIntField(term18562, term18562.getClass(), "su_i2", 0);
        setIntField(term18562, term18562.getClass(), "su_j2", 0);
        setIntField(term18562, term18562.getClass(), "su_rNToGo", 0);
        setIntField(term18562, term18562.getClass(), "su_rTPos", 0);
        setIntField(term18562, term18562.getClass(), "su_tPos", 0);
        setCharField(term18562, term18562.getClass(), "su_z", (char) 0);
        setField(term18562, term18562.getClass(), "data", null);
        setLongField(term18562, term18562.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term18562, args);
    }

};


