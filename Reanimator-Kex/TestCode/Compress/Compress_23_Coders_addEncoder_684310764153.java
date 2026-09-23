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

public class Coders_addEncoder_684310764153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum404;

    public Coders_addEncoder_684310764153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477847 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term477846 = ((Class) term477847).getDeclaredField((String) "LZMA");
        ((Field) term477846).setAccessible(true);
        enum404 = ((Field) term477846).get((Object) null);
        Class<? extends Object> term478151 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term478150 = ((Class) term478151).getDeclaredField((String) "LZMA2");
        ((Field) term478150).setAccessible(true);
        Object enum405 = ((Field) term478150).get((Object) null);
        Class<? extends Object> term478458 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term478457 = ((Class) term478458).getDeclaredField((String) "COPY");
        ((Field) term478457).setAccessible(true);
        Object enum406 = ((Field) term478457).get((Object) null);
        Class<? extends Object> term478762 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term478761 = ((Class) term478762).getDeclaredField((String) "LZMA");
        ((Field) term478761).setAccessible(true);
        Object enum407 = ((Field) term478761).get((Object) null);
        Object[] term475354 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term475648 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term475930 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term476212 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term475648, term475648.getClass(), "method", enum405);
        setElement(term475354, 0, term475648);
        setField(term475930, term475930.getClass(), "method", enum406);
        setElement(term475354, 1, term475930);
        setField(term476212, term476212.getClass(), "method", enum407);
        setElement(term475354, 2, term476212);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term475354);
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
        args[1] = enum404;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


