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
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999764;
     Object enum630;

    public Coders_addEncoder_684310764234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term999764 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        Object term999808 = newInstance(Class.forName("java.io.IOException"));
        setField(term999764, term999764.getClass(), "exception", term999808);
        Class<? extends Object> term1001196 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1001195 = ((Class) term1001196).getDeclaredField((String) "BZIP2");
        ((Field) term1001195).setAccessible(true);
        enum630 = ((Field) term1001195).get((Object) null);
        Class<? extends Object> term1001503 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1001502 = ((Class) term1001503).getDeclaredField((String) "BZIP2");
        ((Field) term1001502).setAccessible(true);
        Object enum631 = ((Field) term1001502).get((Object) null);
        Object[] term999689 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 64);
        Object term1000090 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1000382 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1000090, term1000090.getClass(), "method", enum631);
        setField(term1000090, term1000090.getClass(), "coder", term1000382);
        setElement(term999689, 0, term1000090);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term999689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term999764;
        args[1] = enum630;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


