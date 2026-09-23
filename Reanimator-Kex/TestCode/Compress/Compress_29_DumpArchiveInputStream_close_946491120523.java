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

public class DumpArchiveInputStream_close_946491120523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943855;
     Object term946851;

    public DumpArchiveInputStream_close_946491120523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943855 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term943977 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term944109 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term944169 = newInstance(Class.forName("java.io.BufferedInputStream"));
        setBooleanField(term943855, term943855.getClass(), "isClosed", false);
        setField(term944109, term944109.getClass(), "is", term944169);
        setField(term943977, term943977.getClass(), "in", term944109);
        setField(term943855, term943855.getClass(), "raw", term943977);
        term946851 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term946852 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term946853 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term946854 = newInstance(Class.forName("java.io.BufferedInputStream"));
        setField(term946851, term946851.getClass(), "summary", null);
        setField(term946851, term946851.getClass(), "active", null);
        setBooleanField(term946851, term946851.getClass(), "isClosed", true);
        setBooleanField(term946851, term946851.getClass(), "hasHitEOF", false);
        setLongField(term946851, term946851.getClass(), "entrySize", 0L);
        setLongField(term946851, term946851.getClass(), "entryOffset", 0L);
        setIntField(term946851, term946851.getClass(), "readIdx", 0);
        setField(term946851, term946851.getClass(), "readBuf", null);
        setField(term946851, term946851.getClass(), "blockBuffer", null);
        setIntField(term946851, term946851.getClass(), "recordOffset", 0);
        setLongField(term946851, term946851.getClass(), "filepos", 0L);
        setField(term946852, term946852.getClass(), "blockBuffer", null);
        setIntField(term946852, term946852.getClass(), "currBlkIdx", 0);
        setIntField(term946852, term946852.getClass(), "blockSize", 0);
        setIntField(term946852, term946852.getClass(), "readOffset", 0);
        setBooleanField(term946852, term946852.getClass(), "isCompressed", false);
        setLongField(term946852, term946852.getClass(), "bytesRead", 0L);
        setField(term946853, term946853.getClass(), "SMALL_BUF", null);
        setIntField(term946853, term946853.getClass(), "recordSize", 0);
        setIntField(term946853, term946853.getClass(), "blockSize", 0);
        setBooleanField(term946853, term946853.getClass(), "hasHitEOF", false);
        setLongField(term946853, term946853.getClass(), "entrySize", 0L);
        setLongField(term946853, term946853.getClass(), "entryOffset", 0L);
        setField(term946854, term946854.getClass(), "buf", null);
        setIntField(term946854, term946854.getClass(), "count", 0);
        setIntField(term946854, term946854.getClass(), "pos", 0);
        setIntField(term946854, term946854.getClass(), "markpos", 0);
        setIntField(term946854, term946854.getClass(), "marklimit", 0);
        setField(term946854, term946854.getClass(), "in", null);
        setField(term946853, term946853.getClass(), "is", term946854);
        setField(term946853, term946853.getClass(), "currEntry", null);
        setField(term946853, term946853.getClass(), "zipEncoding", null);
        setField(term946853, term946853.getClass(), "SINGLE", null);
        setLongField(term946853, term946853.getClass(), "bytesRead", 0L);
        setField(term946852, term946852.getClass(), "in", term946853);
        setField(term946851, term946851.getClass(), "raw", term946852);
        setField(term946851, term946851.getClass(), "names", null);
        setField(term946851, term946851.getClass(), "pending", null);
        setField(term946851, term946851.getClass(), "queue", null);
        setField(term946851, term946851.getClass(), "zipEncoding", null);
        setField(term946851, term946851.getClass(), "SINGLE", null);
        setLongField(term946851, term946851.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term943855, args);
        assertTrue(recursiveEquals(term943855, term946851));
    }

};


