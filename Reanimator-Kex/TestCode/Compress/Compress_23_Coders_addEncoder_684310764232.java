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

public class Coders_addEncoder_684310764232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum624;

    public Coders_addEncoder_684310764232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term998214 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term998213 = ((Class) term998214).getDeclaredField((String) "DEFLATE");
        ((Field) term998213).setAccessible(true);
        enum624 = ((Field) term998213).get((Object) null);
        Class<? extends Object> term998527 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term998526 = ((Class) term998527).getDeclaredField((String) "COPY");
        ((Field) term998526).setAccessible(true);
        Object enum625 = ((Field) term998526).get((Object) null);
        Class<? extends Object> term998831 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term998830 = ((Class) term998831).getDeclaredField((String) "AES256SHA256");
        ((Field) term998830).setAccessible(true);
        Object enum626 = ((Field) term998830).get((Object) null);
        Class<? extends Object> term999159 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term999158 = ((Class) term999159).getDeclaredField((String) "DEFLATE");
        ((Field) term999158).setAccessible(true);
        Object enum627 = ((Field) term999158).get((Object) null);
        Object[] term995489 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term995784 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term996066 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term996348 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term996654 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder"));
        setField(term995784, term995784.getClass(), "method", enum625);
        setElement(term995489, 0, term995784);
        setField(term996066, term996066.getClass(), "method", enum626);
        setElement(term995489, 1, term996066);
        setField(term996348, term996348.getClass(), "method", enum627);
        setField(term996348, term996348.getClass(), "coder", term996654);
        setElement(term995489, 2, term996348);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term995489);
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
        args[1] = enum624;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


