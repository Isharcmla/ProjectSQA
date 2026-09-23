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

public class Coders_addEncoder_684310764149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum392;

    public Coders_addEncoder_684310764149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term331435 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term331434 = ((Class) term331435).getDeclaredField((String) "BZIP2");
        ((Field) term331434).setAccessible(true);
        enum392 = ((Field) term331434).get((Object) null);
        Class<? extends Object> term331742 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term331741 = ((Class) term331742).getDeclaredField((String) "BZIP2");
        ((Field) term331741).setAccessible(true);
        Object enum393 = ((Field) term331741).get((Object) null);
        Object[] term329940 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term330227 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term330533 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder"));
        setField(term330227, term330227.getClass(), "method", enum393);
        setField(term330227, term330227.getClass(), "coder", term330533);
        setElement(term329940, 0, term330227);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term329940);
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
        args[1] = enum392;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


