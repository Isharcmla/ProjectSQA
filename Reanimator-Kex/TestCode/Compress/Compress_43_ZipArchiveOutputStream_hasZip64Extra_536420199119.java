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

public class ZipArchiveOutputStream_hasZip64Extra_536420199119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108415;

    public ZipArchiveOutputStream_hasZip64Extra_536420199119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108415 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108415, term108415.getClass(), "finished", false);
        setField(term108415, term108415.getClass(), "entry", null);
        setField(term108415, term108415.getClass(), "comment", null);
        setIntField(term108415, term108415.getClass(), "level", 0);
        setBooleanField(term108415, term108415.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108415, term108415.getClass(), "method", 0);
        setField(term108415, term108415.getClass(), "entries", null);
        setField(term108415, term108415.getClass(), "streamCompressor", null);
        setLongField(term108415, term108415.getClass(), "cdOffset", 0L);
        setLongField(term108415, term108415.getClass(), "cdLength", 0L);
        setField(term108415, term108415.getClass(), "metaData", null);
        setField(term108415, term108415.getClass(), "encoding", null);
        setField(term108415, term108415.getClass(), "zipEncoding", null);
        setField(term108415, term108415.getClass(), "def", null);
        setField(term108415, term108415.getClass(), "channel", null);
        setField(term108415, term108415.getClass(), "out", null);
        setBooleanField(term108415, term108415.getClass(), "useUTF8Flag", false);
        setBooleanField(term108415, term108415.getClass(), "fallbackToUTF8", false);
        setField(term108415, term108415.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108415, term108415.getClass(), "hasUsedZip64", false);
        setField(term108415, term108415.getClass(), "zip64Mode", null);
        setField(term108415, term108415.getClass(), "copyBuffer", null);
        setField(term108415, term108415.getClass(), "calendarInstance", null);
        setField(term108415, term108415.getClass(), "oneByte", null);
        setLongField(term108415, term108415.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasZip64Extra", argTypes, term108415, args);
    }

};


