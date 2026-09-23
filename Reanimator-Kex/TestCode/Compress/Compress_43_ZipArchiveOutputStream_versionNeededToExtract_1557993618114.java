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
import java.lang.Boolean;

public class ZipArchiveOutputStream_versionNeededToExtract_1557993618114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108350;
     Object term108361;
     Object term108363;
     Object term108365;

    public ZipArchiveOutputStream_versionNeededToExtract_1557993618114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108350 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108350, term108350.getClass(), "finished", false);
        setField(term108350, term108350.getClass(), "entry", null);
        setField(term108350, term108350.getClass(), "comment", null);
        setIntField(term108350, term108350.getClass(), "level", 0);
        setBooleanField(term108350, term108350.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108350, term108350.getClass(), "method", 0);
        setField(term108350, term108350.getClass(), "entries", null);
        setField(term108350, term108350.getClass(), "streamCompressor", null);
        setLongField(term108350, term108350.getClass(), "cdOffset", 0L);
        setLongField(term108350, term108350.getClass(), "cdLength", 0L);
        setField(term108350, term108350.getClass(), "metaData", null);
        setField(term108350, term108350.getClass(), "encoding", null);
        setField(term108350, term108350.getClass(), "zipEncoding", null);
        setField(term108350, term108350.getClass(), "def", null);
        setField(term108350, term108350.getClass(), "channel", null);
        setField(term108350, term108350.getClass(), "out", null);
        setBooleanField(term108350, term108350.getClass(), "useUTF8Flag", false);
        setBooleanField(term108350, term108350.getClass(), "fallbackToUTF8", false);
        setField(term108350, term108350.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108350, term108350.getClass(), "hasUsedZip64", false);
        setField(term108350, term108350.getClass(), "zip64Mode", null);
        setField(term108350, term108350.getClass(), "copyBuffer", null);
        setField(term108350, term108350.getClass(), "calendarInstance", null);
        setField(term108350, term108350.getClass(), "oneByte", null);
        setLongField(term108350, term108350.getClass(), "bytesWritten", 0L);
        term108361 = new Integer(0);
        term108363 = new Boolean(false);
        term108365 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term108361;
        args[1] = term108363;
        args[2] = term108365;
        callMethod(klass, "versionNeededToExtract", argTypes, term108350, args);
    }

};


