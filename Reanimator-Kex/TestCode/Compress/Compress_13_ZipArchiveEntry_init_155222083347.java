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

public class ZipArchiveEntry_init_155222083347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33581;

    public ZipArchiveEntry_init_155222083347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term33321 = new LinkedHashMap();
        Object term33083 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term33153 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33223 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term32920 = (byte[]) newByteArray(0);
        Object term33461 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        setLongField(term33083, term33083.getClass(), "xdostime", 0L);
        setLongField(term33083, term33083.getClass(), "crc", 0L);
        setLongField(term33083, term33083.getClass(), "size", 0L);
        setLongField(term33083, term33083.getClass(), "csize", 0L);
        setIntField(term33083, term33083.getClass(), "method", 0);
        setIntField(term33083, term33083.getClass(), "flag", 0);
        setField(term33083, term33083.getClass(), "name", null);
        setField(term33083, term33083.getClass(), "mtime", term33153);
        setField(term33083, term33083.getClass(), "atime", null);
        setField(term33083, term33083.getClass(), "ctime", term33223);
        setField(term33083, term33083.getClass(), "extra", term32920);
        setField(term33083, term33083.getClass(), "comment", "");
        setIntField(term33083, term33083.getClass(), "internalAttributes", 0);
        setIntField(term33083, term33083.getClass(), "platform", 0);
        setLongField(term33083, term33083.getClass(), "externalAttributes", 0L);
        setField(term33083, term33083.getClass(), "extraFields", term33321);
        setField(term33083, term33083.getClass(), "unparseableExtra", term33461);
        setField(term33083, term33083.getClass(), "rawName", null);
        setField(term33083, term33083.getClass(), "gpb", null);
        term33581 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term33689 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term33759 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term32430 = (byte[]) newByteArray(489);
        setField(term33581, term33581.getClass(), "name", "");
        setLongField(term33581, term33581.getClass(), "xdostime", 0L);
        setField(term33581, term33581.getClass(), "mtime", null);
        setField(term33581, term33581.getClass(), "atime", term33689);
        setField(term33581, term33581.getClass(), "ctime", term33759);
        setLongField(term33581, term33581.getClass(), "crc", 0L);
        setLongField(term33581, term33581.getClass(), "size", 0L);
        setLongField(term33581, term33581.getClass(), "csize", 0L);
        setIntField(term33581, term33581.getClass(), "method", 0);
        setIntField(term33581, term33581.getClass(), "flag", 0);
        setField(term33581, term33581.getClass(), "extra", term32430);
        setField(term33581, term33581.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term33581;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


