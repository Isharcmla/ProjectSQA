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

public class ZipArchiveEntry_setPlatform_149379641360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34052;
     Object term34065;

    public ZipArchiveEntry_setPlatform_149379641360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34052 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term34052, term34052.getClass(), "method", 0);
        setLongField(term34052, term34052.getClass(), "size", 0L);
        setIntField(term34052, term34052.getClass(), "internalAttributes", 0);
        setIntField(term34052, term34052.getClass(), "platform", 0);
        setLongField(term34052, term34052.getClass(), "externalAttributes", 0L);
        setField(term34052, term34052.getClass(), "extraFields", null);
        setField(term34052, term34052.getClass(), "unparseableExtra", null);
        setField(term34052, term34052.getClass(), "name", null);
        setField(term34052, term34052.getClass(), "rawName", null);
        setField(term34052, term34052.getClass(), "gpb", null);
        setLongField(term34052, term34052.getClass(), "xdostime", 0L);
        setField(term34052, term34052.getClass(), "mtime", null);
        setField(term34052, term34052.getClass(), "atime", null);
        setField(term34052, term34052.getClass(), "ctime", null);
        setLongField(term34052, term34052.getClass(), "crc", 0L);
        setLongField(term34052, term34052.getClass(), "csize", 0L);
        setIntField(term34052, term34052.getClass(), "flag", 0);
        setField(term34052, term34052.getClass(), "extra", null);
        setField(term34052, term34052.getClass(), "comment", null);
        term34065 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term34065;
        callMethod(klass, "setPlatform", argTypes, term34052, args);
    }

};


