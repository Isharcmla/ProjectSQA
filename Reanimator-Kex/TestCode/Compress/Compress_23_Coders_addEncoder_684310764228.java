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

public class Coders_addEncoder_684310764228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum613;

    public Coders_addEncoder_684310764228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term991942 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term991941 = ((Class) term991942).getDeclaredField((String) "LZMA2");
        ((Field) term991941).setAccessible(true);
        enum613 = ((Field) term991941).get((Object) null);
        Class<? extends Object> term992249 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term992248 = ((Class) term992249).getDeclaredField((String) "AES256SHA256");
        ((Field) term992248).setAccessible(true);
        Object enum614 = ((Field) term992248).get((Object) null);
        Class<? extends Object> term992577 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term992576 = ((Class) term992577).getDeclaredField((String) "LZMA2");
        ((Field) term992576).setAccessible(true);
        Object enum615 = ((Field) term992576).get((Object) null);
        Object[] term990016 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term990306 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term990588 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term990306, term990306.getClass(), "method", enum614);
        setElement(term990016, 0, term990306);
        setField(term990588, term990588.getClass(), "method", enum615);
        setElement(term990016, 1, term990588);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term990016);
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
        args[1] = enum613;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


