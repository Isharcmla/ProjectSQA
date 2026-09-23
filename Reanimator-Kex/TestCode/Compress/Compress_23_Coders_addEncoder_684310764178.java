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

public class Coders_addEncoder_684310764178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum478;

    public Coders_addEncoder_684310764178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term519383 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term519382 = ((Class) term519383).getDeclaredField((String) "DEFLATE");
        ((Field) term519382).setAccessible(true);
        enum478 = ((Field) term519382).get((Object) null);
        Class<? extends Object> term519696 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term519695 = ((Class) term519696).getDeclaredField((String) "BZIP2");
        ((Field) term519695).setAccessible(true);
        Object enum479 = ((Field) term519695).get((Object) null);
        Class<? extends Object> term520003 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term520002 = ((Class) term520003).getDeclaredField((String) "AES256SHA256");
        ((Field) term520002).setAccessible(true);
        Object enum480 = ((Field) term520002).get((Object) null);
        Class<? extends Object> term520331 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term520330 = ((Class) term520331).getDeclaredField((String) "DEFLATE");
        ((Field) term520330).setAccessible(true);
        Object enum481 = ((Field) term520330).get((Object) null);
        Object[] term516723 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term517018 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term517300 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term517582 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term517864 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term517018, term517018.getClass(), "method", enum479);
        setElement(term516723, 0, term517018);
        setField(term517300, term517300.getClass(), "method", enum480);
        setElement(term516723, 1, term517300);
        setField(term517582, term517582.getClass(), "method", enum481);
        setElement(term516723, 2, term517582);
        setElement(term516723, 3, term517864);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term516723);
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
        args[1] = enum478;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


