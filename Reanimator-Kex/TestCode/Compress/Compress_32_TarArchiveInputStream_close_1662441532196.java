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

public class TarArchiveInputStream_close_1662441532196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82644;
     Object term83579;

    public TarArchiveInputStream_close_1662441532196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82644 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term82776 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term82926 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term83076 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term82926, term82926.getClass(), "in", term83076);
        setField(term82776, term82776.getClass(), "is", term82926);
        setField(term82644, term82644.getClass(), "is", term82776);
        term83579 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term83580 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term83581 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setField(term83579, term83579.getClass(), "SMALL_BUF", null);
        setIntField(term83579, term83579.getClass(), "recordSize", 0);
        setIntField(term83579, term83579.getClass(), "blockSize", 0);
        setBooleanField(term83579, term83579.getClass(), "hasHitEOF", false);
        setLongField(term83579, term83579.getClass(), "entrySize", 0L);
        setLongField(term83579, term83579.getClass(), "entryOffset", 0L);
        setField(term83580, term83580.getClass(), "SMALL_BUF", null);
        setIntField(term83580, term83580.getClass(), "recordSize", 0);
        setIntField(term83580, term83580.getClass(), "blockSize", 0);
        setBooleanField(term83580, term83580.getClass(), "hasHitEOF", false);
        setLongField(term83580, term83580.getClass(), "entrySize", 0L);
        setLongField(term83580, term83580.getClass(), "entryOffset", 0L);
        setIntField(term83581, term83581.getClass(), "last", 0);
        setIntField(term83581, term83581.getClass(), "origPtr", 0);
        setIntField(term83581, term83581.getClass(), "blockSize100k", 0);
        setBooleanField(term83581, term83581.getClass(), "blockRandomised", false);
        setIntField(term83581, term83581.getClass(), "bsBuff", 0);
        setIntField(term83581, term83581.getClass(), "bsLive", 0);
        setField(term83581, term83581.getClass(), "crc", null);
        setIntField(term83581, term83581.getClass(), "nInUse", 0);
        setField(term83581, term83581.getClass(), "in", null);
        setBooleanField(term83581, term83581.getClass(), "decompressConcatenated", false);
        setIntField(term83581, term83581.getClass(), "currentState", 0);
        setIntField(term83581, term83581.getClass(), "storedBlockCRC", 0);
        setIntField(term83581, term83581.getClass(), "storedCombinedCRC", 0);
        setIntField(term83581, term83581.getClass(), "computedBlockCRC", 0);
        setIntField(term83581, term83581.getClass(), "computedCombinedCRC", 0);
        setIntField(term83581, term83581.getClass(), "su_count", 0);
        setIntField(term83581, term83581.getClass(), "su_ch2", 0);
        setIntField(term83581, term83581.getClass(), "su_chPrev", 0);
        setIntField(term83581, term83581.getClass(), "su_i2", 0);
        setIntField(term83581, term83581.getClass(), "su_j2", 0);
        setIntField(term83581, term83581.getClass(), "su_rNToGo", 0);
        setIntField(term83581, term83581.getClass(), "su_rTPos", 0);
        setIntField(term83581, term83581.getClass(), "su_tPos", 0);
        setCharField(term83581, term83581.getClass(), "su_z", (char) 0);
        setField(term83581, term83581.getClass(), "data", null);
        setLongField(term83581, term83581.getClass(), "bytesRead", 0L);
        setField(term83580, term83580.getClass(), "is", term83581);
        setField(term83580, term83580.getClass(), "currEntry", null);
        setField(term83580, term83580.getClass(), "zipEncoding", null);
        setField(term83580, term83580.getClass(), "encoding", null);
        setField(term83580, term83580.getClass(), "SINGLE", null);
        setLongField(term83580, term83580.getClass(), "bytesRead", 0L);
        setField(term83579, term83579.getClass(), "is", term83580);
        setField(term83579, term83579.getClass(), "currEntry", null);
        setField(term83579, term83579.getClass(), "zipEncoding", null);
        setField(term83579, term83579.getClass(), "encoding", null);
        setField(term83579, term83579.getClass(), "SINGLE", null);
        setLongField(term83579, term83579.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term82644, args);
        assertTrue(recursiveEquals(term82644, term83579));
    }

};


