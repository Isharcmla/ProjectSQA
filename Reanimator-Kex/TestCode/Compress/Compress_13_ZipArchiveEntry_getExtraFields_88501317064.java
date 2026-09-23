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
import java.lang.Boolean;

public class ZipArchiveEntry_getExtraFields_88501317064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35368;
     Object term35381;

    public ZipArchiveEntry_getExtraFields_88501317064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35368 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35368, term35368.getClass(), "method", 0);
        setLongField(term35368, term35368.getClass(), "size", 0L);
        setIntField(term35368, term35368.getClass(), "internalAttributes", 0);
        setIntField(term35368, term35368.getClass(), "platform", 0);
        setLongField(term35368, term35368.getClass(), "externalAttributes", 0L);
        setField(term35368, term35368.getClass(), "extraFields", null);
        setField(term35368, term35368.getClass(), "unparseableExtra", null);
        setField(term35368, term35368.getClass(), "name", null);
        setField(term35368, term35368.getClass(), "rawName", null);
        setField(term35368, term35368.getClass(), "gpb", null);
        setLongField(term35368, term35368.getClass(), "xdostime", 0L);
        setField(term35368, term35368.getClass(), "mtime", null);
        setField(term35368, term35368.getClass(), "atime", null);
        setField(term35368, term35368.getClass(), "ctime", null);
        setLongField(term35368, term35368.getClass(), "crc", 0L);
        setLongField(term35368, term35368.getClass(), "csize", 0L);
        setIntField(term35368, term35368.getClass(), "flag", 0);
        setField(term35368, term35368.getClass(), "extra", null);
        setField(term35368, term35368.getClass(), "comment", null);
        term35381 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term35381;
        callMethod(klass, "getExtraFields", argTypes, term35368, args);
    }

};


