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
import java.lang.Boolean;

public class ZipArchiveEntry_mergeExtraFields_1507034526109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43201;
     Object term43217;

    public ZipArchiveEntry_mergeExtraFields_1507034526109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43201 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43201, term43201.getClass(), "method", 0);
        setLongField(term43201, term43201.getClass(), "size", 0L);
        setIntField(term43201, term43201.getClass(), "internalAttributes", 0);
        setIntField(term43201, term43201.getClass(), "versionRequired", 0);
        setIntField(term43201, term43201.getClass(), "versionMadeBy", 0);
        setIntField(term43201, term43201.getClass(), "platform", 0);
        setIntField(term43201, term43201.getClass(), "rawFlag", 0);
        setLongField(term43201, term43201.getClass(), "externalAttributes", 0L);
        setField(term43201, term43201.getClass(), "extraFields", null);
        setField(term43201, term43201.getClass(), "unparseableExtra", null);
        setField(term43201, term43201.getClass(), "name", null);
        setField(term43201, term43201.getClass(), "rawName", null);
        setField(term43201, term43201.getClass(), "gpb", null);
        setLongField(term43201, term43201.getClass(), "xdostime", 0L);
        setField(term43201, term43201.getClass(), "mtime", null);
        setField(term43201, term43201.getClass(), "atime", null);
        setField(term43201, term43201.getClass(), "ctime", null);
        setLongField(term43201, term43201.getClass(), "crc", 0L);
        setLongField(term43201, term43201.getClass(), "csize", 0L);
        setIntField(term43201, term43201.getClass(), "flag", 0);
        setField(term43201, term43201.getClass(), "extra", null);
        setField(term43201, term43201.getClass(), "comment", null);
        term43217 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43217;
        callMethod(klass, "mergeExtraFields", argTypes, term43201, args);
    }

};


