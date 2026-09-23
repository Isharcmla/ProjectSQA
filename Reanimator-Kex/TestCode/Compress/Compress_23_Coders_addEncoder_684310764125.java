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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280800;
     Object enum326;

    public Coders_addEncoder_684310764125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280800 = newInstance(Class.forName("java.io.ObjectOutputStream"));
        Class<? extends Object> term282875 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term282874 = ((Class) term282875).getDeclaredField((String) "DEFLATE");
        ((Field) term282874).setAccessible(true);
        enum326 = ((Field) term282874).get((Object) null);
        Class<? extends Object> term283188 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term283187 = ((Class) term283188).getDeclaredField((String) "LZMA");
        ((Field) term283187).setAccessible(true);
        Object enum327 = ((Field) term283187).get((Object) null);
        Class<? extends Object> term283492 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term283491 = ((Class) term283492).getDeclaredField((String) "DEFLATE");
        ((Field) term283491).setAccessible(true);
        Object enum328 = ((Field) term283491).get((Object) null);
        Object[] term280733 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term281082 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term281364 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term281656 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term281082, term281082.getClass(), "method", enum327);
        setElement(term280733, 0, term281082);
        setField(term281364, term281364.getClass(), "method", enum328);
        setField(term281364, term281364.getClass(), "coder", term281656);
        setElement(term280733, 1, term281364);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term280733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term280800;
        args[1] = enum326;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


