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

public class Coders_addDecoder_13902264955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109454;

    public Coders_addDecoder_13902264955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109454 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term109454, term109454.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term110948 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term110947 = ((Class) term110948).getDeclaredField((String) "BZIP2");
        ((Field) term110947).setAccessible(true);
        Object enum176 = ((Field) term110947).get((Object) null);
        Class<? extends Object> term111255 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term111254 = ((Class) term111255).getDeclaredField((String) "LZMA2");
        ((Field) term111254).setAccessible(true);
        Object enum177 = ((Field) term111254).get((Object) null);
        Object[] term109339 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term109578 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term109860 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term109578, term109578.getClass(), "method", enum176);
        setElement(term109339, 0, term109578);
        setField(term109860, term109860.getClass(), "method", enum177);
        setElement(term109339, 1, term109860);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term109339);
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
        args[1] = term109454;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


