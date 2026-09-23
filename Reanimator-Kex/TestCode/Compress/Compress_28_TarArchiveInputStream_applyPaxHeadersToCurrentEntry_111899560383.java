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

public class TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26610;
     Object term26670;
     Object term27084;
     Object term27085;

    public TarArchiveInputStream_applyPaxHeadersToCurrentEntry_111899560383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26610 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term26670 = new LinkedHashMap();
        ((LinkedHashMap) term26670).put((Object)null, (Object)null);
        term27084 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term27084, term27084.getClass(), "SMALL_BUF", null);
        setIntField(term27084, term27084.getClass(), "recordSize", 0);
        setIntField(term27084, term27084.getClass(), "blockSize", 0);
        setBooleanField(term27084, term27084.getClass(), "hasHitEOF", false);
        setLongField(term27084, term27084.getClass(), "entrySize", 0L);
        setLongField(term27084, term27084.getClass(), "entryOffset", 0L);
        setField(term27084, term27084.getClass(), "is", null);
        setField(term27084, term27084.getClass(), "currEntry", null);
        setField(term27084, term27084.getClass(), "encoding", null);
        setField(term27084, term27084.getClass(), "SINGLE", null);
        setLongField(term27084, term27084.getClass(), "bytesRead", 0L);
        term27085 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term26670;
        callMethod(klass, "applyPaxHeadersToCurrentEntry", argTypes, term26610, args);
        assertTrue(recursiveEquals(term26610, term27084));
        assertTrue(recursiveEquals(term26670, term27085));
    }

};


