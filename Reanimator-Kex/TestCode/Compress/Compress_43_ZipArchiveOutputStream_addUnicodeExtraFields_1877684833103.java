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

public class ZipArchiveOutputStream_addUnicodeExtraFields_1877684833103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108213;
     Object term108224;

    public ZipArchiveOutputStream_addUnicodeExtraFields_1877684833103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108213 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108213, term108213.getClass(), "finished", false);
        setField(term108213, term108213.getClass(), "entry", null);
        setField(term108213, term108213.getClass(), "comment", null);
        setIntField(term108213, term108213.getClass(), "level", 0);
        setBooleanField(term108213, term108213.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108213, term108213.getClass(), "method", 0);
        setField(term108213, term108213.getClass(), "entries", null);
        setField(term108213, term108213.getClass(), "streamCompressor", null);
        setLongField(term108213, term108213.getClass(), "cdOffset", 0L);
        setLongField(term108213, term108213.getClass(), "cdLength", 0L);
        setField(term108213, term108213.getClass(), "metaData", null);
        setField(term108213, term108213.getClass(), "encoding", null);
        setField(term108213, term108213.getClass(), "zipEncoding", null);
        setField(term108213, term108213.getClass(), "def", null);
        setField(term108213, term108213.getClass(), "channel", null);
        setField(term108213, term108213.getClass(), "out", null);
        setBooleanField(term108213, term108213.getClass(), "useUTF8Flag", false);
        setBooleanField(term108213, term108213.getClass(), "fallbackToUTF8", false);
        setField(term108213, term108213.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108213, term108213.getClass(), "hasUsedZip64", false);
        setField(term108213, term108213.getClass(), "zip64Mode", null);
        setField(term108213, term108213.getClass(), "copyBuffer", null);
        setField(term108213, term108213.getClass(), "calendarInstance", null);
        setField(term108213, term108213.getClass(), "oneByte", null);
        setLongField(term108213, term108213.getClass(), "bytesWritten", 0L);
        term108224 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term108224;
        args[2] = null;
        callMethod(klass, "addUnicodeExtraFields", argTypes, term108213, args);
    }

};


