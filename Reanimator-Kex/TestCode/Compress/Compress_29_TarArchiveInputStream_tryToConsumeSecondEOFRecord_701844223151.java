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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63180;
     Object term64220;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63180 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term63312 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term63180, term63180.getClass(), "is", term63312);
        setIntField(term63180, term63180.getClass(), "recordSize", 512);
        term64220 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term64221 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term64220, term64220.getClass(), "SMALL_BUF", null);
        setIntField(term64220, term64220.getClass(), "recordSize", 512);
        setIntField(term64220, term64220.getClass(), "blockSize", 0);
        setBooleanField(term64220, term64220.getClass(), "hasHitEOF", false);
        setLongField(term64220, term64220.getClass(), "entrySize", 0L);
        setLongField(term64220, term64220.getClass(), "entryOffset", 0L);
        setField(term64221, term64221.getClass(), "SMALL_BUF", null);
        setIntField(term64221, term64221.getClass(), "recordSize", 0);
        setIntField(term64221, term64221.getClass(), "blockSize", 0);
        setBooleanField(term64221, term64221.getClass(), "hasHitEOF", false);
        setLongField(term64221, term64221.getClass(), "entrySize", 0L);
        setLongField(term64221, term64221.getClass(), "entryOffset", 0L);
        setField(term64221, term64221.getClass(), "is", null);
        setField(term64221, term64221.getClass(), "currEntry", null);
        setField(term64221, term64221.getClass(), "zipEncoding", null);
        setField(term64221, term64221.getClass(), "SINGLE", null);
        setLongField(term64221, term64221.getClass(), "bytesRead", 0L);
        setField(term64220, term64220.getClass(), "is", term64221);
        setField(term64220, term64220.getClass(), "currEntry", null);
        setField(term64220, term64220.getClass(), "zipEncoding", null);
        setField(term64220, term64220.getClass(), "SINGLE", null);
        setLongField(term64220, term64220.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term63180, args);
        assertTrue(recursiveEquals(term63180, term64220));
    }

};


