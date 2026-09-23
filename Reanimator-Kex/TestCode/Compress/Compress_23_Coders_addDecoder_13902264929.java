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

public class Coders_addDecoder_13902264929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57839;

    public Coders_addDecoder_13902264929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57839 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term57839, term57839.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term61173 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term61172 = ((Class) term61173).getDeclaredField((String) "COPY");
        ((Field) term61172).setAccessible(true);
        Object enum87 = ((Field) term61172).get((Object) null);
        Class<? extends Object> term61477 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term61476 = ((Class) term61477).getDeclaredField((String) "DEFLATE");
        ((Field) term61476).setAccessible(true);
        Object enum88 = ((Field) term61476).get((Object) null);
        Class<? extends Object> term61790 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term61789 = ((Class) term61790).getDeclaredField((String) "AES256SHA256");
        ((Field) term61789).setAccessible(true);
        Object enum89 = ((Field) term61789).get((Object) null);
        Class<? extends Object> term62118 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term62117 = ((Class) term62118).getDeclaredField((String) "AES256SHA256");
        ((Field) term62117).setAccessible(true);
        Object enum90 = ((Field) term62117).get((Object) null);
        Class<? extends Object> term62446 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term62445 = ((Class) term62446).getDeclaredField((String) "COPY");
        ((Field) term62445).setAccessible(true);
        Object enum91 = ((Field) term62445).get((Object) null);
        Object[] term57707 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 6);
        Object term57963 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term58245 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term58527 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term58809 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term59091 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term57963, term57963.getClass(), "method", enum87);
        setElement(term57707, 0, term57963);
        setField(term58245, term58245.getClass(), "method", enum88);
        setElement(term57707, 1, term58245);
        setElement(term57707, 2, term58245);
        setField(term58527, term58527.getClass(), "method", enum89);
        setElement(term57707, 3, term58527);
        setField(term58809, term58809.getClass(), "method", enum90);
        setElement(term57707, 4, term58809);
        setField(term59091, term59091.getClass(), "method", enum91);
        setElement(term57707, 5, term59091);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term57707);
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
        args[1] = term57839;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


