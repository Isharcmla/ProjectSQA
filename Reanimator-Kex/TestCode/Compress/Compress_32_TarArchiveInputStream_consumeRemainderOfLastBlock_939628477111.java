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

public class TarArchiveInputStream_consumeRemainderOfLastBlock_939628477111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34280;
     Object term36885;

    public TarArchiveInputStream_consumeRemainderOfLastBlock_939628477111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34280 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term34412 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setLongField(term34280, term34280.getClass(), "bytesRead", -925485789362838487L);
        setIntField(term34280, term34280.getClass(), "blockSize", 822);
        setField(term34280, term34280.getClass(), "is", term34412);
        term36885 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term36886 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term36885, term36885.getClass(), "SMALL_BUF", null);
        setIntField(term36885, term36885.getClass(), "recordSize", 0);
        setIntField(term36885, term36885.getClass(), "blockSize", 822);
        setBooleanField(term36885, term36885.getClass(), "hasHitEOF", false);
        setLongField(term36885, term36885.getClass(), "entrySize", 0L);
        setLongField(term36885, term36885.getClass(), "entryOffset", 0L);
        setField(term36886, term36886.getClass(), "SMALL_BUF", null);
        setIntField(term36886, term36886.getClass(), "recordSize", 0);
        setIntField(term36886, term36886.getClass(), "blockSize", 0);
        setBooleanField(term36886, term36886.getClass(), "hasHitEOF", false);
        setLongField(term36886, term36886.getClass(), "entrySize", 0L);
        setLongField(term36886, term36886.getClass(), "entryOffset", 0L);
        setField(term36886, term36886.getClass(), "is", null);
        setField(term36886, term36886.getClass(), "currEntry", null);
        setField(term36886, term36886.getClass(), "zipEncoding", null);
        setField(term36886, term36886.getClass(), "encoding", null);
        setField(term36886, term36886.getClass(), "SINGLE", null);
        setLongField(term36886, term36886.getClass(), "bytesRead", 0L);
        setField(term36885, term36885.getClass(), "is", term36886);
        setField(term36885, term36885.getClass(), "currEntry", null);
        setField(term36885, term36885.getClass(), "zipEncoding", null);
        setField(term36885, term36885.getClass(), "encoding", null);
        setField(term36885, term36885.getClass(), "SINGLE", null);
        setLongField(term36885, term36885.getClass(), "bytesRead", -925485789362838487L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeRemainderOfLastBlock", argTypes, term34280, args);
        assertTrue(recursiveEquals(term34280, term36885));
    }

};


