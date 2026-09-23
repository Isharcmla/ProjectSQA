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

public class ZipArchiveOutputStream_isTooLageForZip32_154596851483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107973;

    public ZipArchiveOutputStream_isTooLageForZip32_154596851483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107973 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107973, term107973.getClass(), "finished", false);
        setField(term107973, term107973.getClass(), "entry", null);
        setField(term107973, term107973.getClass(), "comment", null);
        setIntField(term107973, term107973.getClass(), "level", 0);
        setBooleanField(term107973, term107973.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107973, term107973.getClass(), "method", 0);
        setField(term107973, term107973.getClass(), "entries", null);
        setField(term107973, term107973.getClass(), "streamCompressor", null);
        setLongField(term107973, term107973.getClass(), "cdOffset", 0L);
        setLongField(term107973, term107973.getClass(), "cdLength", 0L);
        setField(term107973, term107973.getClass(), "metaData", null);
        setField(term107973, term107973.getClass(), "encoding", null);
        setField(term107973, term107973.getClass(), "zipEncoding", null);
        setField(term107973, term107973.getClass(), "def", null);
        setField(term107973, term107973.getClass(), "channel", null);
        setField(term107973, term107973.getClass(), "out", null);
        setBooleanField(term107973, term107973.getClass(), "useUTF8Flag", false);
        setBooleanField(term107973, term107973.getClass(), "fallbackToUTF8", false);
        setField(term107973, term107973.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107973, term107973.getClass(), "hasUsedZip64", false);
        setField(term107973, term107973.getClass(), "zip64Mode", null);
        setField(term107973, term107973.getClass(), "copyBuffer", null);
        setField(term107973, term107973.getClass(), "calendarInstance", null);
        setField(term107973, term107973.getClass(), "oneByte", null);
        setLongField(term107973, term107973.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isTooLageForZip32", argTypes, term107973, args);
    }

};


