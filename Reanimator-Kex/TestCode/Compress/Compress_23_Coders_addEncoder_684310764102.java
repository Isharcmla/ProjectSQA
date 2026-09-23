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

public class Coders_addEncoder_684310764102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169998;
     Object enum274;

    public Coders_addEncoder_684310764102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169998 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        Class<? extends Object> term170856 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term170855 = ((Class) term170856).getDeclaredField((String) "AES256SHA256");
        ((Field) term170855).setAccessible(true);
        enum274 = ((Field) term170855).get((Object) null);
        Class<? extends Object> term171184 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term171183 = ((Class) term171184).getDeclaredField((String) "LZMA2");
        ((Field) term171183).setAccessible(true);
        Object enum275 = ((Field) term171183).get((Object) null);
        Class<? extends Object> term171491 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term171490 = ((Class) term171491).getDeclaredField((String) "AES256SHA256");
        ((Field) term171490).setAccessible(true);
        Object enum276 = ((Field) term171490).get((Object) null);
        Object[] term169901 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term170280 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term170562 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term170854 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term170280, term170280.getClass(), "method", enum275);
        setElement(term169901, 0, term170280);
        setField(term170562, term170562.getClass(), "method", enum276);
        setField(term170562, term170562.getClass(), "coder", term170854);
        setElement(term169901, 1, term170562);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term169901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term169998;
        args[1] = enum274;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


