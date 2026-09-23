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

public class ZipArchiveOutputStream_writeOut_1311564816112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108320;
     Object term108331;
     Object term108333;

    public ZipArchiveOutputStream_writeOut_1311564816112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108320 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108320, term108320.getClass(), "finished", false);
        setField(term108320, term108320.getClass(), "entry", null);
        setField(term108320, term108320.getClass(), "comment", null);
        setIntField(term108320, term108320.getClass(), "level", 0);
        setBooleanField(term108320, term108320.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108320, term108320.getClass(), "method", 0);
        setField(term108320, term108320.getClass(), "entries", null);
        setField(term108320, term108320.getClass(), "streamCompressor", null);
        setLongField(term108320, term108320.getClass(), "cdOffset", 0L);
        setLongField(term108320, term108320.getClass(), "cdLength", 0L);
        setField(term108320, term108320.getClass(), "metaData", null);
        setField(term108320, term108320.getClass(), "encoding", null);
        setField(term108320, term108320.getClass(), "zipEncoding", null);
        setField(term108320, term108320.getClass(), "def", null);
        setField(term108320, term108320.getClass(), "channel", null);
        setField(term108320, term108320.getClass(), "out", null);
        setBooleanField(term108320, term108320.getClass(), "useUTF8Flag", false);
        setBooleanField(term108320, term108320.getClass(), "fallbackToUTF8", false);
        setField(term108320, term108320.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108320, term108320.getClass(), "hasUsedZip64", false);
        setField(term108320, term108320.getClass(), "zip64Mode", null);
        setField(term108320, term108320.getClass(), "copyBuffer", null);
        setField(term108320, term108320.getClass(), "calendarInstance", null);
        setField(term108320, term108320.getClass(), "oneByte", null);
        setLongField(term108320, term108320.getClass(), "bytesWritten", 0L);
        term108331 = new Integer(0);
        term108333 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term108331;
        args[2] = term108333;
        callMethod(klass, "writeOut", argTypes, term108320, args);
    }

};


