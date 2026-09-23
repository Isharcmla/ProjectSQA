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
import java.lang.Object;
import java.util.HashMap;

public class ZipFile_init_131158848165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22192;

    public ZipFile_init_131158848165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22124 = new HashMap();
        Object term22076 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(term22076, term22076.getClass(), "entries", null);
        setField(term22076, term22076.getClass(), "nameMap", term22124);
        setField(term22076, term22076.getClass(), "OFFSET_COMPARATOR", null);
        setField(term22076, term22076.getClass(), "archiveName", "");
        setField(term22076, term22076.getClass(), "encoding", null);
        term22192 = newInstance(Class.forName("java.io.File"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term22192;
        args[1] = "";
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


