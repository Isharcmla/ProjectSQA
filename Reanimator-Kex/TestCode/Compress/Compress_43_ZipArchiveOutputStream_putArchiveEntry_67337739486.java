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

public class ZipArchiveOutputStream_putArchiveEntry_67337739486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108008;
     Object term108019;

    public ZipArchiveOutputStream_putArchiveEntry_67337739486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108008 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108008, term108008.getClass(), "finished", false);
        setField(term108008, term108008.getClass(), "entry", null);
        setField(term108008, term108008.getClass(), "comment", null);
        setIntField(term108008, term108008.getClass(), "level", 0);
        setBooleanField(term108008, term108008.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108008, term108008.getClass(), "method", 0);
        setField(term108008, term108008.getClass(), "entries", null);
        setField(term108008, term108008.getClass(), "streamCompressor", null);
        setLongField(term108008, term108008.getClass(), "cdOffset", 0L);
        setLongField(term108008, term108008.getClass(), "cdLength", 0L);
        setField(term108008, term108008.getClass(), "metaData", null);
        setField(term108008, term108008.getClass(), "encoding", null);
        setField(term108008, term108008.getClass(), "zipEncoding", null);
        setField(term108008, term108008.getClass(), "def", null);
        setField(term108008, term108008.getClass(), "channel", null);
        setField(term108008, term108008.getClass(), "out", null);
        setBooleanField(term108008, term108008.getClass(), "useUTF8Flag", false);
        setBooleanField(term108008, term108008.getClass(), "fallbackToUTF8", false);
        setField(term108008, term108008.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108008, term108008.getClass(), "hasUsedZip64", false);
        setField(term108008, term108008.getClass(), "zip64Mode", null);
        setField(term108008, term108008.getClass(), "copyBuffer", null);
        setField(term108008, term108008.getClass(), "calendarInstance", null);
        setField(term108008, term108008.getClass(), "oneByte", null);
        setLongField(term108008, term108008.getClass(), "bytesWritten", 0L);
        term108019 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term108019;
        callMethod(klass, "putArchiveEntry", argTypes, term108008, args);
    }

};


