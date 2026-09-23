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

public class ZipArchiveEntry_getExternalAttributes_210188321670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42565;

    public ZipArchiveEntry_getExternalAttributes_210188321670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42565 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42565, term42565.getClass(), "method", 0);
        setLongField(term42565, term42565.getClass(), "size", 0L);
        setIntField(term42565, term42565.getClass(), "internalAttributes", 0);
        setIntField(term42565, term42565.getClass(), "versionRequired", 0);
        setIntField(term42565, term42565.getClass(), "versionMadeBy", 0);
        setIntField(term42565, term42565.getClass(), "platform", 0);
        setIntField(term42565, term42565.getClass(), "rawFlag", 0);
        setLongField(term42565, term42565.getClass(), "externalAttributes", 0L);
        setField(term42565, term42565.getClass(), "extraFields", null);
        setField(term42565, term42565.getClass(), "unparseableExtra", null);
        setField(term42565, term42565.getClass(), "name", null);
        setField(term42565, term42565.getClass(), "rawName", null);
        setField(term42565, term42565.getClass(), "gpb", null);
        setLongField(term42565, term42565.getClass(), "xdostime", 0L);
        setField(term42565, term42565.getClass(), "mtime", null);
        setField(term42565, term42565.getClass(), "atime", null);
        setField(term42565, term42565.getClass(), "ctime", null);
        setLongField(term42565, term42565.getClass(), "crc", 0L);
        setLongField(term42565, term42565.getClass(), "csize", 0L);
        setIntField(term42565, term42565.getClass(), "flag", 0);
        setField(term42565, term42565.getClass(), "extra", null);
        setField(term42565, term42565.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalAttributes", argTypes, term42565, args);
    }

};


