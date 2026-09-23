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

public class Coders_addDecoder_13902264921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30592;

    public Coders_addDecoder_13902264921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30592 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term30592, term30592.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term33308 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term33307 = ((Class) term33308).getDeclaredField((String) "COPY");
        ((Field) term33307).setAccessible(true);
        Object enum54 = ((Field) term33307).get((Object) null);
        Class<? extends Object> term33612 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term33611 = ((Class) term33612).getDeclaredField((String) "COPY");
        ((Field) term33611).setAccessible(true);
        Object enum55 = ((Field) term33611).get((Object) null);
        Class<? extends Object> term33916 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term33915 = ((Class) term33916).getDeclaredField((String) "COPY");
        ((Field) term33915).setAccessible(true);
        Object enum56 = ((Field) term33915).get((Object) null);
        Class<? extends Object> term34220 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term34219 = ((Class) term34220).getDeclaredField((String) "DEFLATE");
        ((Field) term34219).setAccessible(true);
        Object enum57 = ((Field) term34219).get((Object) null);
        Object[] term30465 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term30716 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term30998 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term31280 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term31562 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term30716, term30716.getClass(), "method", enum54);
        setElement(term30465, 0, term30716);
        setField(term30998, term30998.getClass(), "method", enum55);
        setElement(term30465, 1, term30998);
        setField(term31280, term31280.getClass(), "method", enum56);
        setElement(term30465, 2, term31280);
        setField(term31562, term31562.getClass(), "method", enum57);
        setElement(term30465, 3, term31562);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term30465);
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
        args[1] = term30592;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


