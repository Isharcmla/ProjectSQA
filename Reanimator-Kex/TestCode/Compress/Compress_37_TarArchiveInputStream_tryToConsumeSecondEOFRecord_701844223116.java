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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48742;
     Object term49192;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48742 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term48874 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term48742, term48742.getClass(), "is", term48874);
        term49192 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term49193 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term49192, term49192.getClass(), "SMALL_BUF", null);
        setIntField(term49192, term49192.getClass(), "recordSize", 0);
        setIntField(term49192, term49192.getClass(), "blockSize", 0);
        setBooleanField(term49192, term49192.getClass(), "hasHitEOF", false);
        setLongField(term49192, term49192.getClass(), "entrySize", 0L);
        setLongField(term49192, term49192.getClass(), "entryOffset", 0L);
        setField(term49193, term49193.getClass(), "SMALL_BUF", null);
        setIntField(term49193, term49193.getClass(), "recordSize", 0);
        setIntField(term49193, term49193.getClass(), "blockSize", 0);
        setBooleanField(term49193, term49193.getClass(), "hasHitEOF", false);
        setLongField(term49193, term49193.getClass(), "entrySize", 0L);
        setLongField(term49193, term49193.getClass(), "entryOffset", 0L);
        setField(term49193, term49193.getClass(), "is", null);
        setField(term49193, term49193.getClass(), "currEntry", null);
        setField(term49193, term49193.getClass(), "zipEncoding", null);
        setField(term49193, term49193.getClass(), "encoding", null);
        setField(term49193, term49193.getClass(), "globalPaxHeaders", null);
        setField(term49193, term49193.getClass(), "SINGLE", null);
        setLongField(term49193, term49193.getClass(), "bytesRead", 0L);
        setField(term49192, term49192.getClass(), "is", term49193);
        setField(term49192, term49192.getClass(), "currEntry", null);
        setField(term49192, term49192.getClass(), "zipEncoding", null);
        setField(term49192, term49192.getClass(), "encoding", null);
        setField(term49192, term49192.getClass(), "globalPaxHeaders", null);
        setField(term49192, term49192.getClass(), "SINGLE", null);
        setLongField(term49192, term49192.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term48742, args);
        assertTrue(recursiveEquals(term48742, term49192));
    }

};


