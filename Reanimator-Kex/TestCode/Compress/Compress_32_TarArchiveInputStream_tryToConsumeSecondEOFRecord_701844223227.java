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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89195;
     Object term120850;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89195 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89327 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term89195, term89195.getClass(), "is", term89327);
        setIntField(term89195, term89195.getClass(), "recordSize", 512);
        term120850 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term120851 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term120850, term120850.getClass(), "SMALL_BUF", null);
        setIntField(term120850, term120850.getClass(), "recordSize", 512);
        setIntField(term120850, term120850.getClass(), "blockSize", 0);
        setBooleanField(term120850, term120850.getClass(), "hasHitEOF", false);
        setLongField(term120850, term120850.getClass(), "entrySize", 0L);
        setLongField(term120850, term120850.getClass(), "entryOffset", 0L);
        setField(term120851, term120851.getClass(), "zipEncoding", null);
        setField(term120851, term120851.getClass(), "encoding", null);
        setBooleanField(term120851, term120851.getClass(), "useUnicodeExtraFields", false);
        setField(term120851, term120851.getClass(), "in", null);
        setField(term120851, term120851.getClass(), "inf", null);
        setField(term120851, term120851.getClass(), "buf", null);
        setField(term120851, term120851.getClass(), "current", null);
        setBooleanField(term120851, term120851.getClass(), "closed", false);
        setBooleanField(term120851, term120851.getClass(), "hitCentralDirectory", false);
        setField(term120851, term120851.getClass(), "lastStoredEntry", null);
        setBooleanField(term120851, term120851.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term120851, term120851.getClass(), "LFH_BUF", null);
        setField(term120851, term120851.getClass(), "SKIP_BUF", null);
        setField(term120851, term120851.getClass(), "SHORT_BUF", null);
        setField(term120851, term120851.getClass(), "WORD_BUF", null);
        setField(term120851, term120851.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term120851, term120851.getClass(), "entriesRead", 0);
        setField(term120851, term120851.getClass(), "SINGLE", null);
        setLongField(term120851, term120851.getClass(), "bytesRead", 0L);
        setField(term120850, term120850.getClass(), "is", term120851);
        setField(term120850, term120850.getClass(), "currEntry", null);
        setField(term120850, term120850.getClass(), "zipEncoding", null);
        setField(term120850, term120850.getClass(), "encoding", null);
        setField(term120850, term120850.getClass(), "SINGLE", null);
        setLongField(term120850, term120850.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term89195, args);
        assertTrue(recursiveEquals(term89195, term120850));
    }

};


