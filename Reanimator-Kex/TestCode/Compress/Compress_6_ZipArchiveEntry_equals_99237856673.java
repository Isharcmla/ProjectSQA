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

public class ZipArchiveEntry_equals_99237856673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31863;

    public ZipArchiveEntry_equals_99237856673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31863 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31863, term31863.getClass(), "method", 0);
        setIntField(term31863, term31863.getClass(), "internalAttributes", 0);
        setIntField(term31863, term31863.getClass(), "platform", 0);
        setLongField(term31863, term31863.getClass(), "externalAttributes", 0L);
        setField(term31863, term31863.getClass(), "extraFields", null);
        setField(term31863, term31863.getClass(), "name", null);
        setLongField(term31863, term31863.getClass(), "xdostime", 0L);
        setField(term31863, term31863.getClass(), "mtime", null);
        setField(term31863, term31863.getClass(), "atime", null);
        setField(term31863, term31863.getClass(), "ctime", null);
        setLongField(term31863, term31863.getClass(), "crc", 0L);
        setLongField(term31863, term31863.getClass(), "size", 0L);
        setLongField(term31863, term31863.getClass(), "csize", 0L);
        setIntField(term31863, term31863.getClass(), "flag", 0);
        setField(term31863, term31863.getClass(), "extra", null);
        setField(term31863, term31863.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term31863, args);
    }

};


