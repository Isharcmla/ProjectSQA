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

public class TarArchiveInputStream_close_1662441532107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32674;
     Object term32751;

    public TarArchiveInputStream_close_1662441532107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32674 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term32742 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setField(term32674, term32674.getClass(), "is", term32742);
        term32751 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term32752 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setField(term32751, term32751.getClass(), "SMALL_BUF", null);
        setIntField(term32751, term32751.getClass(), "recordSize", 0);
        setIntField(term32751, term32751.getClass(), "blockSize", 0);
        setBooleanField(term32751, term32751.getClass(), "hasHitEOF", false);
        setLongField(term32751, term32751.getClass(), "entrySize", 0L);
        setLongField(term32751, term32751.getClass(), "entryOffset", 0L);
        setField(term32752, term32752.getClass(), "this$0", null);
        setField(term32752, term32752.getClass(), "in", null);
        setField(term32751, term32751.getClass(), "is", term32752);
        setField(term32751, term32751.getClass(), "currEntry", null);
        setField(term32751, term32751.getClass(), "zipEncoding", null);
        setField(term32751, term32751.getClass(), "encoding", null);
        setField(term32751, term32751.getClass(), "SINGLE", null);
        setLongField(term32751, term32751.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term32674, args);
        assertTrue(recursiveEquals(term32674, term32751));
    }

};


