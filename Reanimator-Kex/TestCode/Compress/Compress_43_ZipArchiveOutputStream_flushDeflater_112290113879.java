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

public class ZipArchiveOutputStream_flushDeflater_112290113879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107925;

    public ZipArchiveOutputStream_flushDeflater_112290113879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107925 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107925, term107925.getClass(), "finished", false);
        setField(term107925, term107925.getClass(), "entry", null);
        setField(term107925, term107925.getClass(), "comment", null);
        setIntField(term107925, term107925.getClass(), "level", 0);
        setBooleanField(term107925, term107925.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107925, term107925.getClass(), "method", 0);
        setField(term107925, term107925.getClass(), "entries", null);
        setField(term107925, term107925.getClass(), "streamCompressor", null);
        setLongField(term107925, term107925.getClass(), "cdOffset", 0L);
        setLongField(term107925, term107925.getClass(), "cdLength", 0L);
        setField(term107925, term107925.getClass(), "metaData", null);
        setField(term107925, term107925.getClass(), "encoding", null);
        setField(term107925, term107925.getClass(), "zipEncoding", null);
        setField(term107925, term107925.getClass(), "def", null);
        setField(term107925, term107925.getClass(), "channel", null);
        setField(term107925, term107925.getClass(), "out", null);
        setBooleanField(term107925, term107925.getClass(), "useUTF8Flag", false);
        setBooleanField(term107925, term107925.getClass(), "fallbackToUTF8", false);
        setField(term107925, term107925.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107925, term107925.getClass(), "hasUsedZip64", false);
        setField(term107925, term107925.getClass(), "zip64Mode", null);
        setField(term107925, term107925.getClass(), "copyBuffer", null);
        setField(term107925, term107925.getClass(), "calendarInstance", null);
        setField(term107925, term107925.getClass(), "oneByte", null);
        setLongField(term107925, term107925.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flushDeflater", argTypes, term107925, args);
    }

};


