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

public class ZipFile_init_153879219691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipFile_init_153879219691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28430 = new HashMap();
        Object term28382 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term28516 = newInstance(Class.forName("java.util.Collections$ReverseComparator2"));
        setField(term28382, term28382.getClass(), "entries", term28430);
        setField(term28382, term28382.getClass(), "nameMap", null);
        setField(term28382, term28382.getClass(), "OFFSET_COMPARATOR", term28516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


