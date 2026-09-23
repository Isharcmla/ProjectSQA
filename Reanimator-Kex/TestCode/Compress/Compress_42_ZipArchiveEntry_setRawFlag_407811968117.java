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

public class ZipArchiveEntry_setRawFlag_407811968117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43335;
     Object term43351;

    public ZipArchiveEntry_setRawFlag_407811968117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43335 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43335, term43335.getClass(), "method", 0);
        setLongField(term43335, term43335.getClass(), "size", 0L);
        setIntField(term43335, term43335.getClass(), "internalAttributes", 0);
        setIntField(term43335, term43335.getClass(), "versionRequired", 0);
        setIntField(term43335, term43335.getClass(), "versionMadeBy", 0);
        setIntField(term43335, term43335.getClass(), "platform", 0);
        setIntField(term43335, term43335.getClass(), "rawFlag", 0);
        setLongField(term43335, term43335.getClass(), "externalAttributes", 0L);
        setField(term43335, term43335.getClass(), "extraFields", null);
        setField(term43335, term43335.getClass(), "unparseableExtra", null);
        setField(term43335, term43335.getClass(), "name", null);
        setField(term43335, term43335.getClass(), "rawName", null);
        setField(term43335, term43335.getClass(), "gpb", null);
        setLongField(term43335, term43335.getClass(), "xdostime", 0L);
        setField(term43335, term43335.getClass(), "mtime", null);
        setField(term43335, term43335.getClass(), "atime", null);
        setField(term43335, term43335.getClass(), "ctime", null);
        setLongField(term43335, term43335.getClass(), "crc", 0L);
        setLongField(term43335, term43335.getClass(), "csize", 0L);
        setIntField(term43335, term43335.getClass(), "flag", 0);
        setField(term43335, term43335.getClass(), "extra", null);
        setField(term43335, term43335.getClass(), "comment", null);
        term43351 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43351;
        callMethod(klass, "setRawFlag", argTypes, term43335, args);
    }

};


