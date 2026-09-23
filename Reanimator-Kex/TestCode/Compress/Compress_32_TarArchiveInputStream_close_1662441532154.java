package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;

public class TarArchiveInputStream_close_1662441532154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65111;
     Object term65817;

    public TarArchiveInputStream_close_1662441532154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65111 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term65243 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term65393 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term65243, term65243.getClass(), "is", term65393);
        setField(term65111, term65111.getClass(), "is", term65243);
        term65817 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term65818 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term65819 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term65817, term65817.getClass(), "SMALL_BUF", null);
        setIntField(term65817, term65817.getClass(), "recordSize", 0);
        setIntField(term65817, term65817.getClass(), "blockSize", 0);
        setBooleanField(term65817, term65817.getClass(), "hasHitEOF", false);
        setLongField(term65817, term65817.getClass(), "entrySize", 0L);
        setLongField(term65817, term65817.getClass(), "entryOffset", 0L);
        setField(term65818, term65818.getClass(), "SMALL_BUF", null);
        setIntField(term65818, term65818.getClass(), "recordSize", 0);
        setIntField(term65818, term65818.getClass(), "blockSize", 0);
        setBooleanField(term65818, term65818.getClass(), "hasHitEOF", false);
        setLongField(term65818, term65818.getClass(), "entrySize", 0L);
        setLongField(term65818, term65818.getClass(), "entryOffset", 0L);
        setIntField(term65819, term65819.getClass(), "last", 0);
        setIntField(term65819, term65819.getClass(), "origPtr", 0);
        setIntField(term65819, term65819.getClass(), "blockSize100k", 0);
        setBooleanField(term65819, term65819.getClass(), "blockRandomised", false);
        setIntField(term65819, term65819.getClass(), "bsBuff", 0);
        setIntField(term65819, term65819.getClass(), "bsLive", 0);
        setField(term65819, term65819.getClass(), "crc", null);
        setIntField(term65819, term65819.getClass(), "nInUse", 0);
        setField(term65819, term65819.getClass(), "in", null);
        setBooleanField(term65819, term65819.getClass(), "decompressConcatenated", false);
        setIntField(term65819, term65819.getClass(), "currentState", 0);
        setIntField(term65819, term65819.getClass(), "storedBlockCRC", 0);
        setIntField(term65819, term65819.getClass(), "storedCombinedCRC", 0);
        setIntField(term65819, term65819.getClass(), "computedBlockCRC", 0);
        setIntField(term65819, term65819.getClass(), "computedCombinedCRC", 0);
        setIntField(term65819, term65819.getClass(), "su_count", 0);
        setIntField(term65819, term65819.getClass(), "su_ch2", 0);
        setIntField(term65819, term65819.getClass(), "su_chPrev", 0);
        setIntField(term65819, term65819.getClass(), "su_i2", 0);
        setIntField(term65819, term65819.getClass(), "su_j2", 0);
        setIntField(term65819, term65819.getClass(), "su_rNToGo", 0);
        setIntField(term65819, term65819.getClass(), "su_rTPos", 0);
        setIntField(term65819, term65819.getClass(), "su_tPos", 0);
        setCharField(term65819, term65819.getClass(), "su_z", (char) 0);
        setField(term65819, term65819.getClass(), "data", null);
        setLongField(term65819, term65819.getClass(), "bytesRead", 0L);
        setField(term65818, term65818.getClass(), "is", term65819);
        setField(term65818, term65818.getClass(), "currEntry", null);
        setField(term65818, term65818.getClass(), "zipEncoding", null);
        setField(term65818, term65818.getClass(), "encoding", null);
        setField(term65818, term65818.getClass(), "SINGLE", null);
        setLongField(term65818, term65818.getClass(), "bytesRead", 0L);
        setField(term65817, term65817.getClass(), "is", term65818);
        setField(term65817, term65817.getClass(), "currEntry", null);
        setField(term65817, term65817.getClass(), "zipEncoding", null);
        setField(term65817, term65817.getClass(), "encoding", null);
        setField(term65817, term65817.getClass(), "SINGLE", null);
        setLongField(term65817, term65817.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term65111, args);
        assertTrue(recursiveEquals(term65111, term65817));
    }

};


