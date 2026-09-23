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

public class Coders_addDecoder_13902264911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9727;

    public Coders_addDecoder_13902264911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9727 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term8369 = (byte[]) newByteArray(0);
        setField(term9727, term9727.getClass(), "decompressionMethodId", term8369);
        Class<? extends Object> term13634 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term13633 = ((Class) term13634).getDeclaredField((String) "LZMA");
        ((Field) term13633).setAccessible(true);
        Object enum20 = ((Field) term13633).get((Object) null);
        Class<? extends Object> term13938 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term13937 = ((Class) term13938).getDeclaredField((String) "COPY");
        ((Field) term13937).setAccessible(true);
        Object enum21 = ((Field) term13937).get((Object) null);
        Class<? extends Object> term14242 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term14241 = ((Class) term14242).getDeclaredField((String) "AES256SHA256");
        ((Field) term14241).setAccessible(true);
        Object enum22 = ((Field) term14241).get((Object) null);
        Class<? extends Object> term14570 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term14569 = ((Class) term14570).getDeclaredField((String) "BZIP2");
        ((Field) term14569).setAccessible(true);
        Object enum23 = ((Field) term14569).get((Object) null);
        Class<? extends Object> term14877 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term14876 = ((Class) term14877).getDeclaredField((String) "AES256SHA256");
        ((Field) term14876).setAccessible(true);
        Object enum24 = ((Field) term14876).get((Object) null);
        Class<? extends Object> term15205 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term15204 = ((Class) term15205).getDeclaredField((String) "BZIP2");
        ((Field) term15204).setAccessible(true);
        Object enum25 = ((Field) term15204).get((Object) null);
        Object[] term9592 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 128);
        Object term9851 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term10133 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term10415 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term10697 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term10979 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term11261 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term9851, term9851.getClass(), "method", enum20);
        setElement(term9592, 0, term9851);
        setField(term10133, term10133.getClass(), "method", enum21);
        setElement(term9592, 1, term10133);
        setField(term10415, term10415.getClass(), "method", enum22);
        setElement(term9592, 2, term10415);
        setField(term10697, term10697.getClass(), "method", enum23);
        setElement(term9592, 3, term10697);
        setField(term10979, term10979.getClass(), "method", enum24);
        setElement(term9592, 4, term10979);
        setField(term11261, term11261.getClass(), "method", enum25);
        setElement(term9592, 5, term11261);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term9592);
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
        args[1] = term9727;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


