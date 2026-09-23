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

public class Coders_addDecoder_13902264962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118443;

    public Coders_addDecoder_13902264962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118443 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term118443, term118443.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term122336 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term122335 = ((Class) term122336).getDeclaredField((String) "COPY");
        ((Field) term122335).setAccessible(true);
        Object enum196 = ((Field) term122335).get((Object) null);
        Class<? extends Object> term122640 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term122639 = ((Class) term122640).getDeclaredField((String) "BZIP2");
        ((Field) term122639).setAccessible(true);
        Object enum197 = ((Field) term122639).get((Object) null);
        Class<? extends Object> term122947 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term122946 = ((Class) term122947).getDeclaredField((String) "AES256SHA256");
        ((Field) term122946).setAccessible(true);
        Object enum198 = ((Field) term122946).get((Object) null);
        Object[] term118321 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term118567 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term118849 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term119131 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term118567, term118567.getClass(), "method", enum196);
        setElement(term118321, 0, term118567);
        setField(term118849, term118849.getClass(), "method", enum197);
        setElement(term118321, 1, term118849);
        setField(term119131, term119131.getClass(), "method", enum198);
        setElement(term118321, 2, term119131);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term118321);
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
        args[1] = term118443;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


