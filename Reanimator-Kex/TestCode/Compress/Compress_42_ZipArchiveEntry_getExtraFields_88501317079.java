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

public class ZipArchiveEntry_getExtraFields_88501317079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42715;
     Object term42731;

    public ZipArchiveEntry_getExtraFields_88501317079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42715 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42715, term42715.getClass(), "method", 0);
        setLongField(term42715, term42715.getClass(), "size", 0L);
        setIntField(term42715, term42715.getClass(), "internalAttributes", 0);
        setIntField(term42715, term42715.getClass(), "versionRequired", 0);
        setIntField(term42715, term42715.getClass(), "versionMadeBy", 0);
        setIntField(term42715, term42715.getClass(), "platform", 0);
        setIntField(term42715, term42715.getClass(), "rawFlag", 0);
        setLongField(term42715, term42715.getClass(), "externalAttributes", 0L);
        setField(term42715, term42715.getClass(), "extraFields", null);
        setField(term42715, term42715.getClass(), "unparseableExtra", null);
        setField(term42715, term42715.getClass(), "name", null);
        setField(term42715, term42715.getClass(), "rawName", null);
        setField(term42715, term42715.getClass(), "gpb", null);
        setLongField(term42715, term42715.getClass(), "xdostime", 0L);
        setField(term42715, term42715.getClass(), "mtime", null);
        setField(term42715, term42715.getClass(), "atime", null);
        setField(term42715, term42715.getClass(), "ctime", null);
        setLongField(term42715, term42715.getClass(), "crc", 0L);
        setLongField(term42715, term42715.getClass(), "csize", 0L);
        setIntField(term42715, term42715.getClass(), "flag", 0);
        setField(term42715, term42715.getClass(), "extra", null);
        setField(term42715, term42715.getClass(), "comment", null);
        term42731 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term42731;
        callMethod(klass, "getExtraFields", argTypes, term42715, args);
    }

};


