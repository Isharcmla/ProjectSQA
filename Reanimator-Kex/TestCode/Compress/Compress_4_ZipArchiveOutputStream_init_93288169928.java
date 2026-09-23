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
import java.io.FileNotFoundException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ZipArchiveOutputStream_init_93288169928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ZipArchiveOutputStream_init_93288169928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22451 = Class.forName((String) "java.io.File$PathStatus");
        Field term22450 = ((Class) term22451).getDeclaredField((String) "INVALID");
        ((Field) term22450).setAccessible(true);
        Object enum70 = ((Field) term22450).get((Object) null);
        term1 = newInstance(Class.forName("java.io.File"));
        setField(term1, term1.getClass(), "path", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "status", enum70);
        setIntField(term1, term1.getClass(), "prefixLength", 568599855);
        setField(term1, term1.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


