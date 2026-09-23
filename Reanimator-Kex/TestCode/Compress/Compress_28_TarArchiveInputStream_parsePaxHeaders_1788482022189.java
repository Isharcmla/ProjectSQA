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
import java.util.HashMap;

public class TarArchiveInputStream_parsePaxHeaders_1788482022189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90481;
     Object term90619;
     Object term91050;
     Object term91051;
     Object term91038;

    public TarArchiveInputStream_parsePaxHeaders_1788482022189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90481 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        term90619 = newInstance(Class.forName("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        Object term90681 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setField(term90619, term90619.getClass(), "in", term90681);
        term91050 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term91050, term91050.getClass(), "SMALL_BUF", null);
        setIntField(term91050, term91050.getClass(), "recordSize", 0);
        setIntField(term91050, term91050.getClass(), "blockSize", 0);
        setBooleanField(term91050, term91050.getClass(), "hasHitEOF", false);
        setLongField(term91050, term91050.getClass(), "entrySize", 0L);
        setLongField(term91050, term91050.getClass(), "entryOffset", 0L);
        setField(term91050, term91050.getClass(), "is", null);
        setField(term91050, term91050.getClass(), "currEntry", null);
        setField(term91050, term91050.getClass(), "encoding", null);
        setField(term91050, term91050.getClass(), "SINGLE", null);
        setLongField(term91050, term91050.getClass(), "bytesRead", 0L);
        term91051 = newInstance(Class.forName("org.apache.commons.compress.compressors.xz.XZCompressorInputStream"));
        Object term91052 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setField(term91052, term91052.getClass(), "buf", null);
        setIntField(term91052, term91052.getClass(), "pos", 0);
        setIntField(term91052, term91052.getClass(), "mark", 0);
        setIntField(term91052, term91052.getClass(), "count", 0);
        setField(term91051, term91051.getClass(), "in", term91052);
        setLongField(term91051, term91051.getClass(), "bytesRead", 0L);
        term91038 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term90619;
        Object retValue = callMethod(klass, "parsePaxHeaders", argTypes, term90481, args);
        assertTrue(recursiveEquals(term90481, term91050));
        assertTrue(recursiveEquals(term90619, term91051));
        assertTrue(recursiveEquals(retValue, term91038));
    }

};


