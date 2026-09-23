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

public class ZipArchiveOutputStream_destroy_346990591123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108459;

    public ZipArchiveOutputStream_destroy_346990591123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108459 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108459, term108459.getClass(), "finished", false);
        setField(term108459, term108459.getClass(), "entry", null);
        setField(term108459, term108459.getClass(), "comment", null);
        setIntField(term108459, term108459.getClass(), "level", 0);
        setBooleanField(term108459, term108459.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108459, term108459.getClass(), "method", 0);
        setField(term108459, term108459.getClass(), "entries", null);
        setField(term108459, term108459.getClass(), "streamCompressor", null);
        setLongField(term108459, term108459.getClass(), "cdOffset", 0L);
        setLongField(term108459, term108459.getClass(), "cdLength", 0L);
        setField(term108459, term108459.getClass(), "metaData", null);
        setField(term108459, term108459.getClass(), "encoding", null);
        setField(term108459, term108459.getClass(), "zipEncoding", null);
        setField(term108459, term108459.getClass(), "def", null);
        setField(term108459, term108459.getClass(), "channel", null);
        setField(term108459, term108459.getClass(), "out", null);
        setBooleanField(term108459, term108459.getClass(), "useUTF8Flag", false);
        setBooleanField(term108459, term108459.getClass(), "fallbackToUTF8", false);
        setField(term108459, term108459.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108459, term108459.getClass(), "hasUsedZip64", false);
        setField(term108459, term108459.getClass(), "zip64Mode", null);
        setField(term108459, term108459.getClass(), "copyBuffer", null);
        setField(term108459, term108459.getClass(), "calendarInstance", null);
        setField(term108459, term108459.getClass(), "oneByte", null);
        setLongField(term108459, term108459.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "destroy", argTypes, term108459, args);
    }

};


