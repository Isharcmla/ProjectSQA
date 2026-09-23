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

public class ZipArchiveOutputStream_getGeneralPurposeBits_300673010113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108335;
     Object term108346;
     Object term108348;

    public ZipArchiveOutputStream_getGeneralPurposeBits_300673010113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108335 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108335, term108335.getClass(), "finished", false);
        setField(term108335, term108335.getClass(), "entry", null);
        setField(term108335, term108335.getClass(), "comment", null);
        setIntField(term108335, term108335.getClass(), "level", 0);
        setBooleanField(term108335, term108335.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108335, term108335.getClass(), "method", 0);
        setField(term108335, term108335.getClass(), "entries", null);
        setField(term108335, term108335.getClass(), "streamCompressor", null);
        setLongField(term108335, term108335.getClass(), "cdOffset", 0L);
        setLongField(term108335, term108335.getClass(), "cdLength", 0L);
        setField(term108335, term108335.getClass(), "metaData", null);
        setField(term108335, term108335.getClass(), "encoding", null);
        setField(term108335, term108335.getClass(), "zipEncoding", null);
        setField(term108335, term108335.getClass(), "def", null);
        setField(term108335, term108335.getClass(), "channel", null);
        setField(term108335, term108335.getClass(), "out", null);
        setBooleanField(term108335, term108335.getClass(), "useUTF8Flag", false);
        setBooleanField(term108335, term108335.getClass(), "fallbackToUTF8", false);
        setField(term108335, term108335.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108335, term108335.getClass(), "hasUsedZip64", false);
        setField(term108335, term108335.getClass(), "zip64Mode", null);
        setField(term108335, term108335.getClass(), "copyBuffer", null);
        setField(term108335, term108335.getClass(), "calendarInstance", null);
        setField(term108335, term108335.getClass(), "oneByte", null);
        setLongField(term108335, term108335.getClass(), "bytesWritten", 0L);
        term108346 = new Boolean(false);
        term108348 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term108346;
        args[1] = term108348;
        callMethod(klass, "getGeneralPurposeBits", argTypes, term108335, args);
    }

};


