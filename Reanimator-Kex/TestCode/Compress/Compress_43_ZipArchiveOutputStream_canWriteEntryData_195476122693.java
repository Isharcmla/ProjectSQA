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

public class ZipArchiveOutputStream_canWriteEntryData_195476122693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108091;

    public ZipArchiveOutputStream_canWriteEntryData_195476122693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108091 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108091, term108091.getClass(), "finished", false);
        setField(term108091, term108091.getClass(), "entry", null);
        setField(term108091, term108091.getClass(), "comment", null);
        setIntField(term108091, term108091.getClass(), "level", 0);
        setBooleanField(term108091, term108091.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108091, term108091.getClass(), "method", 0);
        setField(term108091, term108091.getClass(), "entries", null);
        setField(term108091, term108091.getClass(), "streamCompressor", null);
        setLongField(term108091, term108091.getClass(), "cdOffset", 0L);
        setLongField(term108091, term108091.getClass(), "cdLength", 0L);
        setField(term108091, term108091.getClass(), "metaData", null);
        setField(term108091, term108091.getClass(), "encoding", null);
        setField(term108091, term108091.getClass(), "zipEncoding", null);
        setField(term108091, term108091.getClass(), "def", null);
        setField(term108091, term108091.getClass(), "channel", null);
        setField(term108091, term108091.getClass(), "out", null);
        setBooleanField(term108091, term108091.getClass(), "useUTF8Flag", false);
        setBooleanField(term108091, term108091.getClass(), "fallbackToUTF8", false);
        setField(term108091, term108091.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108091, term108091.getClass(), "hasUsedZip64", false);
        setField(term108091, term108091.getClass(), "zip64Mode", null);
        setField(term108091, term108091.getClass(), "copyBuffer", null);
        setField(term108091, term108091.getClass(), "calendarInstance", null);
        setField(term108091, term108091.getClass(), "oneByte", null);
        setLongField(term108091, term108091.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canWriteEntryData", argTypes, term108091, args);
    }

};


