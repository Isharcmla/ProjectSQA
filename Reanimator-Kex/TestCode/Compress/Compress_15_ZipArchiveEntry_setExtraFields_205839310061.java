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

public class ZipArchiveEntry_setExtraFields_205839310061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34067;

    public ZipArchiveEntry_setExtraFields_205839310061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34067 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34067, term34067.getClass(), "method", 0);
        setLongField(term34067, term34067.getClass(), "size", 0L);
        setIntField(term34067, term34067.getClass(), "internalAttributes", 0);
        setIntField(term34067, term34067.getClass(), "platform", 0);
        setLongField(term34067, term34067.getClass(), "externalAttributes", 0L);
        setField(term34067, term34067.getClass(), "extraFields", null);
        setField(term34067, term34067.getClass(), "unparseableExtra", null);
        setField(term34067, term34067.getClass(), "name", null);
        setField(term34067, term34067.getClass(), "rawName", null);
        setField(term34067, term34067.getClass(), "gpb", null);
        setLongField(term34067, term34067.getClass(), "xdostime", 0L);
        setField(term34067, term34067.getClass(), "mtime", null);
        setField(term34067, term34067.getClass(), "atime", null);
        setField(term34067, term34067.getClass(), "ctime", null);
        setLongField(term34067, term34067.getClass(), "crc", 0L);
        setLongField(term34067, term34067.getClass(), "csize", 0L);
        setIntField(term34067, term34067.getClass(), "flag", 0);
        setField(term34067, term34067.getClass(), "extra", null);
        setField(term34067, term34067.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExtraFields", argTypes, term34067, args);
    }

};


