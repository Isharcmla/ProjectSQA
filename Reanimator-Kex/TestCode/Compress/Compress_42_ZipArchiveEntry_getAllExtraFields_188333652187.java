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

public class ZipArchiveEntry_getAllExtraFields_188333652187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42847;

    public ZipArchiveEntry_getAllExtraFields_188333652187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42847 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42847, term42847.getClass(), "method", 0);
        setLongField(term42847, term42847.getClass(), "size", 0L);
        setIntField(term42847, term42847.getClass(), "internalAttributes", 0);
        setIntField(term42847, term42847.getClass(), "versionRequired", 0);
        setIntField(term42847, term42847.getClass(), "versionMadeBy", 0);
        setIntField(term42847, term42847.getClass(), "platform", 0);
        setIntField(term42847, term42847.getClass(), "rawFlag", 0);
        setLongField(term42847, term42847.getClass(), "externalAttributes", 0L);
        setField(term42847, term42847.getClass(), "extraFields", null);
        setField(term42847, term42847.getClass(), "unparseableExtra", null);
        setField(term42847, term42847.getClass(), "name", null);
        setField(term42847, term42847.getClass(), "rawName", null);
        setField(term42847, term42847.getClass(), "gpb", null);
        setLongField(term42847, term42847.getClass(), "xdostime", 0L);
        setField(term42847, term42847.getClass(), "mtime", null);
        setField(term42847, term42847.getClass(), "atime", null);
        setField(term42847, term42847.getClass(), "ctime", null);
        setLongField(term42847, term42847.getClass(), "crc", 0L);
        setLongField(term42847, term42847.getClass(), "csize", 0L);
        setIntField(term42847, term42847.getClass(), "flag", 0);
        setField(term42847, term42847.getClass(), "extra", null);
        setField(term42847, term42847.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllExtraFields", argTypes, term42847, args);
    }

};


