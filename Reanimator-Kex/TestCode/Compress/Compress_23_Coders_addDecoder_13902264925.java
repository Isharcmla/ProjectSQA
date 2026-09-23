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

public class Coders_addDecoder_13902264925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41895;

    public Coders_addDecoder_13902264925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41895 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term41895, term41895.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term44019 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term44018 = ((Class) term44019).getDeclaredField((String) "BZIP2");
        ((Field) term44018).setAccessible(true);
        Object enum69 = ((Field) term44018).get((Object) null);
        Class<? extends Object> term44326 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term44325 = ((Class) term44326).getDeclaredField((String) "DEFLATE");
        ((Field) term44325).setAccessible(true);
        Object enum70 = ((Field) term44325).get((Object) null);
        Class<? extends Object> term44639 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term44638 = ((Class) term44639).getDeclaredField((String) "DEFLATE");
        ((Field) term44638).setAccessible(true);
        Object enum71 = ((Field) term44638).get((Object) null);
        Object[] term41772 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term42019 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term42301 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term42583 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term42019, term42019.getClass(), "method", enum69);
        setElement(term41772, 0, term42019);
        setField(term42301, term42301.getClass(), "method", enum70);
        setElement(term41772, 1, term42301);
        setField(term42583, term42583.getClass(), "method", enum71);
        setElement(term41772, 2, term42583);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term41772);
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
        args[1] = term41895;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


