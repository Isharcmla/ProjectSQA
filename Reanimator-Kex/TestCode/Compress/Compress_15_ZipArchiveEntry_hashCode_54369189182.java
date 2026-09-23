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

public class ZipArchiveEntry_hashCode_54369189182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34344;

    public ZipArchiveEntry_hashCode_54369189182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34344 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34344, term34344.getClass(), "method", 0);
        setLongField(term34344, term34344.getClass(), "size", 0L);
        setIntField(term34344, term34344.getClass(), "internalAttributes", 0);
        setIntField(term34344, term34344.getClass(), "platform", 0);
        setLongField(term34344, term34344.getClass(), "externalAttributes", 0L);
        setField(term34344, term34344.getClass(), "extraFields", null);
        setField(term34344, term34344.getClass(), "unparseableExtra", null);
        setField(term34344, term34344.getClass(), "name", null);
        setField(term34344, term34344.getClass(), "rawName", null);
        setField(term34344, term34344.getClass(), "gpb", null);
        setLongField(term34344, term34344.getClass(), "xdostime", 0L);
        setField(term34344, term34344.getClass(), "mtime", null);
        setField(term34344, term34344.getClass(), "atime", null);
        setField(term34344, term34344.getClass(), "ctime", null);
        setLongField(term34344, term34344.getClass(), "crc", 0L);
        setLongField(term34344, term34344.getClass(), "csize", 0L);
        setIntField(term34344, term34344.getClass(), "flag", 0);
        setField(term34344, term34344.getClass(), "extra", null);
        setField(term34344, term34344.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term34344, args);
    }

};


