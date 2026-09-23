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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16843;

    public Coders_addDecoder_13902264913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16843 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term16843, term16843.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term18959 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term18958 = ((Class) term18959).getDeclaredField((String) "LZMA");
        ((Field) term18958).setAccessible(true);
        Object enum29 = ((Field) term18958).get((Object) null);
        Class<? extends Object> term19263 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term19262 = ((Class) term19263).getDeclaredField((String) "BZIP2");
        ((Field) term19262).setAccessible(true);
        Object enum30 = ((Field) term19262).get((Object) null);
        Class<? extends Object> term19570 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term19569 = ((Class) term19570).getDeclaredField((String) "AES256SHA256");
        ((Field) term19569).setAccessible(true);
        Object enum31 = ((Field) term19569).get((Object) null);
        Object[] term16723 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term16967 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term17249 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term17531 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term16967, term16967.getClass(), "method", enum29);
        setElement(term16723, 0, term16967);
        setField(term17249, term17249.getClass(), "method", enum30);
        setElement(term16723, 1, term17249);
        setField(term17531, term17531.getClass(), "method", enum31);
        setElement(term16723, 2, term17531);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term16723);
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
        args[1] = term16843;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


