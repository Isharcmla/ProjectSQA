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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum451;

    public Coders_addEncoder_684310764170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term504523 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term504522 = ((Class) term504523).getDeclaredField((String) "COPY");
        ((Field) term504522).setAccessible(true);
        enum451 = ((Field) term504522).get((Object) null);
        Class<? extends Object> term504827 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term504826 = ((Class) term504827).getDeclaredField((String) "LZMA");
        ((Field) term504826).setAccessible(true);
        Object enum452 = ((Field) term504826).get((Object) null);
        Class<? extends Object> term505131 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term505130 = ((Class) term505131).getDeclaredField((String) "AES256SHA256");
        ((Field) term505130).setAccessible(true);
        Object enum453 = ((Field) term505130).get((Object) null);
        Object[] term502561 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term502851 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term503133 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term502851, term502851.getClass(), "method", enum452);
        setElement(term502561, 0, term502851);
        setElement(term502561, 1, term502851);
        setField(term503133, term503133.getClass(), "method", enum453);
        setElement(term502561, 2, term503133);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term502561);
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
        args[1] = enum451;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


