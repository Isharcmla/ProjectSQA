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

public class Coders_addEncoder_684310764256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum696;
     Object enum700;

    public Coders_addEncoder_684310764256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1127993 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1127992 = ((Class) term1127993).getDeclaredField((String) "DEFLATE");
        ((Field) term1127992).setAccessible(true);
        enum696 = ((Field) term1127992).get((Object) null);
        Class<? extends Object> term1128306 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1128305 = ((Class) term1128306).getDeclaredField((String) "COPY");
        ((Field) term1128305).setAccessible(true);
        Object enum697 = ((Field) term1128305).get((Object) null);
        Class<? extends Object> term1128610 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1128609 = ((Class) term1128610).getDeclaredField((String) "AES256SHA256");
        ((Field) term1128609).setAccessible(true);
        Object enum698 = ((Field) term1128609).get((Object) null);
        Class<? extends Object> term1128938 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1128937 = ((Class) term1128938).getDeclaredField((String) "DEFLATE");
        ((Field) term1128937).setAccessible(true);
        Object enum699 = ((Field) term1128937).get((Object) null);
        Object[] term1125558 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term1125853 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1126135 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1126417 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1126707 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder"));
        setField(term1125853, term1125853.getClass(), "method", enum697);
        setElement(term1125558, 0, term1125853);
        setField(term1126135, term1126135.getClass(), "method", enum698);
        setElement(term1125558, 1, term1126135);
        setField(term1126417, term1126417.getClass(), "method", enum699);
        setField(term1126417, term1126417.getClass(), "coder", term1126707);
        setElement(term1125558, 2, term1126417);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1125558);
        Class<? extends Object> term1129251 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1129250 = ((Class) term1129251).getDeclaredField((String) "DEFLATE");
        ((Field) term1129250).setAccessible(true);
        enum700 = ((Field) term1129250).get((Object) null);
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
        args[1] = enum696;
        args[2] = null;
        Object retValue = callMethod(klass, "addEncoder", argTypes, null, args);
        assertTrue(recursiveEquals(enum696, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


