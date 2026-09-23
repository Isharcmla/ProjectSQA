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

public class ZipArchiveEntry_init_155222083343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30727;

    public ZipArchiveEntry_init_155222083343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term30607 = new LinkedHashMap();
        Object term30261 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term30369 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30439 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30509 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setLongField(term30261, term30261.getClass(), "xdostime", 0L);
        setLongField(term30261, term30261.getClass(), "crc", 0L);
        setLongField(term30261, term30261.getClass(), "size", 0L);
        setLongField(term30261, term30261.getClass(), "csize", 0L);
        setIntField(term30261, term30261.getClass(), "method", 0);
        setIntField(term30261, term30261.getClass(), "flag", 0);
        setField(term30261, term30261.getClass(), "name", "");
        setField(term30261, term30261.getClass(), "mtime", term30369);
        setField(term30261, term30261.getClass(), "atime", term30439);
        setField(term30261, term30261.getClass(), "ctime", term30509);
        setField(term30261, term30261.getClass(), "extra", null);
        setField(term30261, term30261.getClass(), "comment", "");
        setIntField(term30261, term30261.getClass(), "internalAttributes", 0);
        setIntField(term30261, term30261.getClass(), "platform", 0);
        setLongField(term30261, term30261.getClass(), "externalAttributes", 0L);
        setField(term30261, term30261.getClass(), "extraFields", term30607);
        term30727 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term30835 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30905 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term30975 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term29617 = (byte[]) newByteArray(489);
        setField(term30727, term30727.getClass(), "name", "");
        setLongField(term30727, term30727.getClass(), "xdostime", 0L);
        setField(term30727, term30727.getClass(), "mtime", term30835);
        setField(term30727, term30727.getClass(), "atime", term30905);
        setField(term30727, term30727.getClass(), "ctime", term30975);
        setLongField(term30727, term30727.getClass(), "crc", 0L);
        setLongField(term30727, term30727.getClass(), "size", 0L);
        setLongField(term30727, term30727.getClass(), "csize", 0L);
        setIntField(term30727, term30727.getClass(), "method", 0);
        setIntField(term30727, term30727.getClass(), "flag", 0);
        setField(term30727, term30727.getClass(), "extra", term29617);
        setField(term30727, term30727.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.zip.ZipEntry");
        Object[] args = new Object[1];
        args[0] = term30727;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


