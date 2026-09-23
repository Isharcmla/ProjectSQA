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
import java.lang.Boolean;

public class ZipArchiveEntry_getExtraFields_88501317063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34093;
     Object term34106;

    public ZipArchiveEntry_getExtraFields_88501317063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34093 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34093, term34093.getClass(), "method", 0);
        setLongField(term34093, term34093.getClass(), "size", 0L);
        setIntField(term34093, term34093.getClass(), "internalAttributes", 0);
        setIntField(term34093, term34093.getClass(), "platform", 0);
        setLongField(term34093, term34093.getClass(), "externalAttributes", 0L);
        setField(term34093, term34093.getClass(), "extraFields", null);
        setField(term34093, term34093.getClass(), "unparseableExtra", null);
        setField(term34093, term34093.getClass(), "name", null);
        setField(term34093, term34093.getClass(), "rawName", null);
        setField(term34093, term34093.getClass(), "gpb", null);
        setLongField(term34093, term34093.getClass(), "xdostime", 0L);
        setField(term34093, term34093.getClass(), "mtime", null);
        setField(term34093, term34093.getClass(), "atime", null);
        setField(term34093, term34093.getClass(), "ctime", null);
        setLongField(term34093, term34093.getClass(), "crc", 0L);
        setLongField(term34093, term34093.getClass(), "csize", 0L);
        setIntField(term34093, term34093.getClass(), "flag", 0);
        setField(term34093, term34093.getClass(), "extra", null);
        setField(term34093, term34093.getClass(), "comment", null);
        term34106 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term34106;
        callMethod(klass, "getExtraFields", argTypes, term34093, args);
    }

};


