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

public class ZipArchiveEntry_setName_34842581481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35593;

    public ZipArchiveEntry_setName_34842581481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35593 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35593, term35593.getClass(), "method", 0);
        setLongField(term35593, term35593.getClass(), "size", 0L);
        setIntField(term35593, term35593.getClass(), "internalAttributes", 0);
        setIntField(term35593, term35593.getClass(), "platform", 0);
        setLongField(term35593, term35593.getClass(), "externalAttributes", 0L);
        setField(term35593, term35593.getClass(), "extraFields", null);
        setField(term35593, term35593.getClass(), "unparseableExtra", null);
        setField(term35593, term35593.getClass(), "name", null);
        setField(term35593, term35593.getClass(), "rawName", null);
        setField(term35593, term35593.getClass(), "gpb", null);
        setLongField(term35593, term35593.getClass(), "xdostime", 0L);
        setField(term35593, term35593.getClass(), "mtime", null);
        setField(term35593, term35593.getClass(), "atime", null);
        setField(term35593, term35593.getClass(), "ctime", null);
        setLongField(term35593, term35593.getClass(), "crc", 0L);
        setLongField(term35593, term35593.getClass(), "csize", 0L);
        setIntField(term35593, term35593.getClass(), "flag", 0);
        setField(term35593, term35593.getClass(), "extra", null);
        setField(term35593, term35593.getClass(), "comment", null);
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
        callMethod(klass, "setName", argTypes, term35593, args);
    }

};


