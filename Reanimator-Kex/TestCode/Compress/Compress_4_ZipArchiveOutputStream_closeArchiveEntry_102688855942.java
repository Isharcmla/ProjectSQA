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

public class ZipArchiveOutputStream_closeArchiveEntry_102688855942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29098;

    public ZipArchiveOutputStream_closeArchiveEntry_102688855942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29098 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29098, term29098.getClass(), "entry", null);
        setField(term29098, term29098.getClass(), "comment", null);
        setIntField(term29098, term29098.getClass(), "level", 0);
        setBooleanField(term29098, term29098.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29098, term29098.getClass(), "method", 0);
        setField(term29098, term29098.getClass(), "entries", null);
        setField(term29098, term29098.getClass(), "crc", null);
        setLongField(term29098, term29098.getClass(), "written", 0L);
        setLongField(term29098, term29098.getClass(), "dataStart", 0L);
        setLongField(term29098, term29098.getClass(), "localDataStart", 0L);
        setLongField(term29098, term29098.getClass(), "cdOffset", 0L);
        setLongField(term29098, term29098.getClass(), "cdLength", 0L);
        setField(term29098, term29098.getClass(), "offsets", null);
        setField(term29098, term29098.getClass(), "encoding", null);
        setField(term29098, term29098.getClass(), "zipEncoding", null);
        setField(term29098, term29098.getClass(), "def", null);
        setField(term29098, term29098.getClass(), "buf", null);
        setField(term29098, term29098.getClass(), "raf", null);
        setField(term29098, term29098.getClass(), "out", null);
        setBooleanField(term29098, term29098.getClass(), "useEFS", false);
        setBooleanField(term29098, term29098.getClass(), "fallbackToUTF8", false);
        setField(term29098, term29098.getClass(), "createUnicodeExtraFields", null);
        setField(term29098, term29098.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term29098, args);
    }

};


