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
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_1788482022129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42739;
     Object term42871;
     Object term42901;
     Object term42902;
     Object term42889;

    public TarArchiveInputStream_parsePaxHeaders_1788482022129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42739 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term42871 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term42576 = (byte[]) newByteArray(0);
        setField(term42871, term42871.getClass(), "SINGLE", term42576);
        setBooleanField(term42871, term42871.getClass(), "hasHitEOF", true);
        term42901 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term42901, term42901.getClass(), "SMALL_BUF", null);
        setIntField(term42901, term42901.getClass(), "recordSize", 0);
        setIntField(term42901, term42901.getClass(), "blockSize", 0);
        setBooleanField(term42901, term42901.getClass(), "hasHitEOF", false);
        setLongField(term42901, term42901.getClass(), "entrySize", 0L);
        setLongField(term42901, term42901.getClass(), "entryOffset", 0L);
        setField(term42901, term42901.getClass(), "is", null);
        setField(term42901, term42901.getClass(), "currEntry", null);
        setField(term42901, term42901.getClass(), "zipEncoding", null);
        setField(term42901, term42901.getClass(), "SINGLE", null);
        setLongField(term42901, term42901.getClass(), "bytesRead", 0L);
        term42902 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term42903 = (byte[]) newByteArray(0);
        setField(term42902, term42902.getClass(), "SMALL_BUF", null);
        setIntField(term42902, term42902.getClass(), "recordSize", 0);
        setIntField(term42902, term42902.getClass(), "blockSize", 0);
        setBooleanField(term42902, term42902.getClass(), "hasHitEOF", true);
        setLongField(term42902, term42902.getClass(), "entrySize", 0L);
        setLongField(term42902, term42902.getClass(), "entryOffset", 0L);
        setField(term42902, term42902.getClass(), "is", null);
        setField(term42902, term42902.getClass(), "currEntry", null);
        setField(term42902, term42902.getClass(), "zipEncoding", null);
        setField(term42902, term42902.getClass(), "SINGLE", term42903);
        setLongField(term42902, term42902.getClass(), "bytesRead", 0L);
        term42889 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term42871;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term42739, args);
        assertTrue(recursiveEquals(term42739, term42901));
        assertTrue(recursiveEquals(term42871, term42902));
        assertTrue(recursiveEquals(retValue, term42889));
    }

};


