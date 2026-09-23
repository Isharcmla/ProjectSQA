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
import java.lang.Long;
import java.lang.Boolean;

public class ZipArchiveOutputStream_handleZip64Extra_1185555845108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108272;
     Object term108283;
     Object term108285;

    public ZipArchiveOutputStream_handleZip64Extra_1185555845108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108272 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108272, term108272.getClass(), "finished", false);
        setField(term108272, term108272.getClass(), "entry", null);
        setField(term108272, term108272.getClass(), "comment", null);
        setIntField(term108272, term108272.getClass(), "level", 0);
        setBooleanField(term108272, term108272.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108272, term108272.getClass(), "method", 0);
        setField(term108272, term108272.getClass(), "entries", null);
        setField(term108272, term108272.getClass(), "streamCompressor", null);
        setLongField(term108272, term108272.getClass(), "cdOffset", 0L);
        setLongField(term108272, term108272.getClass(), "cdLength", 0L);
        setField(term108272, term108272.getClass(), "metaData", null);
        setField(term108272, term108272.getClass(), "encoding", null);
        setField(term108272, term108272.getClass(), "zipEncoding", null);
        setField(term108272, term108272.getClass(), "def", null);
        setField(term108272, term108272.getClass(), "channel", null);
        setField(term108272, term108272.getClass(), "out", null);
        setBooleanField(term108272, term108272.getClass(), "useUTF8Flag", false);
        setBooleanField(term108272, term108272.getClass(), "fallbackToUTF8", false);
        setField(term108272, term108272.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108272, term108272.getClass(), "hasUsedZip64", false);
        setField(term108272, term108272.getClass(), "zip64Mode", null);
        setField(term108272, term108272.getClass(), "copyBuffer", null);
        setField(term108272, term108272.getClass(), "calendarInstance", null);
        setField(term108272, term108272.getClass(), "oneByte", null);
        setLongField(term108272, term108272.getClass(), "bytesWritten", 0L);
        term108283 = new Long(0L);
        term108285 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = long.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term108283;
        args[2] = term108285;
        callMethod(klass, "handleZip64Extra", argTypes, term108272, args);
    }

};


