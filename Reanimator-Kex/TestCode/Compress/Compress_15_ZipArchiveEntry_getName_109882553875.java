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

public class ZipArchiveEntry_getName_109882553875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34251;

    public ZipArchiveEntry_getName_109882553875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34251 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34251, term34251.getClass(), "method", 0);
        setLongField(term34251, term34251.getClass(), "size", 0L);
        setIntField(term34251, term34251.getClass(), "internalAttributes", 0);
        setIntField(term34251, term34251.getClass(), "platform", 0);
        setLongField(term34251, term34251.getClass(), "externalAttributes", 0L);
        setField(term34251, term34251.getClass(), "extraFields", null);
        setField(term34251, term34251.getClass(), "unparseableExtra", null);
        setField(term34251, term34251.getClass(), "name", null);
        setField(term34251, term34251.getClass(), "rawName", null);
        setField(term34251, term34251.getClass(), "gpb", null);
        setLongField(term34251, term34251.getClass(), "xdostime", 0L);
        setField(term34251, term34251.getClass(), "mtime", null);
        setField(term34251, term34251.getClass(), "atime", null);
        setField(term34251, term34251.getClass(), "ctime", null);
        setLongField(term34251, term34251.getClass(), "crc", 0L);
        setLongField(term34251, term34251.getClass(), "csize", 0L);
        setIntField(term34251, term34251.getClass(), "flag", 0);
        setField(term34251, term34251.getClass(), "extra", null);
        setField(term34251, term34251.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term34251, args);
    }

};


