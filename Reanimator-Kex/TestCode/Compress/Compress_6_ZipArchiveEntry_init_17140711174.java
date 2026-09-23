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

public class ZipArchiveEntry_init_17140711174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32861;

    public ZipArchiveEntry_init_17140711174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term32741 = new LinkedHashMap();
        Object term32535 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term32643 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setLongField(term32535, term32535.getClass(), "xdostime", 0L);
        setLongField(term32535, term32535.getClass(), "crc", 0L);
        setLongField(term32535, term32535.getClass(), "size", 0L);
        setLongField(term32535, term32535.getClass(), "csize", 0L);
        setIntField(term32535, term32535.getClass(), "method", 0);
        setIntField(term32535, term32535.getClass(), "flag", 0);
        setField(term32535, term32535.getClass(), "name", "");
        setField(term32535, term32535.getClass(), "mtime", null);
        setField(term32535, term32535.getClass(), "atime", null);
        setField(term32535, term32535.getClass(), "ctime", term32643);
        setField(term32535, term32535.getClass(), "extra", null);
        setField(term32535, term32535.getClass(), "comment", "");
        setIntField(term32535, term32535.getClass(), "internalAttributes", 0);
        setIntField(term32535, term32535.getClass(), "platform", 0);
        setLongField(term32535, term32535.getClass(), "externalAttributes", 0L);
        setField(term32535, term32535.getClass(), "extraFields", term32741);
        term32861 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term32931 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term31892 = (byte[]) newByteArray(489);
        setField(term32861, term32861.getClass(), "name", null);
        setLongField(term32861, term32861.getClass(), "xdostime", 0L);
        setField(term32861, term32861.getClass(), "mtime", term32931);
        setField(term32861, term32861.getClass(), "atime", null);
        setField(term32861, term32861.getClass(), "ctime", null);
        setLongField(term32861, term32861.getClass(), "crc", 0L);
        setLongField(term32861, term32861.getClass(), "size", 0L);
        setLongField(term32861, term32861.getClass(), "csize", 0L);
        setIntField(term32861, term32861.getClass(), "method", 0);
        setIntField(term32861, term32861.getClass(), "flag", 0);
        setField(term32861, term32861.getClass(), "extra", term31892);
        setField(term32861, term32861.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term32861;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


