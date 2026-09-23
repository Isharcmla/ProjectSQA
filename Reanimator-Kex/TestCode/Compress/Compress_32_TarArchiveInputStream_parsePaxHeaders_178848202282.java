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

public class TarArchiveInputStream_parsePaxHeaders_178848202282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27495;
     Object term27627;
     Object term28580;
     Object term28581;
     Object term28568;

    public TarArchiveInputStream_parsePaxHeaders_178848202282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27495 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term27627 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term28580 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term28580, term28580.getClass(), "SMALL_BUF", null);
        setIntField(term28580, term28580.getClass(), "recordSize", 0);
        setIntField(term28580, term28580.getClass(), "blockSize", 0);
        setBooleanField(term28580, term28580.getClass(), "hasHitEOF", false);
        setLongField(term28580, term28580.getClass(), "entrySize", 0L);
        setLongField(term28580, term28580.getClass(), "entryOffset", 0L);
        setField(term28580, term28580.getClass(), "is", null);
        setField(term28580, term28580.getClass(), "currEntry", null);
        setField(term28580, term28580.getClass(), "zipEncoding", null);
        setField(term28580, term28580.getClass(), "encoding", null);
        setField(term28580, term28580.getClass(), "SINGLE", null);
        setLongField(term28580, term28580.getClass(), "bytesRead", 0L);
        term28581 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term28581, term28581.getClass(), "SMALL_BUF", null);
        setIntField(term28581, term28581.getClass(), "recordSize", 0);
        setIntField(term28581, term28581.getClass(), "blockSize", 0);
        setBooleanField(term28581, term28581.getClass(), "hasHitEOF", false);
        setLongField(term28581, term28581.getClass(), "entrySize", 0L);
        setLongField(term28581, term28581.getClass(), "entryOffset", 0L);
        setField(term28581, term28581.getClass(), "is", null);
        setField(term28581, term28581.getClass(), "currEntry", null);
        setField(term28581, term28581.getClass(), "zipEncoding", null);
        setField(term28581, term28581.getClass(), "encoding", null);
        setField(term28581, term28581.getClass(), "SINGLE", null);
        setLongField(term28581, term28581.getClass(), "bytesRead", 0L);
        term28568 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term27627;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term27495, args);
        assertTrue(recursiveEquals(term27495, term28580));
        assertTrue(recursiveEquals(term27627, term28581));
        assertTrue(recursiveEquals(retValue, term28568));
    }

};


