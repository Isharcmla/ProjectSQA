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

public class ZipArchiveEntry_init_1552220833119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46205;

    public ZipArchiveEntry_init_1552220833119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45767 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term45837 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term45907 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term45605 = (byte[]) newByteArray(0);
        Object term46085 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term45614 = (byte[]) newByteArray(0);
        setLongField(term45767, term45767.getClass(), "xdostime", 0L);
        setLongField(term45767, term45767.getClass(), "crc", 0L);
        setLongField(term45767, term45767.getClass(), "size", 0L);
        setLongField(term45767, term45767.getClass(), "csize", 0L);
        setIntField(term45767, term45767.getClass(), "method", 0);
        setIntField(term45767, term45767.getClass(), "flag", 0);
        setField(term45767, term45767.getClass(), "name", null);
        setField(term45767, term45767.getClass(), "mtime", null);
        setField(term45767, term45767.getClass(), "atime", term45837);
        setField(term45767, term45767.getClass(), "ctime", term45907);
        setField(term45767, term45767.getClass(), "extra", term45605);
        setField(term45767, term45767.getClass(), "comment", "");
        setIntField(term45767, term45767.getClass(), "internalAttributes", 0);
        setIntField(term45767, term45767.getClass(), "platform", 0);
        setLongField(term45767, term45767.getClass(), "externalAttributes", 0L);
        setField(term45767, term45767.getClass(), "unparseableExtra", term46085);
        setField(term45767, term45767.getClass(), "rawName", term45614);
        setField(term45767, term45767.getClass(), "gpb", null);
        term46205 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term46205, term46205.getClass(), "name", "");
        setLongField(term46205, term46205.getClass(), "xdostime", 0L);
        setField(term46205, term46205.getClass(), "mtime", null);
        setField(term46205, term46205.getClass(), "atime", null);
        setField(term46205, term46205.getClass(), "ctime", null);
        setLongField(term46205, term46205.getClass(), "crc", 0L);
        setLongField(term46205, term46205.getClass(), "size", 0L);
        setLongField(term46205, term46205.getClass(), "csize", 0L);
        setIntField(term46205, term46205.getClass(), "method", 0);
        setIntField(term46205, term46205.getClass(), "flag", 0);
        setField(term46205, term46205.getClass(), "extra", null);
        setField(term46205, term46205.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term46205;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


