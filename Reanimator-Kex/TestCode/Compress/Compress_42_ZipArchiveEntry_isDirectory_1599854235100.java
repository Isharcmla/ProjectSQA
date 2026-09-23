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

public class ZipArchiveEntry_isDirectory_1599854235100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43055;

    public ZipArchiveEntry_isDirectory_1599854235100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43055 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43055, term43055.getClass(), "method", 0);
        setLongField(term43055, term43055.getClass(), "size", 0L);
        setIntField(term43055, term43055.getClass(), "internalAttributes", 0);
        setIntField(term43055, term43055.getClass(), "versionRequired", 0);
        setIntField(term43055, term43055.getClass(), "versionMadeBy", 0);
        setIntField(term43055, term43055.getClass(), "platform", 0);
        setIntField(term43055, term43055.getClass(), "rawFlag", 0);
        setLongField(term43055, term43055.getClass(), "externalAttributes", 0L);
        setField(term43055, term43055.getClass(), "extraFields", null);
        setField(term43055, term43055.getClass(), "unparseableExtra", null);
        setField(term43055, term43055.getClass(), "name", null);
        setField(term43055, term43055.getClass(), "rawName", null);
        setField(term43055, term43055.getClass(), "gpb", null);
        setLongField(term43055, term43055.getClass(), "xdostime", 0L);
        setField(term43055, term43055.getClass(), "mtime", null);
        setField(term43055, term43055.getClass(), "atime", null);
        setField(term43055, term43055.getClass(), "ctime", null);
        setLongField(term43055, term43055.getClass(), "crc", 0L);
        setLongField(term43055, term43055.getClass(), "csize", 0L);
        setIntField(term43055, term43055.getClass(), "flag", 0);
        setField(term43055, term43055.getClass(), "extra", null);
        setField(term43055, term43055.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term43055, args);
    }

};


