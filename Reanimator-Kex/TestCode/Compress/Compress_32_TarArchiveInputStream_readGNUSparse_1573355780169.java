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

public class TarArchiveInputStream_readGNUSparse_1573355780169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73383;
     Object term73705;

    public TarArchiveInputStream_readGNUSparse_1573355780169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73383 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term73503 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term73635 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term73503, term73503.getClass(), "isExtended", true);
        setField(term73383, term73383.getClass(), "currEntry", term73503);
        setIntField(term73383, term73383.getClass(), "recordSize", 8);
        setField(term73383, term73383.getClass(), "is", term73635);
        term73705 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term73706 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term73705, term73705.getClass(), "SMALL_BUF", null);
        setIntField(term73705, term73705.getClass(), "recordSize", 8);
        setIntField(term73705, term73705.getClass(), "blockSize", 0);
        setBooleanField(term73705, term73705.getClass(), "hasHitEOF", true);
        setLongField(term73705, term73705.getClass(), "entrySize", 0L);
        setLongField(term73705, term73705.getClass(), "entryOffset", 0L);
        setField(term73706, term73706.getClass(), "SMALL_BUF", null);
        setIntField(term73706, term73706.getClass(), "recordSize", 0);
        setIntField(term73706, term73706.getClass(), "blockSize", 0);
        setBooleanField(term73706, term73706.getClass(), "hasHitEOF", false);
        setLongField(term73706, term73706.getClass(), "entrySize", 0L);
        setLongField(term73706, term73706.getClass(), "entryOffset", 0L);
        setField(term73706, term73706.getClass(), "is", null);
        setField(term73706, term73706.getClass(), "currEntry", null);
        setField(term73706, term73706.getClass(), "zipEncoding", null);
        setField(term73706, term73706.getClass(), "encoding", null);
        setField(term73706, term73706.getClass(), "SINGLE", null);
        setLongField(term73706, term73706.getClass(), "bytesRead", 0L);
        setField(term73705, term73705.getClass(), "is", term73706);
        setField(term73705, term73705.getClass(), "currEntry", null);
        setField(term73705, term73705.getClass(), "zipEncoding", null);
        setField(term73705, term73705.getClass(), "encoding", null);
        setField(term73705, term73705.getClass(), "SINGLE", null);
        setLongField(term73705, term73705.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readGNUSparse", argTypes, term73383, args);
        assertTrue(recursiveEquals(term73383, term73705));
    }

};


