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

public class Coders_addEncoder_684310764113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum294;

    public Coders_addEncoder_684310764113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term265047 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term265046 = ((Class) term265047).getDeclaredField((String) "DEFLATE");
        ((Field) term265046).setAccessible(true);
        enum294 = ((Field) term265046).get((Object) null);
        Class<? extends Object> term265360 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term265359 = ((Class) term265360).getDeclaredField((String) "AES256SHA256");
        ((Field) term265359).setAccessible(true);
        Object enum295 = ((Field) term265359).get((Object) null);
        Class<? extends Object> term265688 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term265687 = ((Class) term265688).getDeclaredField((String) "DEFLATE");
        ((Field) term265687).setAccessible(true);
        Object enum296 = ((Field) term265687).get((Object) null);
        Object[] term262926 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term263217 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term263499 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term263805 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder"));
        setField(term263217, term263217.getClass(), "method", enum295);
        setElement(term262926, 0, term263217);
        setField(term263499, term263499.getClass(), "method", enum296);
        setField(term263499, term263499.getClass(), "coder", term263805);
        setElement(term262926, 1, term263499);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term262926);
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
        args[1] = enum294;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


