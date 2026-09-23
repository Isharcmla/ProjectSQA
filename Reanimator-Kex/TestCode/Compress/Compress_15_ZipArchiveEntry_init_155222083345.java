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
import java.lang.Object;
import java.util.LinkedHashMap;

public class ZipArchiveEntry_init_155222083345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30944;

    public ZipArchiveEntry_init_155222083345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term30684 = new LinkedHashMap();
        Object term30446 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term30516 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30586 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term30283 = (byte[]) newByteArray(0);
        Object term30824 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        setLongField(term30446, term30446.getClass(), "xdostime", 0L);
        setLongField(term30446, term30446.getClass(), "crc", 0L);
        setLongField(term30446, term30446.getClass(), "size", 0L);
        setLongField(term30446, term30446.getClass(), "csize", 0L);
        setIntField(term30446, term30446.getClass(), "method", 0);
        setIntField(term30446, term30446.getClass(), "flag", 0);
        setField(term30446, term30446.getClass(), "name", null);
        setField(term30446, term30446.getClass(), "mtime", term30516);
        setField(term30446, term30446.getClass(), "atime", null);
        setField(term30446, term30446.getClass(), "ctime", term30586);
        setField(term30446, term30446.getClass(), "extra", term30283);
        setField(term30446, term30446.getClass(), "comment", "");
        setIntField(term30446, term30446.getClass(), "internalAttributes", 0);
        setIntField(term30446, term30446.getClass(), "platform", 0);
        setLongField(term30446, term30446.getClass(), "externalAttributes", 0L);
        setField(term30446, term30446.getClass(), "extraFields", term30684);
        setField(term30446, term30446.getClass(), "unparseableExtra", term30824);
        setField(term30446, term30446.getClass(), "rawName", null);
        setField(term30446, term30446.getClass(), "gpb", null);
        term30944 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term31052 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term31122 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term29793 = (byte[]) newByteArray(489);
        setField(term30944, term30944.getClass(), "name", "");
        setLongField(term30944, term30944.getClass(), "xdostime", 0L);
        setField(term30944, term30944.getClass(), "mtime", null);
        setField(term30944, term30944.getClass(), "atime", term31052);
        setField(term30944, term30944.getClass(), "ctime", term31122);
        setLongField(term30944, term30944.getClass(), "crc", 0L);
        setLongField(term30944, term30944.getClass(), "size", 0L);
        setLongField(term30944, term30944.getClass(), "csize", 0L);
        setIntField(term30944, term30944.getClass(), "method", 0);
        setIntField(term30944, term30944.getClass(), "flag", 0);
        setField(term30944, term30944.getClass(), "extra", term29793);
        setField(term30944, term30944.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term30944;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


