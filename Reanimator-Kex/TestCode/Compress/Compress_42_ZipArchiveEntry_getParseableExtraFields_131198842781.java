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

public class ZipArchiveEntry_getParseableExtraFields_131198842781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42749;

    public ZipArchiveEntry_getParseableExtraFields_131198842781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42749 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42749, term42749.getClass(), "method", 0);
        setLongField(term42749, term42749.getClass(), "size", 0L);
        setIntField(term42749, term42749.getClass(), "internalAttributes", 0);
        setIntField(term42749, term42749.getClass(), "versionRequired", 0);
        setIntField(term42749, term42749.getClass(), "versionMadeBy", 0);
        setIntField(term42749, term42749.getClass(), "platform", 0);
        setIntField(term42749, term42749.getClass(), "rawFlag", 0);
        setLongField(term42749, term42749.getClass(), "externalAttributes", 0L);
        setField(term42749, term42749.getClass(), "extraFields", null);
        setField(term42749, term42749.getClass(), "unparseableExtra", null);
        setField(term42749, term42749.getClass(), "name", null);
        setField(term42749, term42749.getClass(), "rawName", null);
        setField(term42749, term42749.getClass(), "gpb", null);
        setLongField(term42749, term42749.getClass(), "xdostime", 0L);
        setField(term42749, term42749.getClass(), "mtime", null);
        setField(term42749, term42749.getClass(), "atime", null);
        setField(term42749, term42749.getClass(), "ctime", null);
        setLongField(term42749, term42749.getClass(), "crc", 0L);
        setLongField(term42749, term42749.getClass(), "csize", 0L);
        setIntField(term42749, term42749.getClass(), "flag", 0);
        setField(term42749, term42749.getClass(), "extra", null);
        setField(term42749, term42749.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParseableExtraFields", argTypes, term42749, args);
    }

};


