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

public class TarArchiveOutputStream_flush_287142803107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100943;
     Object term102318;

    public TarArchiveOutputStream_flush_287142803107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100943 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term101077 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        setField(term100943, term100943.getClass(), "out", term101077);
        term102318 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term102319 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        setLongField(term102318, term102318.getClass(), "currSize", 0L);
        setField(term102318, term102318.getClass(), "currName", null);
        setLongField(term102318, term102318.getClass(), "currBytes", 0L);
        setField(term102318, term102318.getClass(), "recordBuf", null);
        setIntField(term102318, term102318.getClass(), "assemLen", 0);
        setField(term102318, term102318.getClass(), "assemBuf", null);
        setField(term102318, term102318.getClass(), "buffer", null);
        setIntField(term102318, term102318.getClass(), "longFileMode", 0);
        setBooleanField(term102318, term102318.getClass(), "closed", false);
        setBooleanField(term102318, term102318.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term102319, term102319.getClass(), "jarMarkerAdded", false);
        setField(term102319, term102319.getClass(), "entry", null);
        setField(term102319, term102319.getClass(), "comment", null);
        setIntField(term102319, term102319.getClass(), "level", 0);
        setBooleanField(term102319, term102319.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term102319, term102319.getClass(), "method", 0);
        setField(term102319, term102319.getClass(), "entries", null);
        setField(term102319, term102319.getClass(), "crc", null);
        setLongField(term102319, term102319.getClass(), "written", 0L);
        setLongField(term102319, term102319.getClass(), "dataStart", 0L);
        setLongField(term102319, term102319.getClass(), "localDataStart", 0L);
        setLongField(term102319, term102319.getClass(), "cdOffset", 0L);
        setLongField(term102319, term102319.getClass(), "cdLength", 0L);
        setField(term102319, term102319.getClass(), "offsets", null);
        setField(term102319, term102319.getClass(), "encoding", null);
        setField(term102319, term102319.getClass(), "zipEncoding", null);
        setField(term102319, term102319.getClass(), "def", null);
        setField(term102319, term102319.getClass(), "buf", null);
        setField(term102319, term102319.getClass(), "raf", null);
        setField(term102319, term102319.getClass(), "out", null);
        setBooleanField(term102319, term102319.getClass(), "useEFS", false);
        setBooleanField(term102319, term102319.getClass(), "fallbackToUTF8", false);
        setField(term102319, term102319.getClass(), "createUnicodeExtraFields", null);
        setField(term102319, term102319.getClass(), "oneByte", null);
        setField(term102318, term102318.getClass(), "out", term102319);
        setField(term102318, term102318.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term100943, args);
        assertTrue(recursiveEquals(term100943, term102318));
    }

};


