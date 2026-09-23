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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum512;

    public Coders_addEncoder_684310764191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term761333 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term761332 = ((Class) term761333).getDeclaredField((String) "COPY");
        ((Field) term761332).setAccessible(true);
        enum512 = ((Field) term761332).get((Object) null);
        Class<? extends Object> term761637 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term761636 = ((Class) term761637).getDeclaredField((String) "LZMA2");
        ((Field) term761636).setAccessible(true);
        Object enum513 = ((Field) term761636).get((Object) null);
        Class<? extends Object> term761944 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term761943 = ((Class) term761944).getDeclaredField((String) "LZMA");
        ((Field) term761943).setAccessible(true);
        Object enum514 = ((Field) term761943).get((Object) null);
        Class<? extends Object> term762248 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term762247 = ((Class) term762248).getDeclaredField((String) "COPY");
        ((Field) term762247).setAccessible(true);
        Object enum515 = ((Field) term762247).get((Object) null);
        Object[] term757260 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term757555 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term757837 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term758119 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term758425 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder"));
        setField(term757555, term757555.getClass(), "method", enum513);
        setElement(term757260, 0, term757555);
        setField(term757837, term757837.getClass(), "method", enum514);
        setElement(term757260, 1, term757837);
        setField(term758119, term758119.getClass(), "method", enum515);
        setField(term758119, term758119.getClass(), "coder", term758425);
        setElement(term757260, 2, term758119);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term757260);
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
        args[1] = enum512;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


