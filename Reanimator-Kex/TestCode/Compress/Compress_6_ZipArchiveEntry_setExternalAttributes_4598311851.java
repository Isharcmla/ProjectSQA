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

public class ZipArchiveEntry_setExternalAttributes_4598311851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31591;
     Object term31603;

    public ZipArchiveEntry_setExternalAttributes_4598311851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31591 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31591, term31591.getClass(), "method", 0);
        setIntField(term31591, term31591.getClass(), "internalAttributes", 0);
        setIntField(term31591, term31591.getClass(), "platform", 0);
        setLongField(term31591, term31591.getClass(), "externalAttributes", 0L);
        setField(term31591, term31591.getClass(), "extraFields", null);
        setField(term31591, term31591.getClass(), "name", null);
        setLongField(term31591, term31591.getClass(), "xdostime", 0L);
        setField(term31591, term31591.getClass(), "mtime", null);
        setField(term31591, term31591.getClass(), "atime", null);
        setField(term31591, term31591.getClass(), "ctime", null);
        setLongField(term31591, term31591.getClass(), "crc", 0L);
        setLongField(term31591, term31591.getClass(), "size", 0L);
        setLongField(term31591, term31591.getClass(), "csize", 0L);
        setIntField(term31591, term31591.getClass(), "flag", 0);
        setField(term31591, term31591.getClass(), "extra", null);
        setField(term31591, term31591.getClass(), "comment", null);
        term31603 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term31603;
        callMethod(klass, "setExternalAttributes", argTypes, term31591, args);
    }

};


