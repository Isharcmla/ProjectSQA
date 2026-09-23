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

public class TarArchiveInputStream_skipRecordPadding_10841937975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28147;
     Object term28440;

    public TarArchiveInputStream_skipRecordPadding_10841937975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28147 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term28147, term28147.getClass(), "currEntry", null);
        term28440 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term28440, term28440.getClass(), "SMALL_BUF", null);
        setIntField(term28440, term28440.getClass(), "recordSize", 0);
        setIntField(term28440, term28440.getClass(), "blockSize", 0);
        setBooleanField(term28440, term28440.getClass(), "hasHitEOF", false);
        setLongField(term28440, term28440.getClass(), "entrySize", 0L);
        setLongField(term28440, term28440.getClass(), "entryOffset", 0L);
        setField(term28440, term28440.getClass(), "is", null);
        setField(term28440, term28440.getClass(), "currEntry", null);
        setField(term28440, term28440.getClass(), "zipEncoding", null);
        setField(term28440, term28440.getClass(), "encoding", null);
        setField(term28440, term28440.getClass(), "globalPaxHeaders", null);
        setField(term28440, term28440.getClass(), "SINGLE", null);
        setLongField(term28440, term28440.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRecordPadding", argTypes, term28147, args);
        assertTrue(recursiveEquals(term28147, term28440));
    }

};


