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

public class Coders_addDecoder_13902264939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76794;

    public Coders_addDecoder_13902264939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76794 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term76794, term76794.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term79666 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term79665 = ((Class) term79666).getDeclaredField((String) "BZIP2");
        ((Field) term79665).setAccessible(true);
        Object enum120 = ((Field) term79665).get((Object) null);
        Class<? extends Object> term79973 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term79972 = ((Class) term79973).getDeclaredField((String) "LZMA");
        ((Field) term79972).setAccessible(true);
        Object enum121 = ((Field) term79972).get((Object) null);
        Class<? extends Object> term80277 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term80276 = ((Class) term80277).getDeclaredField((String) "LZMA");
        ((Field) term80276).setAccessible(true);
        Object enum122 = ((Field) term80276).get((Object) null);
        Class<? extends Object> term80581 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term80580 = ((Class) term80581).getDeclaredField((String) "COPY");
        ((Field) term80580).setAccessible(true);
        Object enum123 = ((Field) term80580).get((Object) null);
        Object[] term76663 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term76918 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term77200 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term77482 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term77764 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term77888 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term76918, term76918.getClass(), "method", enum120);
        setElement(term76663, 0, term76918);
        setField(term77200, term77200.getClass(), "method", enum121);
        setElement(term76663, 1, term77200);
        setField(term77482, term77482.getClass(), "method", enum122);
        setElement(term76663, 2, term77482);
        setField(term77764, term77764.getClass(), "method", enum122);
        setElement(term76663, 3, term77764);
        setField(term77888, term77888.getClass(), "method", enum123);
        setElement(term76663, 4, term77888);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term76663);
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
        args[1] = term76794;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


