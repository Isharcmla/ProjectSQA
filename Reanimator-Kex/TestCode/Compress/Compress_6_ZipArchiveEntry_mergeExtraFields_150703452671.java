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

public class ZipArchiveEntry_mergeExtraFields_150703452671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31837;
     Object term31849;

    public ZipArchiveEntry_mergeExtraFields_150703452671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31837 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31837, term31837.getClass(), "method", 0);
        setIntField(term31837, term31837.getClass(), "internalAttributes", 0);
        setIntField(term31837, term31837.getClass(), "platform", 0);
        setLongField(term31837, term31837.getClass(), "externalAttributes", 0L);
        setField(term31837, term31837.getClass(), "extraFields", null);
        setField(term31837, term31837.getClass(), "name", null);
        setLongField(term31837, term31837.getClass(), "xdostime", 0L);
        setField(term31837, term31837.getClass(), "mtime", null);
        setField(term31837, term31837.getClass(), "atime", null);
        setField(term31837, term31837.getClass(), "ctime", null);
        setLongField(term31837, term31837.getClass(), "crc", 0L);
        setLongField(term31837, term31837.getClass(), "size", 0L);
        setLongField(term31837, term31837.getClass(), "csize", 0L);
        setIntField(term31837, term31837.getClass(), "flag", 0);
        setField(term31837, term31837.getClass(), "extra", null);
        setField(term31837, term31837.getClass(), "comment", null);
        term31849 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31849;
        callMethod(klass, "mergeExtraFields", argTypes, term31837, args);
    }

};


