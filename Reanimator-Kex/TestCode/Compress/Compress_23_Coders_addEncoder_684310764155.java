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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum410;

    public Coders_addEncoder_684310764155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term481541 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term481540 = ((Class) term481541).getDeclaredField((String) "DEFLATE");
        ((Field) term481540).setAccessible(true);
        enum410 = ((Field) term481540).get((Object) null);
        Class<? extends Object> term481854 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term481853 = ((Class) term481854).getDeclaredField((String) "AES256SHA256");
        ((Field) term481853).setAccessible(true);
        Object enum411 = ((Field) term481853).get((Object) null);
        Class<? extends Object> term482182 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term482181 = ((Class) term482182).getDeclaredField((String) "DEFLATE");
        ((Field) term482181).setAccessible(true);
        Object enum412 = ((Field) term482181).get((Object) null);
        Object[] term480688 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term480979 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term481261 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term481539 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.LZMA2Decoder"));
        setField(term480979, term480979.getClass(), "method", enum411);
        setElement(term480688, 0, term480979);
        setField(term481261, term481261.getClass(), "method", enum412);
        setField(term481261, term481261.getClass(), "coder", term481539);
        setElement(term480688, 1, term481261);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term480688);
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
        args[1] = enum410;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


