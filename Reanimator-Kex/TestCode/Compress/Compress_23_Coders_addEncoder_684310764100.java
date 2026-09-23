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

public class Coders_addEncoder_684310764100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum272;

    public Coders_addEncoder_684310764100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169114 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term169113 = ((Class) term169114).getDeclaredField((String) "LZMA2");
        ((Field) term169113).setAccessible(true);
        enum272 = ((Field) term169113).get((Object) null);
        Class<? extends Object> term169421 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term169420 = ((Class) term169421).getDeclaredField((String) "LZMA2");
        ((Field) term169420).setAccessible(true);
        Object enum273 = ((Field) term169420).get((Object) null);
        Object[] term168668 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term168954 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term168954, term168954.getClass(), "method", enum273);
        setElement(term168668, 0, term168954);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term168668);
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
        args[1] = enum272;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


