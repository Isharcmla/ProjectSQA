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
import java.lang.Object;

public class TarArchiveInputStream_paxHeaders_516671723245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111429;

    public TarArchiveInputStream_paxHeaders_516671723245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111429 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term111190 = (byte[]) newByteArray(16);
        Object term111499 = newInstance(Class.forName("org.tukaani.xz.SimpleInputStream"));
        setField(term111429, term111429.getClass(), "SINGLE", term111190);
        setBooleanField(term111429, term111429.getClass(), "hasHitEOF", false);
        setLongField(term111429, term111429.getClass(), "entryOffset", 412316860416L);
        setLongField(term111429, term111429.getClass(), "entrySize", 274877906945L);
        setField(term111429, term111429.getClass(), "currEntry", null);
        setIntField(term111429, term111429.getClass(), "recordSize", 0);
        setField(term111429, term111429.getClass(), "is", term111499);
        setLongField(term111429, term111429.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term111429, args);
    }

};


