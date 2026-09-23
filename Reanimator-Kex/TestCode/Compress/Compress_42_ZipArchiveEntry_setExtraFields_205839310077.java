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

public class ZipArchiveEntry_setExtraFields_205839310077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42683;

    public ZipArchiveEntry_setExtraFields_205839310077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42683 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42683, term42683.getClass(), "method", 0);
        setLongField(term42683, term42683.getClass(), "size", 0L);
        setIntField(term42683, term42683.getClass(), "internalAttributes", 0);
        setIntField(term42683, term42683.getClass(), "versionRequired", 0);
        setIntField(term42683, term42683.getClass(), "versionMadeBy", 0);
        setIntField(term42683, term42683.getClass(), "platform", 0);
        setIntField(term42683, term42683.getClass(), "rawFlag", 0);
        setLongField(term42683, term42683.getClass(), "externalAttributes", 0L);
        setField(term42683, term42683.getClass(), "extraFields", null);
        setField(term42683, term42683.getClass(), "unparseableExtra", null);
        setField(term42683, term42683.getClass(), "name", null);
        setField(term42683, term42683.getClass(), "rawName", null);
        setField(term42683, term42683.getClass(), "gpb", null);
        setLongField(term42683, term42683.getClass(), "xdostime", 0L);
        setField(term42683, term42683.getClass(), "mtime", null);
        setField(term42683, term42683.getClass(), "atime", null);
        setField(term42683, term42683.getClass(), "ctime", null);
        setLongField(term42683, term42683.getClass(), "crc", 0L);
        setLongField(term42683, term42683.getClass(), "csize", 0L);
        setIntField(term42683, term42683.getClass(), "flag", 0);
        setField(term42683, term42683.getClass(), "extra", null);
        setField(term42683, term42683.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExtraFields", argTypes, term42683, args);
    }

};


