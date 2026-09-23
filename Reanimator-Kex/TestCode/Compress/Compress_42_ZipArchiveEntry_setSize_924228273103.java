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
import java.lang.Long;

public class ZipArchiveEntry_setSize_924228273103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43103;
     Object term43119;

    public ZipArchiveEntry_setSize_924228273103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43103 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43103, term43103.getClass(), "method", 0);
        setLongField(term43103, term43103.getClass(), "size", 0L);
        setIntField(term43103, term43103.getClass(), "internalAttributes", 0);
        setIntField(term43103, term43103.getClass(), "versionRequired", 0);
        setIntField(term43103, term43103.getClass(), "versionMadeBy", 0);
        setIntField(term43103, term43103.getClass(), "platform", 0);
        setIntField(term43103, term43103.getClass(), "rawFlag", 0);
        setLongField(term43103, term43103.getClass(), "externalAttributes", 0L);
        setField(term43103, term43103.getClass(), "extraFields", null);
        setField(term43103, term43103.getClass(), "unparseableExtra", null);
        setField(term43103, term43103.getClass(), "name", null);
        setField(term43103, term43103.getClass(), "rawName", null);
        setField(term43103, term43103.getClass(), "gpb", null);
        setLongField(term43103, term43103.getClass(), "xdostime", 0L);
        setField(term43103, term43103.getClass(), "mtime", null);
        setField(term43103, term43103.getClass(), "atime", null);
        setField(term43103, term43103.getClass(), "ctime", null);
        setLongField(term43103, term43103.getClass(), "crc", 0L);
        setLongField(term43103, term43103.getClass(), "csize", 0L);
        setIntField(term43103, term43103.getClass(), "flag", 0);
        setField(term43103, term43103.getClass(), "extra", null);
        setField(term43103, term43103.getClass(), "comment", null);
        term43119 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term43119;
        callMethod(klass, "setSize", argTypes, term43103, args);
    }

};


