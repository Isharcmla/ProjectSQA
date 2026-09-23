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

public class ZipArchiveEntry_setInternalAttributes_182649689254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33968;
     Object term33981;

    public ZipArchiveEntry_setInternalAttributes_182649689254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33968 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term33968, term33968.getClass(), "method", 0);
        setLongField(term33968, term33968.getClass(), "size", 0L);
        setIntField(term33968, term33968.getClass(), "internalAttributes", 0);
        setIntField(term33968, term33968.getClass(), "platform", 0);
        setLongField(term33968, term33968.getClass(), "externalAttributes", 0L);
        setField(term33968, term33968.getClass(), "extraFields", null);
        setField(term33968, term33968.getClass(), "unparseableExtra", null);
        setField(term33968, term33968.getClass(), "name", null);
        setField(term33968, term33968.getClass(), "rawName", null);
        setField(term33968, term33968.getClass(), "gpb", null);
        setLongField(term33968, term33968.getClass(), "xdostime", 0L);
        setField(term33968, term33968.getClass(), "mtime", null);
        setField(term33968, term33968.getClass(), "atime", null);
        setField(term33968, term33968.getClass(), "ctime", null);
        setLongField(term33968, term33968.getClass(), "crc", 0L);
        setLongField(term33968, term33968.getClass(), "csize", 0L);
        setIntField(term33968, term33968.getClass(), "flag", 0);
        setField(term33968, term33968.getClass(), "extra", null);
        setField(term33968, term33968.getClass(), "comment", null);
        term33981 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33981;
        callMethod(klass, "setInternalAttributes", argTypes, term33968, args);
    }

};


