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

public class ZipArchiveOutputStream_usesDataDescriptor_983800614115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108367;
     Object term108378;

    public ZipArchiveOutputStream_usesDataDescriptor_983800614115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108367 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108367, term108367.getClass(), "finished", false);
        setField(term108367, term108367.getClass(), "entry", null);
        setField(term108367, term108367.getClass(), "comment", null);
        setIntField(term108367, term108367.getClass(), "level", 0);
        setBooleanField(term108367, term108367.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108367, term108367.getClass(), "method", 0);
        setField(term108367, term108367.getClass(), "entries", null);
        setField(term108367, term108367.getClass(), "streamCompressor", null);
        setLongField(term108367, term108367.getClass(), "cdOffset", 0L);
        setLongField(term108367, term108367.getClass(), "cdLength", 0L);
        setField(term108367, term108367.getClass(), "metaData", null);
        setField(term108367, term108367.getClass(), "encoding", null);
        setField(term108367, term108367.getClass(), "zipEncoding", null);
        setField(term108367, term108367.getClass(), "def", null);
        setField(term108367, term108367.getClass(), "channel", null);
        setField(term108367, term108367.getClass(), "out", null);
        setBooleanField(term108367, term108367.getClass(), "useUTF8Flag", false);
        setBooleanField(term108367, term108367.getClass(), "fallbackToUTF8", false);
        setField(term108367, term108367.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108367, term108367.getClass(), "hasUsedZip64", false);
        setField(term108367, term108367.getClass(), "zip64Mode", null);
        setField(term108367, term108367.getClass(), "copyBuffer", null);
        setField(term108367, term108367.getClass(), "calendarInstance", null);
        setField(term108367, term108367.getClass(), "oneByte", null);
        setLongField(term108367, term108367.getClass(), "bytesWritten", 0L);
        term108378 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108378;
        callMethod(klass, "usesDataDescriptor", argTypes, term108367, args);
    }

};


