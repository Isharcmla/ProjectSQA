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

public class ZipArchiveEntry_init_155222083361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42404;

    public ZipArchiveEntry_init_155222083361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41970 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term42040 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term42110 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term41808 = (byte[]) newByteArray(0);
        Object term42288 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term41817 = (byte[]) newByteArray(0);
        setLongField(term41970, term41970.getClass(), "xdostime", 0L);
        setLongField(term41970, term41970.getClass(), "crc", 0L);
        setLongField(term41970, term41970.getClass(), "size", 0L);
        setLongField(term41970, term41970.getClass(), "csize", 0L);
        setIntField(term41970, term41970.getClass(), "method", 0);
        setIntField(term41970, term41970.getClass(), "flag", 0);
        setField(term41970, term41970.getClass(), "name", null);
        setField(term41970, term41970.getClass(), "mtime", null);
        setField(term41970, term41970.getClass(), "atime", term42040);
        setField(term41970, term41970.getClass(), "ctime", term42110);
        setField(term41970, term41970.getClass(), "extra", term41808);
        setField(term41970, term41970.getClass(), "comment", "");
        setIntField(term41970, term41970.getClass(), "internalAttributes", 0);
        setIntField(term41970, term41970.getClass(), "platform", 0);
        setLongField(term41970, term41970.getClass(), "externalAttributes", 0L);
        setField(term41970, term41970.getClass(), "unparseableExtra", term42288);
        setField(term41970, term41970.getClass(), "rawName", term41817);
        setField(term41970, term41970.getClass(), "gpb", null);
        term42404 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$Entry"));
        setField(term42404, term42404.getClass(), "name", "");
        setLongField(term42404, term42404.getClass(), "xdostime", 0L);
        setField(term42404, term42404.getClass(), "mtime", null);
        setField(term42404, term42404.getClass(), "atime", null);
        setField(term42404, term42404.getClass(), "ctime", null);
        setLongField(term42404, term42404.getClass(), "crc", 0L);
        setLongField(term42404, term42404.getClass(), "size", 0L);
        setLongField(term42404, term42404.getClass(), "csize", 0L);
        setIntField(term42404, term42404.getClass(), "method", 0);
        setIntField(term42404, term42404.getClass(), "flag", 0);
        setField(term42404, term42404.getClass(), "extra", null);
        setField(term42404, term42404.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term42404;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


