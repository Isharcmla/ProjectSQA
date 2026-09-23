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

public class ZipArchiveEntry_init_155222083391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41197;

    public ZipArchiveEntry_init_155222083391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term40937 = new LinkedHashMap();
        Object term40699 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term40769 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term40839 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term40536 = (byte[]) newByteArray(0);
        Object term41077 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        setLongField(term40699, term40699.getClass(), "xdostime", 0L);
        setLongField(term40699, term40699.getClass(), "crc", 0L);
        setLongField(term40699, term40699.getClass(), "size", 0L);
        setLongField(term40699, term40699.getClass(), "csize", 0L);
        setIntField(term40699, term40699.getClass(), "method", 0);
        setIntField(term40699, term40699.getClass(), "flag", 0);
        setField(term40699, term40699.getClass(), "name", null);
        setField(term40699, term40699.getClass(), "mtime", term40769);
        setField(term40699, term40699.getClass(), "atime", null);
        setField(term40699, term40699.getClass(), "ctime", term40839);
        setField(term40699, term40699.getClass(), "extra", term40536);
        setField(term40699, term40699.getClass(), "comment", "");
        setIntField(term40699, term40699.getClass(), "internalAttributes", 0);
        setIntField(term40699, term40699.getClass(), "platform", 0);
        setLongField(term40699, term40699.getClass(), "externalAttributes", 0L);
        setField(term40699, term40699.getClass(), "extraFields", term40937);
        setField(term40699, term40699.getClass(), "unparseableExtra", term41077);
        setField(term40699, term40699.getClass(), "rawName", null);
        setField(term40699, term40699.getClass(), "gpb", null);
        term41197 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term41305 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term41375 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term40046 = (byte[]) newByteArray(489);
        setField(term41197, term41197.getClass(), "name", "");
        setLongField(term41197, term41197.getClass(), "xdostime", 0L);
        setField(term41197, term41197.getClass(), "mtime", null);
        setField(term41197, term41197.getClass(), "atime", term41305);
        setField(term41197, term41197.getClass(), "ctime", term41375);
        setLongField(term41197, term41197.getClass(), "crc", 0L);
        setLongField(term41197, term41197.getClass(), "size", 0L);
        setLongField(term41197, term41197.getClass(), "csize", 0L);
        setIntField(term41197, term41197.getClass(), "method", 0);
        setIntField(term41197, term41197.getClass(), "flag", 0);
        setField(term41197, term41197.getClass(), "extra", term40046);
        setField(term41197, term41197.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term41197;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


