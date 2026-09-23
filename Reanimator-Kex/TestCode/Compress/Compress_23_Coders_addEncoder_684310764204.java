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

public class Coders_addEncoder_684310764204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum548;

    public Coders_addEncoder_684310764204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term783540 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term783539 = ((Class) term783540).getDeclaredField((String) "AES256SHA256");
        ((Field) term783539).setAccessible(true);
        enum548 = ((Field) term783539).get((Object) null);
        Class<? extends Object> term783868 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term783867 = ((Class) term783868).getDeclaredField((String) "LZMA2");
        ((Field) term783867).setAccessible(true);
        Object enum549 = ((Field) term783867).get((Object) null);
        Class<? extends Object> term784175 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term784174 = ((Class) term784175).getDeclaredField((String) "LZMA");
        ((Field) term784174).setAccessible(true);
        Object enum550 = ((Field) term784174).get((Object) null);
        Class<? extends Object> term784479 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term784478 = ((Class) term784479).getDeclaredField((String) "DEFLATE");
        ((Field) term784478).setAccessible(true);
        Object enum551 = ((Field) term784478).get((Object) null);
        Object[] term780876 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term781171 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term781453 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term781735 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term782017 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term781171, term781171.getClass(), "method", enum549);
        setElement(term780876, 0, term781171);
        setField(term781453, term781453.getClass(), "method", enum550);
        setElement(term780876, 1, term781453);
        setField(term781735, term781735.getClass(), "method", enum551);
        setElement(term780876, 2, term781735);
        setElement(term780876, 3, term782017);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term780876);
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
        args[1] = enum548;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


