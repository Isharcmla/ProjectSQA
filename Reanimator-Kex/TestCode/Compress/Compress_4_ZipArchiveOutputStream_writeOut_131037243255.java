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

public class ZipArchiveOutputStream_writeOut_131037243255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29249;

    public ZipArchiveOutputStream_writeOut_131037243255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29249 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29249, term29249.getClass(), "entry", null);
        setField(term29249, term29249.getClass(), "comment", null);
        setIntField(term29249, term29249.getClass(), "level", 0);
        setBooleanField(term29249, term29249.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29249, term29249.getClass(), "method", 0);
        setField(term29249, term29249.getClass(), "entries", null);
        setField(term29249, term29249.getClass(), "crc", null);
        setLongField(term29249, term29249.getClass(), "written", 0L);
        setLongField(term29249, term29249.getClass(), "dataStart", 0L);
        setLongField(term29249, term29249.getClass(), "localDataStart", 0L);
        setLongField(term29249, term29249.getClass(), "cdOffset", 0L);
        setLongField(term29249, term29249.getClass(), "cdLength", 0L);
        setField(term29249, term29249.getClass(), "offsets", null);
        setField(term29249, term29249.getClass(), "encoding", null);
        setField(term29249, term29249.getClass(), "zipEncoding", null);
        setField(term29249, term29249.getClass(), "def", null);
        setField(term29249, term29249.getClass(), "buf", null);
        setField(term29249, term29249.getClass(), "raf", null);
        setField(term29249, term29249.getClass(), "out", null);
        setBooleanField(term29249, term29249.getClass(), "useEFS", false);
        setBooleanField(term29249, term29249.getClass(), "fallbackToUTF8", false);
        setField(term29249, term29249.getClass(), "createUnicodeExtraFields", null);
        setField(term29249, term29249.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeOut", argTypes, term29249, args);
    }

};


