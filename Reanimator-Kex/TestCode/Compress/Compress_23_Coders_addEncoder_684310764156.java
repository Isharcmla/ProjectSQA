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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479391;
     Object enum413;

    public Coders_addEncoder_684310764156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479391 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        Class<? extends Object> term482791 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term482790 = ((Class) term482791).getDeclaredField((String) "LZMA");
        ((Field) term482790).setAccessible(true);
        enum413 = ((Field) term482790).get((Object) null);
        Class<? extends Object> term483095 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term483094 = ((Class) term483095).getDeclaredField((String) "LZMA");
        ((Field) term483094).setAccessible(true);
        Object enum414 = ((Field) term483094).get((Object) null);
        Object[] term479298 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term479673 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term479965 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term479673, term479673.getClass(), "method", enum414);
        setField(term479673, term479673.getClass(), "coder", term479965);
        setElement(term479298, 0, term479673);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term479298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term479391;
        args[1] = enum413;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


