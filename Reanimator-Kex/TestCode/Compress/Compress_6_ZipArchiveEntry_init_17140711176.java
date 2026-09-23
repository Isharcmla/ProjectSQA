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

public class ZipArchiveEntry_init_17140711176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34607;

    public ZipArchiveEntry_init_17140711176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term34487 = new LinkedHashMap();
        Object term34287 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term34357 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34427 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        setLongField(term34287, term34287.getClass(), "xdostime", 0L);
        setLongField(term34287, term34287.getClass(), "crc", 0L);
        setLongField(term34287, term34287.getClass(), "size", 0L);
        setLongField(term34287, term34287.getClass(), "csize", 0L);
        setIntField(term34287, term34287.getClass(), "method", 0);
        setIntField(term34287, term34287.getClass(), "flag", 0);
        setField(term34287, term34287.getClass(), "name", null);
        setField(term34287, term34287.getClass(), "mtime", term34357);
        setField(term34287, term34287.getClass(), "atime", null);
        setField(term34287, term34287.getClass(), "ctime", term34427);
        setField(term34287, term34287.getClass(), "extra", null);
        setField(term34287, term34287.getClass(), "comment", null);
        setIntField(term34287, term34287.getClass(), "internalAttributes", 0);
        setIntField(term34287, term34287.getClass(), "platform", 0);
        setLongField(term34287, term34287.getClass(), "externalAttributes", 0L);
        setField(term34287, term34287.getClass(), "extraFields", term34487);
        term34607 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term34715 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34785 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term34855 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        byte[] term33642 = (byte[]) newByteArray(489);
        setField(term34607, term34607.getClass(), "name", "");
        setLongField(term34607, term34607.getClass(), "xdostime", 0L);
        setField(term34607, term34607.getClass(), "mtime", term34715);
        setField(term34607, term34607.getClass(), "atime", term34785);
        setField(term34607, term34607.getClass(), "ctime", term34855);
        setLongField(term34607, term34607.getClass(), "crc", 0L);
        setLongField(term34607, term34607.getClass(), "size", 0L);
        setLongField(term34607, term34607.getClass(), "csize", 0L);
        setIntField(term34607, term34607.getClass(), "method", 0);
        setIntField(term34607, term34607.getClass(), "flag", 0);
        setField(term34607, term34607.getClass(), "extra", term33642);
        setField(term34607, term34607.getClass(), "comment", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term34607;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


