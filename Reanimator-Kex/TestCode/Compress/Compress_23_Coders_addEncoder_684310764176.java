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

public class Coders_addEncoder_684310764176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum470;

    public Coders_addEncoder_684310764176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term515350 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term515349 = ((Class) term515350).getDeclaredField((String) "LZMA2");
        ((Field) term515349).setAccessible(true);
        enum470 = ((Field) term515349).get((Object) null);
        Class<? extends Object> term515657 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term515656 = ((Class) term515657).getDeclaredField((String) "BZIP2");
        ((Field) term515656).setAccessible(true);
        Object enum471 = ((Field) term515656).get((Object) null);
        Class<? extends Object> term515964 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term515963 = ((Class) term515964).getDeclaredField((String) "LZMA");
        ((Field) term515963).setAccessible(true);
        Object enum472 = ((Field) term515963).get((Object) null);
        Class<? extends Object> term516268 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term516267 = ((Class) term516268).getDeclaredField((String) "AES256SHA256");
        ((Field) term516267).setAccessible(true);
        Object enum473 = ((Field) term516267).get((Object) null);
        Object[] term512704 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 16);
        Object term512999 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term513281 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term513563 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term513845 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term512999, term512999.getClass(), "method", enum471);
        setElement(term512704, 0, term512999);
        setField(term513281, term513281.getClass(), "method", enum472);
        setElement(term512704, 1, term513281);
        setField(term513563, term513563.getClass(), "method", enum473);
        setElement(term512704, 2, term513563);
        setElement(term512704, 4, term513845);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term512704);
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
        args[1] = enum470;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


