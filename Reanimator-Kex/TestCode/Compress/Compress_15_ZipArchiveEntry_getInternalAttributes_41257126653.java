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

public class ZipArchiveEntry_getInternalAttributes_41257126653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33955;

    public ZipArchiveEntry_getInternalAttributes_41257126653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33955 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term33955, term33955.getClass(), "method", 0);
        setLongField(term33955, term33955.getClass(), "size", 0L);
        setIntField(term33955, term33955.getClass(), "internalAttributes", 0);
        setIntField(term33955, term33955.getClass(), "platform", 0);
        setLongField(term33955, term33955.getClass(), "externalAttributes", 0L);
        setField(term33955, term33955.getClass(), "extraFields", null);
        setField(term33955, term33955.getClass(), "unparseableExtra", null);
        setField(term33955, term33955.getClass(), "name", null);
        setField(term33955, term33955.getClass(), "rawName", null);
        setField(term33955, term33955.getClass(), "gpb", null);
        setLongField(term33955, term33955.getClass(), "xdostime", 0L);
        setField(term33955, term33955.getClass(), "mtime", null);
        setField(term33955, term33955.getClass(), "atime", null);
        setField(term33955, term33955.getClass(), "ctime", null);
        setLongField(term33955, term33955.getClass(), "crc", 0L);
        setLongField(term33955, term33955.getClass(), "csize", 0L);
        setIntField(term33955, term33955.getClass(), "flag", 0);
        setField(term33955, term33955.getClass(), "extra", null);
        setField(term33955, term33955.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalAttributes", argTypes, term33955, args);
    }

};


