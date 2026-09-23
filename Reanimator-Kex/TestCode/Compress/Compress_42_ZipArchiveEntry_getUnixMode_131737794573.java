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

public class ZipArchiveEntry_getUnixMode_131737794573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42617;

    public ZipArchiveEntry_getUnixMode_131737794573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42617 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42617, term42617.getClass(), "method", 0);
        setLongField(term42617, term42617.getClass(), "size", 0L);
        setIntField(term42617, term42617.getClass(), "internalAttributes", 0);
        setIntField(term42617, term42617.getClass(), "versionRequired", 0);
        setIntField(term42617, term42617.getClass(), "versionMadeBy", 0);
        setIntField(term42617, term42617.getClass(), "platform", 0);
        setIntField(term42617, term42617.getClass(), "rawFlag", 0);
        setLongField(term42617, term42617.getClass(), "externalAttributes", 0L);
        setField(term42617, term42617.getClass(), "extraFields", null);
        setField(term42617, term42617.getClass(), "unparseableExtra", null);
        setField(term42617, term42617.getClass(), "name", null);
        setField(term42617, term42617.getClass(), "rawName", null);
        setField(term42617, term42617.getClass(), "gpb", null);
        setLongField(term42617, term42617.getClass(), "xdostime", 0L);
        setField(term42617, term42617.getClass(), "mtime", null);
        setField(term42617, term42617.getClass(), "atime", null);
        setField(term42617, term42617.getClass(), "ctime", null);
        setLongField(term42617, term42617.getClass(), "crc", 0L);
        setLongField(term42617, term42617.getClass(), "csize", 0L);
        setIntField(term42617, term42617.getClass(), "flag", 0);
        setField(term42617, term42617.getClass(), "extra", null);
        setField(term42617, term42617.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnixMode", argTypes, term42617, args);
    }

};


