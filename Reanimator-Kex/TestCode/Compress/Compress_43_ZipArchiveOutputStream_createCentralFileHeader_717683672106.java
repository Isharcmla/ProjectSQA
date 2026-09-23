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

public class ZipArchiveOutputStream_createCentralFileHeader_717683672106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108248;

    public ZipArchiveOutputStream_createCentralFileHeader_717683672106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108248 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108248, term108248.getClass(), "finished", false);
        setField(term108248, term108248.getClass(), "entry", null);
        setField(term108248, term108248.getClass(), "comment", null);
        setIntField(term108248, term108248.getClass(), "level", 0);
        setBooleanField(term108248, term108248.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108248, term108248.getClass(), "method", 0);
        setField(term108248, term108248.getClass(), "entries", null);
        setField(term108248, term108248.getClass(), "streamCompressor", null);
        setLongField(term108248, term108248.getClass(), "cdOffset", 0L);
        setLongField(term108248, term108248.getClass(), "cdLength", 0L);
        setField(term108248, term108248.getClass(), "metaData", null);
        setField(term108248, term108248.getClass(), "encoding", null);
        setField(term108248, term108248.getClass(), "zipEncoding", null);
        setField(term108248, term108248.getClass(), "def", null);
        setField(term108248, term108248.getClass(), "channel", null);
        setField(term108248, term108248.getClass(), "out", null);
        setBooleanField(term108248, term108248.getClass(), "useUTF8Flag", false);
        setBooleanField(term108248, term108248.getClass(), "fallbackToUTF8", false);
        setField(term108248, term108248.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108248, term108248.getClass(), "hasUsedZip64", false);
        setField(term108248, term108248.getClass(), "zip64Mode", null);
        setField(term108248, term108248.getClass(), "copyBuffer", null);
        setField(term108248, term108248.getClass(), "calendarInstance", null);
        setField(term108248, term108248.getClass(), "oneByte", null);
        setLongField(term108248, term108248.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createCentralFileHeader", argTypes, term108248, args);
    }

};


