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

public class ZipArchiveEntry_setSize_92422827380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35578;
     Object term35591;

    public ZipArchiveEntry_setSize_92422827380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35578 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35578, term35578.getClass(), "method", 0);
        setLongField(term35578, term35578.getClass(), "size", 0L);
        setIntField(term35578, term35578.getClass(), "internalAttributes", 0);
        setIntField(term35578, term35578.getClass(), "platform", 0);
        setLongField(term35578, term35578.getClass(), "externalAttributes", 0L);
        setField(term35578, term35578.getClass(), "extraFields", null);
        setField(term35578, term35578.getClass(), "unparseableExtra", null);
        setField(term35578, term35578.getClass(), "name", null);
        setField(term35578, term35578.getClass(), "rawName", null);
        setField(term35578, term35578.getClass(), "gpb", null);
        setLongField(term35578, term35578.getClass(), "xdostime", 0L);
        setField(term35578, term35578.getClass(), "mtime", null);
        setField(term35578, term35578.getClass(), "atime", null);
        setField(term35578, term35578.getClass(), "ctime", null);
        setLongField(term35578, term35578.getClass(), "crc", 0L);
        setLongField(term35578, term35578.getClass(), "csize", 0L);
        setIntField(term35578, term35578.getClass(), "flag", 0);
        setField(term35578, term35578.getClass(), "extra", null);
        setField(term35578, term35578.getClass(), "comment", null);
        term35591 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term35591;
        callMethod(klass, "setSize", argTypes, term35578, args);
    }

};


