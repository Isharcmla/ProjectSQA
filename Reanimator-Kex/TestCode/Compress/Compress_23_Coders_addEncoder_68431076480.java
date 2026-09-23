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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum241;

    public Coders_addEncoder_68431076480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147485 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term147484 = ((Class) term147485).getDeclaredField((String) "AES256SHA256");
        ((Field) term147484).setAccessible(true);
        enum241 = ((Field) term147484).get((Object) null);
        Class<? extends Object> term147813 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term147812 = ((Class) term147813).getDeclaredField((String) "COPY");
        ((Field) term147812).setAccessible(true);
        Object enum242 = ((Field) term147812).get((Object) null);
        Class<? extends Object> term148117 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term148116 = ((Class) term148117).getDeclaredField((String) "AES256SHA256");
        ((Field) term148116).setAccessible(true);
        Object enum243 = ((Field) term148116).get((Object) null);
        Object[] term146632 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term146923 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term147205 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term147483 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.LZMA2Decoder"));
        setField(term146923, term146923.getClass(), "method", enum242);
        setElement(term146632, 0, term146923);
        setField(term147205, term147205.getClass(), "method", enum243);
        setField(term147205, term147205.getClass(), "coder", term147483);
        setElement(term146632, 1, term147205);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term146632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum241;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


