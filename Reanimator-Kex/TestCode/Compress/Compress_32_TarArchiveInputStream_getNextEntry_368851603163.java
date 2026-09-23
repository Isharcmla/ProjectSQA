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

public class TarArchiveInputStream_getNextEntry_368851603163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70820;
     Object term71514;

    public TarArchiveInputStream_getNextEntry_368851603163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70820 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term70952 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term70820, term70820.getClass(), "hasHitEOF", false);
        setField(term70820, term70820.getClass(), "currEntry", null);
        setIntField(term70820, term70820.getClass(), "recordSize", 512);
        setField(term70820, term70820.getClass(), "is", term70952);
        term71514 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term71515 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term71514, term71514.getClass(), "SMALL_BUF", null);
        setIntField(term71514, term71514.getClass(), "recordSize", 512);
        setIntField(term71514, term71514.getClass(), "blockSize", 0);
        setBooleanField(term71514, term71514.getClass(), "hasHitEOF", true);
        setLongField(term71514, term71514.getClass(), "entrySize", 0L);
        setLongField(term71514, term71514.getClass(), "entryOffset", 0L);
        setField(term71515, term71515.getClass(), "SMALL_BUF", null);
        setIntField(term71515, term71515.getClass(), "recordSize", 0);
        setIntField(term71515, term71515.getClass(), "blockSize", 0);
        setBooleanField(term71515, term71515.getClass(), "hasHitEOF", false);
        setLongField(term71515, term71515.getClass(), "entrySize", 0L);
        setLongField(term71515, term71515.getClass(), "entryOffset", 0L);
        setField(term71515, term71515.getClass(), "is", null);
        setField(term71515, term71515.getClass(), "currEntry", null);
        setField(term71515, term71515.getClass(), "zipEncoding", null);
        setField(term71515, term71515.getClass(), "encoding", null);
        setField(term71515, term71515.getClass(), "SINGLE", null);
        setLongField(term71515, term71515.getClass(), "bytesRead", 0L);
        setField(term71514, term71514.getClass(), "is", term71515);
        setField(term71514, term71514.getClass(), "currEntry", null);
        setField(term71514, term71514.getClass(), "zipEncoding", null);
        setField(term71514, term71514.getClass(), "encoding", null);
        setField(term71514, term71514.getClass(), "SINGLE", null);
        setLongField(term71514, term71514.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term70820, args);
        assertTrue(recursiveEquals(term70820, term71514));
        assertTrue(recursiveEquals(retValue, null));
    }

};


