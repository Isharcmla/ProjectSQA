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

public class ZipArchiveOutputStream_setUseZip64_185685239574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107864;

    public ZipArchiveOutputStream_setUseZip64_185685239574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107864 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107864, term107864.getClass(), "finished", false);
        setField(term107864, term107864.getClass(), "entry", null);
        setField(term107864, term107864.getClass(), "comment", null);
        setIntField(term107864, term107864.getClass(), "level", 0);
        setBooleanField(term107864, term107864.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107864, term107864.getClass(), "method", 0);
        setField(term107864, term107864.getClass(), "entries", null);
        setField(term107864, term107864.getClass(), "streamCompressor", null);
        setLongField(term107864, term107864.getClass(), "cdOffset", 0L);
        setLongField(term107864, term107864.getClass(), "cdLength", 0L);
        setField(term107864, term107864.getClass(), "metaData", null);
        setField(term107864, term107864.getClass(), "encoding", null);
        setField(term107864, term107864.getClass(), "zipEncoding", null);
        setField(term107864, term107864.getClass(), "def", null);
        setField(term107864, term107864.getClass(), "channel", null);
        setField(term107864, term107864.getClass(), "out", null);
        setBooleanField(term107864, term107864.getClass(), "useUTF8Flag", false);
        setBooleanField(term107864, term107864.getClass(), "fallbackToUTF8", false);
        setField(term107864, term107864.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107864, term107864.getClass(), "hasUsedZip64", false);
        setField(term107864, term107864.getClass(), "zip64Mode", null);
        setField(term107864, term107864.getClass(), "copyBuffer", null);
        setField(term107864, term107864.getClass(), "calendarInstance", null);
        setField(term107864, term107864.getClass(), "oneByte", null);
        setLongField(term107864, term107864.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUseZip64", argTypes, term107864, args);
    }

};


