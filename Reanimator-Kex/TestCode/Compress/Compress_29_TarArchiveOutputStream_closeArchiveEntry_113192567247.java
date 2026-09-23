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

public class TarArchiveOutputStream_closeArchiveEntry_113192567247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142225;
     Object term142309;

    public TarArchiveOutputStream_closeArchiveEntry_113192567247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142225 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term142050 = (byte[]) newByteArray(0);
        Object term142283 = newInstance(Class.forName("java.io.FilterOutputStream"));
        setBooleanField(term142225, term142225.getClass(), "finished", false);
        setBooleanField(term142225, term142225.getClass(), "haveUnclosedEntry", true);
        setIntField(term142225, term142225.getClass(), "assemLen", 1022);
        setField(term142225, term142225.getClass(), "assemBuf", term142050);
        setIntField(term142225, term142225.getClass(), "recordSize", 0);
        setField(term142225, term142225.getClass(), "out", term142283);
        term142309 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term142310 = (byte[]) newByteArray(0);
        Object term142311 = newInstance(Class.forName("java.io.FilterOutputStream"));
        setLongField(term142309, term142309.getClass(), "currSize", 0L);
        setField(term142309, term142309.getClass(), "currName", null);
        setLongField(term142309, term142309.getClass(), "currBytes", 1022L);
        setField(term142309, term142309.getClass(), "recordBuf", null);
        setIntField(term142309, term142309.getClass(), "assemLen", 0);
        setField(term142309, term142309.getClass(), "assemBuf", term142310);
        setIntField(term142309, term142309.getClass(), "longFileMode", 0);
        setIntField(term142309, term142309.getClass(), "bigNumberMode", 0);
        setIntField(term142309, term142309.getClass(), "recordsWritten", 1);
        setIntField(term142309, term142309.getClass(), "recordsPerBlock", 0);
        setIntField(term142309, term142309.getClass(), "recordSize", 0);
        setBooleanField(term142309, term142309.getClass(), "closed", false);
        setBooleanField(term142309, term142309.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term142309, term142309.getClass(), "finished", false);
        setField(term142311, term142311.getClass(), "out", null);
        setBooleanField(term142311, term142311.getClass(), "closed", false);
        setField(term142311, term142311.getClass(), "closeLock", null);
        setField(term142309, term142309.getClass(), "out", term142311);
        setField(term142309, term142309.getClass(), "zipEncoding", null);
        setBooleanField(term142309, term142309.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term142309, term142309.getClass(), "oneByte", null);
        setLongField(term142309, term142309.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term142225, args);
        assertTrue(recursiveEquals(term142225, term142309));
    }

};


