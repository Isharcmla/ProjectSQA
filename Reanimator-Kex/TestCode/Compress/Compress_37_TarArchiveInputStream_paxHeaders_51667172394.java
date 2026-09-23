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

public class TarArchiveInputStream_paxHeaders_51667172394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42134;
     Object term42466;

    public TarArchiveInputStream_paxHeaders_51667172394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42182 = new HashMap();
        term42134 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term41933 = (byte[]) newByteArray(0);
        setField(term42134, term42134.getClass(), "globalPaxHeaders", term42182);
        setField(term42134, term42134.getClass(), "SINGLE", term41933);
        setBooleanField(term42134, term42134.getClass(), "hasHitEOF", true);
        HashMap term42467 = new HashMap();
        term42466 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term42468 = (byte[]) newByteArray(0);
        setField(term42466, term42466.getClass(), "SMALL_BUF", null);
        setIntField(term42466, term42466.getClass(), "recordSize", 0);
        setIntField(term42466, term42466.getClass(), "blockSize", 0);
        setBooleanField(term42466, term42466.getClass(), "hasHitEOF", true);
        setLongField(term42466, term42466.getClass(), "entrySize", 0L);
        setLongField(term42466, term42466.getClass(), "entryOffset", 0L);
        setField(term42466, term42466.getClass(), "is", null);
        setField(term42466, term42466.getClass(), "currEntry", null);
        setField(term42466, term42466.getClass(), "zipEncoding", null);
        setField(term42466, term42466.getClass(), "encoding", null);
        setField(term42466, term42466.getClass(), "globalPaxHeaders", term42467);
        setField(term42466, term42466.getClass(), "SINGLE", term42468);
        setLongField(term42466, term42466.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term42134, args);
        assertTrue(recursiveEquals(term42134, term42466));
    }

};


