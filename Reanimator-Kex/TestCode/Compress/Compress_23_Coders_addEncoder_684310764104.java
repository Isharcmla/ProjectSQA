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

public class Coders_addEncoder_684310764104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172065;
     Object enum277;

    public Coders_addEncoder_684310764104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172065 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        Class<? extends Object> term172923 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term172922 = ((Class) term172923).getDeclaredField((String) "AES256SHA256");
        ((Field) term172922).setAccessible(true);
        enum277 = ((Field) term172922).get((Object) null);
        Class<? extends Object> term173251 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term173250 = ((Class) term173251).getDeclaredField((String) "LZMA2");
        ((Field) term173250).setAccessible(true);
        Object enum278 = ((Field) term173250).get((Object) null);
        Class<? extends Object> term173558 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term173557 = ((Class) term173558).getDeclaredField((String) "AES256SHA256");
        ((Field) term173557).setAccessible(true);
        Object enum279 = ((Field) term173557).get((Object) null);
        Object[] term171992 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term172347 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term172629 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term172921 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term172347, term172347.getClass(), "method", enum278);
        setElement(term171992, 0, term172347);
        setField(term172629, term172629.getClass(), "method", enum279);
        setField(term172629, term172629.getClass(), "coder", term172921);
        setElement(term171992, 1, term172629);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term171992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term172065;
        args[1] = enum277;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


