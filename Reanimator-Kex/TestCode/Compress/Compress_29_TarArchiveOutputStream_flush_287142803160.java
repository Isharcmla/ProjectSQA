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

public class TarArchiveOutputStream_flush_287142803160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89223;
     Object term89495;

    public TarArchiveOutputStream_flush_287142803160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89223 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term89273 = newInstance(Class.forName("java.io.OutputStream$1"));
        setField(term89223, term89223.getClass(), "out", term89273);
        term89495 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term89496 = newInstance(Class.forName("java.io.OutputStream$1"));
        setLongField(term89495, term89495.getClass(), "currSize", 0L);
        setField(term89495, term89495.getClass(), "currName", null);
        setLongField(term89495, term89495.getClass(), "currBytes", 0L);
        setField(term89495, term89495.getClass(), "recordBuf", null);
        setIntField(term89495, term89495.getClass(), "assemLen", 0);
        setField(term89495, term89495.getClass(), "assemBuf", null);
        setIntField(term89495, term89495.getClass(), "longFileMode", 0);
        setIntField(term89495, term89495.getClass(), "bigNumberMode", 0);
        setIntField(term89495, term89495.getClass(), "recordsWritten", 0);
        setIntField(term89495, term89495.getClass(), "recordsPerBlock", 0);
        setIntField(term89495, term89495.getClass(), "recordSize", 0);
        setBooleanField(term89495, term89495.getClass(), "closed", false);
        setBooleanField(term89495, term89495.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term89495, term89495.getClass(), "finished", false);
        setBooleanField(term89496, term89496.getClass(), "closed", false);
        setField(term89495, term89495.getClass(), "out", term89496);
        setField(term89495, term89495.getClass(), "zipEncoding", null);
        setBooleanField(term89495, term89495.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term89495, term89495.getClass(), "oneByte", null);
        setLongField(term89495, term89495.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term89223, args);
        assertTrue(recursiveEquals(term89223, term89495));
    }

};


