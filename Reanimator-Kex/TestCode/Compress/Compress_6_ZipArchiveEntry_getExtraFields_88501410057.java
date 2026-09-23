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

public class ZipArchiveEntry_getExtraFields_88501410057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31669;

    public ZipArchiveEntry_getExtraFields_88501410057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31669 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31669, term31669.getClass(), "method", 0);
        setIntField(term31669, term31669.getClass(), "internalAttributes", 0);
        setIntField(term31669, term31669.getClass(), "platform", 0);
        setLongField(term31669, term31669.getClass(), "externalAttributes", 0L);
        setField(term31669, term31669.getClass(), "extraFields", null);
        setField(term31669, term31669.getClass(), "name", null);
        setLongField(term31669, term31669.getClass(), "xdostime", 0L);
        setField(term31669, term31669.getClass(), "mtime", null);
        setField(term31669, term31669.getClass(), "atime", null);
        setField(term31669, term31669.getClass(), "ctime", null);
        setLongField(term31669, term31669.getClass(), "crc", 0L);
        setLongField(term31669, term31669.getClass(), "size", 0L);
        setLongField(term31669, term31669.getClass(), "csize", 0L);
        setIntField(term31669, term31669.getClass(), "flag", 0);
        setField(term31669, term31669.getClass(), "extra", null);
        setField(term31669, term31669.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFields", argTypes, term31669, args);
    }

};


