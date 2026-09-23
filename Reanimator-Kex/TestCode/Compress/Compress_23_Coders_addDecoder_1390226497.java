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

public class Coders_addDecoder_1390226497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1767;

    public Coders_addDecoder_1390226497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1767 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term1564 = (byte[]) newByteArray(0);
        setField(term1767, term1767.getClass(), "decompressionMethodId", term1564);
        Class<? extends Object> term3299 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term3298 = ((Class) term3299).getDeclaredField((String) "AES256SHA256");
        ((Field) term3298).setAccessible(true);
        Object enum4 = ((Field) term3298).get((Object) null);
        Class<? extends Object> term3627 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term3626 = ((Class) term3627).getDeclaredField((String) "AES256SHA256");
        ((Field) term3626).setAccessible(true);
        Object enum5 = ((Field) term3626).get((Object) null);
        Object[] term1651 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term1891 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term2173 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term1891, term1891.getClass(), "method", enum4);
        setElement(term1651, 0, term1891);
        setField(term2173, term2173.getClass(), "method", enum5);
        setElement(term1651, 1, term2173);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1651);
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
        args[1] = term1767;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


