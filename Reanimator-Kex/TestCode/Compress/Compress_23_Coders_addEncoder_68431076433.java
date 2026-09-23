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

public class Coders_addEncoder_68431076433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum102;

    public Coders_addEncoder_68431076433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68576 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term68575 = ((Class) term68576).getDeclaredField((String) "DEFLATE");
        ((Field) term68575).setAccessible(true);
        enum102 = ((Field) term68575).get((Object) null);
        Class<? extends Object> term68889 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term68888 = ((Class) term68889).getDeclaredField((String) "LZMA");
        ((Field) term68888).setAccessible(true);
        Object enum103 = ((Field) term68888).get((Object) null);
        Object[] term67137 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term67424 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term67706 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term67424, term67424.getClass(), "method", enum103);
        setElement(term67137, 0, term67424);
        setElement(term67137, 1, term67706);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term67137);
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
        args[1] = enum102;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


