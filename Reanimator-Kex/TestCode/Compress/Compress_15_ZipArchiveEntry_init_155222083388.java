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

public class ZipArchiveEntry_init_155222083388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35390;

    public ZipArchiveEntry_init_155222083388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term35200 = new LinkedHashMap();
        Object term34962 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term35032 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35102 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term34796 = (byte[]) newByteArray(0);
        Object term35340 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term34805 = (byte[]) newByteArray(0);
        setLongField(term34962, term34962.getClass(), "xdostime", 0L);
        setLongField(term34962, term34962.getClass(), "crc", 0L);
        setLongField(term34962, term34962.getClass(), "size", 0L);
        setLongField(term34962, term34962.getClass(), "csize", 0L);
        setIntField(term34962, term34962.getClass(), "method", 0);
        setIntField(term34962, term34962.getClass(), "flag", 0);
        setField(term34962, term34962.getClass(), "name", null);
        setField(term34962, term34962.getClass(), "mtime", null);
        setField(term34962, term34962.getClass(), "atime", term35032);
        setField(term34962, term34962.getClass(), "ctime", term35102);
        setField(term34962, term34962.getClass(), "extra", term34796);
        setField(term34962, term34962.getClass(), "comment", "");
        setIntField(term34962, term34962.getClass(), "internalAttributes", 0);
        setIntField(term34962, term34962.getClass(), "platform", 0);
        setLongField(term34962, term34962.getClass(), "externalAttributes", 0L);
        setField(term34962, term34962.getClass(), "extraFields", term35200);
        setField(term34962, term34962.getClass(), "unparseableExtra", term35340);
        setField(term34962, term34962.getClass(), "rawName", term34805);
        setField(term34962, term34962.getClass(), "gpb", null);
        term35390 = newInstance(Class.forName("java.util.zip.ZipEntry"));
        Object term35498 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35568 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35638 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setField(term35390, term35390.getClass(), "name", "");
        setLongField(term35390, term35390.getClass(), "xdostime", 0L);
        setField(term35390, term35390.getClass(), "mtime", term35498);
        setField(term35390, term35390.getClass(), "atime", term35568);
        setField(term35390, term35390.getClass(), "ctime", term35638);
        setLongField(term35390, term35390.getClass(), "crc", 0L);
        setLongField(term35390, term35390.getClass(), "size", 0L);
        setLongField(term35390, term35390.getClass(), "csize", 0L);
        setIntField(term35390, term35390.getClass(), "method", 0);
        setIntField(term35390, term35390.getClass(), "flag", 0);
        setField(term35390, term35390.getClass(), "extra", null);
        setField(term35390, term35390.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term35390;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


