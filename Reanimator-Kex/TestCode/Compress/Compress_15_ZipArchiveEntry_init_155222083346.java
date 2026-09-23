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

public class ZipArchiveEntry_init_155222083346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32920;

    public ZipArchiveEntry_init_155222083346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32552 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term32660 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term32730 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term32800 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term32389 = (byte[]) newByteArray(0);
        setLongField(term32552, term32552.getClass(), "xdostime", 0L);
        setLongField(term32552, term32552.getClass(), "crc", 0L);
        setLongField(term32552, term32552.getClass(), "size", 0L);
        setLongField(term32552, term32552.getClass(), "csize", 0L);
        setIntField(term32552, term32552.getClass(), "method", 0);
        setIntField(term32552, term32552.getClass(), "flag", 0);
        setField(term32552, term32552.getClass(), "name", "");
        setField(term32552, term32552.getClass(), "mtime", term32660);
        setField(term32552, term32552.getClass(), "atime", term32730);
        setField(term32552, term32552.getClass(), "ctime", term32800);
        setField(term32552, term32552.getClass(), "extra", null);
        setField(term32552, term32552.getClass(), "comment", null);
        setIntField(term32552, term32552.getClass(), "internalAttributes", 0);
        setIntField(term32552, term32552.getClass(), "platform", 0);
        setLongField(term32552, term32552.getClass(), "externalAttributes", 0L);
        setField(term32552, term32552.getClass(), "extraFields", null);
        setField(term32552, term32552.getClass(), "unparseableExtra", null);
        setField(term32552, term32552.getClass(), "rawName", term32389);
        setField(term32552, term32552.getClass(), "gpb", null);
        term32920 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term32990 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33060 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33130 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term31636 = (byte[]) newByteArray(745);
        setField(term32920, term32920.getClass(), "name", null);
        setLongField(term32920, term32920.getClass(), "xdostime", 0L);
        setField(term32920, term32920.getClass(), "mtime", term32990);
        setField(term32920, term32920.getClass(), "atime", term33060);
        setField(term32920, term32920.getClass(), "ctime", term33130);
        setLongField(term32920, term32920.getClass(), "crc", 0L);
        setLongField(term32920, term32920.getClass(), "size", 0L);
        setLongField(term32920, term32920.getClass(), "csize", 0L);
        setIntField(term32920, term32920.getClass(), "method", 0);
        setIntField(term32920, term32920.getClass(), "flag", 0);
        setByteElement(term31636, 0, (byte) 47);
        setField(term32920, term32920.getClass(), "extra", term31636);
        setField(term32920, term32920.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term32920;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


