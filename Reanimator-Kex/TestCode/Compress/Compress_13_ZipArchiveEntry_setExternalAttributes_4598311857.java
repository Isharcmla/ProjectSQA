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
import java.lang.Long;

public class ZipArchiveEntry_setExternalAttributes_4598311857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35271;
     Object term35284;

    public ZipArchiveEntry_setExternalAttributes_4598311857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35271 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35271, term35271.getClass(), "method", 0);
        setLongField(term35271, term35271.getClass(), "size", 0L);
        setIntField(term35271, term35271.getClass(), "internalAttributes", 0);
        setIntField(term35271, term35271.getClass(), "platform", 0);
        setLongField(term35271, term35271.getClass(), "externalAttributes", 0L);
        setField(term35271, term35271.getClass(), "extraFields", null);
        setField(term35271, term35271.getClass(), "unparseableExtra", null);
        setField(term35271, term35271.getClass(), "name", null);
        setField(term35271, term35271.getClass(), "rawName", null);
        setField(term35271, term35271.getClass(), "gpb", null);
        setLongField(term35271, term35271.getClass(), "xdostime", 0L);
        setField(term35271, term35271.getClass(), "mtime", null);
        setField(term35271, term35271.getClass(), "atime", null);
        setField(term35271, term35271.getClass(), "ctime", null);
        setLongField(term35271, term35271.getClass(), "crc", 0L);
        setLongField(term35271, term35271.getClass(), "csize", 0L);
        setIntField(term35271, term35271.getClass(), "flag", 0);
        setField(term35271, term35271.getClass(), "extra", null);
        setField(term35271, term35271.getClass(), "comment", null);
        term35284 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term35284;
        callMethod(klass, "setExternalAttributes", argTypes, term35271, args);
    }

};


