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
import java.lang.Long;

public class ZipArchiveOutputStream_handleSizesAndCrc_83998255680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107936;
     Object term107947;
     Object term107949;

    public ZipArchiveOutputStream_handleSizesAndCrc_83998255680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107936 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term107936, term107936.getClass(), "finished", false);
        setField(term107936, term107936.getClass(), "entry", null);
        setField(term107936, term107936.getClass(), "comment", null);
        setIntField(term107936, term107936.getClass(), "level", 0);
        setBooleanField(term107936, term107936.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term107936, term107936.getClass(), "method", 0);
        setField(term107936, term107936.getClass(), "entries", null);
        setField(term107936, term107936.getClass(), "streamCompressor", null);
        setLongField(term107936, term107936.getClass(), "cdOffset", 0L);
        setLongField(term107936, term107936.getClass(), "cdLength", 0L);
        setField(term107936, term107936.getClass(), "metaData", null);
        setField(term107936, term107936.getClass(), "encoding", null);
        setField(term107936, term107936.getClass(), "zipEncoding", null);
        setField(term107936, term107936.getClass(), "def", null);
        setField(term107936, term107936.getClass(), "channel", null);
        setField(term107936, term107936.getClass(), "out", null);
        setBooleanField(term107936, term107936.getClass(), "useUTF8Flag", false);
        setBooleanField(term107936, term107936.getClass(), "fallbackToUTF8", false);
        setField(term107936, term107936.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term107936, term107936.getClass(), "hasUsedZip64", false);
        setField(term107936, term107936.getClass(), "zip64Mode", null);
        setField(term107936, term107936.getClass(), "copyBuffer", null);
        setField(term107936, term107936.getClass(), "calendarInstance", null);
        setField(term107936, term107936.getClass(), "oneByte", null);
        setLongField(term107936, term107936.getClass(), "bytesWritten", 0L);
        term107947 = new Long(0L);
        term107949 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Object[] args = new Object[3];
        args[0] = term107947;
        args[1] = term107949;
        args[2] = null;
        callMethod(klass, "handleSizesAndCrc", argTypes, term107936, args);
    }

};


