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

public class Coders_addDecoder_13902264931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63087;

    public Coders_addDecoder_13902264931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63087 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term63087, term63087.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term65792 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term65791 = ((Class) term65792).getDeclaredField((String) "BZIP2");
        ((Field) term65791).setAccessible(true);
        Object enum96 = ((Field) term65791).get((Object) null);
        Class<? extends Object> term66099 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term66098 = ((Class) term66099).getDeclaredField((String) "BZIP2");
        ((Field) term66098).setAccessible(true);
        Object enum97 = ((Field) term66098).get((Object) null);
        Class<? extends Object> term66406 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term66405 = ((Class) term66406).getDeclaredField((String) "BZIP2");
        ((Field) term66405).setAccessible(true);
        Object enum98 = ((Field) term66405).get((Object) null);
        Class<? extends Object> term66713 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term66712 = ((Class) term66713).getDeclaredField((String) "COPY");
        ((Field) term66712).setAccessible(true);
        Object enum99 = ((Field) term66712).get((Object) null);
        Object[] term62961 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term63211 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term63493 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term63775 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term64057 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term63211, term63211.getClass(), "method", enum96);
        setElement(term62961, 0, term63211);
        setField(term63493, term63493.getClass(), "method", enum97);
        setElement(term62961, 1, term63493);
        setField(term63775, term63775.getClass(), "method", enum98);
        setElement(term62961, 2, term63775);
        setField(term64057, term64057.getClass(), "method", enum99);
        setElement(term62961, 3, term64057);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term62961);
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
        args[1] = term63087;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


