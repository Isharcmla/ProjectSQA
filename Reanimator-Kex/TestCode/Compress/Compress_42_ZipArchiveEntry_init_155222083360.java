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

public class ZipArchiveEntry_init_155222083360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40965;

    public ZipArchiveEntry_init_155222083360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40527 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term40597 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term40667 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term40363 = (byte[]) newByteArray(0);
        Object term40845 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term40372 = (byte[]) newByteArray(0);
        setLongField(term40527, term40527.getClass(), "xdostime", 0L);
        setLongField(term40527, term40527.getClass(), "crc", 0L);
        setLongField(term40527, term40527.getClass(), "size", 0L);
        setLongField(term40527, term40527.getClass(), "csize", 0L);
        setIntField(term40527, term40527.getClass(), "method", 0);
        setIntField(term40527, term40527.getClass(), "flag", 0);
        setField(term40527, term40527.getClass(), "name", null);
        setField(term40527, term40527.getClass(), "mtime", term40597);
        setField(term40527, term40527.getClass(), "atime", null);
        setField(term40527, term40527.getClass(), "ctime", term40667);
        setField(term40527, term40527.getClass(), "extra", term40363);
        setField(term40527, term40527.getClass(), "comment", "");
        setIntField(term40527, term40527.getClass(), "internalAttributes", 0);
        setIntField(term40527, term40527.getClass(), "platform", 0);
        setLongField(term40527, term40527.getClass(), "externalAttributes", 0L);
        setField(term40527, term40527.getClass(), "unparseableExtra", term40845);
        setField(term40527, term40527.getClass(), "rawName", term40372);
        setField(term40527, term40527.getClass(), "gpb", null);
        term40965 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term41073 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term41143 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term39873 = (byte[]) newByteArray(489);
        setField(term40965, term40965.getClass(), "name", "");
        setLongField(term40965, term40965.getClass(), "xdostime", 0L);
        setField(term40965, term40965.getClass(), "mtime", null);
        setField(term40965, term40965.getClass(), "atime", term41073);
        setField(term40965, term40965.getClass(), "ctime", term41143);
        setLongField(term40965, term40965.getClass(), "crc", 0L);
        setLongField(term40965, term40965.getClass(), "size", 0L);
        setLongField(term40965, term40965.getClass(), "csize", 0L);
        setIntField(term40965, term40965.getClass(), "method", 0);
        setIntField(term40965, term40965.getClass(), "flag", 0);
        setField(term40965, term40965.getClass(), "extra", term39873);
        setField(term40965, term40965.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term40965;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


