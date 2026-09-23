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

public class ZipArchiveOutputStream_isSeekable_17994827365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107761;

    public ZipArchiveOutputStream_isSeekable_17994827365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107761 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107761, term107761.getClass(), "finished", false);
        setField(term107761, term107761.getClass(), "entry", null);
        setField(term107761, term107761.getClass(), "comment", null);
        setIntField(term107761, term107761.getClass(), "level", 0);
        setBooleanField(term107761, term107761.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107761, term107761.getClass(), "method", 0);
        setField(term107761, term107761.getClass(), "entries", null);
        setField(term107761, term107761.getClass(), "streamCompressor", null);
        setLongField(term107761, term107761.getClass(), "cdOffset", 0L);
        setLongField(term107761, term107761.getClass(), "cdLength", 0L);
        setField(term107761, term107761.getClass(), "metaData", null);
        setField(term107761, term107761.getClass(), "encoding", null);
        setField(term107761, term107761.getClass(), "zipEncoding", null);
        setField(term107761, term107761.getClass(), "def", null);
        setField(term107761, term107761.getClass(), "channel", null);
        setField(term107761, term107761.getClass(), "out", null);
        setBooleanField(term107761, term107761.getClass(), "useUTF8Flag", false);
        setBooleanField(term107761, term107761.getClass(), "fallbackToUTF8", false);
        setField(term107761, term107761.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107761, term107761.getClass(), "hasUsedZip64", false);
        setField(term107761, term107761.getClass(), "zip64Mode", null);
        setField(term107761, term107761.getClass(), "copyBuffer", null);
        setField(term107761, term107761.getClass(), "calendarInstance", null);
        setField(term107761, term107761.getClass(), "oneByte", null);
        setLongField(term107761, term107761.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSeekable", argTypes, term107761, args);
    }

};


