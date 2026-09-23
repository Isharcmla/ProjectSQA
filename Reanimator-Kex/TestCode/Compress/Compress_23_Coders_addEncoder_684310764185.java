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

public class Coders_addEncoder_684310764185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526983;
     Object enum497;

    public Coders_addEncoder_684310764185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term526983 = newInstance(Class.forName("java.io.OutputStream$1"));
        Class<? extends Object> term752458 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term752457 = ((Class) term752458).getDeclaredField((String) "LZMA");
        ((Field) term752457).setAccessible(true);
        enum497 = ((Field) term752457).get((Object) null);
        Class<? extends Object> term752762 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term752761 = ((Class) term752762).getDeclaredField((String) "LZMA");
        ((Field) term752761).setAccessible(true);
        Object enum498 = ((Field) term752761).get((Object) null);
        Object[] term526928 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term527265 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term527557 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term527265, term527265.getClass(), "method", enum498);
        setField(term527265, term527265.getClass(), "coder", term527557);
        setElement(term526928, 0, term527265);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term526928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term526983;
        args[1] = enum497;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


