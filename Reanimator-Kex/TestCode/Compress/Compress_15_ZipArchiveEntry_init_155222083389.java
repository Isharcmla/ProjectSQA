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

public class ZipArchiveEntry_init_155222083389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36320;

    public ZipArchiveEntry_init_155222083389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term36076 = new LinkedHashMap();
        Object term35838 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term35908 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35978 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term35665 = (byte[]) newByteArray(0);
        Object term36200 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setLongField(term35838, term35838.getClass(), "xdostime", 0L);
        setLongField(term35838, term35838.getClass(), "crc", 0L);
        setLongField(term35838, term35838.getClass(), "size", 0L);
        setLongField(term35838, term35838.getClass(), "csize", 0L);
        setIntField(term35838, term35838.getClass(), "method", 0);
        setIntField(term35838, term35838.getClass(), "flag", 0);
        setField(term35838, term35838.getClass(), "name", null);
        setField(term35838, term35838.getClass(), "mtime", term35908);
        setField(term35838, term35838.getClass(), "atime", term35978);
        setField(term35838, term35838.getClass(), "ctime", term35978);
        setField(term35838, term35838.getClass(), "extra", term35665);
        setField(term35838, term35838.getClass(), "comment", "");
        setIntField(term35838, term35838.getClass(), "internalAttributes", 0);
        setIntField(term35838, term35838.getClass(), "platform", 0);
        setLongField(term35838, term35838.getClass(), "externalAttributes", 0L);
        setField(term35838, term35838.getClass(), "extraFields", term36076);
        setField(term35838, term35838.getClass(), "unparseableExtra", null);
        setField(term35838, term35838.getClass(), "rawName", term35665);
        setField(term35838, term35838.getClass(), "gpb", term36200);
        term36320 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term36428 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36498 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36568 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setField(term36320, term36320.getClass(), "name", "");
        setLongField(term36320, term36320.getClass(), "xdostime", 0L);
        setField(term36320, term36320.getClass(), "mtime", term36428);
        setField(term36320, term36320.getClass(), "atime", term36498);
        setField(term36320, term36320.getClass(), "ctime", term36568);
        setLongField(term36320, term36320.getClass(), "crc", 0L);
        setLongField(term36320, term36320.getClass(), "size", 0L);
        setLongField(term36320, term36320.getClass(), "csize", 0L);
        setIntField(term36320, term36320.getClass(), "method", 0);
        setIntField(term36320, term36320.getClass(), "flag", 0);
        setField(term36320, term36320.getClass(), "extra", null);
        setField(term36320, term36320.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term36320;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


