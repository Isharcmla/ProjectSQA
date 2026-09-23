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
     Object term37200;

    public ZipArchiveEntry_init_155222083389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term37010 = new LinkedHashMap();
        Object term36702 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term36810 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36880 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term36950 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term36533 = (byte[]) newByteArray(0);
        Object term37150 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term36543 = (byte[]) newByteArray(0);
        setLongField(term36702, term36702.getClass(), "xdostime", 0L);
        setLongField(term36702, term36702.getClass(), "crc", 0L);
        setLongField(term36702, term36702.getClass(), "size", 0L);
        setLongField(term36702, term36702.getClass(), "csize", 0L);
        setIntField(term36702, term36702.getClass(), "method", 0);
        setIntField(term36702, term36702.getClass(), "flag", 0);
        setField(term36702, term36702.getClass(), "name", "");
        setField(term36702, term36702.getClass(), "mtime", term36810);
        setField(term36702, term36702.getClass(), "atime", term36880);
        setField(term36702, term36702.getClass(), "ctime", term36950);
        setField(term36702, term36702.getClass(), "extra", term36533);
        setField(term36702, term36702.getClass(), "comment", null);
        setIntField(term36702, term36702.getClass(), "internalAttributes", 0);
        setIntField(term36702, term36702.getClass(), "platform", 0);
        setLongField(term36702, term36702.getClass(), "externalAttributes", 0L);
        setField(term36702, term36702.getClass(), "extraFields", term37010);
        setField(term36702, term36702.getClass(), "unparseableExtra", term37150);
        setField(term36702, term36702.getClass(), "rawName", term36543);
        setField(term36702, term36702.getClass(), "gpb", null);
        term37200 = newInstance(Class.forName("java.util.zip.ZipEntry"));
        Object term37308 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term37378 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term37448 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term36043 = (byte[]) newByteArray(489);
        setField(term37200, term37200.getClass(), "name", "");
        setLongField(term37200, term37200.getClass(), "xdostime", 0L);
        setField(term37200, term37200.getClass(), "mtime", term37308);
        setField(term37200, term37200.getClass(), "atime", term37378);
        setField(term37200, term37200.getClass(), "ctime", term37448);
        setLongField(term37200, term37200.getClass(), "crc", 0L);
        setLongField(term37200, term37200.getClass(), "size", 0L);
        setLongField(term37200, term37200.getClass(), "csize", 0L);
        setIntField(term37200, term37200.getClass(), "method", 0);
        setIntField(term37200, term37200.getClass(), "flag", 0);
        setField(term37200, term37200.getClass(), "extra", term36043);
        setField(term37200, term37200.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term37200;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


