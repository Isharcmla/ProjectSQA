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

public class Coders_addDecoder_139022649216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972798;

    public Coders_addDecoder_139022649216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term972798 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term972798, term972798.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term973488 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term973487 = ((Class) term973488).getDeclaredField((String) "AES256SHA256");
        ((Field) term973487).setAccessible(true);
        Object enum582 = ((Field) term973487).get((Object) null);
        Class<? extends Object> term973816 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term973815 = ((Class) term973816).getDeclaredField((String) "COPY");
        ((Field) term973815).setAccessible(true);
        Object enum583 = ((Field) term973815).get((Object) null);
        Object[] term972681 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term972922 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term973204 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term973486 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term972922, term972922.getClass(), "method", enum582);
        setElement(term972681, 0, term972922);
        setField(term973204, term973204.getClass(), "method", enum583);
        setElement(term972681, 1, term973204);
        setElement(term972681, 2, term973486);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term972681);
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
        args[1] = term972798;
        args[2] = null;
        callMethod(klass, "addDecoder", argTypes, null, args);
    }

};


