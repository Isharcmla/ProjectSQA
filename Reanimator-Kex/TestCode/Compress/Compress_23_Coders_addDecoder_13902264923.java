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
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36938;

    public Coders_addDecoder_13902264923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36938 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term36938, term36938.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term39823 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term39822 = ((Class) term39823).getDeclaredField((String) "BZIP2");
        ((Field) term39822).setAccessible(true);
        Object enum62 = ((Field) term39822).get((Object) null);
        Class<? extends Object> term40130 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term40129 = ((Class) term40130).getDeclaredField((String) "LZMA");
        ((Field) term40129).setAccessible(true);
        Object enum63 = ((Field) term40129).get((Object) null);
        Class<? extends Object> term40434 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term40433 = ((Class) term40434).getDeclaredField((String) "AES256SHA256");
        ((Field) term40433).setAccessible(true);
        Object enum64 = ((Field) term40433).get((Object) null);
        Class<? extends Object> term40762 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term40761 = ((Class) term40762).getDeclaredField((String) "LZMA");
        ((Field) term40761).setAccessible(true);
        Object enum65 = ((Field) term40761).get((Object) null);
        Object[] term36811 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term37062 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term37344 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term37468 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term37750 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term38032 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term37062, term37062.getClass(), "method", enum62);
        setElement(term36811, 0, term37062);
        setField(term37344, term37344.getClass(), "method", enum62);
        setElement(term36811, 1, term37344);
        setField(term37468, term37468.getClass(), "method", enum63);
        setElement(term36811, 2, term37468);
        setField(term37750, term37750.getClass(), "method", enum64);
        setElement(term36811, 3, term37750);
        setField(term38032, term38032.getClass(), "method", enum65);
        setElement(term36811, 4, term38032);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term36811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Coder");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term36938;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


