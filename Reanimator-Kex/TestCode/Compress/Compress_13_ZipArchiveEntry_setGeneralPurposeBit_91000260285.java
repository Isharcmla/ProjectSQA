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

public class ZipArchiveEntry_setGeneralPurposeBit_91000260285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35645;

    public ZipArchiveEntry_setGeneralPurposeBit_91000260285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35645 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term35645, term35645.getClass(), "method", 0);
        setLongField(term35645, term35645.getClass(), "size", 0L);
        setIntField(term35645, term35645.getClass(), "internalAttributes", 0);
        setIntField(term35645, term35645.getClass(), "platform", 0);
        setLongField(term35645, term35645.getClass(), "externalAttributes", 0L);
        setField(term35645, term35645.getClass(), "extraFields", null);
        setField(term35645, term35645.getClass(), "unparseableExtra", null);
        setField(term35645, term35645.getClass(), "name", null);
        setField(term35645, term35645.getClass(), "rawName", null);
        setField(term35645, term35645.getClass(), "gpb", null);
        setLongField(term35645, term35645.getClass(), "xdostime", 0L);
        setField(term35645, term35645.getClass(), "mtime", null);
        setField(term35645, term35645.getClass(), "atime", null);
        setField(term35645, term35645.getClass(), "ctime", null);
        setLongField(term35645, term35645.getClass(), "crc", 0L);
        setLongField(term35645, term35645.getClass(), "csize", 0L);
        setIntField(term35645, term35645.getClass(), "flag", 0);
        setField(term35645, term35645.getClass(), "extra", null);
        setField(term35645, term35645.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGeneralPurposeBit", argTypes, term35645, args);
    }

};


