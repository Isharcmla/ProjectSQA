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

public class ZipArchiveEntry_setPlatform_149379641355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31643;
     Object term31655;

    public ZipArchiveEntry_setPlatform_149379641355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31643 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31643, term31643.getClass(), "method", 0);
        setIntField(term31643, term31643.getClass(), "internalAttributes", 0);
        setIntField(term31643, term31643.getClass(), "platform", 0);
        setLongField(term31643, term31643.getClass(), "externalAttributes", 0L);
        setField(term31643, term31643.getClass(), "extraFields", null);
        setField(term31643, term31643.getClass(), "name", null);
        setLongField(term31643, term31643.getClass(), "xdostime", 0L);
        setField(term31643, term31643.getClass(), "mtime", null);
        setField(term31643, term31643.getClass(), "atime", null);
        setField(term31643, term31643.getClass(), "ctime", null);
        setLongField(term31643, term31643.getClass(), "crc", 0L);
        setLongField(term31643, term31643.getClass(), "size", 0L);
        setLongField(term31643, term31643.getClass(), "csize", 0L);
        setIntField(term31643, term31643.getClass(), "flag", 0);
        setField(term31643, term31643.getClass(), "extra", null);
        setField(term31643, term31643.getClass(), "comment", null);
        term31655 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31655;
        callMethod(klass, "setPlatform", argTypes, term31643, args);
    }

};


