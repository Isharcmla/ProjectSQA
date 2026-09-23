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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum618;

    public Coders_addEncoder_684310764230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term994681 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term994680 = ((Class) term994681).getDeclaredField((String) "LZMA");
        ((Field) term994680).setAccessible(true);
        enum618 = ((Field) term994680).get((Object) null);
        Class<? extends Object> term994985 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term994984 = ((Class) term994985).getDeclaredField((String) "LZMA");
        ((Field) term994984).setAccessible(true);
        Object enum619 = ((Field) term994984).get((Object) null);
        Object[] term993210 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term993497 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term993787 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$LZMADecoder"));
        setField(term993497, term993497.getClass(), "method", enum619);
        setField(term993497, term993497.getClass(), "coder", term993787);
        setElement(term993210, 0, term993497);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term993210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum618;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


