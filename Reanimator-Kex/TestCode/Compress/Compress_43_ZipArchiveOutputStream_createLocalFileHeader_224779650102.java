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
import java.lang.Long;

public class ZipArchiveOutputStream_createLocalFileHeader_224779650102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108196;
     Object term108207;
     Object term108209;
     Object term108211;

    public ZipArchiveOutputStream_createLocalFileHeader_224779650102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108196 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108196, term108196.getClass(), "finished", false);
        setField(term108196, term108196.getClass(), "entry", null);
        setField(term108196, term108196.getClass(), "comment", null);
        setIntField(term108196, term108196.getClass(), "level", 0);
        setBooleanField(term108196, term108196.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108196, term108196.getClass(), "method", 0);
        setField(term108196, term108196.getClass(), "entries", null);
        setField(term108196, term108196.getClass(), "streamCompressor", null);
        setLongField(term108196, term108196.getClass(), "cdOffset", 0L);
        setLongField(term108196, term108196.getClass(), "cdLength", 0L);
        setField(term108196, term108196.getClass(), "metaData", null);
        setField(term108196, term108196.getClass(), "encoding", null);
        setField(term108196, term108196.getClass(), "zipEncoding", null);
        setField(term108196, term108196.getClass(), "def", null);
        setField(term108196, term108196.getClass(), "channel", null);
        setField(term108196, term108196.getClass(), "out", null);
        setBooleanField(term108196, term108196.getClass(), "useUTF8Flag", false);
        setBooleanField(term108196, term108196.getClass(), "fallbackToUTF8", false);
        setField(term108196, term108196.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108196, term108196.getClass(), "hasUsedZip64", false);
        setField(term108196, term108196.getClass(), "zip64Mode", null);
        setField(term108196, term108196.getClass(), "copyBuffer", null);
        setField(term108196, term108196.getClass(), "calendarInstance", null);
        setField(term108196, term108196.getClass(), "oneByte", null);
        setLongField(term108196, term108196.getClass(), "bytesWritten", 0L);
        term108207 = new Boolean(false);
        term108209 = new Boolean(false);
        term108211 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = Class.forName("java.nio.ByteBuffer");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term108207;
        args[3] = term108209;
        args[4] = term108211;
        callMethod(klass, "createLocalFileHeader", argTypes, term108196, args);
    }

};


