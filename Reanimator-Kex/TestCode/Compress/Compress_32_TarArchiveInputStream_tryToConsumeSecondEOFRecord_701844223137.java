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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56460;
     Object term57159;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56460 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term56592 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term56460, term56460.getClass(), "is", term56592);
        setIntField(term56460, term56460.getClass(), "recordSize", 512);
        term57159 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term57160 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term57159, term57159.getClass(), "SMALL_BUF", null);
        setIntField(term57159, term57159.getClass(), "recordSize", 512);
        setIntField(term57159, term57159.getClass(), "blockSize", 0);
        setBooleanField(term57159, term57159.getClass(), "hasHitEOF", false);
        setLongField(term57159, term57159.getClass(), "entrySize", 0L);
        setLongField(term57159, term57159.getClass(), "entryOffset", 0L);
        setField(term57160, term57160.getClass(), "SMALL_BUF", null);
        setIntField(term57160, term57160.getClass(), "recordSize", 0);
        setIntField(term57160, term57160.getClass(), "blockSize", 0);
        setBooleanField(term57160, term57160.getClass(), "hasHitEOF", false);
        setLongField(term57160, term57160.getClass(), "entrySize", 0L);
        setLongField(term57160, term57160.getClass(), "entryOffset", 0L);
        setField(term57160, term57160.getClass(), "is", null);
        setField(term57160, term57160.getClass(), "currEntry", null);
        setField(term57160, term57160.getClass(), "zipEncoding", null);
        setField(term57160, term57160.getClass(), "encoding", null);
        setField(term57160, term57160.getClass(), "SINGLE", null);
        setLongField(term57160, term57160.getClass(), "bytesRead", 0L);
        setField(term57159, term57159.getClass(), "is", term57160);
        setField(term57159, term57159.getClass(), "currEntry", null);
        setField(term57159, term57159.getClass(), "zipEncoding", null);
        setField(term57159, term57159.getClass(), "encoding", null);
        setField(term57159, term57159.getClass(), "SINGLE", null);
        setLongField(term57159, term57159.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term56460, args);
        assertTrue(recursiveEquals(term56460, term57159));
    }

};


