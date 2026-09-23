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

public class ZipArchiveEntry_setInternalAttributes_182649689255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35243;
     Object term35256;

    public ZipArchiveEntry_setInternalAttributes_182649689255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35243 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35243, term35243.getClass(), "method", 0);
        setLongField(term35243, term35243.getClass(), "size", 0L);
        setIntField(term35243, term35243.getClass(), "internalAttributes", 0);
        setIntField(term35243, term35243.getClass(), "platform", 0);
        setLongField(term35243, term35243.getClass(), "externalAttributes", 0L);
        setField(term35243, term35243.getClass(), "extraFields", null);
        setField(term35243, term35243.getClass(), "unparseableExtra", null);
        setField(term35243, term35243.getClass(), "name", null);
        setField(term35243, term35243.getClass(), "rawName", null);
        setField(term35243, term35243.getClass(), "gpb", null);
        setLongField(term35243, term35243.getClass(), "xdostime", 0L);
        setField(term35243, term35243.getClass(), "mtime", null);
        setField(term35243, term35243.getClass(), "atime", null);
        setField(term35243, term35243.getClass(), "ctime", null);
        setLongField(term35243, term35243.getClass(), "crc", 0L);
        setLongField(term35243, term35243.getClass(), "csize", 0L);
        setIntField(term35243, term35243.getClass(), "flag", 0);
        setField(term35243, term35243.getClass(), "extra", null);
        setField(term35243, term35243.getClass(), "comment", null);
        term35256 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term35256;
        callMethod(klass, "setInternalAttributes", argTypes, term35243, args);
    }

};


