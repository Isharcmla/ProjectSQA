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
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23930;

    public Coders_addDecoder_13902264919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23930 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term23930, term23930.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term27883 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term27882 = ((Class) term27883).getDeclaredField((String) "BZIP2");
        ((Field) term27882).setAccessible(true);
        Object enum44 = ((Field) term27882).get((Object) null);
        Class<? extends Object> term28190 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term28189 = ((Class) term28190).getDeclaredField((String) "LZMA");
        ((Field) term28189).setAccessible(true);
        Object enum45 = ((Field) term28189).get((Object) null);
        Class<? extends Object> term28494 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term28493 = ((Class) term28494).getDeclaredField((String) "LZMA");
        ((Field) term28493).setAccessible(true);
        Object enum46 = ((Field) term28493).get((Object) null);
        Class<? extends Object> term28798 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term28797 = ((Class) term28798).getDeclaredField((String) "AES256SHA256");
        ((Field) term28797).setAccessible(true);
        Object enum47 = ((Field) term28797).get((Object) null);
        Class<? extends Object> term29126 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term29125 = ((Class) term29126).getDeclaredField((String) "LZMA");
        ((Field) term29125).setAccessible(true);
        Object enum48 = ((Field) term29125).get((Object) null);
        Class<? extends Object> term29430 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term29429 = ((Class) term29430).getDeclaredField((String) "DEFLATE");
        ((Field) term29429).setAccessible(true);
        Object enum49 = ((Field) term29429).get((Object) null);
        Object[] term23787 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 128);
        Object term24054 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term24336 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term24618 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term24900 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term25182 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term25464 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term24054, term24054.getClass(), "method", enum44);
        setElement(term23787, 0, term24054);
        setField(term24336, term24336.getClass(), "method", enum45);
        setElement(term23787, 1, term24336);
        setField(term24618, term24618.getClass(), "method", enum46);
        setElement(term23787, 2, term24618);
        setField(term24900, term24900.getClass(), "method", enum47);
        setElement(term23787, 3, term24900);
        setField(term25182, term25182.getClass(), "method", enum48);
        setElement(term23787, 4, term25182);
        setField(term25464, term25464.getClass(), "method", enum49);
        setElement(term23787, 5, term25464);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term23787);
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
        args[1] = term23930;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


