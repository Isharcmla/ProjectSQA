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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.sevenz.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum380;
     Object enum383;

    public Coders_addEncoder_684310764145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324925 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term324924 = ((Class) term324925).getDeclaredField((String) "DEFLATE");
        ((Field) term324924).setAccessible(true);
        enum380 = ((Field) term324924).get((Object) null);
        Class<? extends Object> term325238 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term325237 = ((Class) term325238).getDeclaredField((String) "AES256SHA256");
        ((Field) term325237).setAccessible(true);
        Object enum381 = ((Field) term325237).get((Object) null);
        Class<? extends Object> term325566 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term325565 = ((Class) term325566).getDeclaredField((String) "DEFLATE");
        ((Field) term325565).setAccessible(true);
        Object enum382 = ((Field) term325565).get((Object) null);
        Object[] term323082 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term323373 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term323655 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term323945 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder"));
        setField(term323373, term323373.getClass(), "method", enum381);
        setElement(term323082, 0, term323373);
        setField(term323655, term323655.getClass(), "method", enum382);
        setField(term323655, term323655.getClass(), "coder", term323945);
        setElement(term323082, 1, term323655);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term323082);
        Class<? extends Object> term325879 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term325878 = ((Class) term325879).getDeclaredField((String) "DEFLATE");
        ((Field) term325878).setAccessible(true);
        enum383 = ((Field) term325878).get((Object) null);
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
        args[1] = enum380;
        args[2] = null;
        Object retValue = callMethod(klass, "addEncoder", argTypes, null, args);
        assertTrue(recursiveEquals(enum380, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


