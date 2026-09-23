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

public class ZipArchiveEntry_setInternalAttributes_182649689269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42547;
     Object term42563;

    public ZipArchiveEntry_setInternalAttributes_182649689269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42547 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42547, term42547.getClass(), "method", 0);
        setLongField(term42547, term42547.getClass(), "size", 0L);
        setIntField(term42547, term42547.getClass(), "internalAttributes", 0);
        setIntField(term42547, term42547.getClass(), "versionRequired", 0);
        setIntField(term42547, term42547.getClass(), "versionMadeBy", 0);
        setIntField(term42547, term42547.getClass(), "platform", 0);
        setIntField(term42547, term42547.getClass(), "rawFlag", 0);
        setLongField(term42547, term42547.getClass(), "externalAttributes", 0L);
        setField(term42547, term42547.getClass(), "extraFields", null);
        setField(term42547, term42547.getClass(), "unparseableExtra", null);
        setField(term42547, term42547.getClass(), "name", null);
        setField(term42547, term42547.getClass(), "rawName", null);
        setField(term42547, term42547.getClass(), "gpb", null);
        setLongField(term42547, term42547.getClass(), "xdostime", 0L);
        setField(term42547, term42547.getClass(), "mtime", null);
        setField(term42547, term42547.getClass(), "atime", null);
        setField(term42547, term42547.getClass(), "ctime", null);
        setLongField(term42547, term42547.getClass(), "crc", 0L);
        setLongField(term42547, term42547.getClass(), "csize", 0L);
        setIntField(term42547, term42547.getClass(), "flag", 0);
        setField(term42547, term42547.getClass(), "extra", null);
        setField(term42547, term42547.getClass(), "comment", null);
        term42563 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42563;
        callMethod(klass, "setInternalAttributes", argTypes, term42547, args);
    }

};


