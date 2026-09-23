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

public class ZipArchiveEntry_setExternalAttributes_4598311871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42581;
     Object term42597;

    public ZipArchiveEntry_setExternalAttributes_4598311871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42581 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term42581, term42581.getClass(), "method", 0);
        setLongField(term42581, term42581.getClass(), "size", 0L);
        setIntField(term42581, term42581.getClass(), "internalAttributes", 0);
        setIntField(term42581, term42581.getClass(), "versionRequired", 0);
        setIntField(term42581, term42581.getClass(), "versionMadeBy", 0);
        setIntField(term42581, term42581.getClass(), "platform", 0);
        setIntField(term42581, term42581.getClass(), "rawFlag", 0);
        setLongField(term42581, term42581.getClass(), "externalAttributes", 0L);
        setField(term42581, term42581.getClass(), "extraFields", null);
        setField(term42581, term42581.getClass(), "unparseableExtra", null);
        setField(term42581, term42581.getClass(), "name", null);
        setField(term42581, term42581.getClass(), "rawName", null);
        setField(term42581, term42581.getClass(), "gpb", null);
        setLongField(term42581, term42581.getClass(), "xdostime", 0L);
        setField(term42581, term42581.getClass(), "mtime", null);
        setField(term42581, term42581.getClass(), "atime", null);
        setField(term42581, term42581.getClass(), "ctime", null);
        setLongField(term42581, term42581.getClass(), "crc", 0L);
        setLongField(term42581, term42581.getClass(), "csize", 0L);
        setIntField(term42581, term42581.getClass(), "flag", 0);
        setField(term42581, term42581.getClass(), "extra", null);
        setField(term42581, term42581.getClass(), "comment", null);
        term42597 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term42597;
        callMethod(klass, "setExternalAttributes", argTypes, term42581, args);
    }

};


