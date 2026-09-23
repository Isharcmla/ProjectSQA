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

public class ZipArchiveOutputStream_isZip64Required_177559015482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107962;

    public ZipArchiveOutputStream_isZip64Required_177559015482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107962 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107962, term107962.getClass(), "finished", false);
        setField(term107962, term107962.getClass(), "entry", null);
        setField(term107962, term107962.getClass(), "comment", null);
        setIntField(term107962, term107962.getClass(), "level", 0);
        setBooleanField(term107962, term107962.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107962, term107962.getClass(), "method", 0);
        setField(term107962, term107962.getClass(), "entries", null);
        setField(term107962, term107962.getClass(), "streamCompressor", null);
        setLongField(term107962, term107962.getClass(), "cdOffset", 0L);
        setLongField(term107962, term107962.getClass(), "cdLength", 0L);
        setField(term107962, term107962.getClass(), "metaData", null);
        setField(term107962, term107962.getClass(), "encoding", null);
        setField(term107962, term107962.getClass(), "zipEncoding", null);
        setField(term107962, term107962.getClass(), "def", null);
        setField(term107962, term107962.getClass(), "channel", null);
        setField(term107962, term107962.getClass(), "out", null);
        setBooleanField(term107962, term107962.getClass(), "useUTF8Flag", false);
        setBooleanField(term107962, term107962.getClass(), "fallbackToUTF8", false);
        setField(term107962, term107962.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107962, term107962.getClass(), "hasUsedZip64", false);
        setField(term107962, term107962.getClass(), "zip64Mode", null);
        setField(term107962, term107962.getClass(), "copyBuffer", null);
        setField(term107962, term107962.getClass(), "calendarInstance", null);
        setField(term107962, term107962.getClass(), "oneByte", null);
        setLongField(term107962, term107962.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isZip64Required", argTypes, term107962, args);
    }

};


