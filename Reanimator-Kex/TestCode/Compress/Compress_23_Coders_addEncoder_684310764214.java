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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum574;

    public Coders_addEncoder_684310764214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term966404 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term966403 = ((Class) term966404).getDeclaredField((String) "DEFLATE");
        ((Field) term966403).setAccessible(true);
        enum574 = ((Field) term966403).get((Object) null);
        Class<? extends Object> term966717 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term966716 = ((Class) term966717).getDeclaredField((String) "COPY");
        ((Field) term966716).setAccessible(true);
        Object enum575 = ((Field) term966716).get((Object) null);
        Class<? extends Object> term967021 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term967020 = ((Class) term967021).getDeclaredField((String) "AES256SHA256");
        ((Field) term967020).setAccessible(true);
        Object enum576 = ((Field) term967020).get((Object) null);
        Class<? extends Object> term967349 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term967348 = ((Class) term967349).getDeclaredField((String) "DEFLATE");
        ((Field) term967348).setAccessible(true);
        Object enum577 = ((Field) term967348).get((Object) null);
        Object[] term795758 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 3);
        Object term796053 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term796335 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term796617 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term796895 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.LZMA2Decoder"));
        setField(term796053, term796053.getClass(), "method", enum575);
        setElement(term795758, 0, term796053);
        setField(term796335, term796335.getClass(), "method", enum576);
        setElement(term795758, 1, term796335);
        setField(term796617, term796617.getClass(), "method", enum577);
        setField(term796617, term796617.getClass(), "coder", term796895);
        setElement(term795758, 2, term796617);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term795758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum574;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


