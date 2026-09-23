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
import java.lang.Long;

public class ZipArchiveEntry_setSize_92422827379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34303;
     Object term34316;

    public ZipArchiveEntry_setSize_92422827379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34303, term34303.getClass(), "method", 0);
        setLongField(term34303, term34303.getClass(), "size", 0L);
        setIntField(term34303, term34303.getClass(), "internalAttributes", 0);
        setIntField(term34303, term34303.getClass(), "platform", 0);
        setLongField(term34303, term34303.getClass(), "externalAttributes", 0L);
        setField(term34303, term34303.getClass(), "extraFields", null);
        setField(term34303, term34303.getClass(), "unparseableExtra", null);
        setField(term34303, term34303.getClass(), "name", null);
        setField(term34303, term34303.getClass(), "rawName", null);
        setField(term34303, term34303.getClass(), "gpb", null);
        setLongField(term34303, term34303.getClass(), "xdostime", 0L);
        setField(term34303, term34303.getClass(), "mtime", null);
        setField(term34303, term34303.getClass(), "atime", null);
        setField(term34303, term34303.getClass(), "ctime", null);
        setLongField(term34303, term34303.getClass(), "crc", 0L);
        setLongField(term34303, term34303.getClass(), "csize", 0L);
        setIntField(term34303, term34303.getClass(), "flag", 0);
        setField(term34303, term34303.getClass(), "extra", null);
        setField(term34303, term34303.getClass(), "comment", null);
        term34316 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term34316;
        callMethod(klass, "setSize", argTypes, term34303, args);
    }

};


