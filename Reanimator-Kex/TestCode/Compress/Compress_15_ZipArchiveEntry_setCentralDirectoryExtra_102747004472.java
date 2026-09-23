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

public class ZipArchiveEntry_setCentralDirectoryExtra_102747004472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34212;

    public ZipArchiveEntry_setCentralDirectoryExtra_102747004472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34212 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34212, term34212.getClass(), "method", 0);
        setLongField(term34212, term34212.getClass(), "size", 0L);
        setIntField(term34212, term34212.getClass(), "internalAttributes", 0);
        setIntField(term34212, term34212.getClass(), "platform", 0);
        setLongField(term34212, term34212.getClass(), "externalAttributes", 0L);
        setField(term34212, term34212.getClass(), "extraFields", null);
        setField(term34212, term34212.getClass(), "unparseableExtra", null);
        setField(term34212, term34212.getClass(), "name", null);
        setField(term34212, term34212.getClass(), "rawName", null);
        setField(term34212, term34212.getClass(), "gpb", null);
        setLongField(term34212, term34212.getClass(), "xdostime", 0L);
        setField(term34212, term34212.getClass(), "mtime", null);
        setField(term34212, term34212.getClass(), "atime", null);
        setField(term34212, term34212.getClass(), "ctime", null);
        setLongField(term34212, term34212.getClass(), "crc", 0L);
        setLongField(term34212, term34212.getClass(), "csize", 0L);
        setIntField(term34212, term34212.getClass(), "flag", 0);
        setField(term34212, term34212.getClass(), "extra", null);
        setField(term34212, term34212.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCentralDirectoryExtra", argTypes, term34212, args);
    }

};


