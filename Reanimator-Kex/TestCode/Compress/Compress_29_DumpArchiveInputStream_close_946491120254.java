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

public class DumpArchiveInputStream_close_946491120254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280463;
     Object term282917;

    public DumpArchiveInputStream_close_946491120254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280463 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term280585 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term280721 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term280843 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term280979 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term280463, term280463.getClass(), "isClosed", false);
        setBooleanField(term280721, term280721.getClass(), "isClosed", false);
        setBooleanField(term280979, term280979.getClass(), "isClosed", true);
        setField(term280843, term280843.getClass(), "in", term280979);
        setField(term280721, term280721.getClass(), "raw", term280843);
        setField(term280585, term280585.getClass(), "in", term280721);
        setField(term280463, term280463.getClass(), "raw", term280585);
        term282917 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term282918 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term282919 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term282920 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term282921 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term282917, term282917.getClass(), "summary", null);
        setField(term282917, term282917.getClass(), "active", null);
        setBooleanField(term282917, term282917.getClass(), "isClosed", true);
        setBooleanField(term282917, term282917.getClass(), "hasHitEOF", false);
        setLongField(term282917, term282917.getClass(), "entrySize", 0L);
        setLongField(term282917, term282917.getClass(), "entryOffset", 0L);
        setIntField(term282917, term282917.getClass(), "readIdx", 0);
        setField(term282917, term282917.getClass(), "readBuf", null);
        setField(term282917, term282917.getClass(), "blockBuffer", null);
        setIntField(term282917, term282917.getClass(), "recordOffset", 0);
        setLongField(term282917, term282917.getClass(), "filepos", 0L);
        setField(term282918, term282918.getClass(), "blockBuffer", null);
        setIntField(term282918, term282918.getClass(), "currBlkIdx", 0);
        setIntField(term282918, term282918.getClass(), "blockSize", 0);
        setIntField(term282918, term282918.getClass(), "readOffset", 0);
        setBooleanField(term282918, term282918.getClass(), "isCompressed", false);
        setLongField(term282918, term282918.getClass(), "bytesRead", 0L);
        setField(term282919, term282919.getClass(), "summary", null);
        setField(term282919, term282919.getClass(), "active", null);
        setBooleanField(term282919, term282919.getClass(), "isClosed", true);
        setBooleanField(term282919, term282919.getClass(), "hasHitEOF", false);
        setLongField(term282919, term282919.getClass(), "entrySize", 0L);
        setLongField(term282919, term282919.getClass(), "entryOffset", 0L);
        setIntField(term282919, term282919.getClass(), "readIdx", 0);
        setField(term282919, term282919.getClass(), "readBuf", null);
        setField(term282919, term282919.getClass(), "blockBuffer", null);
        setIntField(term282919, term282919.getClass(), "recordOffset", 0);
        setLongField(term282919, term282919.getClass(), "filepos", 0L);
        setField(term282920, term282920.getClass(), "blockBuffer", null);
        setIntField(term282920, term282920.getClass(), "currBlkIdx", 0);
        setIntField(term282920, term282920.getClass(), "blockSize", 0);
        setIntField(term282920, term282920.getClass(), "readOffset", 0);
        setBooleanField(term282920, term282920.getClass(), "isCompressed", false);
        setLongField(term282920, term282920.getClass(), "bytesRead", 0L);
        setField(term282921, term282921.getClass(), "summary", null);
        setField(term282921, term282921.getClass(), "active", null);
        setBooleanField(term282921, term282921.getClass(), "isClosed", true);
        setBooleanField(term282921, term282921.getClass(), "hasHitEOF", false);
        setLongField(term282921, term282921.getClass(), "entrySize", 0L);
        setLongField(term282921, term282921.getClass(), "entryOffset", 0L);
        setIntField(term282921, term282921.getClass(), "readIdx", 0);
        setField(term282921, term282921.getClass(), "readBuf", null);
        setField(term282921, term282921.getClass(), "blockBuffer", null);
        setIntField(term282921, term282921.getClass(), "recordOffset", 0);
        setLongField(term282921, term282921.getClass(), "filepos", 0L);
        setField(term282921, term282921.getClass(), "raw", null);
        setField(term282921, term282921.getClass(), "names", null);
        setField(term282921, term282921.getClass(), "pending", null);
        setField(term282921, term282921.getClass(), "queue", null);
        setField(term282921, term282921.getClass(), "zipEncoding", null);
        setField(term282921, term282921.getClass(), "SINGLE", null);
        setLongField(term282921, term282921.getClass(), "bytesRead", 0L);
        setField(term282920, term282920.getClass(), "in", term282921);
        setField(term282919, term282919.getClass(), "raw", term282920);
        setField(term282919, term282919.getClass(), "names", null);
        setField(term282919, term282919.getClass(), "pending", null);
        setField(term282919, term282919.getClass(), "queue", null);
        setField(term282919, term282919.getClass(), "zipEncoding", null);
        setField(term282919, term282919.getClass(), "SINGLE", null);
        setLongField(term282919, term282919.getClass(), "bytesRead", 0L);
        setField(term282918, term282918.getClass(), "in", term282919);
        setField(term282917, term282917.getClass(), "raw", term282918);
        setField(term282917, term282917.getClass(), "names", null);
        setField(term282917, term282917.getClass(), "pending", null);
        setField(term282917, term282917.getClass(), "queue", null);
        setField(term282917, term282917.getClass(), "zipEncoding", null);
        setField(term282917, term282917.getClass(), "SINGLE", null);
        setLongField(term282917, term282917.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term280463, args);
        assertTrue(recursiveEquals(term280463, term282917));
    }

};


