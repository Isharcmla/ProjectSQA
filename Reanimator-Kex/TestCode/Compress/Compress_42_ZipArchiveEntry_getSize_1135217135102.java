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

public class ZipArchiveEntry_getSize_1135217135102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43087;

    public ZipArchiveEntry_getSize_1135217135102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43087 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term43087, term43087.getClass(), "method", 0);
        setLongField(term43087, term43087.getClass(), "size", 0L);
        setIntField(term43087, term43087.getClass(), "internalAttributes", 0);
        setIntField(term43087, term43087.getClass(), "versionRequired", 0);
        setIntField(term43087, term43087.getClass(), "versionMadeBy", 0);
        setIntField(term43087, term43087.getClass(), "platform", 0);
        setIntField(term43087, term43087.getClass(), "rawFlag", 0);
        setLongField(term43087, term43087.getClass(), "externalAttributes", 0L);
        setField(term43087, term43087.getClass(), "extraFields", null);
        setField(term43087, term43087.getClass(), "unparseableExtra", null);
        setField(term43087, term43087.getClass(), "name", null);
        setField(term43087, term43087.getClass(), "rawName", null);
        setField(term43087, term43087.getClass(), "gpb", null);
        setLongField(term43087, term43087.getClass(), "xdostime", 0L);
        setField(term43087, term43087.getClass(), "mtime", null);
        setField(term43087, term43087.getClass(), "atime", null);
        setField(term43087, term43087.getClass(), "ctime", null);
        setLongField(term43087, term43087.getClass(), "crc", 0L);
        setLongField(term43087, term43087.getClass(), "csize", 0L);
        setIntField(term43087, term43087.getClass(), "flag", 0);
        setField(term43087, term43087.getClass(), "extra", null);
        setField(term43087, term43087.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term43087, args);
    }

};


