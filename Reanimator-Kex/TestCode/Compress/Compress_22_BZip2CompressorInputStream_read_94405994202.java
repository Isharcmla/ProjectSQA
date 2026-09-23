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
import java.lang.Object;

public class BZip2CompressorInputStream_read_94405994202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124019;
     Object term124737;

    public BZip2CompressorInputStream_read_94405994202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124019 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term124169 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term124019, term124019.getClass(), "in", term124169);
        term124737 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term124738 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setIntField(term124737, term124737.getClass(), "last", 0);
        setIntField(term124737, term124737.getClass(), "origPtr", 0);
        setIntField(term124737, term124737.getClass(), "blockSize100k", 0);
        setBooleanField(term124737, term124737.getClass(), "blockRandomised", false);
        setIntField(term124737, term124737.getClass(), "bsBuff", 0);
        setIntField(term124737, term124737.getClass(), "bsLive", 0);
        setField(term124737, term124737.getClass(), "crc", null);
        setIntField(term124737, term124737.getClass(), "nInUse", 0);
        setIntField(term124738, term124738.getClass(), "last", 0);
        setIntField(term124738, term124738.getClass(), "origPtr", 0);
        setIntField(term124738, term124738.getClass(), "blockSize100k", 0);
        setBooleanField(term124738, term124738.getClass(), "blockRandomised", false);
        setIntField(term124738, term124738.getClass(), "bsBuff", 0);
        setIntField(term124738, term124738.getClass(), "bsLive", 0);
        setField(term124738, term124738.getClass(), "crc", null);
        setIntField(term124738, term124738.getClass(), "nInUse", 0);
        setField(term124738, term124738.getClass(), "in", null);
        setBooleanField(term124738, term124738.getClass(), "decompressConcatenated", false);
        setIntField(term124738, term124738.getClass(), "currentChar", 0);
        setIntField(term124738, term124738.getClass(), "currentState", 0);
        setIntField(term124738, term124738.getClass(), "storedBlockCRC", 0);
        setIntField(term124738, term124738.getClass(), "storedCombinedCRC", 0);
        setIntField(term124738, term124738.getClass(), "computedBlockCRC", 0);
        setIntField(term124738, term124738.getClass(), "computedCombinedCRC", 0);
        setIntField(term124738, term124738.getClass(), "su_count", 0);
        setIntField(term124738, term124738.getClass(), "su_ch2", 0);
        setIntField(term124738, term124738.getClass(), "su_chPrev", 0);
        setIntField(term124738, term124738.getClass(), "su_i2", 0);
        setIntField(term124738, term124738.getClass(), "su_j2", 0);
        setIntField(term124738, term124738.getClass(), "su_rNToGo", 0);
        setIntField(term124738, term124738.getClass(), "su_rTPos", 0);
        setIntField(term124738, term124738.getClass(), "su_tPos", 0);
        setCharField(term124738, term124738.getClass(), "su_z", (char) 0);
        setField(term124738, term124738.getClass(), "data", null);
        setLongField(term124738, term124738.getClass(), "bytesRead", 0L);
        setField(term124737, term124737.getClass(), "in", term124738);
        setBooleanField(term124737, term124737.getClass(), "decompressConcatenated", false);
        setIntField(term124737, term124737.getClass(), "currentChar", 0);
        setIntField(term124737, term124737.getClass(), "currentState", 0);
        setIntField(term124737, term124737.getClass(), "storedBlockCRC", 0);
        setIntField(term124737, term124737.getClass(), "storedCombinedCRC", 0);
        setIntField(term124737, term124737.getClass(), "computedBlockCRC", 0);
        setIntField(term124737, term124737.getClass(), "computedCombinedCRC", 0);
        setIntField(term124737, term124737.getClass(), "su_count", 0);
        setIntField(term124737, term124737.getClass(), "su_ch2", 0);
        setIntField(term124737, term124737.getClass(), "su_chPrev", 0);
        setIntField(term124737, term124737.getClass(), "su_i2", 0);
        setIntField(term124737, term124737.getClass(), "su_j2", 0);
        setIntField(term124737, term124737.getClass(), "su_rNToGo", 0);
        setIntField(term124737, term124737.getClass(), "su_rTPos", 0);
        setIntField(term124737, term124737.getClass(), "su_tPos", 0);
        setCharField(term124737, term124737.getClass(), "su_z", (char) 0);
        setField(term124737, term124737.getClass(), "data", null);
        setLongField(term124737, term124737.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term124019, args);
        assertTrue(recursiveEquals(term124019, term124737));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


