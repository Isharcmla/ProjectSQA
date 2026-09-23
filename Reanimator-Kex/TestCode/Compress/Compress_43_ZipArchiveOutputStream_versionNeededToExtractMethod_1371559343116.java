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
import java.lang.Integer;

public class ZipArchiveOutputStream_versionNeededToExtractMethod_1371559343116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108380;
     Object term108391;

    public ZipArchiveOutputStream_versionNeededToExtractMethod_1371559343116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108380 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108380, term108380.getClass(), "finished", false);
        setField(term108380, term108380.getClass(), "entry", null);
        setField(term108380, term108380.getClass(), "comment", null);
        setIntField(term108380, term108380.getClass(), "level", 0);
        setBooleanField(term108380, term108380.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108380, term108380.getClass(), "method", 0);
        setField(term108380, term108380.getClass(), "entries", null);
        setField(term108380, term108380.getClass(), "streamCompressor", null);
        setLongField(term108380, term108380.getClass(), "cdOffset", 0L);
        setLongField(term108380, term108380.getClass(), "cdLength", 0L);
        setField(term108380, term108380.getClass(), "metaData", null);
        setField(term108380, term108380.getClass(), "encoding", null);
        setField(term108380, term108380.getClass(), "zipEncoding", null);
        setField(term108380, term108380.getClass(), "def", null);
        setField(term108380, term108380.getClass(), "channel", null);
        setField(term108380, term108380.getClass(), "out", null);
        setBooleanField(term108380, term108380.getClass(), "useUTF8Flag", false);
        setBooleanField(term108380, term108380.getClass(), "fallbackToUTF8", false);
        setField(term108380, term108380.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108380, term108380.getClass(), "hasUsedZip64", false);
        setField(term108380, term108380.getClass(), "zip64Mode", null);
        setField(term108380, term108380.getClass(), "copyBuffer", null);
        setField(term108380, term108380.getClass(), "calendarInstance", null);
        setField(term108380, term108380.getClass(), "oneByte", null);
        setLongField(term108380, term108380.getClass(), "bytesWritten", 0L);
        term108391 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108391;
        callMethod(klass, "versionNeededToExtractMethod", argTypes, term108380, args);
    }

};


