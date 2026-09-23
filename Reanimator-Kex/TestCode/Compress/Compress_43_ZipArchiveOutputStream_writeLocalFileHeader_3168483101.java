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
import java.lang.Boolean;

public class ZipArchiveOutputStream_writeLocalFileHeader_3168483101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108183;
     Object term108194;

    public ZipArchiveOutputStream_writeLocalFileHeader_3168483101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108183 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108183, term108183.getClass(), "finished", false);
        setField(term108183, term108183.getClass(), "entry", null);
        setField(term108183, term108183.getClass(), "comment", null);
        setIntField(term108183, term108183.getClass(), "level", 0);
        setBooleanField(term108183, term108183.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108183, term108183.getClass(), "method", 0);
        setField(term108183, term108183.getClass(), "entries", null);
        setField(term108183, term108183.getClass(), "streamCompressor", null);
        setLongField(term108183, term108183.getClass(), "cdOffset", 0L);
        setLongField(term108183, term108183.getClass(), "cdLength", 0L);
        setField(term108183, term108183.getClass(), "metaData", null);
        setField(term108183, term108183.getClass(), "encoding", null);
        setField(term108183, term108183.getClass(), "zipEncoding", null);
        setField(term108183, term108183.getClass(), "def", null);
        setField(term108183, term108183.getClass(), "channel", null);
        setField(term108183, term108183.getClass(), "out", null);
        setBooleanField(term108183, term108183.getClass(), "useUTF8Flag", false);
        setBooleanField(term108183, term108183.getClass(), "fallbackToUTF8", false);
        setField(term108183, term108183.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108183, term108183.getClass(), "hasUsedZip64", false);
        setField(term108183, term108183.getClass(), "zip64Mode", null);
        setField(term108183, term108183.getClass(), "copyBuffer", null);
        setField(term108183, term108183.getClass(), "calendarInstance", null);
        setField(term108183, term108183.getClass(), "oneByte", null);
        setLongField(term108183, term108183.getClass(), "bytesWritten", 0L);
        term108194 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term108194;
        callMethod(klass, "writeLocalFileHeader", argTypes, term108183, args);
    }

};


