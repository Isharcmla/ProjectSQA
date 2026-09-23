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
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class ZipArchiveEntry_init_66477677335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21417;

    public ZipArchiveEntry_init_66477677335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21417 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term21417, term21417.getClass(), "method", -1);
        setIntField(term21417, term21417.getClass(), "internalAttributes", 0);
        setIntField(term21417, term21417.getClass(), "platform", 0);
        setLongField(term21417, term21417.getClass(), "externalAttributes", 0L);
        setField(term21417, term21417.getClass(), "extraFields", null);
        setField(term21417, term21417.getClass(), "name", "PAEBtnZtTD");
        setLongField(term21417, term21417.getClass(), "xdostime", -1L);
        setField(term21417, term21417.getClass(), "mtime", null);
        setField(term21417, term21417.getClass(), "atime", null);
        setField(term21417, term21417.getClass(), "ctime", null);
        setLongField(term21417, term21417.getClass(), "crc", -1L);
        setLongField(term21417, term21417.getClass(), "size", -1L);
        setLongField(term21417, term21417.getClass(), "csize", -1L);
        setIntField(term21417, term21417.getClass(), "flag", 0);
        setField(term21417, term21417.getClass(), "extra", null);
        setField(term21417, term21417.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21417));
    }

};


