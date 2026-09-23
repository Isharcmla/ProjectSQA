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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum161;

    public Coders_addEncoder_68431076451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102801 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term102800 = ((Class) term102801).getDeclaredField((String) "AES256SHA256");
        ((Field) term102800).setAccessible(true);
        enum161 = ((Field) term102800).get((Object) null);
        Class<? extends Object> term103129 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term103128 = ((Class) term103129).getDeclaredField((String) "COPY");
        ((Field) term103128).setAccessible(true);
        Object enum162 = ((Field) term103128).get((Object) null);
        Class<? extends Object> term103433 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term103432 = ((Class) term103433).getDeclaredField((String) "AES256SHA256");
        ((Field) term103432).setAccessible(true);
        Object enum163 = ((Field) term103432).get((Object) null);
        Object[] term100696 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term100987 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term101269 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term101561 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term100987, term100987.getClass(), "method", enum162);
        setElement(term100696, 0, term100987);
        setField(term101269, term101269.getClass(), "method", enum163);
        setField(term101269, term101269.getClass(), "coder", term101561);
        setElement(term100696, 1, term101269);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term100696);
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
        args[1] = enum161;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


