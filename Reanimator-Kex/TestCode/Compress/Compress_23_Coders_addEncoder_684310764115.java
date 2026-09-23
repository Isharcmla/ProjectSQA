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

public class Coders_addEncoder_684310764115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266282;
     Object enum300;

    public Coders_addEncoder_684310764115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266282 = newInstance(Class.forName("java.nio.channels.Channels$3"));
        Class<? extends Object> term268460 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term268459 = ((Class) term268460).getDeclaredField((String) "DEFLATE");
        ((Field) term268459).setAccessible(true);
        enum300 = ((Field) term268459).get((Object) null);
        Class<? extends Object> term268773 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term268772 = ((Class) term268773).getDeclaredField((String) "LZMA");
        ((Field) term268772).setAccessible(true);
        Object enum301 = ((Field) term268772).get((Object) null);
        Class<? extends Object> term269077 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term269076 = ((Class) term269077).getDeclaredField((String) "DEFLATE");
        ((Field) term269076).setAccessible(true);
        Object enum302 = ((Field) term269076).get((Object) null);
        Object[] term266211 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term266564 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term266846 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term267138 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term266564, term266564.getClass(), "method", enum301);
        setElement(term266211, 0, term266564);
        setField(term266846, term266846.getClass(), "method", enum302);
        setField(term266846, term266846.getClass(), "coder", term267138);
        setElement(term266211, 1, term266846);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term266211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term266282;
        args[1] = enum300;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


