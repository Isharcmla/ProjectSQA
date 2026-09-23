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

public class ZipArchiveEntry_getPlatform_202341241760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35314;

    public ZipArchiveEntry_getPlatform_202341241760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35314, term35314.getClass(), "method", 0);
        setLongField(term35314, term35314.getClass(), "size", 0L);
        setIntField(term35314, term35314.getClass(), "internalAttributes", 0);
        setIntField(term35314, term35314.getClass(), "platform", 0);
        setLongField(term35314, term35314.getClass(), "externalAttributes", 0L);
        setField(term35314, term35314.getClass(), "extraFields", null);
        setField(term35314, term35314.getClass(), "unparseableExtra", null);
        setField(term35314, term35314.getClass(), "name", null);
        setField(term35314, term35314.getClass(), "rawName", null);
        setField(term35314, term35314.getClass(), "gpb", null);
        setLongField(term35314, term35314.getClass(), "xdostime", 0L);
        setField(term35314, term35314.getClass(), "mtime", null);
        setField(term35314, term35314.getClass(), "atime", null);
        setField(term35314, term35314.getClass(), "ctime", null);
        setLongField(term35314, term35314.getClass(), "crc", 0L);
        setLongField(term35314, term35314.getClass(), "csize", 0L);
        setIntField(term35314, term35314.getClass(), "flag", 0);
        setField(term35314, term35314.getClass(), "extra", null);
        setField(term35314, term35314.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlatform", argTypes, term35314, args);
    }

};


