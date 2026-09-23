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

public class ZipArchiveEntry_getExternalAttributes_210188321656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35258;

    public ZipArchiveEntry_getExternalAttributes_210188321656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35258 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35258, term35258.getClass(), "method", 0);
        setLongField(term35258, term35258.getClass(), "size", 0L);
        setIntField(term35258, term35258.getClass(), "internalAttributes", 0);
        setIntField(term35258, term35258.getClass(), "platform", 0);
        setLongField(term35258, term35258.getClass(), "externalAttributes", 0L);
        setField(term35258, term35258.getClass(), "extraFields", null);
        setField(term35258, term35258.getClass(), "unparseableExtra", null);
        setField(term35258, term35258.getClass(), "name", null);
        setField(term35258, term35258.getClass(), "rawName", null);
        setField(term35258, term35258.getClass(), "gpb", null);
        setLongField(term35258, term35258.getClass(), "xdostime", 0L);
        setField(term35258, term35258.getClass(), "mtime", null);
        setField(term35258, term35258.getClass(), "atime", null);
        setField(term35258, term35258.getClass(), "ctime", null);
        setLongField(term35258, term35258.getClass(), "crc", 0L);
        setLongField(term35258, term35258.getClass(), "csize", 0L);
        setIntField(term35258, term35258.getClass(), "flag", 0);
        setField(term35258, term35258.getClass(), "extra", null);
        setField(term35258, term35258.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalAttributes", argTypes, term35258, args);
    }

};


