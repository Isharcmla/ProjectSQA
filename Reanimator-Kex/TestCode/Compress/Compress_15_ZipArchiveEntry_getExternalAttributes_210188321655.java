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

public class ZipArchiveEntry_getExternalAttributes_210188321655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33983;

    public ZipArchiveEntry_getExternalAttributes_210188321655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33983 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term33983, term33983.getClass(), "method", 0);
        setLongField(term33983, term33983.getClass(), "size", 0L);
        setIntField(term33983, term33983.getClass(), "internalAttributes", 0);
        setIntField(term33983, term33983.getClass(), "platform", 0);
        setLongField(term33983, term33983.getClass(), "externalAttributes", 0L);
        setField(term33983, term33983.getClass(), "extraFields", null);
        setField(term33983, term33983.getClass(), "unparseableExtra", null);
        setField(term33983, term33983.getClass(), "name", null);
        setField(term33983, term33983.getClass(), "rawName", null);
        setField(term33983, term33983.getClass(), "gpb", null);
        setLongField(term33983, term33983.getClass(), "xdostime", 0L);
        setField(term33983, term33983.getClass(), "mtime", null);
        setField(term33983, term33983.getClass(), "atime", null);
        setField(term33983, term33983.getClass(), "ctime", null);
        setLongField(term33983, term33983.getClass(), "crc", 0L);
        setLongField(term33983, term33983.getClass(), "csize", 0L);
        setIntField(term33983, term33983.getClass(), "flag", 0);
        setField(term33983, term33983.getClass(), "extra", null);
        setField(term33983, term33983.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalAttributes", argTypes, term33983, args);
    }

};


