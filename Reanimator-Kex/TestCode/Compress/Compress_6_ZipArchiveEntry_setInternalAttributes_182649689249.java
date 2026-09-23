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

public class ZipArchiveEntry_setInternalAttributes_182649689249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31565;
     Object term31577;

    public ZipArchiveEntry_setInternalAttributes_182649689249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31565 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31565, term31565.getClass(), "method", 0);
        setIntField(term31565, term31565.getClass(), "internalAttributes", 0);
        setIntField(term31565, term31565.getClass(), "platform", 0);
        setLongField(term31565, term31565.getClass(), "externalAttributes", 0L);
        setField(term31565, term31565.getClass(), "extraFields", null);
        setField(term31565, term31565.getClass(), "name", null);
        setLongField(term31565, term31565.getClass(), "xdostime", 0L);
        setField(term31565, term31565.getClass(), "mtime", null);
        setField(term31565, term31565.getClass(), "atime", null);
        setField(term31565, term31565.getClass(), "ctime", null);
        setLongField(term31565, term31565.getClass(), "crc", 0L);
        setLongField(term31565, term31565.getClass(), "size", 0L);
        setLongField(term31565, term31565.getClass(), "csize", 0L);
        setIntField(term31565, term31565.getClass(), "flag", 0);
        setField(term31565, term31565.getClass(), "extra", null);
        setField(term31565, term31565.getClass(), "comment", null);
        term31577 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31577;
        callMethod(klass, "setInternalAttributes", argTypes, term31565, args);
    }

};


