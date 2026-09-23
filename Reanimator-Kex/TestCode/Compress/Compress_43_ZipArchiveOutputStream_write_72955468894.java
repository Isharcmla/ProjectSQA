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

public class ZipArchiveOutputStream_write_72955468894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108102;
     Object term108113;
     Object term108115;

    public ZipArchiveOutputStream_write_72955468894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108102 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108102, term108102.getClass(), "finished", false);
        setField(term108102, term108102.getClass(), "entry", null);
        setField(term108102, term108102.getClass(), "comment", null);
        setIntField(term108102, term108102.getClass(), "level", 0);
        setBooleanField(term108102, term108102.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108102, term108102.getClass(), "method", 0);
        setField(term108102, term108102.getClass(), "entries", null);
        setField(term108102, term108102.getClass(), "streamCompressor", null);
        setLongField(term108102, term108102.getClass(), "cdOffset", 0L);
        setLongField(term108102, term108102.getClass(), "cdLength", 0L);
        setField(term108102, term108102.getClass(), "metaData", null);
        setField(term108102, term108102.getClass(), "encoding", null);
        setField(term108102, term108102.getClass(), "zipEncoding", null);
        setField(term108102, term108102.getClass(), "def", null);
        setField(term108102, term108102.getClass(), "channel", null);
        setField(term108102, term108102.getClass(), "out", null);
        setBooleanField(term108102, term108102.getClass(), "useUTF8Flag", false);
        setBooleanField(term108102, term108102.getClass(), "fallbackToUTF8", false);
        setField(term108102, term108102.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108102, term108102.getClass(), "hasUsedZip64", false);
        setField(term108102, term108102.getClass(), "zip64Mode", null);
        setField(term108102, term108102.getClass(), "copyBuffer", null);
        setField(term108102, term108102.getClass(), "calendarInstance", null);
        setField(term108102, term108102.getClass(), "oneByte", null);
        setLongField(term108102, term108102.getClass(), "bytesWritten", 0L);
        term108113 = new Integer(0);
        term108115 = new Integer(0);
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
        args[1] = term108113;
        args[2] = term108115;
        callMethod(klass, "write", argTypes, term108102, args);
    }

};


