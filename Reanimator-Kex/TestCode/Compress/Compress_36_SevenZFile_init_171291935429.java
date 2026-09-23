package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SevenZFile_init_171291935429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;

    public SevenZFile_init_171291935429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13889 = Class.forName((String) "java.io.File$PathStatus");
        Field term13888 = ((Class) term13889).getDeclaredField((String) "INVALID");
        ((Field) term13888).setAccessible(true);
        Object enum2 = ((Field) term13888).get((Object) null);
        term1 = newInstance(Class.forName("java.io.File"));
        setField(term1, term1.getClass(), "path", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "status", enum2);
        setIntField(term1, term1.getClass(), "prefixLength", 568599855);
        setField(term1, term1.getClass(), "filePath", null);
        term26 = (byte[]) newByteArray(5);
        setByteElement(term26, 0, (byte) 47);
        setByteElement(term26, 1, (byte) 48);
        setByteElement(term26, 2, (byte) 89);
        setByteElement(term26, 3, (byte) 75);
        setByteElement(term26, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term26;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};


