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

public class ZipArchiveOutputStream_getEncoding_91131481567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107783;

    public ZipArchiveOutputStream_getEncoding_91131481567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107783 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107783, term107783.getClass(), "finished", false);
        setField(term107783, term107783.getClass(), "entry", null);
        setField(term107783, term107783.getClass(), "comment", null);
        setIntField(term107783, term107783.getClass(), "level", 0);
        setBooleanField(term107783, term107783.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107783, term107783.getClass(), "method", 0);
        setField(term107783, term107783.getClass(), "entries", null);
        setField(term107783, term107783.getClass(), "streamCompressor", null);
        setLongField(term107783, term107783.getClass(), "cdOffset", 0L);
        setLongField(term107783, term107783.getClass(), "cdLength", 0L);
        setField(term107783, term107783.getClass(), "metaData", null);
        setField(term107783, term107783.getClass(), "encoding", null);
        setField(term107783, term107783.getClass(), "zipEncoding", null);
        setField(term107783, term107783.getClass(), "def", null);
        setField(term107783, term107783.getClass(), "channel", null);
        setField(term107783, term107783.getClass(), "out", null);
        setBooleanField(term107783, term107783.getClass(), "useUTF8Flag", false);
        setBooleanField(term107783, term107783.getClass(), "fallbackToUTF8", false);
        setField(term107783, term107783.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107783, term107783.getClass(), "hasUsedZip64", false);
        setField(term107783, term107783.getClass(), "zip64Mode", null);
        setField(term107783, term107783.getClass(), "copyBuffer", null);
        setField(term107783, term107783.getClass(), "calendarInstance", null);
        setField(term107783, term107783.getClass(), "oneByte", null);
        setLongField(term107783, term107783.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncoding", argTypes, term107783, args);
    }

};


