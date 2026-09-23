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

public class ZipArchiveEntry_mergeExtraFields_150703452685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34383;
     Object term34396;

    public ZipArchiveEntry_mergeExtraFields_150703452685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34383 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34383, term34383.getClass(), "method", 0);
        setLongField(term34383, term34383.getClass(), "size", 0L);
        setIntField(term34383, term34383.getClass(), "internalAttributes", 0);
        setIntField(term34383, term34383.getClass(), "platform", 0);
        setLongField(term34383, term34383.getClass(), "externalAttributes", 0L);
        setField(term34383, term34383.getClass(), "extraFields", null);
        setField(term34383, term34383.getClass(), "unparseableExtra", null);
        setField(term34383, term34383.getClass(), "name", null);
        setField(term34383, term34383.getClass(), "rawName", null);
        setField(term34383, term34383.getClass(), "gpb", null);
        setLongField(term34383, term34383.getClass(), "xdostime", 0L);
        setField(term34383, term34383.getClass(), "mtime", null);
        setField(term34383, term34383.getClass(), "atime", null);
        setField(term34383, term34383.getClass(), "ctime", null);
        setLongField(term34383, term34383.getClass(), "crc", 0L);
        setLongField(term34383, term34383.getClass(), "csize", 0L);
        setIntField(term34383, term34383.getClass(), "flag", 0);
        setField(term34383, term34383.getClass(), "extra", null);
        setField(term34383, term34383.getClass(), "comment", null);
        term34396 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34396;
        callMethod(klass, "mergeExtraFields", argTypes, term34383, args);
    }

};


