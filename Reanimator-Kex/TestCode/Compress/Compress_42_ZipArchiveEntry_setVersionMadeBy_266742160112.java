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

public class ZipArchiveEntry_setVersionMadeBy_266742160112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43251;
     Object term43267;

    public ZipArchiveEntry_setVersionMadeBy_266742160112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43251 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43251, term43251.getClass(), "method", 0);
        setLongField(term43251, term43251.getClass(), "size", 0L);
        setIntField(term43251, term43251.getClass(), "internalAttributes", 0);
        setIntField(term43251, term43251.getClass(), "versionRequired", 0);
        setIntField(term43251, term43251.getClass(), "versionMadeBy", 0);
        setIntField(term43251, term43251.getClass(), "platform", 0);
        setIntField(term43251, term43251.getClass(), "rawFlag", 0);
        setLongField(term43251, term43251.getClass(), "externalAttributes", 0L);
        setField(term43251, term43251.getClass(), "extraFields", null);
        setField(term43251, term43251.getClass(), "unparseableExtra", null);
        setField(term43251, term43251.getClass(), "name", null);
        setField(term43251, term43251.getClass(), "rawName", null);
        setField(term43251, term43251.getClass(), "gpb", null);
        setLongField(term43251, term43251.getClass(), "xdostime", 0L);
        setField(term43251, term43251.getClass(), "mtime", null);
        setField(term43251, term43251.getClass(), "atime", null);
        setField(term43251, term43251.getClass(), "ctime", null);
        setLongField(term43251, term43251.getClass(), "crc", 0L);
        setLongField(term43251, term43251.getClass(), "csize", 0L);
        setIntField(term43251, term43251.getClass(), "flag", 0);
        setField(term43251, term43251.getClass(), "extra", null);
        setField(term43251, term43251.getClass(), "comment", null);
        term43267 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43267;
        callMethod(klass, "setVersionMadeBy", argTypes, term43251, args);
    }

};


