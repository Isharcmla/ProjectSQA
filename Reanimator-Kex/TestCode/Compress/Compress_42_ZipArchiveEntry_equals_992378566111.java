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

public class ZipArchiveEntry_equals_992378566111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43235;

    public ZipArchiveEntry_equals_992378566111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43235 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43235, term43235.getClass(), "method", 0);
        setLongField(term43235, term43235.getClass(), "size", 0L);
        setIntField(term43235, term43235.getClass(), "internalAttributes", 0);
        setIntField(term43235, term43235.getClass(), "versionRequired", 0);
        setIntField(term43235, term43235.getClass(), "versionMadeBy", 0);
        setIntField(term43235, term43235.getClass(), "platform", 0);
        setIntField(term43235, term43235.getClass(), "rawFlag", 0);
        setLongField(term43235, term43235.getClass(), "externalAttributes", 0L);
        setField(term43235, term43235.getClass(), "extraFields", null);
        setField(term43235, term43235.getClass(), "unparseableExtra", null);
        setField(term43235, term43235.getClass(), "name", null);
        setField(term43235, term43235.getClass(), "rawName", null);
        setField(term43235, term43235.getClass(), "gpb", null);
        setLongField(term43235, term43235.getClass(), "xdostime", 0L);
        setField(term43235, term43235.getClass(), "mtime", null);
        setField(term43235, term43235.getClass(), "atime", null);
        setField(term43235, term43235.getClass(), "ctime", null);
        setLongField(term43235, term43235.getClass(), "crc", 0L);
        setLongField(term43235, term43235.getClass(), "csize", 0L);
        setIntField(term43235, term43235.getClass(), "flag", 0);
        setField(term43235, term43235.getClass(), "extra", null);
        setField(term43235, term43235.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term43235, args);
    }

};


