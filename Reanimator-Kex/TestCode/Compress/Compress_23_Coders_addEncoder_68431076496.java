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

public class Coders_addEncoder_68431076496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164547;
     Object enum264;

    public Coders_addEncoder_68431076496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164547 = newInstance(Class.forName("java.io.DataOutputStream"));
        Class<? extends Object> term165405 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term165404 = ((Class) term165405).getDeclaredField((String) "AES256SHA256");
        ((Field) term165404).setAccessible(true);
        enum264 = ((Field) term165404).get((Object) null);
        Class<? extends Object> term165733 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term165732 = ((Class) term165733).getDeclaredField((String) "LZMA2");
        ((Field) term165732).setAccessible(true);
        Object enum265 = ((Field) term165732).get((Object) null);
        Class<? extends Object> term166040 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term166039 = ((Class) term166040).getDeclaredField((String) "AES256SHA256");
        ((Field) term166039).setAccessible(true);
        Object enum266 = ((Field) term166039).get((Object) null);
        Object[] term164484 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term164829 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term165111 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term165403 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term164829, term164829.getClass(), "method", enum265);
        setElement(term164484, 0, term164829);
        setField(term165111, term165111.getClass(), "method", enum266);
        setField(term165111, term165111.getClass(), "coder", term165403);
        setElement(term164484, 1, term165111);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term164484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term164547;
        args[1] = enum264;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


