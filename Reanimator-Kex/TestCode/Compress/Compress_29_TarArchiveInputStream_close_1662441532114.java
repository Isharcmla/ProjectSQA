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

public class TarArchiveInputStream_close_1662441532114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34468;
     Object term34814;

    public TarArchiveInputStream_close_1662441532114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34468 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term34534 = newInstance(Class.forName("org.tukaani.xz.LZMAInputStream"));
        setField(term34468, term34468.getClass(), "is", term34534);
        term34814 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term34815 = newInstance(Class.forName("org.tukaani.xz.LZMAInputStream"));
        setField(term34814, term34814.getClass(), "SMALL_BUF", null);
        setIntField(term34814, term34814.getClass(), "recordSize", 0);
        setIntField(term34814, term34814.getClass(), "blockSize", 0);
        setBooleanField(term34814, term34814.getClass(), "hasHitEOF", false);
        setLongField(term34814, term34814.getClass(), "entrySize", 0L);
        setLongField(term34814, term34814.getClass(), "entryOffset", 0L);
        setField(term34815, term34815.getClass(), "in", null);
        setField(term34815, term34815.getClass(), "lz", null);
        setField(term34815, term34815.getClass(), "rc", null);
        setField(term34815, term34815.getClass(), "lzma", null);
        setBooleanField(term34815, term34815.getClass(), "endReached", false);
        setField(term34815, term34815.getClass(), "tempBuf", null);
        setLongField(term34815, term34815.getClass(), "remainingSize", 0L);
        setField(term34815, term34815.getClass(), "exception", null);
        setField(term34814, term34814.getClass(), "is", term34815);
        setField(term34814, term34814.getClass(), "currEntry", null);
        setField(term34814, term34814.getClass(), "zipEncoding", null);
        setField(term34814, term34814.getClass(), "SINGLE", null);
        setLongField(term34814, term34814.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term34468, args);
        assertTrue(recursiveEquals(term34468, term34814));
    }

};


