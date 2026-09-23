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

public class Coders_addDecoder_139022649106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174295;

    public Coders_addDecoder_139022649106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174295 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        setField(term174295, term174295.getClass(), "decompressionMethodId", null);
        Class<? extends Object> term174861 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term174860 = ((Class) term174861).getDeclaredField((String) "LZMA");
        ((Field) term174860).setAccessible(true);
        Object enum280 = ((Field) term174860).get((Object) null);
        Class<? extends Object> term175165 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term175164 = ((Class) term175165).getDeclaredField((String) "AES256SHA256");
        ((Field) term175164).setAccessible(true);
        Object enum281 = ((Field) term175164).get((Object) null);
        Object[] term174178 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term174419 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term174701 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term174419, term174419.getClass(), "method", enum280);
        setElement(term174178, 0, term174419);
        setField(term174701, term174701.getClass(), "method", enum281);
        setElement(term174178, 1, term174701);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term174178);
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
        args[1] = term174295;
        args[2] = null;
        callMethod(klass, "addDecoder", argTypes, null, args);
    }

};


