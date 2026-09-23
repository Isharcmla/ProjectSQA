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
import java.lang.Integer;

public class ZipArchiveEntry_setMethod_189085060967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42513;
     Object term42529;

    public ZipArchiveEntry_setMethod_189085060967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42513 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42513, term42513.getClass(), "method", 0);
        setLongField(term42513, term42513.getClass(), "size", 0L);
        setIntField(term42513, term42513.getClass(), "internalAttributes", 0);
        setIntField(term42513, term42513.getClass(), "versionRequired", 0);
        setIntField(term42513, term42513.getClass(), "versionMadeBy", 0);
        setIntField(term42513, term42513.getClass(), "platform", 0);
        setIntField(term42513, term42513.getClass(), "rawFlag", 0);
        setLongField(term42513, term42513.getClass(), "externalAttributes", 0L);
        setField(term42513, term42513.getClass(), "extraFields", null);
        setField(term42513, term42513.getClass(), "unparseableExtra", null);
        setField(term42513, term42513.getClass(), "name", null);
        setField(term42513, term42513.getClass(), "rawName", null);
        setField(term42513, term42513.getClass(), "gpb", null);
        setLongField(term42513, term42513.getClass(), "xdostime", 0L);
        setField(term42513, term42513.getClass(), "mtime", null);
        setField(term42513, term42513.getClass(), "atime", null);
        setField(term42513, term42513.getClass(), "ctime", null);
        setLongField(term42513, term42513.getClass(), "crc", 0L);
        setLongField(term42513, term42513.getClass(), "csize", 0L);
        setIntField(term42513, term42513.getClass(), "flag", 0);
        setField(term42513, term42513.getClass(), "extra", null);
        setField(term42513, term42513.getClass(), "comment", null);
        term42529 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42529;
        callMethod(klass, "setMethod", argTypes, term42513, args);
    }

};


