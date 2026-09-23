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
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum213;
     Object enum216;

    public Coders_addEncoder_68431076469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131013 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term131012 = ((Class) term131013).getDeclaredField((String) "AES256SHA256");
        ((Field) term131012).setAccessible(true);
        enum213 = ((Field) term131012).get((Object) null);
        Class<? extends Object> term131341 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term131340 = ((Class) term131341).getDeclaredField((String) "COPY");
        ((Field) term131340).setAccessible(true);
        Object enum214 = ((Field) term131340).get((Object) null);
        Class<? extends Object> term131645 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term131644 = ((Class) term131645).getDeclaredField((String) "AES256SHA256");
        ((Field) term131644).setAccessible(true);
        Object enum215 = ((Field) term131644).get((Object) null);
        Object[] term129158 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term129449 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term129731 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term130021 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder"));
        setField(term129449, term129449.getClass(), "method", enum214);
        setElement(term129158, 0, term129449);
        setField(term129731, term129731.getClass(), "method", enum215);
        setField(term129731, term129731.getClass(), "coder", term130021);
        setElement(term129158, 1, term129731);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term129158);
        Class<? extends Object> term131973 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term131972 = ((Class) term131973).getDeclaredField((String) "AES256SHA256");
        ((Field) term131972).setAccessible(true);
        enum216 = ((Field) term131972).get((Object) null);
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
        args[1] = enum213;
        args[2] = null;
        Object retValue = callMethod(klass, "addEncoder", argTypes, null, args);
        assertTrue(recursiveEquals(enum213, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


