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

public class ZipArchiveOutputStream_finish_128755362672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107842;

    public ZipArchiveOutputStream_finish_128755362672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107842 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107842, term107842.getClass(), "finished", false);
        setField(term107842, term107842.getClass(), "entry", null);
        setField(term107842, term107842.getClass(), "comment", null);
        setIntField(term107842, term107842.getClass(), "level", 0);
        setBooleanField(term107842, term107842.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107842, term107842.getClass(), "method", 0);
        setField(term107842, term107842.getClass(), "entries", null);
        setField(term107842, term107842.getClass(), "streamCompressor", null);
        setLongField(term107842, term107842.getClass(), "cdOffset", 0L);
        setLongField(term107842, term107842.getClass(), "cdLength", 0L);
        setField(term107842, term107842.getClass(), "metaData", null);
        setField(term107842, term107842.getClass(), "encoding", null);
        setField(term107842, term107842.getClass(), "zipEncoding", null);
        setField(term107842, term107842.getClass(), "def", null);
        setField(term107842, term107842.getClass(), "channel", null);
        setField(term107842, term107842.getClass(), "out", null);
        setBooleanField(term107842, term107842.getClass(), "useUTF8Flag", false);
        setBooleanField(term107842, term107842.getClass(), "fallbackToUTF8", false);
        setField(term107842, term107842.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107842, term107842.getClass(), "hasUsedZip64", false);
        setField(term107842, term107842.getClass(), "zip64Mode", null);
        setField(term107842, term107842.getClass(), "copyBuffer", null);
        setField(term107842, term107842.getClass(), "calendarInstance", null);
        setField(term107842, term107842.getClass(), "oneByte", null);
        setLongField(term107842, term107842.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finish", argTypes, term107842, args);
    }

};


