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

public class TarArchiveOutputStream_flush_287142803141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109825;
     Object term119019;

    public TarArchiveOutputStream_flush_287142803141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109825 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term109959 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        Object term110093 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        setField(term109959, term109959.getClass(), "out", term110093);
        setField(term109825, term109825.getClass(), "out", term109959);
        term119019 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term119020 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        Object term119021 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        setLongField(term119019, term119019.getClass(), "currSize", 0L);
        setField(term119019, term119019.getClass(), "currName", null);
        setLongField(term119019, term119019.getClass(), "currBytes", 0L);
        setField(term119019, term119019.getClass(), "recordBuf", null);
        setIntField(term119019, term119019.getClass(), "assemLen", 0);
        setField(term119019, term119019.getClass(), "assemBuf", null);
        setField(term119019, term119019.getClass(), "buffer", null);
        setIntField(term119019, term119019.getClass(), "longFileMode", 0);
        setBooleanField(term119019, term119019.getClass(), "closed", false);
        setBooleanField(term119019, term119019.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term119020, term119020.getClass(), "jarMarkerAdded", false);
        setField(term119020, term119020.getClass(), "entry", null);
        setField(term119020, term119020.getClass(), "comment", null);
        setIntField(term119020, term119020.getClass(), "level", 0);
        setBooleanField(term119020, term119020.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term119020, term119020.getClass(), "method", 0);
        setField(term119020, term119020.getClass(), "entries", null);
        setField(term119020, term119020.getClass(), "crc", null);
        setLongField(term119020, term119020.getClass(), "written", 0L);
        setLongField(term119020, term119020.getClass(), "dataStart", 0L);
        setLongField(term119020, term119020.getClass(), "localDataStart", 0L);
        setLongField(term119020, term119020.getClass(), "cdOffset", 0L);
        setLongField(term119020, term119020.getClass(), "cdLength", 0L);
        setField(term119020, term119020.getClass(), "offsets", null);
        setField(term119020, term119020.getClass(), "encoding", null);
        setField(term119020, term119020.getClass(), "zipEncoding", null);
        setField(term119020, term119020.getClass(), "def", null);
        setField(term119020, term119020.getClass(), "buf", null);
        setField(term119020, term119020.getClass(), "raf", null);
        setBooleanField(term119021, term119021.getClass(), "jarMarkerAdded", false);
        setField(term119021, term119021.getClass(), "entry", null);
        setField(term119021, term119021.getClass(), "comment", null);
        setIntField(term119021, term119021.getClass(), "level", 0);
        setBooleanField(term119021, term119021.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term119021, term119021.getClass(), "method", 0);
        setField(term119021, term119021.getClass(), "entries", null);
        setField(term119021, term119021.getClass(), "crc", null);
        setLongField(term119021, term119021.getClass(), "written", 0L);
        setLongField(term119021, term119021.getClass(), "dataStart", 0L);
        setLongField(term119021, term119021.getClass(), "localDataStart", 0L);
        setLongField(term119021, term119021.getClass(), "cdOffset", 0L);
        setLongField(term119021, term119021.getClass(), "cdLength", 0L);
        setField(term119021, term119021.getClass(), "offsets", null);
        setField(term119021, term119021.getClass(), "encoding", null);
        setField(term119021, term119021.getClass(), "zipEncoding", null);
        setField(term119021, term119021.getClass(), "def", null);
        setField(term119021, term119021.getClass(), "buf", null);
        setField(term119021, term119021.getClass(), "raf", null);
        setField(term119021, term119021.getClass(), "out", null);
        setBooleanField(term119021, term119021.getClass(), "useEFS", false);
        setBooleanField(term119021, term119021.getClass(), "fallbackToUTF8", false);
        setField(term119021, term119021.getClass(), "createUnicodeExtraFields", null);
        setField(term119021, term119021.getClass(), "oneByte", null);
        setField(term119020, term119020.getClass(), "out", term119021);
        setBooleanField(term119020, term119020.getClass(), "useEFS", false);
        setBooleanField(term119020, term119020.getClass(), "fallbackToUTF8", false);
        setField(term119020, term119020.getClass(), "createUnicodeExtraFields", null);
        setField(term119020, term119020.getClass(), "oneByte", null);
        setField(term119019, term119019.getClass(), "out", term119020);
        setField(term119019, term119019.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term109825, args);
        assertTrue(recursiveEquals(term109825, term119019));
    }

};


