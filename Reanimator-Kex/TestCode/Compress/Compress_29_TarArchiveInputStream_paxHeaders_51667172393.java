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

public class TarArchiveInputStream_paxHeaders_51667172393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29363;
     Object term29794;

    public TarArchiveInputStream_paxHeaders_51667172393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29363 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term29363, term29363.getClass(), "SINGLE", null);
        setBooleanField(term29363, term29363.getClass(), "hasHitEOF", true);
        term29794 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term29794, term29794.getClass(), "SMALL_BUF", null);
        setIntField(term29794, term29794.getClass(), "recordSize", 0);
        setIntField(term29794, term29794.getClass(), "blockSize", 0);
        setBooleanField(term29794, term29794.getClass(), "hasHitEOF", true);
        setLongField(term29794, term29794.getClass(), "entrySize", 0L);
        setLongField(term29794, term29794.getClass(), "entryOffset", 0L);
        setField(term29794, term29794.getClass(), "is", null);
        setField(term29794, term29794.getClass(), "currEntry", null);
        setField(term29794, term29794.getClass(), "zipEncoding", null);
        setField(term29794, term29794.getClass(), "SINGLE", null);
        setLongField(term29794, term29794.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term29363, args);
        assertTrue(recursiveEquals(term29363, term29794));
    }

};


