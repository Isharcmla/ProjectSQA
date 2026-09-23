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

public class Coders_addDecoder_13902264988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158649;

    public Coders_addDecoder_13902264988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158649 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term158649, term158649.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term159497 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term159496 = ((Class) term159497).getDeclaredField((String) "COPY");
        ((Field) term159496).setAccessible(true);
        Object enum255 = ((Field) term159496).get((Object) null);
        Class<? extends Object> term159801 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term159800 = ((Class) term159801).getDeclaredField((String) "AES256SHA256");
        ((Field) term159800).setAccessible(true);
        Object enum256 = ((Field) term159800).get((Object) null);
        Class<? extends Object> term160129 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term160128 = ((Class) term160129).getDeclaredField((String) "BZIP2");
        ((Field) term160128).setAccessible(true);
        Object enum257 = ((Field) term160128).get((Object) null);
        Object[] term158529 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term158773 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term159055 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term159337 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term158773, term158773.getClass(), "method", enum255);
        setElement(term158529, 0, term158773);
        setElement(term158529, 1, term158773);
        setField(term159055, term159055.getClass(), "method", enum256);
        setElement(term158529, 2, term159055);
        setField(term159337, term159337.getClass(), "method", enum257);
        setElement(term158529, 3, term159337);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term158529);
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
        args[1] = term158649;
        args[2] = null;
        callMethod(klass, "addDecoder", argTypes, null, args);
    }

};


