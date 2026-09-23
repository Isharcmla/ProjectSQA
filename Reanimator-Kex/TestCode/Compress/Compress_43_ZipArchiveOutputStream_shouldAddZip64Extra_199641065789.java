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

public class ZipArchiveOutputStream_shouldAddZip64Extra_199641065789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108043;

    public ZipArchiveOutputStream_shouldAddZip64Extra_199641065789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108043 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108043, term108043.getClass(), "finished", false);
        setField(term108043, term108043.getClass(), "entry", null);
        setField(term108043, term108043.getClass(), "comment", null);
        setIntField(term108043, term108043.getClass(), "level", 0);
        setBooleanField(term108043, term108043.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108043, term108043.getClass(), "method", 0);
        setField(term108043, term108043.getClass(), "entries", null);
        setField(term108043, term108043.getClass(), "streamCompressor", null);
        setLongField(term108043, term108043.getClass(), "cdOffset", 0L);
        setLongField(term108043, term108043.getClass(), "cdLength", 0L);
        setField(term108043, term108043.getClass(), "metaData", null);
        setField(term108043, term108043.getClass(), "encoding", null);
        setField(term108043, term108043.getClass(), "zipEncoding", null);
        setField(term108043, term108043.getClass(), "def", null);
        setField(term108043, term108043.getClass(), "channel", null);
        setField(term108043, term108043.getClass(), "out", null);
        setBooleanField(term108043, term108043.getClass(), "useUTF8Flag", false);
        setBooleanField(term108043, term108043.getClass(), "fallbackToUTF8", false);
        setField(term108043, term108043.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108043, term108043.getClass(), "hasUsedZip64", false);
        setField(term108043, term108043.getClass(), "zip64Mode", null);
        setField(term108043, term108043.getClass(), "copyBuffer", null);
        setField(term108043, term108043.getClass(), "calendarInstance", null);
        setField(term108043, term108043.getClass(), "oneByte", null);
        setLongField(term108043, term108043.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "shouldAddZip64Extra", argTypes, term108043, args);
    }

};


