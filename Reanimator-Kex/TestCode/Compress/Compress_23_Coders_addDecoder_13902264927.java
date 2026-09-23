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

public class Coders_addDecoder_13902264927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47366;

    public Coders_addDecoder_13902264927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47366 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term47366, term47366.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term50720 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term50719 = ((Class) term50720).getDeclaredField((String) "BZIP2");
        ((Field) term50719).setAccessible(true);
        Object enum77 = ((Field) term50719).get((Object) null);
        Class<? extends Object> term51027 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term51026 = ((Class) term51027).getDeclaredField((String) "COPY");
        ((Field) term51026).setAccessible(true);
        Object enum78 = ((Field) term51026).get((Object) null);
        Class<? extends Object> term51331 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term51330 = ((Class) term51331).getDeclaredField((String) "AES256SHA256");
        ((Field) term51330).setAccessible(true);
        Object enum79 = ((Field) term51330).get((Object) null);
        Class<? extends Object> term51659 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term51658 = ((Class) term51659).getDeclaredField((String) "BZIP2");
        ((Field) term51658).setAccessible(true);
        Object enum80 = ((Field) term51658).get((Object) null);
        Class<? extends Object> term51966 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term51965 = ((Class) term51966).getDeclaredField((String) "COPY");
        ((Field) term51965).setAccessible(true);
        Object enum81 = ((Field) term51965).get((Object) null);
        Object[] term47234 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term47490 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term47772 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term48054 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term48336 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term48618 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term47490, term47490.getClass(), "method", enum77);
        setElement(term47234, 0, term47490);
        setField(term47772, term47772.getClass(), "method", enum78);
        setElement(term47234, 1, term47772);
        setField(term48054, term48054.getClass(), "method", enum79);
        setElement(term47234, 2, term48054);
        setField(term48336, term48336.getClass(), "method", enum80);
        setElement(term47234, 3, term48336);
        setField(term48618, term48618.getClass(), "method", enum81);
        setElement(term47234, 4, term48618);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term47234);
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
        args[1] = term47366;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


