package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class BitInputStream_close_190125753666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14853;
     Object term16014;

    public BitInputStream_close_190125753666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14853 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term14985 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term15113 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setBooleanField(term15113, term15113.getClass(), "closed", true);
        setField(term14985, term14985.getClass(), "is", term15113);
        setField(term14853, term14853.getClass(), "in", term14985);
        term16014 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term16015 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term16016 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term16015, term16015.getClass(), "SMALL_BUF", null);
        setIntField(term16015, term16015.getClass(), "recordSize", 0);
        setIntField(term16015, term16015.getClass(), "blockSize", 0);
        setBooleanField(term16015, term16015.getClass(), "hasHitEOF", false);
        setLongField(term16015, term16015.getClass(), "entrySize", 0L);
        setLongField(term16015, term16015.getClass(), "entryOffset", 0L);
        setField(term16016, term16016.getClass(), "input", null);
        setLongField(term16016, term16016.getClass(), "offset", 0L);
        setBooleanField(term16016, term16016.getClass(), "closed", true);
        setField(term16016, term16016.getClass(), "currentEntry", null);
        setField(term16016, term16016.getClass(), "namebuffer", null);
        setLongField(term16016, term16016.getClass(), "entryOffset", 0L);
        setField(term16016, term16016.getClass(), "NAME_BUF", null);
        setField(term16016, term16016.getClass(), "LAST_MODIFIED_BUF", null);
        setField(term16016, term16016.getClass(), "ID_BUF", null);
        setField(term16016, term16016.getClass(), "FILE_MODE_BUF", null);
        setField(term16016, term16016.getClass(), "LENGTH_BUF", null);
        setField(term16016, term16016.getClass(), "SINGLE", null);
        setLongField(term16016, term16016.getClass(), "bytesRead", 0L);
        setField(term16015, term16015.getClass(), "is", term16016);
        setField(term16015, term16015.getClass(), "currEntry", null);
        setField(term16015, term16015.getClass(), "zipEncoding", null);
        setField(term16015, term16015.getClass(), "encoding", null);
        setField(term16015, term16015.getClass(), "globalPaxHeaders", null);
        setField(term16015, term16015.getClass(), "SINGLE", null);
        setLongField(term16015, term16015.getClass(), "bytesRead", 0L);
        setField(term16014, term16014.getClass(), "in", term16015);
        setField(term16014, term16014.getClass(), "byteOrder", null);
        setLongField(term16014, term16014.getClass(), "bitsCached", 0L);
        setIntField(term16014, term16014.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term14853, args);
        assertTrue(recursiveEquals(term14853, term16014));
    }

};


