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

public class Coders_addEncoder_684310764123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum320;

    public Coders_addEncoder_684310764123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term279620 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term279619 = ((Class) term279620).getDeclaredField((String) "COPY");
        ((Field) term279619).setAccessible(true);
        enum320 = ((Field) term279619).get((Object) null);
        Class<? extends Object> term279924 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term279923 = ((Class) term279924).getDeclaredField((String) "LZMA2");
        ((Field) term279923).setAccessible(true);
        Object enum321 = ((Field) term279923).get((Object) null);
        Class<? extends Object> term280231 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term280230 = ((Class) term280231).getDeclaredField((String) "AES256SHA256");
        ((Field) term280230).setAccessible(true);
        Object enum322 = ((Field) term280230).get((Object) null);
        Object[] term277657 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term277947 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term278229 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term277947, term277947.getClass(), "method", enum321);
        setElement(term277657, 0, term277947);
        setField(term278229, term278229.getClass(), "method", enum322);
        setElement(term277657, 1, term278229);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term277657);
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
        args[1] = enum320;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


