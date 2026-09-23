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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum238;

    public Coders_addEncoder_68431076477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144969 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term144968 = ((Class) term144969).getDeclaredField((String) "AES256SHA256");
        ((Field) term144968).setAccessible(true);
        enum238 = ((Field) term144968).get((Object) null);
        Class<? extends Object> term145297 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term145296 = ((Class) term145297).getDeclaredField((String) "COPY");
        ((Field) term145296).setAccessible(true);
        Object enum239 = ((Field) term145296).get((Object) null);
        Class<? extends Object> term145601 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term145600 = ((Class) term145601).getDeclaredField((String) "AES256SHA256");
        ((Field) term145600).setAccessible(true);
        Object enum240 = ((Field) term145600).get((Object) null);
        Object[] term142882 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term143173 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term143455 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term143751 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder"));
        setField(term143173, term143173.getClass(), "method", enum239);
        setElement(term142882, 0, term143173);
        setField(term143455, term143455.getClass(), "method", enum240);
        setField(term143455, term143455.getClass(), "coder", term143751);
        setElement(term142882, 1, term143455);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term142882);
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
        args[1] = enum238;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


