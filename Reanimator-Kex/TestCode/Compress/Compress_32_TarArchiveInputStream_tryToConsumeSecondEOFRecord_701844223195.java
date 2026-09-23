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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81680;
     Object term83457;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81680 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term81812 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term81680, term81680.getClass(), "is", term81812);
        term83457 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term83458 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term83457, term83457.getClass(), "SMALL_BUF", null);
        setIntField(term83457, term83457.getClass(), "recordSize", 0);
        setIntField(term83457, term83457.getClass(), "blockSize", 0);
        setBooleanField(term83457, term83457.getClass(), "hasHitEOF", false);
        setLongField(term83457, term83457.getClass(), "entrySize", 0L);
        setLongField(term83457, term83457.getClass(), "entryOffset", 0L);
        setField(term83458, term83458.getClass(), "zipEncoding", null);
        setField(term83458, term83458.getClass(), "encoding", null);
        setBooleanField(term83458, term83458.getClass(), "useUnicodeExtraFields", false);
        setField(term83458, term83458.getClass(), "in", null);
        setField(term83458, term83458.getClass(), "inf", null);
        setField(term83458, term83458.getClass(), "buf", null);
        setField(term83458, term83458.getClass(), "current", null);
        setBooleanField(term83458, term83458.getClass(), "closed", false);
        setBooleanField(term83458, term83458.getClass(), "hitCentralDirectory", false);
        setField(term83458, term83458.getClass(), "lastStoredEntry", null);
        setBooleanField(term83458, term83458.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term83458, term83458.getClass(), "LFH_BUF", null);
        setField(term83458, term83458.getClass(), "SKIP_BUF", null);
        setField(term83458, term83458.getClass(), "SHORT_BUF", null);
        setField(term83458, term83458.getClass(), "WORD_BUF", null);
        setField(term83458, term83458.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term83458, term83458.getClass(), "entriesRead", 0);
        setField(term83458, term83458.getClass(), "SINGLE", null);
        setLongField(term83458, term83458.getClass(), "bytesRead", 0L);
        setField(term83457, term83457.getClass(), "is", term83458);
        setField(term83457, term83457.getClass(), "currEntry", null);
        setField(term83457, term83457.getClass(), "zipEncoding", null);
        setField(term83457, term83457.getClass(), "encoding", null);
        setField(term83457, term83457.getClass(), "SINGLE", null);
        setLongField(term83457, term83457.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term81680, args);
        assertTrue(recursiveEquals(term81680, term83457));
    }

};


