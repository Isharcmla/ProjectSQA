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

public class ZipArchiveOutputStream_closeCopiedEntry_11573462575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107875;
     Object term107886;

    public ZipArchiveOutputStream_closeCopiedEntry_11573462575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107875 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107875, term107875.getClass(), "finished", false);
        setField(term107875, term107875.getClass(), "entry", null);
        setField(term107875, term107875.getClass(), "comment", null);
        setIntField(term107875, term107875.getClass(), "level", 0);
        setBooleanField(term107875, term107875.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107875, term107875.getClass(), "method", 0);
        setField(term107875, term107875.getClass(), "entries", null);
        setField(term107875, term107875.getClass(), "streamCompressor", null);
        setLongField(term107875, term107875.getClass(), "cdOffset", 0L);
        setLongField(term107875, term107875.getClass(), "cdLength", 0L);
        setField(term107875, term107875.getClass(), "metaData", null);
        setField(term107875, term107875.getClass(), "encoding", null);
        setField(term107875, term107875.getClass(), "zipEncoding", null);
        setField(term107875, term107875.getClass(), "def", null);
        setField(term107875, term107875.getClass(), "channel", null);
        setField(term107875, term107875.getClass(), "out", null);
        setBooleanField(term107875, term107875.getClass(), "useUTF8Flag", false);
        setBooleanField(term107875, term107875.getClass(), "fallbackToUTF8", false);
        setField(term107875, term107875.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107875, term107875.getClass(), "hasUsedZip64", false);
        setField(term107875, term107875.getClass(), "zip64Mode", null);
        setField(term107875, term107875.getClass(), "copyBuffer", null);
        setField(term107875, term107875.getClass(), "calendarInstance", null);
        setField(term107875, term107875.getClass(), "oneByte", null);
        setLongField(term107875, term107875.getClass(), "bytesWritten", 0L);
        term107886 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107886;
        callMethod(klass, "closeCopiedEntry", argTypes, term107875, args);
    }

};


