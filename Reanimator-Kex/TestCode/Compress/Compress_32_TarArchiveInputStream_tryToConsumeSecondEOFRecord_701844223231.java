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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91130;
     Object term132228;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91130 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term91262 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term91130, term91130.getClass(), "is", term91262);
        setIntField(term91130, term91130.getClass(), "recordSize", 10000);
        term132228 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term132229 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term132228, term132228.getClass(), "SMALL_BUF", null);
        setIntField(term132228, term132228.getClass(), "recordSize", 10000);
        setIntField(term132228, term132228.getClass(), "blockSize", 0);
        setBooleanField(term132228, term132228.getClass(), "hasHitEOF", false);
        setLongField(term132228, term132228.getClass(), "entrySize", 0L);
        setLongField(term132228, term132228.getClass(), "entryOffset", 0L);
        setField(term132229, term132229.getClass(), "zipEncoding", null);
        setField(term132229, term132229.getClass(), "encoding", null);
        setBooleanField(term132229, term132229.getClass(), "useUnicodeExtraFields", false);
        setField(term132229, term132229.getClass(), "in", null);
        setField(term132229, term132229.getClass(), "inf", null);
        setField(term132229, term132229.getClass(), "buf", null);
        setField(term132229, term132229.getClass(), "current", null);
        setBooleanField(term132229, term132229.getClass(), "closed", false);
        setBooleanField(term132229, term132229.getClass(), "hitCentralDirectory", false);
        setField(term132229, term132229.getClass(), "lastStoredEntry", null);
        setBooleanField(term132229, term132229.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term132229, term132229.getClass(), "LFH_BUF", null);
        setField(term132229, term132229.getClass(), "SKIP_BUF", null);
        setField(term132229, term132229.getClass(), "SHORT_BUF", null);
        setField(term132229, term132229.getClass(), "WORD_BUF", null);
        setField(term132229, term132229.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term132229, term132229.getClass(), "entriesRead", 0);
        setField(term132229, term132229.getClass(), "SINGLE", null);
        setLongField(term132229, term132229.getClass(), "bytesRead", 0L);
        setField(term132228, term132228.getClass(), "is", term132229);
        setField(term132228, term132228.getClass(), "currEntry", null);
        setField(term132228, term132228.getClass(), "zipEncoding", null);
        setField(term132228, term132228.getClass(), "encoding", null);
        setField(term132228, term132228.getClass(), "SINGLE", null);
        setLongField(term132228, term132228.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term91130, args);
        assertTrue(recursiveEquals(term91130, term132228));
    }

};


