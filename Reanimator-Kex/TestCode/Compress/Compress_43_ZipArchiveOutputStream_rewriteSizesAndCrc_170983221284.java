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

public class ZipArchiveOutputStream_rewriteSizesAndCrc_170983221284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107984;
     Object term107995;

    public ZipArchiveOutputStream_rewriteSizesAndCrc_170983221284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107984 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107984, term107984.getClass(), "finished", false);
        setField(term107984, term107984.getClass(), "entry", null);
        setField(term107984, term107984.getClass(), "comment", null);
        setIntField(term107984, term107984.getClass(), "level", 0);
        setBooleanField(term107984, term107984.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107984, term107984.getClass(), "method", 0);
        setField(term107984, term107984.getClass(), "entries", null);
        setField(term107984, term107984.getClass(), "streamCompressor", null);
        setLongField(term107984, term107984.getClass(), "cdOffset", 0L);
        setLongField(term107984, term107984.getClass(), "cdLength", 0L);
        setField(term107984, term107984.getClass(), "metaData", null);
        setField(term107984, term107984.getClass(), "encoding", null);
        setField(term107984, term107984.getClass(), "zipEncoding", null);
        setField(term107984, term107984.getClass(), "def", null);
        setField(term107984, term107984.getClass(), "channel", null);
        setField(term107984, term107984.getClass(), "out", null);
        setBooleanField(term107984, term107984.getClass(), "useUTF8Flag", false);
        setBooleanField(term107984, term107984.getClass(), "fallbackToUTF8", false);
        setField(term107984, term107984.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107984, term107984.getClass(), "hasUsedZip64", false);
        setField(term107984, term107984.getClass(), "zip64Mode", null);
        setField(term107984, term107984.getClass(), "copyBuffer", null);
        setField(term107984, term107984.getClass(), "calendarInstance", null);
        setField(term107984, term107984.getClass(), "oneByte", null);
        setLongField(term107984, term107984.getClass(), "bytesWritten", 0L);
        term107995 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107995;
        callMethod(klass, "rewriteSizesAndCrc", argTypes, term107984, args);
    }

};


