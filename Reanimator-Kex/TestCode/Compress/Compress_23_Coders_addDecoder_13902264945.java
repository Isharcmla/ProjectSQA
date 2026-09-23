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

public class Coders_addDecoder_13902264945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87757;

    public Coders_addDecoder_13902264945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87757 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term87463 = (byte[]) newByteArray(2);
        setField(term87757, term87757.getClass(), "decompressionMethodId", term87463);
        Class<? extends Object> term91167 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term91166 = ((Class) term91167).getDeclaredField((String) "COPY");
        ((Field) term91166).setAccessible(true);
        Object enum139 = ((Field) term91166).get((Object) null);
        Class<? extends Object> term91471 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term91470 = ((Class) term91471).getDeclaredField((String) "COPY");
        ((Field) term91470).setAccessible(true);
        Object enum140 = ((Field) term91470).get((Object) null);
        Class<? extends Object> term91775 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term91774 = ((Class) term91775).getDeclaredField((String) "DEFLATE");
        ((Field) term91774).setAccessible(true);
        Object enum141 = ((Field) term91774).get((Object) null);
        Class<? extends Object> term92088 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term92087 = ((Class) term92088).getDeclaredField((String) "AES256SHA256");
        ((Field) term92087).setAccessible(true);
        Object enum142 = ((Field) term92087).get((Object) null);
        Class<? extends Object> term92416 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term92415 = ((Class) term92416).getDeclaredField((String) "COPY");
        ((Field) term92415).setAccessible(true);
        Object enum143 = ((Field) term92415).get((Object) null);
        Object[] term87627 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 6);
        Object term87881 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term88163 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term88445 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term88727 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term89009 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term87881, term87881.getClass(), "method", enum139);
        setElement(term87627, 0, term87881);
        setField(term88163, term88163.getClass(), "method", enum140);
        setElement(term87627, 1, term88163);
        setField(term88445, term88445.getClass(), "method", enum141);
        setElement(term87627, 2, term88445);
        setField(term88727, term88727.getClass(), "method", enum142);
        setElement(term87627, 3, term88727);
        setField(term89009, term89009.getClass(), "method", enum143);
        setElement(term87627, 4, term89009);
        setElement(term87627, 5, term89009);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term87627);
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
        args[1] = term87757;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


