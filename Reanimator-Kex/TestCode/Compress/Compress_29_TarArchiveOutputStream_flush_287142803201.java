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

public class TarArchiveOutputStream_flush_287142803201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113512;
     Object term113753;

    public TarArchiveOutputStream_flush_287142803201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113512 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term113646 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term113708 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        setField(term113646, term113646.getClass(), "out", term113708);
        setField(term113512, term113512.getClass(), "out", term113646);
        term113753 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term113754 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term113755 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        setLongField(term113753, term113753.getClass(), "currSize", 0L);
        setField(term113753, term113753.getClass(), "currName", null);
        setLongField(term113753, term113753.getClass(), "currBytes", 0L);
        setField(term113753, term113753.getClass(), "recordBuf", null);
        setIntField(term113753, term113753.getClass(), "assemLen", 0);
        setField(term113753, term113753.getClass(), "assemBuf", null);
        setIntField(term113753, term113753.getClass(), "longFileMode", 0);
        setIntField(term113753, term113753.getClass(), "bigNumberMode", 0);
        setIntField(term113753, term113753.getClass(), "recordsWritten", 0);
        setIntField(term113753, term113753.getClass(), "recordsPerBlock", 0);
        setIntField(term113753, term113753.getClass(), "recordSize", 0);
        setBooleanField(term113753, term113753.getClass(), "closed", false);
        setBooleanField(term113753, term113753.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term113753, term113753.getClass(), "finished", false);
        setLongField(term113754, term113754.getClass(), "currSize", 0L);
        setField(term113754, term113754.getClass(), "currName", null);
        setLongField(term113754, term113754.getClass(), "currBytes", 0L);
        setField(term113754, term113754.getClass(), "recordBuf", null);
        setIntField(term113754, term113754.getClass(), "assemLen", 0);
        setField(term113754, term113754.getClass(), "assemBuf", null);
        setIntField(term113754, term113754.getClass(), "longFileMode", 0);
        setIntField(term113754, term113754.getClass(), "bigNumberMode", 0);
        setIntField(term113754, term113754.getClass(), "recordsWritten", 0);
        setIntField(term113754, term113754.getClass(), "recordsPerBlock", 0);
        setIntField(term113754, term113754.getClass(), "recordSize", 0);
        setBooleanField(term113754, term113754.getClass(), "closed", false);
        setBooleanField(term113754, term113754.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term113754, term113754.getClass(), "finished", false);
        setField(term113755, term113755.getClass(), "bb", null);
        setField(term113755, term113755.getClass(), "bs", null);
        setField(term113755, term113755.getClass(), "b1", null);
        setField(term113755, term113755.getClass(), "val$ch", null);
        setField(term113754, term113754.getClass(), "out", term113755);
        setField(term113754, term113754.getClass(), "zipEncoding", null);
        setBooleanField(term113754, term113754.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term113754, term113754.getClass(), "oneByte", null);
        setLongField(term113754, term113754.getClass(), "bytesWritten", 0L);
        setField(term113753, term113753.getClass(), "out", term113754);
        setField(term113753, term113753.getClass(), "zipEncoding", null);
        setBooleanField(term113753, term113753.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term113753, term113753.getClass(), "oneByte", null);
        setLongField(term113753, term113753.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term113512, args);
        assertTrue(recursiveEquals(term113512, term113753));
    }

};


