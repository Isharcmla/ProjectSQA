package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.dump.EqualityUtils.*;
import java.lang.Object;

public class DumpArchiveInputStream_close_946491120395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647765;
     Object term651375;

    public DumpArchiveInputStream_close_946491120395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647765 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term647887 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term648033 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term648179 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term648315 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term647765, term647765.getClass(), "isClosed", false);
        setField(term648033, term648033.getClass(), "inf", null);
        setField(term648179, term648179.getClass(), "inf", null);
        setBooleanField(term648315, term648315.getClass(), "isClosed", true);
        setField(term648179, term648179.getClass(), "in", term648315);
        setField(term648033, term648033.getClass(), "in", term648179);
        setField(term647887, term647887.getClass(), "in", term648033);
        setField(term647765, term647765.getClass(), "raw", term647887);
        term651375 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term651376 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term651377 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term651378 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream"));
        Object term651379 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term651375, term651375.getClass(), "summary", null);
        setField(term651375, term651375.getClass(), "active", null);
        setBooleanField(term651375, term651375.getClass(), "isClosed", true);
        setBooleanField(term651375, term651375.getClass(), "hasHitEOF", false);
        setLongField(term651375, term651375.getClass(), "entrySize", 0L);
        setLongField(term651375, term651375.getClass(), "entryOffset", 0L);
        setIntField(term651375, term651375.getClass(), "readIdx", 0);
        setField(term651375, term651375.getClass(), "readBuf", null);
        setField(term651375, term651375.getClass(), "blockBuffer", null);
        setIntField(term651375, term651375.getClass(), "recordOffset", 0);
        setLongField(term651375, term651375.getClass(), "filepos", 0L);
        setField(term651376, term651376.getClass(), "blockBuffer", null);
        setIntField(term651376, term651376.getClass(), "currBlkIdx", 0);
        setIntField(term651376, term651376.getClass(), "blockSize", 0);
        setIntField(term651376, term651376.getClass(), "readOffset", 0);
        setBooleanField(term651376, term651376.getClass(), "isCompressed", false);
        setLongField(term651376, term651376.getClass(), "bytesRead", 0L);
        setField(term651379, term651379.getClass(), "summary", null);
        setField(term651379, term651379.getClass(), "active", null);
        setBooleanField(term651379, term651379.getClass(), "isClosed", true);
        setBooleanField(term651379, term651379.getClass(), "hasHitEOF", false);
        setLongField(term651379, term651379.getClass(), "entrySize", 0L);
        setLongField(term651379, term651379.getClass(), "entryOffset", 0L);
        setIntField(term651379, term651379.getClass(), "readIdx", 0);
        setField(term651379, term651379.getClass(), "readBuf", null);
        setField(term651379, term651379.getClass(), "blockBuffer", null);
        setIntField(term651379, term651379.getClass(), "recordOffset", 0);
        setLongField(term651379, term651379.getClass(), "filepos", 0L);
        setField(term651379, term651379.getClass(), "raw", null);
        setField(term651379, term651379.getClass(), "names", null);
        setField(term651379, term651379.getClass(), "pending", null);
        setField(term651379, term651379.getClass(), "queue", null);
        setField(term651379, term651379.getClass(), "zipEncoding", null);
        setField(term651379, term651379.getClass(), "SINGLE", null);
        setLongField(term651379, term651379.getClass(), "bytesRead", 0L);
        setField(term651378, term651378.getClass(), "in", term651379);
        setBooleanField(term651378, term651378.getClass(), "decompressConcatenated", false);
        setField(term651378, term651378.getClass(), "buf", null);
        setIntField(term651378, term651378.getClass(), "bufUsed", 0);
        setField(term651378, term651378.getClass(), "inf", null);
        setField(term651378, term651378.getClass(), "crc", null);
        setBooleanField(term651378, term651378.getClass(), "endReached", false);
        setField(term651378, term651378.getClass(), "oneByte", null);
        setField(term651378, term651378.getClass(), "parameters", null);
        setLongField(term651378, term651378.getClass(), "bytesRead", 0L);
        setField(term651377, term651377.getClass(), "in", term651378);
        setBooleanField(term651377, term651377.getClass(), "decompressConcatenated", false);
        setField(term651377, term651377.getClass(), "buf", null);
        setIntField(term651377, term651377.getClass(), "bufUsed", 0);
        setField(term651377, term651377.getClass(), "inf", null);
        setField(term651377, term651377.getClass(), "crc", null);
        setBooleanField(term651377, term651377.getClass(), "endReached", false);
        setField(term651377, term651377.getClass(), "oneByte", null);
        setField(term651377, term651377.getClass(), "parameters", null);
        setLongField(term651377, term651377.getClass(), "bytesRead", 0L);
        setField(term651376, term651376.getClass(), "in", term651377);
        setField(term651375, term651375.getClass(), "raw", term651376);
        setField(term651375, term651375.getClass(), "names", null);
        setField(term651375, term651375.getClass(), "pending", null);
        setField(term651375, term651375.getClass(), "queue", null);
        setField(term651375, term651375.getClass(), "zipEncoding", null);
        setField(term651375, term651375.getClass(), "SINGLE", null);
        setLongField(term651375, term651375.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term647765, args);
        assertTrue(recursiveEquals(term647765, term651375));
    }

};


