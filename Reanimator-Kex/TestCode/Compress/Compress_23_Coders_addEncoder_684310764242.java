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

public class Coders_addEncoder_684310764242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum650;

    public Coders_addEncoder_684310764242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1014250 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1014249 = ((Class) term1014250).getDeclaredField((String) "AES256SHA256");
        ((Field) term1014249).setAccessible(true);
        enum650 = ((Field) term1014249).get((Object) null);
        Class<? extends Object> term1014578 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1014577 = ((Class) term1014578).getDeclaredField((String) "DEFLATE");
        ((Field) term1014577).setAccessible(true);
        Object enum651 = ((Field) term1014577).get((Object) null);
        Class<? extends Object> term1014891 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1014890 = ((Class) term1014891).getDeclaredField((String) "BZIP2");
        ((Field) term1014890).setAccessible(true);
        Object enum652 = ((Field) term1014890).get((Object) null);
        Class<? extends Object> term1015198 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1015197 = ((Class) term1015198).getDeclaredField((String) "AES256SHA256");
        ((Field) term1015197).setAccessible(true);
        Object enum653 = ((Field) term1015197).get((Object) null);
        Object[] term1011434 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term1011730 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1012012 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1012294 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1012590 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder"));
        Object term1012714 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term1011730, term1011730.getClass(), "method", enum651);
        setElement(term1011434, 0, term1011730);
        setField(term1012012, term1012012.getClass(), "method", enum652);
        setElement(term1011434, 1, term1012012);
        setField(term1012294, term1012294.getClass(), "method", enum653);
        setField(term1012294, term1012294.getClass(), "coder", term1012590);
        setElement(term1011434, 2, term1012294);
        setElement(term1011434, 3, term1012714);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1011434);
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
        args[1] = enum650;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


