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

public class Coders_addEncoder_684310764192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759859;
     Object enum516;

    public Coders_addEncoder_684310764192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term759859 = newInstance(Class.forName("java.io.PipedOutputStream"));
        Class<? extends Object> term762865 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term762864 = ((Class) term762865).getDeclaredField((String) "LZMA");
        ((Field) term762864).setAccessible(true);
        enum516 = ((Field) term762864).get((Object) null);
        Class<? extends Object> term763169 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term763168 = ((Class) term763169).getDeclaredField((String) "LZMA");
        ((Field) term763168).setAccessible(true);
        Object enum517 = ((Field) term763168).get((Object) null);
        Object[] term759798 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term760141 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term760433 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term760141, term760141.getClass(), "method", enum517);
        setField(term760141, term760141.getClass(), "coder", term760433);
        setElement(term759798, 0, term760141);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term759798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term759859;
        args[1] = enum516;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


