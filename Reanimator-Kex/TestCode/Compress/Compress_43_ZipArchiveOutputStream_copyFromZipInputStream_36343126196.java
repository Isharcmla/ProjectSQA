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

public class ZipArchiveOutputStream_copyFromZipInputStream_36343126196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108128;

    public ZipArchiveOutputStream_copyFromZipInputStream_36343126196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108128 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108128, term108128.getClass(), "finished", false);
        setField(term108128, term108128.getClass(), "entry", null);
        setField(term108128, term108128.getClass(), "comment", null);
        setIntField(term108128, term108128.getClass(), "level", 0);
        setBooleanField(term108128, term108128.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108128, term108128.getClass(), "method", 0);
        setField(term108128, term108128.getClass(), "entries", null);
        setField(term108128, term108128.getClass(), "streamCompressor", null);
        setLongField(term108128, term108128.getClass(), "cdOffset", 0L);
        setLongField(term108128, term108128.getClass(), "cdLength", 0L);
        setField(term108128, term108128.getClass(), "metaData", null);
        setField(term108128, term108128.getClass(), "encoding", null);
        setField(term108128, term108128.getClass(), "zipEncoding", null);
        setField(term108128, term108128.getClass(), "def", null);
        setField(term108128, term108128.getClass(), "channel", null);
        setField(term108128, term108128.getClass(), "out", null);
        setBooleanField(term108128, term108128.getClass(), "useUTF8Flag", false);
        setBooleanField(term108128, term108128.getClass(), "fallbackToUTF8", false);
        setField(term108128, term108128.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108128, term108128.getClass(), "hasUsedZip64", false);
        setField(term108128, term108128.getClass(), "zip64Mode", null);
        setField(term108128, term108128.getClass(), "copyBuffer", null);
        setField(term108128, term108128.getClass(), "calendarInstance", null);
        setField(term108128, term108128.getClass(), "oneByte", null);
        setLongField(term108128, term108128.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "copyFromZipInputStream", argTypes, term108128, args);
    }

};


