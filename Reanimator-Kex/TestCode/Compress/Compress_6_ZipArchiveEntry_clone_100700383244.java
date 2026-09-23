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

public class ZipArchiveEntry_clone_100700383244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31503;

    public ZipArchiveEntry_clone_100700383244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31503 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31503, term31503.getClass(), "method", 0);
        setIntField(term31503, term31503.getClass(), "internalAttributes", 0);
        setIntField(term31503, term31503.getClass(), "platform", 0);
        setLongField(term31503, term31503.getClass(), "externalAttributes", 0L);
        setField(term31503, term31503.getClass(), "extraFields", null);
        setField(term31503, term31503.getClass(), "name", null);
        setLongField(term31503, term31503.getClass(), "xdostime", 0L);
        setField(term31503, term31503.getClass(), "mtime", null);
        setField(term31503, term31503.getClass(), "atime", null);
        setField(term31503, term31503.getClass(), "ctime", null);
        setLongField(term31503, term31503.getClass(), "crc", 0L);
        setLongField(term31503, term31503.getClass(), "size", 0L);
        setLongField(term31503, term31503.getClass(), "csize", 0L);
        setIntField(term31503, term31503.getClass(), "flag", 0);
        setField(term31503, term31503.getClass(), "extra", null);
        setField(term31503, term31503.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term31503, args);
    }

};


