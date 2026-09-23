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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum605;

    public Coders_addEncoder_684310764226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term988239 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term988238 = ((Class) term988239).getDeclaredField((String) "DEFLATE");
        ((Field) term988238).setAccessible(true);
        enum605 = ((Field) term988238).get((Object) null);
        Class<? extends Object> term988552 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term988551 = ((Class) term988552).getDeclaredField((String) "LZMA");
        ((Field) term988551).setAccessible(true);
        Object enum606 = ((Field) term988551).get((Object) null);
        Class<? extends Object> term988856 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term988855 = ((Class) term988856).getDeclaredField((String) "COPY");
        ((Field) term988855).setAccessible(true);
        Object enum607 = ((Field) term988855).get((Object) null);
        Class<? extends Object> term989160 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term989159 = ((Class) term989160).getDeclaredField((String) "BZIP2");
        ((Field) term989159).setAccessible(true);
        Object enum608 = ((Field) term989159).get((Object) null);
        Class<? extends Object> term989467 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term989466 = ((Class) term989467).getDeclaredField((String) "AES256SHA256");
        ((Field) term989466).setAccessible(true);
        Object enum609 = ((Field) term989466).get((Object) null);
        Object[] term985082 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term985380 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term985662 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term985944 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term986226 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term985380, term985380.getClass(), "method", enum606);
        setElement(term985082, 0, term985380);
        setField(term985662, term985662.getClass(), "method", enum607);
        setElement(term985082, 1, term985662);
        setField(term985944, term985944.getClass(), "method", enum608);
        setElement(term985082, 2, term985944);
        setField(term986226, term986226.getClass(), "method", enum609);
        setElement(term985082, 3, term986226);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term985082);
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
        args[1] = enum605;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


