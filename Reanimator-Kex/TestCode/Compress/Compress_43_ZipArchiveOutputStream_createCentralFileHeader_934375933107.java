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

public class ZipArchiveOutputStream_createCentralFileHeader_934375933107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108259;
     Object term108270;

    public ZipArchiveOutputStream_createCentralFileHeader_934375933107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108259 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setBooleanField(term108259, term108259.getClass(), "finished", false);
        setField(term108259, term108259.getClass(), "entry", null);
        setField(term108259, term108259.getClass(), "comment", null);
        setIntField(term108259, term108259.getClass(), "level", 0);
        setBooleanField(term108259, term108259.getClass(), "hasCompressionLevelChanged", false);
        setIntField(term108259, term108259.getClass(), "method", 0);
        setField(term108259, term108259.getClass(), "entries", null);
        setField(term108259, term108259.getClass(), "streamCompressor", null);
        setLongField(term108259, term108259.getClass(), "cdOffset", 0L);
        setLongField(term108259, term108259.getClass(), "cdLength", 0L);
        setField(term108259, term108259.getClass(), "metaData", null);
        setField(term108259, term108259.getClass(), "encoding", null);
        setField(term108259, term108259.getClass(), "zipEncoding", null);
        setField(term108259, term108259.getClass(), "def", null);
        setField(term108259, term108259.getClass(), "channel", null);
        setField(term108259, term108259.getClass(), "out", null);
        setBooleanField(term108259, term108259.getClass(), "useUTF8Flag", false);
        setBooleanField(term108259, term108259.getClass(), "fallbackToUTF8", false);
        setField(term108259, term108259.getClass(), "createUnicodeExtraFields", null);
        setBooleanField(term108259, term108259.getClass(), "hasUsedZip64", false);
        setField(term108259, term108259.getClass(), "zip64Mode", null);
        setField(term108259, term108259.getClass(), "copyBuffer", null);
        setField(term108259, term108259.getClass(), "calendarInstance", null);
        setField(term108259, term108259.getClass(), "oneByte", null);
        setLongField(term108259, term108259.getClass(), "bytesWritten", 0L);
        term108270 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        argTypes[1] = Class.forName("java.nio.ByteBuffer");
        argTypes[2] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream$EntryMetaData");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term108270;
        callMethod(klass, "createCentralFileHeader", argTypes, term108259, args);
    }

};


