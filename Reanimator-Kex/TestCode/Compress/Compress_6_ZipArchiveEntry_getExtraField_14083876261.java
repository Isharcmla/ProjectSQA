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

public class ZipArchiveEntry_getExtraField_14083876261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31717;

    public ZipArchiveEntry_getExtraField_14083876261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31717 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        setIntField(term31717, term31717.getClass(), "method", 0);
        setIntField(term31717, term31717.getClass(), "internalAttributes", 0);
        setIntField(term31717, term31717.getClass(), "platform", 0);
        setLongField(term31717, term31717.getClass(), "externalAttributes", 0L);
        setField(term31717, term31717.getClass(), "extraFields", null);
        setField(term31717, term31717.getClass(), "name", null);
        setLongField(term31717, term31717.getClass(), "xdostime", 0L);
        setField(term31717, term31717.getClass(), "mtime", null);
        setField(term31717, term31717.getClass(), "atime", null);
        setField(term31717, term31717.getClass(), "ctime", null);
        setLongField(term31717, term31717.getClass(), "crc", 0L);
        setLongField(term31717, term31717.getClass(), "size", 0L);
        setLongField(term31717, term31717.getClass(), "csize", 0L);
        setIntField(term31717, term31717.getClass(), "flag", 0);
        setField(term31717, term31717.getClass(), "extra", null);
        setField(term31717, term31717.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipShort");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getExtraField", argTypes, term31717, args);
    }

};


