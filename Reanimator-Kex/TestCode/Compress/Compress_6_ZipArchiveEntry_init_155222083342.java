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

public class ZipArchiveEntry_init_155222083342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28888;

    public ZipArchiveEntry_init_155222083342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term28838 = new LinkedHashMap();
        Object term28632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term28740 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term28474 = (byte[]) newByteArray(0);
        setLongField(term28632, term28632.getClass(), "xdostime", 0L);
        setLongField(term28632, term28632.getClass(), "crc", 0L);
        setLongField(term28632, term28632.getClass(), "size", 0L);
        setLongField(term28632, term28632.getClass(), "csize", 0L);
        setIntField(term28632, term28632.getClass(), "method", 0);
        setIntField(term28632, term28632.getClass(), "flag", 0);
        setField(term28632, term28632.getClass(), "name", "");
        setField(term28632, term28632.getClass(), "mtime", term28740);
        setField(term28632, term28632.getClass(), "atime", null);
        setField(term28632, term28632.getClass(), "ctime", null);
        setField(term28632, term28632.getClass(), "extra", term28474);
        setField(term28632, term28632.getClass(), "comment", "");
        setIntField(term28632, term28632.getClass(), "internalAttributes", 0);
        setIntField(term28632, term28632.getClass(), "platform", 0);
        setLongField(term28632, term28632.getClass(), "externalAttributes", 0L);
        setField(term28632, term28632.getClass(), "extraFields", term28838);
        term28888 = newInstance(Class.forName("java.util.zip.ZipEntry"));
        Object term28996 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term29066 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term27983 = (byte[]) newByteArray(490);
        setField(term28888, term28888.getClass(), "name", "");
        setLongField(term28888, term28888.getClass(), "xdostime", 0L);
        setField(term28888, term28888.getClass(), "mtime", null);
        setField(term28888, term28888.getClass(), "atime", term28996);
        setField(term28888, term28888.getClass(), "ctime", term29066);
        setLongField(term28888, term28888.getClass(), "crc", 0L);
        setLongField(term28888, term28888.getClass(), "size", 0L);
        setLongField(term28888, term28888.getClass(), "csize", 0L);
        setIntField(term28888, term28888.getClass(), "method", 0);
        setIntField(term28888, term28888.getClass(), "flag", 0);
        setField(term28888, term28888.getClass(), "extra", term27983);
        setField(term28888, term28888.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term28888;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


