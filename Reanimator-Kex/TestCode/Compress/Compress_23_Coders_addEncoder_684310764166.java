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

public class Coders_addEncoder_684310764166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495356;
     Object enum439;

    public Coders_addEncoder_684310764166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495356 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term495508 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(term495356, term495356.getClass(), "out", term495508);
        setIntField(term495356, term495356.getClass(), "currentChar", 66);
        setIntField(term495356, term495356.getClass(), "runLength", 254);
        setIntField(term495356, term495356.getClass(), "last", -2147483648);
        setIntField(term495356, term495356.getClass(), "allowableBlockSize", -2147483647);
        Class<? extends Object> term497712 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term497711 = ((Class) term497712).getDeclaredField((String) "DEFLATE");
        ((Field) term497711).setAccessible(true);
        enum439 = ((Field) term497711).get((Object) null);
        Class<? extends Object> term498025 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term498024 = ((Class) term498025).getDeclaredField((String) "BZIP2");
        ((Field) term498024).setAccessible(true);
        Object enum440 = ((Field) term498024).get((Object) null);
        Class<? extends Object> term498332 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term498331 = ((Class) term498332).getDeclaredField((String) "DEFLATE");
        ((Field) term498331).setAccessible(true);
        Object enum441 = ((Field) term498331).get((Object) null);
        Object[] term495195 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term495790 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term496072 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term496364 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term495790, term495790.getClass(), "method", enum440);
        setElement(term495195, 0, term495790);
        setField(term496072, term496072.getClass(), "method", enum441);
        setField(term496072, term496072.getClass(), "coder", term496364);
        setElement(term495195, 1, term496072);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term495195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term495356;
        args[1] = enum439;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


