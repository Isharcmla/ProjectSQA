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

public class ZipArchiveOutputStream_writeDataDescriptor_280468346104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108226;

    public ZipArchiveOutputStream_writeDataDescriptor_280468346104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108226 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108226, term108226.getClass(), "finished", false);
        setField(term108226, term108226.getClass(), "entry", null);
        setField(term108226, term108226.getClass(), "comment", null);
        setIntField(term108226, term108226.getClass(), "level", 0);
        setBooleanField(term108226, term108226.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108226, term108226.getClass(), "method", 0);
        setField(term108226, term108226.getClass(), "entries", null);
        setField(term108226, term108226.getClass(), "streamCompressor", null);
        setLongField(term108226, term108226.getClass(), "cdOffset", 0L);
        setLongField(term108226, term108226.getClass(), "cdLength", 0L);
        setField(term108226, term108226.getClass(), "metaData", null);
        setField(term108226, term108226.getClass(), "encoding", null);
        setField(term108226, term108226.getClass(), "zipEncoding", null);
        setField(term108226, term108226.getClass(), "def", null);
        setField(term108226, term108226.getClass(), "channel", null);
        setField(term108226, term108226.getClass(), "out", null);
        setBooleanField(term108226, term108226.getClass(), "useUTF8Flag", false);
        setBooleanField(term108226, term108226.getClass(), "fallbackToUTF8", false);
        setField(term108226, term108226.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108226, term108226.getClass(), "hasUsedZip64", false);
        setField(term108226, term108226.getClass(), "zip64Mode", null);
        setField(term108226, term108226.getClass(), "copyBuffer", null);
        setField(term108226, term108226.getClass(), "calendarInstance", null);
        setField(term108226, term108226.getClass(), "oneByte", null);
        setLongField(term108226, term108226.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeDataDescriptor", argTypes, term108226, args);
    }

};


