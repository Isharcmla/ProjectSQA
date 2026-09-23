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
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_178848202276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25291;
     Object term25423;
     Object term25459;
     Object term25460;
     Object term25447;

    public TarArchiveInputStream_parsePaxHeaders_178848202276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25291 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term25423 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term25459 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term25459, term25459.getClass(), "SMALL_BUF", null);
        setIntField(term25459, term25459.getClass(), "recordSize", 0);
        setIntField(term25459, term25459.getClass(), "blockSize", 0);
        setBooleanField(term25459, term25459.getClass(), "hasHitEOF", false);
        setLongField(term25459, term25459.getClass(), "entrySize", 0L);
        setLongField(term25459, term25459.getClass(), "entryOffset", 0L);
        setField(term25459, term25459.getClass(), "is", null);
        setField(term25459, term25459.getClass(), "currEntry", null);
        setField(term25459, term25459.getClass(), "encoding", null);
        setField(term25459, term25459.getClass(), "SINGLE", null);
        setLongField(term25459, term25459.getClass(), "bytesRead", 0L);
        term25460 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term25460, term25460.getClass(), "SMALL_BUF", null);
        setIntField(term25460, term25460.getClass(), "recordSize", 0);
        setIntField(term25460, term25460.getClass(), "blockSize", 0);
        setBooleanField(term25460, term25460.getClass(), "hasHitEOF", false);
        setLongField(term25460, term25460.getClass(), "entrySize", 0L);
        setLongField(term25460, term25460.getClass(), "entryOffset", 0L);
        setField(term25460, term25460.getClass(), "is", null);
        setField(term25460, term25460.getClass(), "currEntry", null);
        setField(term25460, term25460.getClass(), "encoding", null);
        setField(term25460, term25460.getClass(), "SINGLE", null);
        setLongField(term25460, term25460.getClass(), "bytesRead", 0L);
        term25447 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term25423;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term25291, args);
        assertTrue(recursiveEquals(term25291, term25459));
        assertTrue(recursiveEquals(term25423, term25460));
        assertTrue(recursiveEquals(retValue, term25447));
    }

};


