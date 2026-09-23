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

public class Coders_addDecoder_13902264943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82971;

    public Coders_addDecoder_13902264943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82971 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term82476 = (byte[]) newByteArray(32);
        setField(term82971, term82971.getClass(), "decompressionMethodId", term82476);
        Class<? extends Object> term86148 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term86147 = ((Class) term86148).getDeclaredField((String) "COPY");
        ((Field) term86147).setAccessible(true);
        Object enum130 = ((Field) term86147).get((Object) null);
        Class<? extends Object> term86452 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term86451 = ((Class) term86452).getDeclaredField((String) "COPY");
        ((Field) term86451).setAccessible(true);
        Object enum131 = ((Field) term86451).get((Object) null);
        Class<? extends Object> term86756 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term86755 = ((Class) term86756).getDeclaredField((String) "DEFLATE");
        ((Field) term86755).setAccessible(true);
        Object enum132 = ((Field) term86755).get((Object) null);
        Class<? extends Object> term87069 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term87068 = ((Class) term87069).getDeclaredField((String) "DEFLATE");
        ((Field) term87068).setAccessible(true);
        Object enum133 = ((Field) term87068).get((Object) null);
        Object[] term82843 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 6);
        Object term83095 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term83377 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term83659 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term83941 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term84065 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term84347 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term83095, term83095.getClass(), "method", enum130);
        setElement(term82843, 0, term83095);
        setField(term83377, term83377.getClass(), "method", enum131);
        setElement(term82843, 1, term83377);
        setField(term83659, term83659.getClass(), "method", enum132);
        setElement(term82843, 2, term83659);
        setField(term83941, term83941.getClass(), "method", enum132);
        setElement(term82843, 3, term83941);
        setField(term84065, term84065.getClass(), "method", enum133);
        setElement(term82843, 4, term84065);
        setField(term84347, term84347.getClass(), "method", enum131);
        setElement(term82843, 5, term84347);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term82843);
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
        args[1] = term82971;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


