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

public class ZipArchiveEntry_getLocalFileDataExtra_2094040597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43007;

    public ZipArchiveEntry_getLocalFileDataExtra_2094040597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43007 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43007, term43007.getClass(), "method", 0);
        setLongField(term43007, term43007.getClass(), "size", 0L);
        setIntField(term43007, term43007.getClass(), "internalAttributes", 0);
        setIntField(term43007, term43007.getClass(), "versionRequired", 0);
        setIntField(term43007, term43007.getClass(), "versionMadeBy", 0);
        setIntField(term43007, term43007.getClass(), "platform", 0);
        setIntField(term43007, term43007.getClass(), "rawFlag", 0);
        setLongField(term43007, term43007.getClass(), "externalAttributes", 0L);
        setField(term43007, term43007.getClass(), "extraFields", null);
        setField(term43007, term43007.getClass(), "unparseableExtra", null);
        setField(term43007, term43007.getClass(), "name", null);
        setField(term43007, term43007.getClass(), "rawName", null);
        setField(term43007, term43007.getClass(), "gpb", null);
        setLongField(term43007, term43007.getClass(), "xdostime", 0L);
        setField(term43007, term43007.getClass(), "mtime", null);
        setField(term43007, term43007.getClass(), "atime", null);
        setField(term43007, term43007.getClass(), "ctime", null);
        setLongField(term43007, term43007.getClass(), "crc", 0L);
        setLongField(term43007, term43007.getClass(), "csize", 0L);
        setIntField(term43007, term43007.getClass(), "flag", 0);
        setField(term43007, term43007.getClass(), "extra", null);
        setField(term43007, term43007.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalFileDataExtra", argTypes, term43007, args);
    }

};


