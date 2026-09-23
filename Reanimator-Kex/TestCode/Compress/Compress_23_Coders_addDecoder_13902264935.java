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
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69578;

    public Coders_addDecoder_13902264935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69578 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term69275 = (byte[]) newByteArray(1);
        setField(term69578, term69578.getClass(), "decompressionMethodId", term69275);
        Class<? extends Object> term72457 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term72456 = ((Class) term72457).getDeclaredField((String) "COPY");
        ((Field) term72456).setAccessible(true);
        Object enum108 = ((Field) term72456).get((Object) null);
        Class<? extends Object> term72761 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term72760 = ((Class) term72761).getDeclaredField((String) "AES256SHA256");
        ((Field) term72760).setAccessible(true);
        Object enum109 = ((Field) term72760).get((Object) null);
        Class<? extends Object> term73089 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term73088 = ((Class) term73089).getDeclaredField((String) "AES256SHA256");
        ((Field) term73088).setAccessible(true);
        Object enum110 = ((Field) term73088).get((Object) null);
        Class<? extends Object> term73417 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term73416 = ((Class) term73417).getDeclaredField((String) "AES256SHA256");
        ((Field) term73416).setAccessible(true);
        Object enum111 = ((Field) term73416).get((Object) null);
        Object[] term69450 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 7);
        Object term69702 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term69984 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term70266 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term70548 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term70672 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term70954 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term69702, term69702.getClass(), "method", enum108);
        setElement(term69450, 0, term69702);
        setField(term69984, term69984.getClass(), "method", enum109);
        setElement(term69450, 1, term69984);
        setField(term70266, term70266.getClass(), "method", enum110);
        setElement(term69450, 2, term70266);
        setField(term70548, term70548.getClass(), "method", enum109);
        setElement(term69450, 3, term70548);
        setField(term70672, term70672.getClass(), "method", enum111);
        setElement(term69450, 4, term70672);
        setElement(term69450, 5, term70672);
        setElement(term69450, 6, term70954);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term69450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Coder");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term69578;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


