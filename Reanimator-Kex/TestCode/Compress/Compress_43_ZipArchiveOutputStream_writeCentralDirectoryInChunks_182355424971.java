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

public class ZipArchiveOutputStream_writeCentralDirectoryInChunks_182355424971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107831;

    public ZipArchiveOutputStream_writeCentralDirectoryInChunks_182355424971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107831 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107831, term107831.getClass(), "finished", false);
        setField(term107831, term107831.getClass(), "entry", null);
        setField(term107831, term107831.getClass(), "comment", null);
        setIntField(term107831, term107831.getClass(), "level", 0);
        setBooleanField(term107831, term107831.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107831, term107831.getClass(), "method", 0);
        setField(term107831, term107831.getClass(), "entries", null);
        setField(term107831, term107831.getClass(), "streamCompressor", null);
        setLongField(term107831, term107831.getClass(), "cdOffset", 0L);
        setLongField(term107831, term107831.getClass(), "cdLength", 0L);
        setField(term107831, term107831.getClass(), "metaData", null);
        setField(term107831, term107831.getClass(), "encoding", null);
        setField(term107831, term107831.getClass(), "zipEncoding", null);
        setField(term107831, term107831.getClass(), "def", null);
        setField(term107831, term107831.getClass(), "channel", null);
        setField(term107831, term107831.getClass(), "out", null);
        setBooleanField(term107831, term107831.getClass(), "useUTF8Flag", false);
        setBooleanField(term107831, term107831.getClass(), "fallbackToUTF8", false);
        setField(term107831, term107831.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107831, term107831.getClass(), "hasUsedZip64", false);
        setField(term107831, term107831.getClass(), "zip64Mode", null);
        setField(term107831, term107831.getClass(), "copyBuffer", null);
        setField(term107831, term107831.getClass(), "calendarInstance", null);
        setField(term107831, term107831.getClass(), "oneByte", null);
        setLongField(term107831, term107831.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "writeCentralDirectoryInChunks", argTypes, term107831, args);
    }

};


