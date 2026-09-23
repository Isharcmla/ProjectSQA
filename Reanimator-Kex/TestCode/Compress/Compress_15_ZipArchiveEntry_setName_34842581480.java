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

public class ZipArchiveEntry_setName_34842581480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34318;

    public ZipArchiveEntry_setName_34842581480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34318 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34318, term34318.getClass(), "method", 0);
        setLongField(term34318, term34318.getClass(), "size", 0L);
        setIntField(term34318, term34318.getClass(), "internalAttributes", 0);
        setIntField(term34318, term34318.getClass(), "platform", 0);
        setLongField(term34318, term34318.getClass(), "externalAttributes", 0L);
        setField(term34318, term34318.getClass(), "extraFields", null);
        setField(term34318, term34318.getClass(), "unparseableExtra", null);
        setField(term34318, term34318.getClass(), "name", null);
        setField(term34318, term34318.getClass(), "rawName", null);
        setField(term34318, term34318.getClass(), "gpb", null);
        setLongField(term34318, term34318.getClass(), "xdostime", 0L);
        setField(term34318, term34318.getClass(), "mtime", null);
        setField(term34318, term34318.getClass(), "atime", null);
        setField(term34318, term34318.getClass(), "ctime", null);
        setLongField(term34318, term34318.getClass(), "crc", 0L);
        setLongField(term34318, term34318.getClass(), "csize", 0L);
        setIntField(term34318, term34318.getClass(), "flag", 0);
        setField(term34318, term34318.getClass(), "extra", null);
        setField(term34318, term34318.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setName", argTypes, term34318, args);
    }

};


