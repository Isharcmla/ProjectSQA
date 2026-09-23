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

public class ZipArchiveEntry_getVersionMadeBy_656918746115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43303;

    public ZipArchiveEntry_getVersionMadeBy_656918746115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43303, term43303.getClass(), "method", 0);
        setLongField(term43303, term43303.getClass(), "size", 0L);
        setIntField(term43303, term43303.getClass(), "internalAttributes", 0);
        setIntField(term43303, term43303.getClass(), "versionRequired", 0);
        setIntField(term43303, term43303.getClass(), "versionMadeBy", 0);
        setIntField(term43303, term43303.getClass(), "platform", 0);
        setIntField(term43303, term43303.getClass(), "rawFlag", 0);
        setLongField(term43303, term43303.getClass(), "externalAttributes", 0L);
        setField(term43303, term43303.getClass(), "extraFields", null);
        setField(term43303, term43303.getClass(), "unparseableExtra", null);
        setField(term43303, term43303.getClass(), "name", null);
        setField(term43303, term43303.getClass(), "rawName", null);
        setField(term43303, term43303.getClass(), "gpb", null);
        setLongField(term43303, term43303.getClass(), "xdostime", 0L);
        setField(term43303, term43303.getClass(), "mtime", null);
        setField(term43303, term43303.getClass(), "atime", null);
        setField(term43303, term43303.getClass(), "ctime", null);
        setLongField(term43303, term43303.getClass(), "crc", 0L);
        setLongField(term43303, term43303.getClass(), "csize", 0L);
        setIntField(term43303, term43303.getClass(), "flag", 0);
        setField(term43303, term43303.getClass(), "extra", null);
        setField(term43303, term43303.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionMadeBy", argTypes, term43303, args);
    }

};


