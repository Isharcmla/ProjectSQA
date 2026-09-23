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

public class Coders_addDecoder_1390226499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4303;

    public Coders_addDecoder_1390226499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4303 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term4303, term4303.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term7015 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term7014 = ((Class) term7015).getDeclaredField((String) "COPY");
        ((Field) term7014).setAccessible(true);
        Object enum10 = ((Field) term7014).get((Object) null);
        Class<? extends Object> term7319 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term7318 = ((Class) term7319).getDeclaredField((String) "COPY");
        ((Field) term7318).setAccessible(true);
        Object enum11 = ((Field) term7318).get((Object) null);
        Class<? extends Object> term7623 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term7622 = ((Class) term7623).getDeclaredField((String) "AES256SHA256");
        ((Field) term7622).setAccessible(true);
        Object enum12 = ((Field) term7622).get((Object) null);
        Class<? extends Object> term7951 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term7950 = ((Class) term7951).getDeclaredField((String) "AES256SHA256");
        ((Field) term7950).setAccessible(true);
        Object enum13 = ((Field) term7950).get((Object) null);
        Object[] term4176 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term4427 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term4709 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term4991 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term5273 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term4427, term4427.getClass(), "method", enum10);
        setElement(term4176, 0, term4427);
        setField(term4709, term4709.getClass(), "method", enum11);
        setElement(term4176, 1, term4709);
        setField(term4991, term4991.getClass(), "method", enum12);
        setElement(term4176, 2, term4991);
        setField(term5273, term5273.getClass(), "method", enum13);
        setElement(term4176, 3, term5273);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term4176);
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
        args[1] = term4303;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


