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
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153540;

    public Coders_addDecoder_13902264983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153540 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term153540, term153540.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term154388 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term154387 = ((Class) term154388).getDeclaredField((String) "LZMA");
        ((Field) term154387).setAccessible(true);
        Object enum250 = ((Field) term154387).get((Object) null);
        Class<? extends Object> term154692 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term154691 = ((Class) term154692).getDeclaredField((String) "LZMA");
        ((Field) term154691).setAccessible(true);
        Object enum251 = ((Field) term154691).get((Object) null);
        Class<? extends Object> term154996 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term154995 = ((Class) term154996).getDeclaredField((String) "AES256SHA256");
        ((Field) term154995).setAccessible(true);
        Object enum252 = ((Field) term154995).get((Object) null);
        Object[] term153419 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term153664 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term153946 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term154228 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term153664, term153664.getClass(), "method", enum250);
        setElement(term153419, 0, term153664);
        setField(term153946, term153946.getClass(), "method", enum251);
        setElement(term153419, 1, term153946);
        setField(term154228, term154228.getClass(), "method", enum252);
        setElement(term153419, 2, term154228);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term153419);
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
        args[1] = term153540;
        args[2] = null;
        callMethod(klass, "addDecoder", argTypes, null, args);
    }

};


