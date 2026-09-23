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

public class ZipArchiveEntry_setMethod_189085060952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33940;
     Object term33953;

    public ZipArchiveEntry_setMethod_189085060952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33940 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term33940, term33940.getClass(), "method", 0);
        setLongField(term33940, term33940.getClass(), "size", 0L);
        setIntField(term33940, term33940.getClass(), "internalAttributes", 0);
        setIntField(term33940, term33940.getClass(), "platform", 0);
        setLongField(term33940, term33940.getClass(), "externalAttributes", 0L);
        setField(term33940, term33940.getClass(), "extraFields", null);
        setField(term33940, term33940.getClass(), "unparseableExtra", null);
        setField(term33940, term33940.getClass(), "name", null);
        setField(term33940, term33940.getClass(), "rawName", null);
        setField(term33940, term33940.getClass(), "gpb", null);
        setLongField(term33940, term33940.getClass(), "xdostime", 0L);
        setField(term33940, term33940.getClass(), "mtime", null);
        setField(term33940, term33940.getClass(), "atime", null);
        setField(term33940, term33940.getClass(), "ctime", null);
        setLongField(term33940, term33940.getClass(), "crc", 0L);
        setLongField(term33940, term33940.getClass(), "csize", 0L);
        setIntField(term33940, term33940.getClass(), "flag", 0);
        setField(term33940, term33940.getClass(), "extra", null);
        setField(term33940, term33940.getClass(), "comment", null);
        term33953 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33953;
        callMethod(klass, "setMethod", argTypes, term33940, args);
    }

};


