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
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149046;

    public Coders_addDecoder_13902264981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149046 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term148769 = (byte[]) newByteArray(0);
        setField(term149046, term149046.getClass(), "decompressionMethodId", term148769);
        Class<? extends Object> term150018 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term150017 = ((Class) term150018).getDeclaredField((String) "COPY");
        ((Field) term150017).setAccessible(true);
        Object enum244 = ((Field) term150017).get((Object) null);
        Class<? extends Object> term150322 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term150321 = ((Class) term150322).getDeclaredField((String) "DEFLATE");
        ((Field) term150321).setAccessible(true);
        Object enum245 = ((Field) term150321).get((Object) null);
        Class<? extends Object> term150635 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term150634 = ((Class) term150635).getDeclaredField((String) "LZMA");
        ((Field) term150634).setAccessible(true);
        Object enum246 = ((Field) term150634).get((Object) null);
        Object[] term148925 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term149170 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term149452 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term149734 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term150016 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term149170, term149170.getClass(), "method", enum244);
        setElement(term148925, 0, term149170);
        setField(term149452, term149452.getClass(), "method", enum245);
        setElement(term148925, 1, term149452);
        setField(term149734, term149734.getClass(), "method", enum246);
        setElement(term148925, 2, term149734);
        setElement(term148925, 3, term150016);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term148925);
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
        args[1] = term149046;
        args[2] = null;
        callMethod(klass, "addDecoder", argTypes, null, args);
    }

};


