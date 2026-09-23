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

public class ZipArchiveEntry_copyOf_36784140284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42797;
     Object term42813;

    public ZipArchiveEntry_copyOf_36784140284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42797 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42797, term42797.getClass(), "method", 0);
        setLongField(term42797, term42797.getClass(), "size", 0L);
        setIntField(term42797, term42797.getClass(), "internalAttributes", 0);
        setIntField(term42797, term42797.getClass(), "versionRequired", 0);
        setIntField(term42797, term42797.getClass(), "versionMadeBy", 0);
        setIntField(term42797, term42797.getClass(), "platform", 0);
        setIntField(term42797, term42797.getClass(), "rawFlag", 0);
        setLongField(term42797, term42797.getClass(), "externalAttributes", 0L);
        setField(term42797, term42797.getClass(), "extraFields", null);
        setField(term42797, term42797.getClass(), "unparseableExtra", null);
        setField(term42797, term42797.getClass(), "name", null);
        setField(term42797, term42797.getClass(), "rawName", null);
        setField(term42797, term42797.getClass(), "gpb", null);
        setLongField(term42797, term42797.getClass(), "xdostime", 0L);
        setField(term42797, term42797.getClass(), "mtime", null);
        setField(term42797, term42797.getClass(), "atime", null);
        setField(term42797, term42797.getClass(), "ctime", null);
        setLongField(term42797, term42797.getClass(), "crc", 0L);
        setLongField(term42797, term42797.getClass(), "csize", 0L);
        setIntField(term42797, term42797.getClass(), "flag", 0);
        setField(term42797, term42797.getClass(), "extra", null);
        setField(term42797, term42797.getClass(), "comment", null);
        term42813 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term42813;
        callMethod(klass, "copyOf", argTypes, term42797, args);
    }

};


