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

public class ZipArchiveEntry_setExternalAttributes_4598311856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33996;
     Object term34009;

    public ZipArchiveEntry_setExternalAttributes_4598311856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33996 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term33996, term33996.getClass(), "method", 0);
        setLongField(term33996, term33996.getClass(), "size", 0L);
        setIntField(term33996, term33996.getClass(), "internalAttributes", 0);
        setIntField(term33996, term33996.getClass(), "platform", 0);
        setLongField(term33996, term33996.getClass(), "externalAttributes", 0L);
        setField(term33996, term33996.getClass(), "extraFields", null);
        setField(term33996, term33996.getClass(), "unparseableExtra", null);
        setField(term33996, term33996.getClass(), "name", null);
        setField(term33996, term33996.getClass(), "rawName", null);
        setField(term33996, term33996.getClass(), "gpb", null);
        setLongField(term33996, term33996.getClass(), "xdostime", 0L);
        setField(term33996, term33996.getClass(), "mtime", null);
        setField(term33996, term33996.getClass(), "atime", null);
        setField(term33996, term33996.getClass(), "ctime", null);
        setLongField(term33996, term33996.getClass(), "crc", 0L);
        setLongField(term33996, term33996.getClass(), "csize", 0L);
        setIntField(term33996, term33996.getClass(), "flag", 0);
        setField(term33996, term33996.getClass(), "extra", null);
        setField(term33996, term33996.getClass(), "comment", null);
        term34009 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term34009;
        callMethod(klass, "setExternalAttributes", argTypes, term33996, args);
    }

};


