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

public class ZipArchiveEntry_getUnparseableOnly_45310307586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42831;

    public ZipArchiveEntry_getUnparseableOnly_45310307586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42831 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42831, term42831.getClass(), "method", 0);
        setLongField(term42831, term42831.getClass(), "size", 0L);
        setIntField(term42831, term42831.getClass(), "internalAttributes", 0);
        setIntField(term42831, term42831.getClass(), "versionRequired", 0);
        setIntField(term42831, term42831.getClass(), "versionMadeBy", 0);
        setIntField(term42831, term42831.getClass(), "platform", 0);
        setIntField(term42831, term42831.getClass(), "rawFlag", 0);
        setLongField(term42831, term42831.getClass(), "externalAttributes", 0L);
        setField(term42831, term42831.getClass(), "extraFields", null);
        setField(term42831, term42831.getClass(), "unparseableExtra", null);
        setField(term42831, term42831.getClass(), "name", null);
        setField(term42831, term42831.getClass(), "rawName", null);
        setField(term42831, term42831.getClass(), "gpb", null);
        setLongField(term42831, term42831.getClass(), "xdostime", 0L);
        setField(term42831, term42831.getClass(), "mtime", null);
        setField(term42831, term42831.getClass(), "atime", null);
        setField(term42831, term42831.getClass(), "ctime", null);
        setLongField(term42831, term42831.getClass(), "crc", 0L);
        setLongField(term42831, term42831.getClass(), "csize", 0L);
        setIntField(term42831, term42831.getClass(), "flag", 0);
        setField(term42831, term42831.getClass(), "extra", null);
        setField(term42831, term42831.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnparseableOnly", argTypes, term42831, args);
    }

};


