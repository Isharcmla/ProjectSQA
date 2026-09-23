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

public class Coders_addDecoder_13902264947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93040;

    public Coders_addDecoder_13902264947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93040 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term92800 = (byte[]) newByteArray(1);
        setField(term93040, term93040.getClass(), "decompressionMethodId", term92800);
        Class<? extends Object> term95352 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term95351 = ((Class) term95352).getDeclaredField((String) "BZIP2");
        ((Field) term95351).setAccessible(true);
        Object enum147 = ((Field) term95351).get((Object) null);
        Class<? extends Object> term95659 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term95658 = ((Class) term95659).getDeclaredField((String) "AES256SHA256");
        ((Field) term95658).setAccessible(true);
        Object enum148 = ((Field) term95658).get((Object) null);
        Class<? extends Object> term95987 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term95986 = ((Class) term95987).getDeclaredField((String) "DEFLATE");
        ((Field) term95986).setAccessible(true);
        Object enum149 = ((Field) term95986).get((Object) null);
        Object[] term92916 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term93164 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term93446 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term93728 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term94010 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term93164, term93164.getClass(), "method", enum147);
        setElement(term92916, 0, term93164);
        setField(term93446, term93446.getClass(), "method", enum148);
        setElement(term92916, 1, term93446);
        setField(term93728, term93728.getClass(), "method", enum149);
        setElement(term92916, 2, term93728);
        setField(term94010, term94010.getClass(), "method", enum148);
        setElement(term92916, 3, term94010);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term92916);
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
        args[1] = term93040;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


