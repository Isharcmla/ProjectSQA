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

public class ZipArchiveOutputStream_validateSizeInformation_153278323888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108032;

    public ZipArchiveOutputStream_validateSizeInformation_153278323888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108032 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108032, term108032.getClass(), "finished", false);
        setField(term108032, term108032.getClass(), "entry", null);
        setField(term108032, term108032.getClass(), "comment", null);
        setIntField(term108032, term108032.getClass(), "level", 0);
        setBooleanField(term108032, term108032.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108032, term108032.getClass(), "method", 0);
        setField(term108032, term108032.getClass(), "entries", null);
        setField(term108032, term108032.getClass(), "streamCompressor", null);
        setLongField(term108032, term108032.getClass(), "cdOffset", 0L);
        setLongField(term108032, term108032.getClass(), "cdLength", 0L);
        setField(term108032, term108032.getClass(), "metaData", null);
        setField(term108032, term108032.getClass(), "encoding", null);
        setField(term108032, term108032.getClass(), "zipEncoding", null);
        setField(term108032, term108032.getClass(), "def", null);
        setField(term108032, term108032.getClass(), "channel", null);
        setField(term108032, term108032.getClass(), "out", null);
        setBooleanField(term108032, term108032.getClass(), "useUTF8Flag", false);
        setBooleanField(term108032, term108032.getClass(), "fallbackToUTF8", false);
        setField(term108032, term108032.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108032, term108032.getClass(), "hasUsedZip64", false);
        setField(term108032, term108032.getClass(), "zip64Mode", null);
        setField(term108032, term108032.getClass(), "copyBuffer", null);
        setField(term108032, term108032.getClass(), "calendarInstance", null);
        setField(term108032, term108032.getClass(), "oneByte", null);
        setLongField(term108032, term108032.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.Zip64Mode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateSizeInformation", argTypes, term108032, args);
    }

};


