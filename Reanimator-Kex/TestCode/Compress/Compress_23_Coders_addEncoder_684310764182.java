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

public class Coders_addEncoder_684310764182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523341;
     Object enum490;

    public Coders_addEncoder_684310764182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523341 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        Class<? extends Object> term526156 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term526155 = ((Class) term526156).getDeclaredField((String) "LZMA");
        ((Field) term526155).setAccessible(true);
        enum490 = ((Field) term526155).get((Object) null);
        Class<? extends Object> term526460 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term526459 = ((Class) term526460).getDeclaredField((String) "LZMA");
        ((Field) term526459).setAccessible(true);
        Object enum491 = ((Field) term526459).get((Object) null);
        Object[] term523266 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term523623 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term523915 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term523623, term523623.getClass(), "method", enum491);
        setField(term523623, term523623.getClass(), "coder", term523915);
        setElement(term523266, 0, term523623);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term523266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term523341;
        args[1] = enum490;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


