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

public class Coders_addEncoder_684310764244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum658;

    public Coders_addEncoder_684310764244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1018363 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1018362 = ((Class) term1018363).getDeclaredField((String) "COPY");
        ((Field) term1018362).setAccessible(true);
        enum658 = ((Field) term1018362).get((Object) null);
        Class<? extends Object> term1018667 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1018666 = ((Class) term1018667).getDeclaredField((String) "BZIP2");
        ((Field) term1018666).setAccessible(true);
        Object enum659 = ((Field) term1018666).get((Object) null);
        Class<? extends Object> term1018974 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1018973 = ((Class) term1018974).getDeclaredField((String) "AES256SHA256");
        ((Field) term1018973).setAccessible(true);
        Object enum660 = ((Field) term1018973).get((Object) null);
        Class<? extends Object> term1019302 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1019301 = ((Class) term1019302).getDeclaredField((String) "COPY");
        ((Field) term1019301).setAccessible(true);
        Object enum661 = ((Field) term1019301).get((Object) null);
        Object[] term1015709 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term1016004 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1016286 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1016410 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1016692 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term1016004, term1016004.getClass(), "method", enum659);
        setElement(term1015709, 0, term1016004);
        setField(term1016286, term1016286.getClass(), "method", enum659);
        setElement(term1015709, 1, term1016286);
        setField(term1016410, term1016410.getClass(), "method", enum660);
        setElement(term1015709, 2, term1016410);
        setField(term1016692, term1016692.getClass(), "method", enum661);
        setElement(term1015709, 3, term1016692);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1015709);
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
        args[1] = enum658;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


