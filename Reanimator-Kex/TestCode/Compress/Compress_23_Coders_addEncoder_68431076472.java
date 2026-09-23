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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum225;

    public Coders_addEncoder_68431076472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term138244 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term138243 = ((Class) term138244).getDeclaredField((String) "AES256SHA256");
        ((Field) term138243).setAccessible(true);
        enum225 = ((Field) term138243).get((Object) null);
        Class<? extends Object> term138572 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term138571 = ((Class) term138572).getDeclaredField((String) "COPY");
        ((Field) term138571).setAccessible(true);
        Object enum226 = ((Field) term138571).get((Object) null);
        Class<? extends Object> term138876 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term138875 = ((Class) term138876).getDeclaredField((String) "AES256SHA256");
        ((Field) term138875).setAccessible(true);
        Object enum227 = ((Field) term138875).get((Object) null);
        Object[] term132431 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term132722 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term133004 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term133310 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder"));
        setField(term132722, term132722.getClass(), "method", enum226);
        setElement(term132431, 0, term132722);
        setField(term133004, term133004.getClass(), "method", enum227);
        setField(term133004, term133004.getClass(), "coder", term133310);
        setElement(term132431, 1, term133004);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term132431);
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
        args[1] = enum225;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


