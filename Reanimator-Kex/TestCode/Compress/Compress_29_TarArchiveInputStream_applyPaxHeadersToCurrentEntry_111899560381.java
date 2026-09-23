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

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26925;
     Object term26985;
     Object term27395;
     Object term27396;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26925 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term26985 = new LinkedHashMap();
        ((LinkedHashMap) term26985).put((Object)null, (Object)null);
        term27395 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term27395, term27395.getClass(), "SMALL_BUF", null);
        setIntField(term27395, term27395.getClass(), "recordSize", 0);
        setIntField(term27395, term27395.getClass(), "blockSize", 0);
        setBooleanField(term27395, term27395.getClass(), "hasHitEOF", false);
        setLongField(term27395, term27395.getClass(), "entrySize", 0L);
        setLongField(term27395, term27395.getClass(), "entryOffset", 0L);
        setField(term27395, term27395.getClass(), "is", null);
        setField(term27395, term27395.getClass(), "currEntry", null);
        setField(term27395, term27395.getClass(), "zipEncoding", null);
        setField(term27395, term27395.getClass(), "SINGLE", null);
        setLongField(term27395, term27395.getClass(), "bytesRead", 0L);
        term27396 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term26985;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term26925, args);
        assertTrue(recursiveEquals(term26925, term27395));
        assertTrue(recursiveEquals(term26985, term27396));
    }

};


