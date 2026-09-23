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

public class Coders_addDecoder_13902264967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125085;

    public Coders_addDecoder_13902264967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125085 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term125085, term125085.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term127788 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term127787 = ((Class) term127788).getDeclaredField((String) "LZMA");
        ((Field) term127787).setAccessible(true);
        Object enum206 = ((Field) term127787).get((Object) null);
        Class<? extends Object> term128092 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term128091 = ((Class) term128092).getDeclaredField((String) "COPY");
        ((Field) term128091).setAccessible(true);
        Object enum207 = ((Field) term128091).get((Object) null);
        Class<? extends Object> term128396 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term128395 = ((Class) term128396).getDeclaredField((String) "BZIP2");
        ((Field) term128395).setAccessible(true);
        Object enum208 = ((Field) term128395).get((Object) null);
        Class<? extends Object> term128703 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term128702 = ((Class) term128703).getDeclaredField((String) "DEFLATE");
        ((Field) term128702).setAccessible(true);
        Object enum209 = ((Field) term128702).get((Object) null);
        Object[] term124961 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 16);
        Object term125209 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term125491 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term125773 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term126055 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term125209, term125209.getClass(), "method", enum206);
        setElement(term124961, 0, term125209);
        setField(term125491, term125491.getClass(), "method", enum207);
        setElement(term124961, 1, term125491);
        setField(term125773, term125773.getClass(), "method", enum208);
        setElement(term124961, 2, term125773);
        setField(term126055, term126055.getClass(), "method", enum209);
        setElement(term124961, 3, term126055);
        setElement(term124961, 4, term125773);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term124961);
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
        args[1] = term125085;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


