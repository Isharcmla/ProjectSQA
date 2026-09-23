package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZipArchiveOutputStream_createArchiveEntry_171297756659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29301;

    public ZipArchiveOutputStream_createArchiveEntry_171297756659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29301 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29301, term29301.getClass(), "entry", null);
        setField(term29301, term29301.getClass(), "comment", null);
        setIntField(term29301, term29301.getClass(), "level", 0);
        setBooleanField(term29301, term29301.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29301, term29301.getClass(), "method", 0);
        setField(term29301, term29301.getClass(), "entries", null);
        setField(term29301, term29301.getClass(), "crc", null);
        setLongField(term29301, term29301.getClass(), "written", 0L);
        setLongField(term29301, term29301.getClass(), "dataStart", 0L);
        setLongField(term29301, term29301.getClass(), "localDataStart", 0L);
        setLongField(term29301, term29301.getClass(), "cdOffset", 0L);
        setLongField(term29301, term29301.getClass(), "cdLength", 0L);
        setField(term29301, term29301.getClass(), "offsets", null);
        setField(term29301, term29301.getClass(), "encoding", null);
        setField(term29301, term29301.getClass(), "zipEncoding", null);
        setField(term29301, term29301.getClass(), "def", null);
        setField(term29301, term29301.getClass(), "buf", null);
        setField(term29301, term29301.getClass(), "raf", null);
        setField(term29301, term29301.getClass(), "out", null);
        setBooleanField(term29301, term29301.getClass(), "useEFS", false);
        setBooleanField(term29301, term29301.getClass(), "fallbackToUTF8", false);
        setField(term29301, term29301.getClass(), "createUnicodeExtraFields", null);
        setField(term29301, term29301.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createArchiveEntry", argTypes, term29301, args);
    }

};


