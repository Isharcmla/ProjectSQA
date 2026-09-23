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

public class Coders_addEncoder_68431076463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum199;

    public Coders_addEncoder_68431076463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123566 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term123565 = ((Class) term123566).getDeclaredField((String) "BZIP2");
        ((Field) term123565).setAccessible(true);
        enum199 = ((Field) term123565).get((Object) null);
        Class<? extends Object> term123873 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term123872 = ((Class) term123873).getDeclaredField((String) "LZMA");
        ((Field) term123872).setAccessible(true);
        Object enum200 = ((Field) term123872).get((Object) null);
        Class<? extends Object> term124177 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term124176 = ((Class) term124177).getDeclaredField((String) "COPY");
        ((Field) term124176).setAccessible(true);
        Object enum201 = ((Field) term124176).get((Object) null);
        Object[] term120341 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term120631 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term120913 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term120631, term120631.getClass(), "method", enum200);
        setElement(term120341, 0, term120631);
        setField(term120913, term120913.getClass(), "method", enum201);
        setElement(term120341, 1, term120913);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term120341);
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
        args[1] = enum199;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


