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

public class Coders_addEncoder_684310764212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793496;
     Object enum568;

    public Coders_addEncoder_684310764212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term793496 = newInstance(Class.forName("org.tukaani.xz.LZMA2OutputStream"));
        Class<? extends Object> term794992 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term794991 = ((Class) term794992).getDeclaredField((String) "DEFLATE");
        ((Field) term794991).setAccessible(true);
        enum568 = ((Field) term794991).get((Object) null);
        Class<? extends Object> term795305 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term795304 = ((Class) term795305).getDeclaredField((String) "DEFLATE");
        ((Field) term795304).setAccessible(true);
        Object enum569 = ((Field) term795304).get((Object) null);
        Object[] term793421 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term793778 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term794070 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term793778, term793778.getClass(), "method", enum569);
        setField(term793778, term793778.getClass(), "coder", term794070);
        setElement(term793421, 0, term793778);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term793421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term793496;
        args[1] = enum568;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


