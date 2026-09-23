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

public class ZipArchiveEntry_init_155222083341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27189;

    public ZipArchiveEntry_init_155222083341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term27069 = new LinkedHashMap();
        Object term26723 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term26831 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26901 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term26971 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setLongField(term26723, term26723.getClass(), "xdostime", 0L);
        setLongField(term26723, term26723.getClass(), "crc", 0L);
        setLongField(term26723, term26723.getClass(), "size", 0L);
        setLongField(term26723, term26723.getClass(), "csize", 0L);
        setIntField(term26723, term26723.getClass(), "method", 0);
        setIntField(term26723, term26723.getClass(), "flag", 0);
        setField(term26723, term26723.getClass(), "name", "");
        setField(term26723, term26723.getClass(), "mtime", term26831);
        setField(term26723, term26723.getClass(), "atime", term26901);
        setField(term26723, term26723.getClass(), "ctime", term26971);
        setField(term26723, term26723.getClass(), "extra", null);
        setField(term26723, term26723.getClass(), "comment", "");
        setIntField(term26723, term26723.getClass(), "internalAttributes", 0);
        setIntField(term26723, term26723.getClass(), "platform", 0);
        setLongField(term26723, term26723.getClass(), "externalAttributes", 0L);
        setField(term26723, term26723.getClass(), "extraFields", term27069);
        term27189 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term27297 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27367 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term27437 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term26077 = (byte[]) newByteArray(489);
        setField(term27189, term27189.getClass(), "name", "");
        setLongField(term27189, term27189.getClass(), "xdostime", 0L);
        setField(term27189, term27189.getClass(), "mtime", term27297);
        setField(term27189, term27189.getClass(), "atime", term27367);
        setField(term27189, term27189.getClass(), "ctime", term27437);
        setLongField(term27189, term27189.getClass(), "crc", 0L);
        setLongField(term27189, term27189.getClass(), "size", 0L);
        setLongField(term27189, term27189.getClass(), "csize", 0L);
        setIntField(term27189, term27189.getClass(), "method", 0);
        setIntField(term27189, term27189.getClass(), "flag", 0);
        setField(term27189, term27189.getClass(), "extra", term26077);
        setField(term27189, term27189.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term27189;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


