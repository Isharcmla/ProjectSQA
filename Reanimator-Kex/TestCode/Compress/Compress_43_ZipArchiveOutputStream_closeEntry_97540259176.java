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

public class ZipArchiveOutputStream_closeEntry_97540259176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107888;
     Object term107899;
     Object term107901;

    public ZipArchiveOutputStream_closeEntry_97540259176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107888 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107888, term107888.getClass(), "finished", false);
        setField(term107888, term107888.getClass(), "entry", null);
        setField(term107888, term107888.getClass(), "comment", null);
        setIntField(term107888, term107888.getClass(), "level", 0);
        setBooleanField(term107888, term107888.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107888, term107888.getClass(), "method", 0);
        setField(term107888, term107888.getClass(), "entries", null);
        setField(term107888, term107888.getClass(), "streamCompressor", null);
        setLongField(term107888, term107888.getClass(), "cdOffset", 0L);
        setLongField(term107888, term107888.getClass(), "cdLength", 0L);
        setField(term107888, term107888.getClass(), "metaData", null);
        setField(term107888, term107888.getClass(), "encoding", null);
        setField(term107888, term107888.getClass(), "zipEncoding", null);
        setField(term107888, term107888.getClass(), "def", null);
        setField(term107888, term107888.getClass(), "channel", null);
        setField(term107888, term107888.getClass(), "out", null);
        setBooleanField(term107888, term107888.getClass(), "useUTF8Flag", false);
        setBooleanField(term107888, term107888.getClass(), "fallbackToUTF8", false);
        setField(term107888, term107888.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107888, term107888.getClass(), "hasUsedZip64", false);
        setField(term107888, term107888.getClass(), "zip64Mode", null);
        setField(term107888, term107888.getClass(), "copyBuffer", null);
        setField(term107888, term107888.getClass(), "calendarInstance", null);
        setField(term107888, term107888.getClass(), "oneByte", null);
        setLongField(term107888, term107888.getClass(), "bytesWritten", 0L);
        term107899 = new Boolean(false);
        term107901 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term107899;
        args[1] = term107901;
        callMethod(klass, "closeEntry", argTypes, term107888, args);
    }

};


