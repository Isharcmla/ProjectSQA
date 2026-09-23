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

public class DumpArchiveInputStream_close_946491120482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834730;
     Object term835467;

    public DumpArchiveInputStream_close_946491120482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term834730 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term834852 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term834984 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term834730, term834730.getClass(), "isClosed", false);
        setField(term834984, term834984.getClass(), "is", term834730);
        setField(term834852, term834852.getClass(), "in", term834984);
        setField(term834730, term834730.getClass(), "raw", term834852);
        term835467 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term835468 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term835469 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term835467, term835467.getClass(), "summary", null);
        setField(term835467, term835467.getClass(), "active", null);
        setBooleanField(term835467, term835467.getClass(), "isClosed", true);
        setBooleanField(term835467, term835467.getClass(), "hasHitEOF", false);
        setLongField(term835467, term835467.getClass(), "entrySize", 0L);
        setLongField(term835467, term835467.getClass(), "entryOffset", 0L);
        setIntField(term835467, term835467.getClass(), "readIdx", 0);
        setField(term835467, term835467.getClass(), "readBuf", null);
        setField(term835467, term835467.getClass(), "blockBuffer", null);
        setIntField(term835467, term835467.getClass(), "recordOffset", 0);
        setLongField(term835467, term835467.getClass(), "filepos", 0L);
        setField(term835468, term835468.getClass(), "blockBuffer", null);
        setIntField(term835468, term835468.getClass(), "currBlkIdx", 0);
        setIntField(term835468, term835468.getClass(), "blockSize", 0);
        setIntField(term835468, term835468.getClass(), "readOffset", 0);
        setBooleanField(term835468, term835468.getClass(), "isCompressed", false);
        setLongField(term835468, term835468.getClass(), "bytesRead", 0L);
        setField(term835469, term835469.getClass(), "SMALL_BUF", null);
        setIntField(term835469, term835469.getClass(), "recordSize", 0);
        setIntField(term835469, term835469.getClass(), "blockSize", 0);
        setBooleanField(term835469, term835469.getClass(), "hasHitEOF", false);
        setLongField(term835469, term835469.getClass(), "entrySize", 0L);
        setLongField(term835469, term835469.getClass(), "entryOffset", 0L);
        setField(term835469, term835469.getClass(), "is", term835467);
        setField(term835469, term835469.getClass(), "currEntry", null);
        setField(term835469, term835469.getClass(), "zipEncoding", null);
        setField(term835469, term835469.getClass(), "SINGLE", null);
        setLongField(term835469, term835469.getClass(), "bytesRead", 0L);
        setField(term835468, term835468.getClass(), "in", term835469);
        setField(term835467, term835467.getClass(), "raw", term835468);
        setField(term835467, term835467.getClass(), "names", null);
        setField(term835467, term835467.getClass(), "pending", null);
        setField(term835467, term835467.getClass(), "queue", null);
        setField(term835467, term835467.getClass(), "zipEncoding", null);
        setField(term835467, term835467.getClass(), "SINGLE", null);
        setLongField(term835467, term835467.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term834730, args);
        assertTrue(recursiveEquals(term834730, term835467));
    }

};


