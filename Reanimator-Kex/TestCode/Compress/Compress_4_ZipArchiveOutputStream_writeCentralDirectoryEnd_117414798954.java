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

public class ZipArchiveOutputStream_writeCentralDirectoryEnd_117414798954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29238;

    public ZipArchiveOutputStream_writeCentralDirectoryEnd_117414798954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29238 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29238, term29238.getClass(), "entry", null);
        setField(term29238, term29238.getClass(), "comment", null);
        setIntField(term29238, term29238.getClass(), "level", 0);
        setBooleanField(term29238, term29238.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29238, term29238.getClass(), "method", 0);
        setField(term29238, term29238.getClass(), "entries", null);
        setField(term29238, term29238.getClass(), "crc", null);
        setLongField(term29238, term29238.getClass(), "written", 0L);
        setLongField(term29238, term29238.getClass(), "dataStart", 0L);
        setLongField(term29238, term29238.getClass(), "localDataStart", 0L);
        setLongField(term29238, term29238.getClass(), "cdOffset", 0L);
        setLongField(term29238, term29238.getClass(), "cdLength", 0L);
        setField(term29238, term29238.getClass(), "offsets", null);
        setField(term29238, term29238.getClass(), "encoding", null);
        setField(term29238, term29238.getClass(), "zipEncoding", null);
        setField(term29238, term29238.getClass(), "def", null);
        setField(term29238, term29238.getClass(), "buf", null);
        setField(term29238, term29238.getClass(), "raf", null);
        setField(term29238, term29238.getClass(), "out", null);
        setBooleanField(term29238, term29238.getClass(), "useEFS", false);
        setBooleanField(term29238, term29238.getClass(), "fallbackToUTF8", false);
        setField(term29238, term29238.getClass(), "createUnicodeExtraFields", null);
        setField(term29238, term29238.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeCentralDirectoryEnd", argTypes, term29238, args);
    }

};


