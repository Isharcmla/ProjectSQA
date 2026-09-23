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
import java.lang.String;

public class ZipFile_init_153879219673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24999;

    public ZipFile_init_153879219673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24837 = new HashMap();
        Class<? extends Object> term25013 = Class.forName((String) "java.util.Comparators$NaturalOrderComparator");
        Field term25012 = ((Class) term25013).getDeclaredField((String) "INSTANCE");
        ((Field) term25012).setAccessible(true);
        Object enum29 = ((Field) term25012).get((Object) null);
        Object term24789 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(term24789, term24789.getClass(), "entries", null);
        setField(term24789, term24789.getClass(), "nameMap", term24837);
        setField(term24789, term24789.getClass(), "OFFSET_COMPARATOR", enum29);
        setField(term24789, term24789.getClass(), "archiveName", "");
        setField(term24789, term24789.getClass(), "encoding", null);
        term24999 = newInstance(Class.forName("java.io.File"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term24999;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


