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

public class TarArchiveInputStream_getNextTarEntry_135466979228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90009;
     Object term121415;

    public TarArchiveInputStream_getNextTarEntry_135466979228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90009 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term90145 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term90009, term90009.getClass(), "hasHitEOF", false);
        setField(term90009, term90009.getClass(), "currEntry", null);
        setIntField(term90009, term90009.getClass(), "recordSize", 512);
        setBooleanField(term90145, term90145.getClass(), "hasHitEOF", true);
        setField(term90009, term90009.getClass(), "is", term90145);
        term121415 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term121416 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term121415, term121415.getClass(), "SMALL_BUF", null);
        setIntField(term121415, term121415.getClass(), "recordSize", 512);
        setIntField(term121415, term121415.getClass(), "blockSize", 0);
        setBooleanField(term121415, term121415.getClass(), "hasHitEOF", true);
        setLongField(term121415, term121415.getClass(), "entrySize", 0L);
        setLongField(term121415, term121415.getClass(), "entryOffset", 0L);
        setField(term121416, term121416.getClass(), "summary", null);
        setField(term121416, term121416.getClass(), "active", null);
        setBooleanField(term121416, term121416.getClass(), "isClosed", false);
        setBooleanField(term121416, term121416.getClass(), "hasHitEOF", true);
        setLongField(term121416, term121416.getClass(), "entrySize", 0L);
        setLongField(term121416, term121416.getClass(), "entryOffset", 0L);
        setIntField(term121416, term121416.getClass(), "readIdx", 0);
        setField(term121416, term121416.getClass(), "readBuf", null);
        setField(term121416, term121416.getClass(), "blockBuffer", null);
        setIntField(term121416, term121416.getClass(), "recordOffset", 0);
        setLongField(term121416, term121416.getClass(), "filepos", 0L);
        setField(term121416, term121416.getClass(), "raw", null);
        setField(term121416, term121416.getClass(), "names", null);
        setField(term121416, term121416.getClass(), "pending", null);
        setField(term121416, term121416.getClass(), "queue", null);
        setField(term121416, term121416.getClass(), "zipEncoding", null);
        setField(term121416, term121416.getClass(), "encoding", null);
        setField(term121416, term121416.getClass(), "SINGLE", null);
        setLongField(term121416, term121416.getClass(), "bytesRead", 0L);
        setField(term121415, term121415.getClass(), "is", term121416);
        setField(term121415, term121415.getClass(), "currEntry", null);
        setField(term121415, term121415.getClass(), "zipEncoding", null);
        setField(term121415, term121415.getClass(), "encoding", null);
        setField(term121415, term121415.getClass(), "SINGLE", null);
        setLongField(term121415, term121415.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term90009, args);
        assertTrue(recursiveEquals(term90009, term121415));
        assertTrue(recursiveEquals(retValue, null));
    }

};


