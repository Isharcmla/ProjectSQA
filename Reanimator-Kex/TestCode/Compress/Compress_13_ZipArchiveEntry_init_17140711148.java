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

public class ZipArchiveEntry_init_17140711148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34902;

    public ZipArchiveEntry_init_17140711148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term34642 = new LinkedHashMap();
        Object term34436 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term34544 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term34269 = (byte[]) newByteArray(0);
        Object term34782 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        setLongField(term34436, term34436.getClass(), "xdostime", 0L);
        setLongField(term34436, term34436.getClass(), "crc", 0L);
        setLongField(term34436, term34436.getClass(), "size", 0L);
        setLongField(term34436, term34436.getClass(), "csize", 0L);
        setIntField(term34436, term34436.getClass(), "method", 0);
        setIntField(term34436, term34436.getClass(), "flag", 0);
        setField(term34436, term34436.getClass(), "name", "");
        setField(term34436, term34436.getClass(), "mtime", null);
        setField(term34436, term34436.getClass(), "atime", term34544);
        setField(term34436, term34436.getClass(), "ctime", null);
        setField(term34436, term34436.getClass(), "extra", term34269);
        setField(term34436, term34436.getClass(), "comment", "");
        setIntField(term34436, term34436.getClass(), "internalAttributes", 0);
        setIntField(term34436, term34436.getClass(), "platform", 0);
        setLongField(term34436, term34436.getClass(), "externalAttributes", 0L);
        setField(term34436, term34436.getClass(), "extraFields", term34642);
        setField(term34436, term34436.getClass(), "unparseableExtra", term34782);
        setField(term34436, term34436.getClass(), "rawName", null);
        setField(term34436, term34436.getClass(), "gpb", null);
        term34902 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term35010 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35080 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35150 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setField(term34902, term34902.getClass(), "name", "");
        setLongField(term34902, term34902.getClass(), "xdostime", 0L);
        setField(term34902, term34902.getClass(), "mtime", term35010);
        setField(term34902, term34902.getClass(), "atime", term35080);
        setField(term34902, term34902.getClass(), "ctime", term35150);
        setLongField(term34902, term34902.getClass(), "crc", 0L);
        setLongField(term34902, term34902.getClass(), "size", 0L);
        setLongField(term34902, term34902.getClass(), "csize", 0L);
        setIntField(term34902, term34902.getClass(), "method", 0);
        setIntField(term34902, term34902.getClass(), "flag", 0);
        setField(term34902, term34902.getClass(), "extra", null);
        setField(term34902, term34902.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term34902;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


