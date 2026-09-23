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

public class ZipArchiveEntry_clone_100700383265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42481;

    public ZipArchiveEntry_clone_100700383265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42481 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42481, term42481.getClass(), "method", 0);
        setLongField(term42481, term42481.getClass(), "size", 0L);
        setIntField(term42481, term42481.getClass(), "internalAttributes", 0);
        setIntField(term42481, term42481.getClass(), "versionRequired", 0);
        setIntField(term42481, term42481.getClass(), "versionMadeBy", 0);
        setIntField(term42481, term42481.getClass(), "platform", 0);
        setIntField(term42481, term42481.getClass(), "rawFlag", 0);
        setLongField(term42481, term42481.getClass(), "externalAttributes", 0L);
        setField(term42481, term42481.getClass(), "extraFields", null);
        setField(term42481, term42481.getClass(), "unparseableExtra", null);
        setField(term42481, term42481.getClass(), "name", null);
        setField(term42481, term42481.getClass(), "rawName", null);
        setField(term42481, term42481.getClass(), "gpb", null);
        setLongField(term42481, term42481.getClass(), "xdostime", 0L);
        setField(term42481, term42481.getClass(), "mtime", null);
        setField(term42481, term42481.getClass(), "atime", null);
        setField(term42481, term42481.getClass(), "ctime", null);
        setLongField(term42481, term42481.getClass(), "crc", 0L);
        setLongField(term42481, term42481.getClass(), "csize", 0L);
        setIntField(term42481, term42481.getClass(), "flag", 0);
        setField(term42481, term42481.getClass(), "extra", null);
        setField(term42481, term42481.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term42481, args);
    }

};


