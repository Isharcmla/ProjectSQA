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

public class ZipArchiveEntry_setCentralDirectoryExtra_102747004496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42991;

    public ZipArchiveEntry_setCentralDirectoryExtra_102747004496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42991 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42991, term42991.getClass(), "method", 0);
        setLongField(term42991, term42991.getClass(), "size", 0L);
        setIntField(term42991, term42991.getClass(), "internalAttributes", 0);
        setIntField(term42991, term42991.getClass(), "versionRequired", 0);
        setIntField(term42991, term42991.getClass(), "versionMadeBy", 0);
        setIntField(term42991, term42991.getClass(), "platform", 0);
        setIntField(term42991, term42991.getClass(), "rawFlag", 0);
        setLongField(term42991, term42991.getClass(), "externalAttributes", 0L);
        setField(term42991, term42991.getClass(), "extraFields", null);
        setField(term42991, term42991.getClass(), "unparseableExtra", null);
        setField(term42991, term42991.getClass(), "name", null);
        setField(term42991, term42991.getClass(), "rawName", null);
        setField(term42991, term42991.getClass(), "gpb", null);
        setLongField(term42991, term42991.getClass(), "xdostime", 0L);
        setField(term42991, term42991.getClass(), "mtime", null);
        setField(term42991, term42991.getClass(), "atime", null);
        setField(term42991, term42991.getClass(), "ctime", null);
        setLongField(term42991, term42991.getClass(), "crc", 0L);
        setLongField(term42991, term42991.getClass(), "csize", 0L);
        setIntField(term42991, term42991.getClass(), "flag", 0);
        setField(term42991, term42991.getClass(), "extra", null);
        setField(term42991, term42991.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCentralDirectoryExtra", argTypes, term42991, args);
    }

};


