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

public class ZipArchiveEntry_setPlatform_149379641361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35327;
     Object term35340;

    public ZipArchiveEntry_setPlatform_149379641361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35327 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35327, term35327.getClass(), "method", 0);
        setLongField(term35327, term35327.getClass(), "size", 0L);
        setIntField(term35327, term35327.getClass(), "internalAttributes", 0);
        setIntField(term35327, term35327.getClass(), "platform", 0);
        setLongField(term35327, term35327.getClass(), "externalAttributes", 0L);
        setField(term35327, term35327.getClass(), "extraFields", null);
        setField(term35327, term35327.getClass(), "unparseableExtra", null);
        setField(term35327, term35327.getClass(), "name", null);
        setField(term35327, term35327.getClass(), "rawName", null);
        setField(term35327, term35327.getClass(), "gpb", null);
        setLongField(term35327, term35327.getClass(), "xdostime", 0L);
        setField(term35327, term35327.getClass(), "mtime", null);
        setField(term35327, term35327.getClass(), "atime", null);
        setField(term35327, term35327.getClass(), "ctime", null);
        setLongField(term35327, term35327.getClass(), "crc", 0L);
        setLongField(term35327, term35327.getClass(), "csize", 0L);
        setIntField(term35327, term35327.getClass(), "flag", 0);
        setField(term35327, term35327.getClass(), "extra", null);
        setField(term35327, term35327.getClass(), "comment", null);
        term35340 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term35340;
        callMethod(klass, "setPlatform", argTypes, term35327, args);
    }

};


