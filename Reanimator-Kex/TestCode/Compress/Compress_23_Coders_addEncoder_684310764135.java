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

public class Coders_addEncoder_684310764135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum356;

    public Coders_addEncoder_684310764135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term300671 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term300670 = ((Class) term300671).getDeclaredField((String) "LZMA2");
        ((Field) term300670).setAccessible(true);
        enum356 = ((Field) term300670).get((Object) null);
        Class<? extends Object> term300978 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term300977 = ((Class) term300978).getDeclaredField((String) "DEFLATE");
        ((Field) term300977).setAccessible(true);
        Object enum357 = ((Field) term300977).get((Object) null);
        Class<? extends Object> term301291 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term301290 = ((Class) term301291).getDeclaredField((String) "LZMA");
        ((Field) term301290).setAccessible(true);
        Object enum358 = ((Field) term301290).get((Object) null);
        Object[] term298635 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term298926 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term299208 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term299490 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term298926, term298926.getClass(), "method", enum357);
        setElement(term298635, 0, term298926);
        setField(term299208, term299208.getClass(), "method", enum358);
        setElement(term298635, 1, term299208);
        setElement(term298635, 2, term299490);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term298635);
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
        args[1] = enum356;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


