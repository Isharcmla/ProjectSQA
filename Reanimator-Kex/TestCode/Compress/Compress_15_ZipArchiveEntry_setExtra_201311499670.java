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

public class ZipArchiveEntry_setExtra_201311499670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34186;

    public ZipArchiveEntry_setExtra_201311499670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34186 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34186, term34186.getClass(), "method", 0);
        setLongField(term34186, term34186.getClass(), "size", 0L);
        setIntField(term34186, term34186.getClass(), "internalAttributes", 0);
        setIntField(term34186, term34186.getClass(), "platform", 0);
        setLongField(term34186, term34186.getClass(), "externalAttributes", 0L);
        setField(term34186, term34186.getClass(), "extraFields", null);
        setField(term34186, term34186.getClass(), "unparseableExtra", null);
        setField(term34186, term34186.getClass(), "name", null);
        setField(term34186, term34186.getClass(), "rawName", null);
        setField(term34186, term34186.getClass(), "gpb", null);
        setLongField(term34186, term34186.getClass(), "xdostime", 0L);
        setField(term34186, term34186.getClass(), "mtime", null);
        setField(term34186, term34186.getClass(), "atime", null);
        setField(term34186, term34186.getClass(), "ctime", null);
        setLongField(term34186, term34186.getClass(), "crc", 0L);
        setLongField(term34186, term34186.getClass(), "csize", 0L);
        setIntField(term34186, term34186.getClass(), "flag", 0);
        setField(term34186, term34186.getClass(), "extra", null);
        setField(term34186, term34186.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExtra", argTypes, term34186, args);
    }

};


