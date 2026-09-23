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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104148;

    public Coders_addDecoder_13902264953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104148 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term103856 = (byte[]) newByteArray(1);
        setField(term104148, term104148.getClass(), "decompressionMethodId", term103856);
        Class<? extends Object> term107630 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term107629 = ((Class) term107630).getDeclaredField((String) "LZMA");
        ((Field) term107629).setAccessible(true);
        Object enum169 = ((Field) term107629).get((Object) null);
        Class<? extends Object> term107934 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term107933 = ((Class) term107934).getDeclaredField((String) "COPY");
        ((Field) term107933).setAccessible(true);
        Object enum170 = ((Field) term107933).get((Object) null);
        Class<? extends Object> term108238 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term108237 = ((Class) term108238).getDeclaredField((String) "COPY");
        ((Field) term108237).setAccessible(true);
        Object enum171 = ((Field) term108237).get((Object) null);
        Class<? extends Object> term108542 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term108541 = ((Class) term108542).getDeclaredField((String) "AES256SHA256");
        ((Field) term108541).setAccessible(true);
        Object enum172 = ((Field) term108541).get((Object) null);
        Class<? extends Object> term108870 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term108869 = ((Class) term108870).getDeclaredField((String) "BZIP2");
        ((Field) term108869).setAccessible(true);
        Object enum173 = ((Field) term108869).get((Object) null);
        Object[] term104016 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 32);
        Object term104272 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term104554 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term104836 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term105118 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term105400 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term105682 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term105806 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term104272, term104272.getClass(), "method", enum169);
        setElement(term104016, 0, term104272);
        setField(term104554, term104554.getClass(), "method", enum170);
        setElement(term104016, 1, term104554);
        setField(term104836, term104836.getClass(), "method", enum171);
        setElement(term104016, 2, term104836);
        setField(term105118, term105118.getClass(), "method", enum172);
        setElement(term104016, 3, term105118);
        setField(term105400, term105400.getClass(), "method", enum173);
        setElement(term104016, 4, term105400);
        setField(term105682, term105682.getClass(), "method", enum173);
        setElement(term104016, 5, term105682);
        setElement(term104016, 8, term105806);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term104016);
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
        args[1] = term104148;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


