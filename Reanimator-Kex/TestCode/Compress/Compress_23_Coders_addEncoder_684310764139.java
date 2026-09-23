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

public class Coders_addEncoder_684310764139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304061;
     Object enum366;

    public Coders_addEncoder_684310764139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304061 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        Class<? extends Object> term306244 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term306243 = ((Class) term306244).getDeclaredField((String) "DEFLATE");
        ((Field) term306243).setAccessible(true);
        enum366 = ((Field) term306243).get((Object) null);
        Class<? extends Object> term306557 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term306556 = ((Class) term306557).getDeclaredField((String) "LZMA");
        ((Field) term306556).setAccessible(true);
        Object enum367 = ((Field) term306556).get((Object) null);
        Class<? extends Object> term306861 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term306860 = ((Class) term306861).getDeclaredField((String) "DEFLATE");
        ((Field) term306860).setAccessible(true);
        Object enum368 = ((Field) term306860).get((Object) null);
        Object[] term303990 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term304343 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term304625 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term304917 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term304343, term304343.getClass(), "method", enum367);
        setElement(term303990, 0, term304343);
        setField(term304625, term304625.getClass(), "method", enum368);
        setField(term304625, term304625.getClass(), "coder", term304917);
        setElement(term303990, 1, term304625);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term303990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term304061;
        args[1] = enum366;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


