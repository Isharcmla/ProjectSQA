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

public class ZipArchiveEntry_setMethod_189085060947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31539;
     Object term31551;

    public ZipArchiveEntry_setMethod_189085060947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31539 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31539, term31539.getClass(), "method", 0);
        setIntField(term31539, term31539.getClass(), "internalAttributes", 0);
        setIntField(term31539, term31539.getClass(), "platform", 0);
        setLongField(term31539, term31539.getClass(), "externalAttributes", 0L);
        setField(term31539, term31539.getClass(), "extraFields", null);
        setField(term31539, term31539.getClass(), "name", null);
        setLongField(term31539, term31539.getClass(), "xdostime", 0L);
        setField(term31539, term31539.getClass(), "mtime", null);
        setField(term31539, term31539.getClass(), "atime", null);
        setField(term31539, term31539.getClass(), "ctime", null);
        setLongField(term31539, term31539.getClass(), "crc", 0L);
        setLongField(term31539, term31539.getClass(), "size", 0L);
        setLongField(term31539, term31539.getClass(), "csize", 0L);
        setIntField(term31539, term31539.getClass(), "flag", 0);
        setField(term31539, term31539.getClass(), "extra", null);
        setField(term31539, term31539.getClass(), "comment", null);
        term31551 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31551;
        callMethod(klass, "setMethod", argTypes, term31539, args);
    }

};


