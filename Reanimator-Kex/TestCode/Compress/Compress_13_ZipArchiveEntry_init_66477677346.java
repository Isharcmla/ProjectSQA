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
import java.lang.Object;

public class ZipArchiveEntry_init_66477677346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipArchiveEntry_init_66477677346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31977 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        Object term32117 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        Object term32241 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        setLongField(term31977, term31977.getClass(), "xdostime", 0L);
        setLongField(term31977, term31977.getClass(), "crc", 0L);
        setLongField(term31977, term31977.getClass(), "size", 0L);
        setLongField(term31977, term31977.getClass(), "csize", 0L);
        setIntField(term31977, term31977.getClass(), "method", 0);
        setIntField(term31977, term31977.getClass(), "flag", 0);
        setField(term31977, term31977.getClass(), "name", null);
        setIntField(term31977, term31977.getClass(), "internalAttributes", 0);
        setIntField(term31977, term31977.getClass(), "platform", 0);
        setLongField(term31977, term31977.getClass(), "externalAttributes", 0L);
        setField(term31977, term31977.getClass(), "extraFields", null);
        setField(term31977, term31977.getClass(), "unparseableExtra", term32117);
        setField(term31977, term31977.getClass(), "rawName", null);
        setField(term31977, term31977.getClass(), "gpb", term32241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


