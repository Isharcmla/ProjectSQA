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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96012;
     Object term146715;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96012 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term96144 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term96012, term96012.getClass(), "is", term96144);
        term146715 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term146716 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveInputStream"));
        setField(term146715, term146715.getClass(), "SMALL_BUF", null);
        setIntField(term146715, term146715.getClass(), "recordSize", 0);
        setIntField(term146715, term146715.getClass(), "blockSize", 0);
        setBooleanField(term146715, term146715.getClass(), "hasHitEOF", false);
        setLongField(term146715, term146715.getClass(), "entrySize", 0L);
        setLongField(term146715, term146715.getClass(), "entryOffset", 0L);
        setField(term146716, term146716.getClass(), "zipEncoding", null);
        setField(term146716, term146716.getClass(), "encoding", null);
        setBooleanField(term146716, term146716.getClass(), "useUnicodeExtraFields", false);
        setField(term146716, term146716.getClass(), "in", null);
        setField(term146716, term146716.getClass(), "inf", null);
        setField(term146716, term146716.getClass(), "buf", null);
        setField(term146716, term146716.getClass(), "current", null);
        setBooleanField(term146716, term146716.getClass(), "closed", false);
        setBooleanField(term146716, term146716.getClass(), "hitCentralDirectory", false);
        setField(term146716, term146716.getClass(), "lastStoredEntry", null);
        setBooleanField(term146716, term146716.getClass(), "allowStoredEntriesWithDataDescriptor", false);
        setField(term146716, term146716.getClass(), "LFH_BUF", null);
        setField(term146716, term146716.getClass(), "SKIP_BUF", null);
        setField(term146716, term146716.getClass(), "SHORT_BUF", null);
        setField(term146716, term146716.getClass(), "WORD_BUF", null);
        setField(term146716, term146716.getClass(), "TWO_DWORD_BUF", null);
        setIntField(term146716, term146716.getClass(), "entriesRead", 0);
        setField(term146716, term146716.getClass(), "SINGLE", null);
        setLongField(term146716, term146716.getClass(), "bytesRead", 0L);
        setField(term146715, term146715.getClass(), "is", term146716);
        setField(term146715, term146715.getClass(), "currEntry", null);
        setField(term146715, term146715.getClass(), "zipEncoding", null);
        setField(term146715, term146715.getClass(), "encoding", null);
        setField(term146715, term146715.getClass(), "SINGLE", null);
        setLongField(term146715, term146715.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term96012, args);
        assertTrue(recursiveEquals(term96012, term146715));
    }

};


