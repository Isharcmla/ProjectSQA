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

public class TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66749;
     Object term67446;

    public TarArchiveInputStream_tryToConsumeSecondEOFRecord_701844223157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66749 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term66881 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term66881, term66881.getClass(), "hasHitEOF", true);
        setField(term66749, term66749.getClass(), "is", term66881);
        setIntField(term66749, term66749.getClass(), "recordSize", 512);
        term67446 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term67447 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term67446, term67446.getClass(), "SMALL_BUF", null);
        setIntField(term67446, term67446.getClass(), "recordSize", 512);
        setIntField(term67446, term67446.getClass(), "blockSize", 0);
        setBooleanField(term67446, term67446.getClass(), "hasHitEOF", false);
        setLongField(term67446, term67446.getClass(), "entrySize", 0L);
        setLongField(term67446, term67446.getClass(), "entryOffset", 0L);
        setField(term67447, term67447.getClass(), "SMALL_BUF", null);
        setIntField(term67447, term67447.getClass(), "recordSize", 0);
        setIntField(term67447, term67447.getClass(), "blockSize", 0);
        setBooleanField(term67447, term67447.getClass(), "hasHitEOF", true);
        setLongField(term67447, term67447.getClass(), "entrySize", 0L);
        setLongField(term67447, term67447.getClass(), "entryOffset", 0L);
        setField(term67447, term67447.getClass(), "is", null);
        setField(term67447, term67447.getClass(), "currEntry", null);
        setField(term67447, term67447.getClass(), "zipEncoding", null);
        setField(term67447, term67447.getClass(), "encoding", null);
        setField(term67447, term67447.getClass(), "SINGLE", null);
        setLongField(term67447, term67447.getClass(), "bytesRead", 0L);
        setField(term67446, term67446.getClass(), "is", term67447);
        setField(term67446, term67446.getClass(), "currEntry", null);
        setField(term67446, term67446.getClass(), "zipEncoding", null);
        setField(term67446, term67446.getClass(), "encoding", null);
        setField(term67446, term67446.getClass(), "SINGLE", null);
        setLongField(term67446, term67446.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "tryToConsumeSecondEOFRecord", argTypes, term66749, args);
        assertTrue(recursiveEquals(term66749, term67446));
    }

};


