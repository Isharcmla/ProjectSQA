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

public class TarArchiveInputStream_getNextEntry_36885160384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28550;
     Object term28772;

    public TarArchiveInputStream_getNextEntry_36885160384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28550 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setBooleanField(term28550, term28550.getClass(), "hasHitEOF", true);
        term28772 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term28772, term28772.getClass(), "SMALL_BUF", null);
        setIntField(term28772, term28772.getClass(), "recordSize", 0);
        setIntField(term28772, term28772.getClass(), "blockSize", 0);
        setBooleanField(term28772, term28772.getClass(), "hasHitEOF", true);
        setLongField(term28772, term28772.getClass(), "entrySize", 0L);
        setLongField(term28772, term28772.getClass(), "entryOffset", 0L);
        setField(term28772, term28772.getClass(), "is", null);
        setField(term28772, term28772.getClass(), "currEntry", null);
        setField(term28772, term28772.getClass(), "zipEncoding", null);
        setField(term28772, term28772.getClass(), "encoding", null);
        setField(term28772, term28772.getClass(), "SINGLE", null);
        setLongField(term28772, term28772.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNextEntry", argTypes, term28550, args);
        assertTrue(recursiveEquals(term28550, term28772));
        assertTrue(recursiveEquals(retValue, null));
    }

};


