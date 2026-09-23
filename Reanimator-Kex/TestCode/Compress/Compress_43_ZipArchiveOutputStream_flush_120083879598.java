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

public class ZipArchiveOutputStream_flush_120083879598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108150;

    public ZipArchiveOutputStream_flush_120083879598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108150 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108150, term108150.getClass(), "finished", false);
        setField(term108150, term108150.getClass(), "entry", null);
        setField(term108150, term108150.getClass(), "comment", null);
        setIntField(term108150, term108150.getClass(), "level", 0);
        setBooleanField(term108150, term108150.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108150, term108150.getClass(), "method", 0);
        setField(term108150, term108150.getClass(), "entries", null);
        setField(term108150, term108150.getClass(), "streamCompressor", null);
        setLongField(term108150, term108150.getClass(), "cdOffset", 0L);
        setLongField(term108150, term108150.getClass(), "cdLength", 0L);
        setField(term108150, term108150.getClass(), "metaData", null);
        setField(term108150, term108150.getClass(), "encoding", null);
        setField(term108150, term108150.getClass(), "zipEncoding", null);
        setField(term108150, term108150.getClass(), "def", null);
        setField(term108150, term108150.getClass(), "channel", null);
        setField(term108150, term108150.getClass(), "out", null);
        setBooleanField(term108150, term108150.getClass(), "useUTF8Flag", false);
        setBooleanField(term108150, term108150.getClass(), "fallbackToUTF8", false);
        setField(term108150, term108150.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108150, term108150.getClass(), "hasUsedZip64", false);
        setField(term108150, term108150.getClass(), "zip64Mode", null);
        setField(term108150, term108150.getClass(), "copyBuffer", null);
        setField(term108150, term108150.getClass(), "calendarInstance", null);
        setField(term108150, term108150.getClass(), "oneByte", null);
        setLongField(term108150, term108150.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term108150, args);
    }

};


