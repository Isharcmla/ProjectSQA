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

public class ZipArchiveOutputStream_setUseLanguageEncodingFlag_172370652368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107794;
     Object term107805;

    public ZipArchiveOutputStream_setUseLanguageEncodingFlag_172370652368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107794 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107794, term107794.getClass(), "finished", false);
        setField(term107794, term107794.getClass(), "entry", null);
        setField(term107794, term107794.getClass(), "comment", null);
        setIntField(term107794, term107794.getClass(), "level", 0);
        setBooleanField(term107794, term107794.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107794, term107794.getClass(), "method", 0);
        setField(term107794, term107794.getClass(), "entries", null);
        setField(term107794, term107794.getClass(), "streamCompressor", null);
        setLongField(term107794, term107794.getClass(), "cdOffset", 0L);
        setLongField(term107794, term107794.getClass(), "cdLength", 0L);
        setField(term107794, term107794.getClass(), "metaData", null);
        setField(term107794, term107794.getClass(), "encoding", null);
        setField(term107794, term107794.getClass(), "zipEncoding", null);
        setField(term107794, term107794.getClass(), "def", null);
        setField(term107794, term107794.getClass(), "channel", null);
        setField(term107794, term107794.getClass(), "out", null);
        setBooleanField(term107794, term107794.getClass(), "useUTF8Flag", false);
        setBooleanField(term107794, term107794.getClass(), "fallbackToUTF8", false);
        setField(term107794, term107794.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107794, term107794.getClass(), "hasUsedZip64", false);
        setField(term107794, term107794.getClass(), "zip64Mode", null);
        setField(term107794, term107794.getClass(), "copyBuffer", null);
        setField(term107794, term107794.getClass(), "calendarInstance", null);
        setField(term107794, term107794.getClass(), "oneByte", null);
        setLongField(term107794, term107794.getClass(), "bytesWritten", 0L);
        term107805 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term107805;
        callMethod(klass, "setUseLanguageEncodingFlag", argTypes, term107794, args);
    }

};


