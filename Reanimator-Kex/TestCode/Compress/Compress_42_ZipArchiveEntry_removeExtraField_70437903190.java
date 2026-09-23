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

public class ZipArchiveEntry_removeExtraField_70437903190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42895;

    public ZipArchiveEntry_removeExtraField_70437903190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42895 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42895, term42895.getClass(), "method", 0);
        setLongField(term42895, term42895.getClass(), "size", 0L);
        setIntField(term42895, term42895.getClass(), "internalAttributes", 0);
        setIntField(term42895, term42895.getClass(), "versionRequired", 0);
        setIntField(term42895, term42895.getClass(), "versionMadeBy", 0);
        setIntField(term42895, term42895.getClass(), "platform", 0);
        setIntField(term42895, term42895.getClass(), "rawFlag", 0);
        setLongField(term42895, term42895.getClass(), "externalAttributes", 0L);
        setField(term42895, term42895.getClass(), "extraFields", null);
        setField(term42895, term42895.getClass(), "unparseableExtra", null);
        setField(term42895, term42895.getClass(), "name", null);
        setField(term42895, term42895.getClass(), "rawName", null);
        setField(term42895, term42895.getClass(), "gpb", null);
        setLongField(term42895, term42895.getClass(), "xdostime", 0L);
        setField(term42895, term42895.getClass(), "mtime", null);
        setField(term42895, term42895.getClass(), "atime", null);
        setField(term42895, term42895.getClass(), "ctime", null);
        setLongField(term42895, term42895.getClass(), "crc", 0L);
        setLongField(term42895, term42895.getClass(), "csize", 0L);
        setIntField(term42895, term42895.getClass(), "flag", 0);
        setField(term42895, term42895.getClass(), "extra", null);
        setField(term42895, term42895.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeExtraField", argTypes, term42895, args);
    }

};


