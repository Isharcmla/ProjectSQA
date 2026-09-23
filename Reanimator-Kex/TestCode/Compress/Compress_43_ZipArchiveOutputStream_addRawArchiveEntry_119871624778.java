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

public class ZipArchiveOutputStream_addRawArchiveEntry_119871624778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107914;

    public ZipArchiveOutputStream_addRawArchiveEntry_119871624778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107914 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107914, term107914.getClass(), "finished", false);
        setField(term107914, term107914.getClass(), "entry", null);
        setField(term107914, term107914.getClass(), "comment", null);
        setIntField(term107914, term107914.getClass(), "level", 0);
        setBooleanField(term107914, term107914.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107914, term107914.getClass(), "method", 0);
        setField(term107914, term107914.getClass(), "entries", null);
        setField(term107914, term107914.getClass(), "streamCompressor", null);
        setLongField(term107914, term107914.getClass(), "cdOffset", 0L);
        setLongField(term107914, term107914.getClass(), "cdLength", 0L);
        setField(term107914, term107914.getClass(), "metaData", null);
        setField(term107914, term107914.getClass(), "encoding", null);
        setField(term107914, term107914.getClass(), "zipEncoding", null);
        setField(term107914, term107914.getClass(), "def", null);
        setField(term107914, term107914.getClass(), "channel", null);
        setField(term107914, term107914.getClass(), "out", null);
        setBooleanField(term107914, term107914.getClass(), "useUTF8Flag", false);
        setBooleanField(term107914, term107914.getClass(), "fallbackToUTF8", false);
        setField(term107914, term107914.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107914, term107914.getClass(), "hasUsedZip64", false);
        setField(term107914, term107914.getClass(), "zip64Mode", null);
        setField(term107914, term107914.getClass(), "copyBuffer", null);
        setField(term107914, term107914.getClass(), "calendarInstance", null);
        setField(term107914, term107914.getClass(), "oneByte", null);
        setLongField(term107914, term107914.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addRawArchiveEntry", argTypes, term107914, args);
    }

};


