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
import java.util.LinkedHashMap;

public class ZipArchiveEntry_init_167302033540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26016;

    public ZipArchiveEntry_init_167302033540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term25986 = new LinkedHashMap();
        Object term25888 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setLongField(term25888, term25888.getClass(), "xdostime", 0L);
        setLongField(term25888, term25888.getClass(), "crc", 0L);
        setLongField(term25888, term25888.getClass(), "size", 0L);
        setLongField(term25888, term25888.getClass(), "csize", 0L);
        setIntField(term25888, term25888.getClass(), "method", 0);
        setIntField(term25888, term25888.getClass(), "flag", 0);
        setField(term25888, term25888.getClass(), "name", "");
        setIntField(term25888, term25888.getClass(), "internalAttributes", 0);
        setIntField(term25888, term25888.getClass(), "platform", 0);
        setLongField(term25888, term25888.getClass(), "externalAttributes", 0L);
        setField(term25888, term25888.getClass(), "extraFields", term25986);
        term26016 = newInstance(Class.forName("java.io.File"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term26016;
        args[1] = "";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


