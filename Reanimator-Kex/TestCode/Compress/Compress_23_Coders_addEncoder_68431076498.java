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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum270;

    public Coders_addEncoder_68431076498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term167895 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term167894 = ((Class) term167895).getDeclaredField((String) "AES256SHA256");
        ((Field) term167894).setAccessible(true);
        enum270 = ((Field) term167894).get((Object) null);
        Class<? extends Object> term168223 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term168222 = ((Class) term168223).getDeclaredField((String) "AES256SHA256");
        ((Field) term168222).setAccessible(true);
        Object enum271 = ((Field) term168222).get((Object) null);
        Object[] term167449 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term167735 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term167735, term167735.getClass(), "method", enum271);
        setElement(term167449, 0, term167735);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term167449);
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
        args[1] = enum270;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


