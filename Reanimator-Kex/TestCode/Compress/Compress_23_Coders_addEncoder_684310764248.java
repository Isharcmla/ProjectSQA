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

public class Coders_addEncoder_684310764248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum670;

    public Coders_addEncoder_684310764248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1025182 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1025181 = ((Class) term1025182).getDeclaredField((String) "DEFLATE");
        ((Field) term1025181).setAccessible(true);
        enum670 = ((Field) term1025181).get((Object) null);
        Class<? extends Object> term1025495 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1025494 = ((Class) term1025495).getDeclaredField((String) "AES256SHA256");
        ((Field) term1025494).setAccessible(true);
        Object enum671 = ((Field) term1025494).get((Object) null);
        Class<? extends Object> term1025823 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1025822 = ((Class) term1025823).getDeclaredField((String) "LZMA");
        ((Field) term1025822).setAccessible(true);
        Object enum672 = ((Field) term1025822).get((Object) null);
        Class<? extends Object> term1026127 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1026126 = ((Class) term1026127).getDeclaredField((String) "LZMA2");
        ((Field) term1026126).setAccessible(true);
        Object enum673 = ((Field) term1026126).get((Object) null);
        Object[] term1022405 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term1022701 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1022983 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1023265 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1023389 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1023671 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term1022701, term1022701.getClass(), "method", enum671);
        setElement(term1022405, 0, term1022701);
        setField(term1022983, term1022983.getClass(), "method", enum672);
        setElement(term1022405, 1, term1022983);
        setField(term1023265, term1023265.getClass(), "method", enum671);
        setElement(term1022405, 2, term1023265);
        setField(term1023389, term1023389.getClass(), "method", enum673);
        setElement(term1022405, 3, term1023389);
        setElement(term1022405, 4, term1023671);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1022405);
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
        args[1] = enum670;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


