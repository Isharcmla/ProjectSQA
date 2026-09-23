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

public class ZipArchiveEntry_init_17140711177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35916;

    public ZipArchiveEntry_init_17140711177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term35796 = new LinkedHashMap();
        Object term35558 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term36059 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term35736 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term35402 = (byte[]) newByteArray(0);
        setLongField(term35558, term35558.getClass(), "xdostime", 0L);
        setLongField(term35558, term35558.getClass(), "crc", 0L);
        setLongField(term35558, term35558.getClass(), "size", 0L);
        setLongField(term35558, term35558.getClass(), "csize", 0L);
        setIntField(term35558, term35558.getClass(), "method", 0);
        setIntField(term35558, term35558.getClass(), "flag", 0);
        setField(term35558, term35558.getClass(), "name", "");
        setField(term35558, term35558.getClass(), "mtime", term36059);
        setField(term35558, term35558.getClass(), "atime", null);
        setField(term35558, term35558.getClass(), "ctime", term35736);
        setField(term35558, term35558.getClass(), "extra", term35402);
        setField(term35558, term35558.getClass(), "comment", null);
        setIntField(term35558, term35558.getClass(), "internalAttributes", 0);
        setIntField(term35558, term35558.getClass(), "platform", 0);
        setLongField(term35558, term35558.getClass(), "externalAttributes", 0L);
        setField(term35558, term35558.getClass(), "extraFields", term35796);
        term35916 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term36024 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setField(term35916, term35916.getClass(), "name", "");
        setLongField(term35916, term35916.getClass(), "xdostime", 0L);
        setField(term35916, term35916.getClass(), "mtime", term36024);
        setField(term35916, term35916.getClass(), "atime", term36059);
        setField(term35916, term35916.getClass(), "ctime", null);
        setLongField(term35916, term35916.getClass(), "crc", 0L);
        setLongField(term35916, term35916.getClass(), "size", 0L);
        setLongField(term35916, term35916.getClass(), "csize", 0L);
        setIntField(term35916, term35916.getClass(), "method", 0);
        setIntField(term35916, term35916.getClass(), "flag", 0);
        setField(term35916, term35916.getClass(), "extra", null);
        setField(term35916, term35916.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term35916;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


