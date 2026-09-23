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

public class TarArchiveInputStream_close_1662441532184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89164;
     Object term89756;

    public TarArchiveInputStream_close_1662441532184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89164 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89296 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89428 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89490 = newInstance(Class.forName("org.tukaani.xz.XZInputStream"));
        setField(term89428, term89428.getClass(), "is", term89490);
        setField(term89296, term89296.getClass(), "is", term89428);
        setField(term89164, term89164.getClass(), "is", term89296);
        term89756 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89757 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89758 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term89759 = newInstance(Class.forName("org.tukaani.xz.XZInputStream"));
        setField(term89756, term89756.getClass(), "SMALL_BUF", null);
        setIntField(term89756, term89756.getClass(), "recordSize", 0);
        setIntField(term89756, term89756.getClass(), "blockSize", 0);
        setBooleanField(term89756, term89756.getClass(), "hasHitEOF", false);
        setLongField(term89756, term89756.getClass(), "entrySize", 0L);
        setLongField(term89756, term89756.getClass(), "entryOffset", 0L);
        setField(term89757, term89757.getClass(), "SMALL_BUF", null);
        setIntField(term89757, term89757.getClass(), "recordSize", 0);
        setIntField(term89757, term89757.getClass(), "blockSize", 0);
        setBooleanField(term89757, term89757.getClass(), "hasHitEOF", false);
        setLongField(term89757, term89757.getClass(), "entrySize", 0L);
        setLongField(term89757, term89757.getClass(), "entryOffset", 0L);
        setField(term89758, term89758.getClass(), "SMALL_BUF", null);
        setIntField(term89758, term89758.getClass(), "recordSize", 0);
        setIntField(term89758, term89758.getClass(), "blockSize", 0);
        setBooleanField(term89758, term89758.getClass(), "hasHitEOF", false);
        setLongField(term89758, term89758.getClass(), "entrySize", 0L);
        setLongField(term89758, term89758.getClass(), "entryOffset", 0L);
        setIntField(term89759, term89759.getClass(), "memoryLimit", 0);
        setField(term89759, term89759.getClass(), "in", null);
        setField(term89759, term89759.getClass(), "xzIn", null);
        setBooleanField(term89759, term89759.getClass(), "endReached", false);
        setField(term89759, term89759.getClass(), "exception", null);
        setField(term89759, term89759.getClass(), "tempBuf", null);
        setField(term89758, term89758.getClass(), "is", term89759);
        setField(term89758, term89758.getClass(), "currEntry", null);
        setField(term89758, term89758.getClass(), "encoding", null);
        setField(term89758, term89758.getClass(), "SINGLE", null);
        setLongField(term89758, term89758.getClass(), "bytesRead", 0L);
        setField(term89757, term89757.getClass(), "is", term89758);
        setField(term89757, term89757.getClass(), "currEntry", null);
        setField(term89757, term89757.getClass(), "encoding", null);
        setField(term89757, term89757.getClass(), "SINGLE", null);
        setLongField(term89757, term89757.getClass(), "bytesRead", 0L);
        setField(term89756, term89756.getClass(), "is", term89757);
        setField(term89756, term89756.getClass(), "currEntry", null);
        setField(term89756, term89756.getClass(), "encoding", null);
        setField(term89756, term89756.getClass(), "SINGLE", null);
        setLongField(term89756, term89756.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term89164, args);
        assertTrue(recursiveEquals(term89164, term89756));
    }

};


