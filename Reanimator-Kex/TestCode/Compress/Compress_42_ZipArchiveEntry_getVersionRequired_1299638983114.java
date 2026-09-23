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

public class ZipArchiveEntry_getVersionRequired_1299638983114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43287;

    public ZipArchiveEntry_getVersionRequired_1299638983114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43287 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43287, term43287.getClass(), "method", 0);
        setLongField(term43287, term43287.getClass(), "size", 0L);
        setIntField(term43287, term43287.getClass(), "internalAttributes", 0);
        setIntField(term43287, term43287.getClass(), "versionRequired", 0);
        setIntField(term43287, term43287.getClass(), "versionMadeBy", 0);
        setIntField(term43287, term43287.getClass(), "platform", 0);
        setIntField(term43287, term43287.getClass(), "rawFlag", 0);
        setLongField(term43287, term43287.getClass(), "externalAttributes", 0L);
        setField(term43287, term43287.getClass(), "extraFields", null);
        setField(term43287, term43287.getClass(), "unparseableExtra", null);
        setField(term43287, term43287.getClass(), "name", null);
        setField(term43287, term43287.getClass(), "rawName", null);
        setField(term43287, term43287.getClass(), "gpb", null);
        setLongField(term43287, term43287.getClass(), "xdostime", 0L);
        setField(term43287, term43287.getClass(), "mtime", null);
        setField(term43287, term43287.getClass(), "atime", null);
        setField(term43287, term43287.getClass(), "ctime", null);
        setLongField(term43287, term43287.getClass(), "crc", 0L);
        setLongField(term43287, term43287.getClass(), "csize", 0L);
        setIntField(term43287, term43287.getClass(), "flag", 0);
        setField(term43287, term43287.getClass(), "extra", null);
        setField(term43287, term43287.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionRequired", argTypes, term43287, args);
    }

};


