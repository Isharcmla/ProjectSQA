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

public class ZipFile_init_131158848195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29224;

    public ZipFile_init_131158848195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29194 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(term29194, term29194.getClass(), "entries", null);
        setField(term29194, term29194.getClass(), "nameMap", null);
        setField(term29194, term29194.getClass(), "OFFSET_COMPARATOR", null);
        setField(term29194, term29194.getClass(), "archiveName", null);
        setField(term29194, term29194.getClass(), "encoding", null);
        term29224 = newInstance(Class.forName("java.io.File"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term29224;
        args[1] = "";
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


