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

public class Coders_addDecoder_13902264937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74159;

    public Coders_addDecoder_13902264937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74159 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term74159, term74159.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term75805 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term75804 = ((Class) term75805).getDeclaredField((String) "COPY");
        ((Field) term75804).setAccessible(true);
        Object enum114 = ((Field) term75804).get((Object) null);
        Class<? extends Object> term76109 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term76108 = ((Class) term76109).getDeclaredField((String) "AES256SHA256");
        ((Field) term76108).setAccessible(true);
        Object enum115 = ((Field) term76108).get((Object) null);
        Object[] term74041 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term74283 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term74565 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term74861 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder"));
        setField(term74283, term74283.getClass(), "method", enum114);
        setElement(term74041, 0, term74283);
        setField(term74565, term74565.getClass(), "method", enum115);
        setField(term74565, term74565.getClass(), "coder", term74861);
        setElement(term74041, 1, term74565);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term74041);
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
        args[1] = term74159;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


