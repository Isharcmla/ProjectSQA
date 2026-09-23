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

public class TarArchiveInputStream_getNextTarEntry_135466979234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92440;
     Object term143264;

    public TarArchiveInputStream_getNextTarEntry_135466979234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92440 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term92576 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setBooleanField(term92440, term92440.getClass(), "hasHitEOF", false);
        setField(term92440, term92440.getClass(), "currEntry", null);
        setIntField(term92440, term92440.getClass(), "recordSize", 512);
        setBooleanField(term92576, term92576.getClass(), "hasHitEOF", false);
        setBooleanField(term92576, term92576.getClass(), "isClosed", true);
        setField(term92440, term92440.getClass(), "is", term92576);
        term143264 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term143265 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        setField(term143264, term143264.getClass(), "SMALL_BUF", null);
        setIntField(term143264, term143264.getClass(), "recordSize", 512);
        setIntField(term143264, term143264.getClass(), "blockSize", 0);
        setBooleanField(term143264, term143264.getClass(), "hasHitEOF", true);
        setLongField(term143264, term143264.getClass(), "entrySize", 0L);
        setLongField(term143264, term143264.getClass(), "entryOffset", 0L);
        setField(term143265, term143265.getClass(), "summary", null);
        setField(term143265, term143265.getClass(), "active", null);
        setBooleanField(term143265, term143265.getClass(), "isClosed", true);
        setBooleanField(term143265, term143265.getClass(), "hasHitEOF", false);
        setLongField(term143265, term143265.getClass(), "entrySize", 0L);
        setLongField(term143265, term143265.getClass(), "entryOffset", 0L);
        setIntField(term143265, term143265.getClass(), "readIdx", 0);
        setField(term143265, term143265.getClass(), "readBuf", null);
        setField(term143265, term143265.getClass(), "blockBuffer", null);
        setIntField(term143265, term143265.getClass(), "recordOffset", 0);
        setLongField(term143265, term143265.getClass(), "filepos", 0L);
        setField(term143265, term143265.getClass(), "raw", null);
        setField(term143265, term143265.getClass(), "names", null);
        setField(term143265, term143265.getClass(), "pending", null);
        setField(term143265, term143265.getClass(), "queue", null);
        setField(term143265, term143265.getClass(), "zipEncoding", null);
        setField(term143265, term143265.getClass(), "encoding", null);
        setField(term143265, term143265.getClass(), "SINGLE", null);
        setLongField(term143265, term143265.getClass(), "bytesRead", 0L);
        setField(term143264, term143264.getClass(), "is", term143265);
        setField(term143264, term143264.getClass(), "currEntry", null);
        setField(term143264, term143264.getClass(), "zipEncoding", null);
        setField(term143264, term143264.getClass(), "encoding", null);
        setField(term143264, term143264.getClass(), "SINGLE", null);
        setLongField(term143264, term143264.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term92440, args);
        assertTrue(recursiveEquals(term92440, term143264));
        assertTrue(recursiveEquals(retValue, null));
    }

};


