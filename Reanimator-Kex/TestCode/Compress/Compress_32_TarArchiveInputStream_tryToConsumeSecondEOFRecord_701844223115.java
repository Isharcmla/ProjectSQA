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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37587;
     Object term47821;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37587 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term37719 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term37587, term37587.getClass(), "is", term37719);
        setIntField(term37587, term37587.getClass(), "recordSize", 10000);
        term47821 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term47822 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term47821, term47821.getClass(), "SMALL_BUF", null);
        setIntField(term47821, term47821.getClass(), "recordSize", 10000);
        setIntField(term47821, term47821.getClass(), "blockSize", 0);
        setBooleanField(term47821, term47821.getClass(), "hasHitEOF", false);
        setLongField(term47821, term47821.getClass(), "entrySize", 0L);
        setLongField(term47821, term47821.getClass(), "entryOffset", 0L);
        setField(term47822, term47822.getClass(), "SMALL_BUF", null);
        setIntField(term47822, term47822.getClass(), "recordSize", 0);
        setIntField(term47822, term47822.getClass(), "blockSize", 0);
        setBooleanField(term47822, term47822.getClass(), "hasHitEOF", false);
        setLongField(term47822, term47822.getClass(), "entrySize", 0L);
        setLongField(term47822, term47822.getClass(), "entryOffset", 0L);
        setField(term47822, term47822.getClass(), "is", null);
        setField(term47822, term47822.getClass(), "currEntry", null);
        setField(term47822, term47822.getClass(), "zipEncoding", null);
        setField(term47822, term47822.getClass(), "encoding", null);
        setField(term47822, term47822.getClass(), "SINGLE", null);
        setLongField(term47822, term47822.getClass(), "bytesRead", 0L);
        setField(term47821, term47821.getClass(), "is", term47822);
        setField(term47821, term47821.getClass(), "currEntry", null);
        setField(term47821, term47821.getClass(), "zipEncoding", null);
        setField(term47821, term47821.getClass(), "encoding", null);
        setField(term47821, term47821.getClass(), "SINGLE", null);
        setLongField(term47821, term47821.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term37587, args);
        assertTrue(recursiveEquals(term37587, term47821));
    }

};


