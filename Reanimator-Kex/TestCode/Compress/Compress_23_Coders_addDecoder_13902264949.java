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

public class Coders_addDecoder_13902264949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96630;

    public Coders_addDecoder_13902264949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96630 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term96630, term96630.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term99332 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term99331 = ((Class) term99332).getDeclaredField((String) "DEFLATE");
        ((Field) term99331).setAccessible(true);
        Object enum154 = ((Field) term99331).get((Object) null);
        Class<? extends Object> term99645 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term99644 = ((Class) term99645).getDeclaredField((String) "DEFLATE");
        ((Field) term99644).setAccessible(true);
        Object enum155 = ((Field) term99644).get((Object) null);
        Class<? extends Object> term99958 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term99957 = ((Class) term99958).getDeclaredField((String) "LZMA");
        ((Field) term99957).setAccessible(true);
        Object enum156 = ((Field) term99957).get((Object) null);
        Class<? extends Object> term100262 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term100261 = ((Class) term100262).getDeclaredField((String) "LZMA");
        ((Field) term100261).setAccessible(true);
        Object enum157 = ((Field) term100261).get((Object) null);
        Object[] term96506 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term96754 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term97036 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term97318 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term97600 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term96754, term96754.getClass(), "method", enum154);
        setElement(term96506, 0, term96754);
        setField(term97036, term97036.getClass(), "method", enum155);
        setElement(term96506, 1, term97036);
        setField(term97318, term97318.getClass(), "method", enum156);
        setElement(term96506, 2, term97318);
        setField(term97600, term97600.getClass(), "method", enum157);
        setElement(term96506, 3, term97600);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term96506);
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
        args[1] = term96630;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


