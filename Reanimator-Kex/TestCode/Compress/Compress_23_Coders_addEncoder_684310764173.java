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

public class Coders_addEncoder_684310764173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505802;
     Object enum460;

    public Coders_addEncoder_684310764173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505802 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream"));
        Class<? extends Object> term510263 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term510262 = ((Class) term510263).getDeclaredField((String) "DEFLATE");
        ((Field) term510262).setAccessible(true);
        enum460 = ((Field) term510262).get((Object) null);
        Class<? extends Object> term510576 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term510575 = ((Class) term510576).getDeclaredField((String) "LZMA");
        ((Field) term510575).setAccessible(true);
        Object enum461 = ((Field) term510575).get((Object) null);
        Class<? extends Object> term510880 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term510879 = ((Class) term510880).getDeclaredField((String) "DEFLATE");
        ((Field) term510879).setAccessible(true);
        Object enum462 = ((Field) term510879).get((Object) null);
        Object[] term505633 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term506084 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term506366 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term506658 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term506084, term506084.getClass(), "method", enum461);
        setElement(term505633, 0, term506084);
        setField(term506366, term506366.getClass(), "method", enum462);
        setField(term506366, term506366.getClass(), "coder", term506658);
        setElement(term505633, 1, term506366);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term505633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term505802;
        args[1] = enum460;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


