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
import java.util.LinkedHashMap;
import java.lang.Object;

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29764;
     Object term29824;
     Object term30240;
     Object term30241;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29764 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term29824 = new LinkedHashMap();
        ((LinkedHashMap) term29824).put((Object)null, (Object)null);
        term30240 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term30240, term30240.getClass(), "SMALL_BUF", null);
        setIntField(term30240, term30240.getClass(), "recordSize", 0);
        setIntField(term30240, term30240.getClass(), "blockSize", 0);
        setBooleanField(term30240, term30240.getClass(), "hasHitEOF", false);
        setLongField(term30240, term30240.getClass(), "entrySize", 0L);
        setLongField(term30240, term30240.getClass(), "entryOffset", 0L);
        setField(term30240, term30240.getClass(), "is", null);
        setField(term30240, term30240.getClass(), "currEntry", null);
        setField(term30240, term30240.getClass(), "zipEncoding", null);
        setField(term30240, term30240.getClass(), "encoding", null);
        setField(term30240, term30240.getClass(), "SINGLE", null);
        setLongField(term30240, term30240.getClass(), "bytesRead", 0L);
        term30241 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term29824;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term29764, args);
        assertTrue(recursiveEquals(term29764, term30240));
        assertTrue(recursiveEquals(term29824, term30241));
    }

};


