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

public class TarArchiveInputStream_getNextTarEntry_135466979159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68129;
     Object term68821;

    public TarArchiveInputStream_getNextTarEntry_135466979159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68129 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term68261 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term68129, term68129.getClass(), "hasHitEOF", false);
        setField(term68129, term68129.getClass(), "currEntry", null);
        setIntField(term68129, term68129.getClass(), "recordSize", 512);
        setBooleanField(term68261, term68261.getClass(), "hasHitEOF", true);
        setField(term68129, term68129.getClass(), "is", term68261);
        term68821 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term68822 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term68821, term68821.getClass(), "SMALL_BUF", null);
        setIntField(term68821, term68821.getClass(), "recordSize", 512);
        setIntField(term68821, term68821.getClass(), "blockSize", 0);
        setBooleanField(term68821, term68821.getClass(), "hasHitEOF", true);
        setLongField(term68821, term68821.getClass(), "entrySize", 0L);
        setLongField(term68821, term68821.getClass(), "entryOffset", 0L);
        setField(term68822, term68822.getClass(), "SMALL_BUF", null);
        setIntField(term68822, term68822.getClass(), "recordSize", 0);
        setIntField(term68822, term68822.getClass(), "blockSize", 0);
        setBooleanField(term68822, term68822.getClass(), "hasHitEOF", true);
        setLongField(term68822, term68822.getClass(), "entrySize", 0L);
        setLongField(term68822, term68822.getClass(), "entryOffset", 0L);
        setField(term68822, term68822.getClass(), "is", null);
        setField(term68822, term68822.getClass(), "currEntry", null);
        setField(term68822, term68822.getClass(), "zipEncoding", null);
        setField(term68822, term68822.getClass(), "encoding", null);
        setField(term68822, term68822.getClass(), "SINGLE", null);
        setLongField(term68822, term68822.getClass(), "bytesRead", 0L);
        setField(term68821, term68821.getClass(), "is", term68822);
        setField(term68821, term68821.getClass(), "currEntry", null);
        setField(term68821, term68821.getClass(), "zipEncoding", null);
        setField(term68821, term68821.getClass(), "encoding", null);
        setField(term68821, term68821.getClass(), "SINGLE", null);
        setLongField(term68821, term68821.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextTarEntry", argTypes, term68129, args);
        assertTrue(recursiveEquals(term68129, term68821));
        assertTrue(recursiveEquals(retValue, null));
    }

};


