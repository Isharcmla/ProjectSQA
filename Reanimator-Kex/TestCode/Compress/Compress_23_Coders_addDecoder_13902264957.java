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

public class Coders_addDecoder_13902264957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111909;

    public Coders_addDecoder_13902264957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111909 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term111909, term111909.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term115215 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term115214 = ((Class) term115215).getDeclaredField((String) "AES256SHA256");
        ((Field) term115214).setAccessible(true);
        Object enum183 = ((Field) term115214).get((Object) null);
        Class<? extends Object> term115543 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term115542 = ((Class) term115543).getDeclaredField((String) "COPY");
        ((Field) term115542).setAccessible(true);
        Object enum184 = ((Field) term115542).get((Object) null);
        Class<? extends Object> term115847 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term115846 = ((Class) term115847).getDeclaredField((String) "AES256SHA256");
        ((Field) term115846).setAccessible(true);
        Object enum185 = ((Field) term115846).get((Object) null);
        Class<? extends Object> term116175 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term116174 = ((Class) term116175).getDeclaredField((String) "DEFLATE");
        ((Field) term116174).setAccessible(true);
        Object enum186 = ((Field) term116174).get((Object) null);
        Class<? extends Object> term116488 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term116487 = ((Class) term116488).getDeclaredField((String) "BZIP2");
        ((Field) term116487).setAccessible(true);
        Object enum187 = ((Field) term116487).get((Object) null);
        Object[] term111778 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term112033 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term112315 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term112597 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term112879 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term113161 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term112033, term112033.getClass(), "method", enum183);
        setElement(term111778, 0, term112033);
        setField(term112315, term112315.getClass(), "method", enum184);
        setElement(term111778, 1, term112315);
        setField(term112597, term112597.getClass(), "method", enum185);
        setElement(term111778, 2, term112597);
        setField(term112879, term112879.getClass(), "method", enum186);
        setElement(term111778, 3, term112879);
        setField(term113161, term113161.getClass(), "method", enum187);
        setElement(term111778, 4, term113161);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term111778);
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
        args[1] = term111909;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


