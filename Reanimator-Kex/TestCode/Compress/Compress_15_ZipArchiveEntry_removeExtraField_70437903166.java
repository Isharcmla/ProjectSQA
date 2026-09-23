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

public class ZipArchiveEntry_removeExtraField_70437903166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34134;

    public ZipArchiveEntry_removeExtraField_70437903166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34134 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34134, term34134.getClass(), "method", 0);
        setLongField(term34134, term34134.getClass(), "size", 0L);
        setIntField(term34134, term34134.getClass(), "internalAttributes", 0);
        setIntField(term34134, term34134.getClass(), "platform", 0);
        setLongField(term34134, term34134.getClass(), "externalAttributes", 0L);
        setField(term34134, term34134.getClass(), "extraFields", null);
        setField(term34134, term34134.getClass(), "unparseableExtra", null);
        setField(term34134, term34134.getClass(), "name", null);
        setField(term34134, term34134.getClass(), "rawName", null);
        setField(term34134, term34134.getClass(), "gpb", null);
        setLongField(term34134, term34134.getClass(), "xdostime", 0L);
        setField(term34134, term34134.getClass(), "mtime", null);
        setField(term34134, term34134.getClass(), "atime", null);
        setField(term34134, term34134.getClass(), "ctime", null);
        setLongField(term34134, term34134.getClass(), "crc", 0L);
        setLongField(term34134, term34134.getClass(), "csize", 0L);
        setIntField(term34134, term34134.getClass(), "flag", 0);
        setField(term34134, term34134.getClass(), "extra", null);
        setField(term34134, term34134.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeExtraField", argTypes, term34134, args);
    }

};


