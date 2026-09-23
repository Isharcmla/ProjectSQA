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

public class ZipArchiveOutputStream_createArchiveEntry_1712977566117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108393;

    public ZipArchiveOutputStream_createArchiveEntry_1712977566117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108393 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108393, term108393.getClass(), "finished", false);
        setField(term108393, term108393.getClass(), "entry", null);
        setField(term108393, term108393.getClass(), "comment", null);
        setIntField(term108393, term108393.getClass(), "level", 0);
        setBooleanField(term108393, term108393.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108393, term108393.getClass(), "method", 0);
        setField(term108393, term108393.getClass(), "entries", null);
        setField(term108393, term108393.getClass(), "streamCompressor", null);
        setLongField(term108393, term108393.getClass(), "cdOffset", 0L);
        setLongField(term108393, term108393.getClass(), "cdLength", 0L);
        setField(term108393, term108393.getClass(), "metaData", null);
        setField(term108393, term108393.getClass(), "encoding", null);
        setField(term108393, term108393.getClass(), "zipEncoding", null);
        setField(term108393, term108393.getClass(), "def", null);
        setField(term108393, term108393.getClass(), "channel", null);
        setField(term108393, term108393.getClass(), "out", null);
        setBooleanField(term108393, term108393.getClass(), "useUTF8Flag", false);
        setBooleanField(term108393, term108393.getClass(), "fallbackToUTF8", false);
        setField(term108393, term108393.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108393, term108393.getClass(), "hasUsedZip64", false);
        setField(term108393, term108393.getClass(), "zip64Mode", null);
        setField(term108393, term108393.getClass(), "copyBuffer", null);
        setField(term108393, term108393.getClass(), "calendarInstance", null);
        setField(term108393, term108393.getClass(), "oneByte", null);
        setLongField(term108393, term108393.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createArchiveEntry", argTypes, term108393, args);
    }

};


