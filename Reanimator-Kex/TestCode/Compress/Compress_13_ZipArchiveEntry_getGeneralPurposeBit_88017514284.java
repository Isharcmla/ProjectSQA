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

public class ZipArchiveEntry_getGeneralPurposeBit_88017514284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35632;

    public ZipArchiveEntry_getGeneralPurposeBit_88017514284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35632, term35632.getClass(), "method", 0);
        setLongField(term35632, term35632.getClass(), "size", 0L);
        setIntField(term35632, term35632.getClass(), "internalAttributes", 0);
        setIntField(term35632, term35632.getClass(), "platform", 0);
        setLongField(term35632, term35632.getClass(), "externalAttributes", 0L);
        setField(term35632, term35632.getClass(), "extraFields", null);
        setField(term35632, term35632.getClass(), "unparseableExtra", null);
        setField(term35632, term35632.getClass(), "name", null);
        setField(term35632, term35632.getClass(), "rawName", null);
        setField(term35632, term35632.getClass(), "gpb", null);
        setLongField(term35632, term35632.getClass(), "xdostime", 0L);
        setField(term35632, term35632.getClass(), "mtime", null);
        setField(term35632, term35632.getClass(), "atime", null);
        setField(term35632, term35632.getClass(), "ctime", null);
        setLongField(term35632, term35632.getClass(), "crc", 0L);
        setLongField(term35632, term35632.getClass(), "csize", 0L);
        setIntField(term35632, term35632.getClass(), "flag", 0);
        setField(term35632, term35632.getClass(), "extra", null);
        setField(term35632, term35632.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneralPurposeBit", argTypes, term35632, args);
    }

};


