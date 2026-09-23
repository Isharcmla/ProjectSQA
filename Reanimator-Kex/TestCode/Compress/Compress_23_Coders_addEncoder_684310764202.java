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

public class Coders_addEncoder_684310764202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777312;
     Object enum541;

    public Coders_addEncoder_684310764202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777312 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term777464 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(term777312, term777312.getClass(), "out", term777464);
        Class<? extends Object> term779652 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term779651 = ((Class) term779652).getDeclaredField((String) "LZMA");
        ((Field) term779651).setAccessible(true);
        enum541 = ((Field) term779651).get((Object) null);
        Class<? extends Object> term779956 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term779955 = ((Class) term779956).getDeclaredField((String) "BZIP2");
        ((Field) term779955).setAccessible(true);
        Object enum542 = ((Field) term779955).get((Object) null);
        Class<? extends Object> term780263 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term780262 = ((Class) term780263).getDeclaredField((String) "LZMA");
        ((Field) term780262).setAccessible(true);
        Object enum543 = ((Field) term780262).get((Object) null);
        Object[] term777151 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term777746 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term778028 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term778320 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term777746, term777746.getClass(), "method", enum542);
        setElement(term777151, 0, term777746);
        setField(term778028, term778028.getClass(), "method", enum543);
        setField(term778028, term778028.getClass(), "coder", term778320);
        setElement(term777151, 1, term778028);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term777151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term777312;
        args[1] = enum541;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


