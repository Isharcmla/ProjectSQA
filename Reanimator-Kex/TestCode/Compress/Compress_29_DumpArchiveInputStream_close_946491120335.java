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

public class DumpArchiveInputStream_close_946491120335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509342;
     Object term512662;

    public DumpArchiveInputStream_close_946491120335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509342 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term509464 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term509532 = newInstance(Class.forName("org.tukaani.xz.LZMA2InputStream"));
        setBooleanField(term509342, term509342.getClass(), "isClosed", false);
        setField(term509464, term509464.getClass(), "in", term509532);
        setField(term509342, term509342.getClass(), "raw", term509464);
        term512662 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term512663 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term512664 = newInstance(Class.forName("org.tukaani.xz.LZMA2InputStream"));
        setField(term512662, term512662.getClass(), "summary", null);
        setField(term512662, term512662.getClass(), "active", null);
        setBooleanField(term512662, term512662.getClass(), "isClosed", true);
        setBooleanField(term512662, term512662.getClass(), "hasHitEOF", false);
        setLongField(term512662, term512662.getClass(), "entrySize", 0L);
        setLongField(term512662, term512662.getClass(), "entryOffset", 0L);
        setIntField(term512662, term512662.getClass(), "readIdx", 0);
        setField(term512662, term512662.getClass(), "readBuf", null);
        setField(term512662, term512662.getClass(), "blockBuffer", null);
        setIntField(term512662, term512662.getClass(), "recordOffset", 0);
        setLongField(term512662, term512662.getClass(), "filepos", 0L);
        setField(term512663, term512663.getClass(), "blockBuffer", null);
        setIntField(term512663, term512663.getClass(), "currBlkIdx", 0);
        setIntField(term512663, term512663.getClass(), "blockSize", 0);
        setIntField(term512663, term512663.getClass(), "readOffset", 0);
        setBooleanField(term512663, term512663.getClass(), "isCompressed", false);
        setLongField(term512663, term512663.getClass(), "bytesRead", 0L);
        setField(term512664, term512664.getClass(), "in", null);
        setField(term512664, term512664.getClass(), "lz", null);
        setField(term512664, term512664.getClass(), "rc", null);
        setField(term512664, term512664.getClass(), "lzma", null);
        setIntField(term512664, term512664.getClass(), "uncompressedSize", 0);
        setBooleanField(term512664, term512664.getClass(), "isLZMAChunk", false);
        setBooleanField(term512664, term512664.getClass(), "needDictReset", false);
        setBooleanField(term512664, term512664.getClass(), "needProps", false);
        setBooleanField(term512664, term512664.getClass(), "endReached", false);
        setField(term512664, term512664.getClass(), "exception", null);
        setField(term512664, term512664.getClass(), "tempBuf", null);
        setField(term512663, term512663.getClass(), "in", term512664);
        setField(term512662, term512662.getClass(), "raw", term512663);
        setField(term512662, term512662.getClass(), "names", null);
        setField(term512662, term512662.getClass(), "pending", null);
        setField(term512662, term512662.getClass(), "queue", null);
        setField(term512662, term512662.getClass(), "zipEncoding", null);
        setField(term512662, term512662.getClass(), "SINGLE", null);
        setLongField(term512662, term512662.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term509342, args);
        assertTrue(recursiveEquals(term509342, term512662));
    }

};


