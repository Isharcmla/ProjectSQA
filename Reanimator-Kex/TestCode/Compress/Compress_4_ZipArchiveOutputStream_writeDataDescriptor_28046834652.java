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

public class ZipArchiveOutputStream_writeDataDescriptor_28046834652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29216;

    public ZipArchiveOutputStream_writeDataDescriptor_28046834652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29216 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term29216, term29216.getClass(), "entry", null);
        setField(term29216, term29216.getClass(), "comment", null);
        setIntField(term29216, term29216.getClass(), "level", 0);
        setBooleanField(term29216, term29216.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term29216, term29216.getClass(), "method", 0);
        setField(term29216, term29216.getClass(), "entries", null);
        setField(term29216, term29216.getClass(), "crc", null);
        setLongField(term29216, term29216.getClass(), "written", 0L);
        setLongField(term29216, term29216.getClass(), "dataStart", 0L);
        setLongField(term29216, term29216.getClass(), "localDataStart", 0L);
        setLongField(term29216, term29216.getClass(), "cdOffset", 0L);
        setLongField(term29216, term29216.getClass(), "cdLength", 0L);
        setField(term29216, term29216.getClass(), "offsets", null);
        setField(term29216, term29216.getClass(), "encoding", null);
        setField(term29216, term29216.getClass(), "zipEncoding", null);
        setField(term29216, term29216.getClass(), "def", null);
        setField(term29216, term29216.getClass(), "buf", null);
        setField(term29216, term29216.getClass(), "raf", null);
        setField(term29216, term29216.getClass(), "out", null);
        setBooleanField(term29216, term29216.getClass(), "useEFS", false);
        setBooleanField(term29216, term29216.getClass(), "fallbackToUTF8", false);
        setField(term29216, term29216.getClass(), "createUnicodeExtraFields", null);
        setField(term29216, term29216.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeDataDescriptor", argTypes, term29216, args);
    }

};


