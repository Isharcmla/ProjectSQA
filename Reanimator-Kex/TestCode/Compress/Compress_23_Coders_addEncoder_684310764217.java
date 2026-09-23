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

public class Coders_addEncoder_684310764217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum584;

    public Coders_addEncoder_684310764217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term974845 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term974844 = ((Class) term974845).getDeclaredField((String) "LZMA");
        ((Field) term974844).setAccessible(true);
        enum584 = ((Field) term974844).get((Object) null);
        Class<? extends Object> term975149 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term975148 = ((Class) term975149).getDeclaredField((String) "LZMA");
        ((Field) term975148).setAccessible(true);
        Object enum585 = ((Field) term975148).get((Object) null);
        Object[] term974278 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term974565 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term974843 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.LZMA2Decoder"));
        setField(term974565, term974565.getClass(), "method", enum585);
        setField(term974565, term974565.getClass(), "coder", term974843);
        setElement(term974278, 0, term974565);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term974278);
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
        args[1] = enum584;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


