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

public class Coders_addDecoder_13902264986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156645;

    public Coders_addDecoder_13902264986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156645 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term155415 = (byte[]) newByteArray(512);
        setField(term156645, term156645.getClass(), "decompressionMethodId", term155415);
        Class<? extends Object> term157723 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term157722 = ((Class) term157723).getDeclaredField((String) "DEFLATE");
        ((Field) term157722).setAccessible(true);
        Object enum253 = ((Field) term157722).get((Object) null);
        Class<? extends Object> term158036 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term158035 = ((Class) term158036).getDeclaredField((String) "LZMA");
        ((Field) term158035).setAccessible(true);
        Object enum254 = ((Field) term158035).get((Object) null);
        Object[] term156529 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term156769 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term157051 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term156769, term156769.getClass(), "method", enum253);
        setElement(term156529, 0, term156769);
        setField(term157051, term157051.getClass(), "method", enum254);
        setElement(term156529, 1, term157051);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term156529);
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
        args[1] = term156645;
        args[2] = null;
        callMethod(klass, "addDecoder", argTypes, null, args);
    }

};


