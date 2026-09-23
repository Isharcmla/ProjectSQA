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

public class ZipFile_init_176674973358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19672;

    public ZipFile_init_176674973358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19604 = new HashMap();
        Object term19556 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(term19556, term19556.getClass(), "entries", null);
        setField(term19556, term19556.getClass(), "nameMap", term19604);
        setField(term19556, term19556.getClass(), "OFFSET_COMPARATOR", null);
        setField(term19556, term19556.getClass(), "archiveName", null);
        setField(term19556, term19556.getClass(), "encoding", "");
        term19672 = newInstance(Class.forName("java.io.File"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term19672;
        args[1] = "";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


