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

public class TarArchiveOutputStream_getCount_1256383180144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85948;
     Object term86757;

    public TarArchiveOutputStream_getCount_1256383180144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85948 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term86062 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setField(term85948, term85948.getClass(), "out", term86062);
        term86757 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term86758 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        setLongField(term86757, term86757.getClass(), "currSize", 0L);
        setField(term86757, term86757.getClass(), "currName", null);
        setLongField(term86757, term86757.getClass(), "currBytes", 0L);
        setField(term86757, term86757.getClass(), "recordBuf", null);
        setIntField(term86757, term86757.getClass(), "assemLen", 0);
        setField(term86757, term86757.getClass(), "assemBuf", null);
        setIntField(term86757, term86757.getClass(), "longFileMode", 0);
        setIntField(term86757, term86757.getClass(), "bigNumberMode", 0);
        setIntField(term86757, term86757.getClass(), "recordsWritten", 0);
        setIntField(term86757, term86757.getClass(), "recordsPerBlock", 0);
        setIntField(term86757, term86757.getClass(), "recordSize", 0);
        setBooleanField(term86757, term86757.getClass(), "closed", false);
        setBooleanField(term86757, term86757.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term86757, term86757.getClass(), "finished", false);
        setLongField(term86758, term86758.getClass(), "bytesWritten", 0L);
        setField(term86758, term86758.getClass(), "out", null);
        setBooleanField(term86758, term86758.getClass(), "closed", false);
        setField(term86758, term86758.getClass(), "closeLock", null);
        setField(term86757, term86757.getClass(), "out", term86758);
        setField(term86757, term86757.getClass(), "zipEncoding", null);
        setBooleanField(term86757, term86757.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term86757, term86757.getClass(), "oneByte", null);
        setLongField(term86757, term86757.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCount", argTypes, term85948, args);
        assertTrue(recursiveEquals(term85948, term86757));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


