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
import static org.apache.commons.compress.compressors.bzip2.EqualityUtils.*;

public class BZip2CompressorInputStream_complete_299365721327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374791;
     Object term374830;

    public BZip2CompressorInputStream_complete_299365721327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374791 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term374791, term374791.getClass(), "bsLive", 16384);
        setIntField(term374791, term374791.getClass(), "bsBuff", 0);
        setIntField(term374791, term374791.getClass(), "storedCombinedCRC", 0);
        setIntField(term374791, term374791.getClass(), "currentState", 0);
        setField(term374791, term374791.getClass(), "data", null);
        setIntField(term374791, term374791.getClass(), "computedCombinedCRC", 0);
        term374830 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term374830, term374830.getClass(), "last", 0);
        setIntField(term374830, term374830.getClass(), "origPtr", 0);
        setIntField(term374830, term374830.getClass(), "blockSize100k", 0);
        setBooleanField(term374830, term374830.getClass(), "blockRandomised", false);
        setIntField(term374830, term374830.getClass(), "bsBuff", 0);
        setIntField(term374830, term374830.getClass(), "bsLive", 16352);
        setField(term374830, term374830.getClass(), "crc", null);
        setIntField(term374830, term374830.getClass(), "nInUse", 0);
        setField(term374830, term374830.getClass(), "in", null);
        setBooleanField(term374830, term374830.getClass(), "decompressConcatenated", false);
        setIntField(term374830, term374830.getClass(), "currentChar", 0);
        setIntField(term374830, term374830.getClass(), "currentState", 0);
        setIntField(term374830, term374830.getClass(), "storedBlockCRC", 0);
        setIntField(term374830, term374830.getClass(), "storedCombinedCRC", 0);
        setIntField(term374830, term374830.getClass(), "computedBlockCRC", 0);
        setIntField(term374830, term374830.getClass(), "computedCombinedCRC", 0);
        setIntField(term374830, term374830.getClass(), "su_count", 0);
        setIntField(term374830, term374830.getClass(), "su_ch2", 0);
        setIntField(term374830, term374830.getClass(), "su_chPrev", 0);
        setIntField(term374830, term374830.getClass(), "su_i2", 0);
        setIntField(term374830, term374830.getClass(), "su_j2", 0);
        setIntField(term374830, term374830.getClass(), "su_rNToGo", 0);
        setIntField(term374830, term374830.getClass(), "su_rTPos", 0);
        setIntField(term374830, term374830.getClass(), "su_tPos", 0);
        setCharField(term374830, term374830.getClass(), "su_z", (char) 0);
        setField(term374830, term374830.getClass(), "data", null);
        setLongField(term374830, term374830.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "complete", argTypes, term374791, args);
        assertTrue(recursiveEquals(term374791, term374830));
        assertTrue(recursiveEquals(retValue, true));
    }

};


