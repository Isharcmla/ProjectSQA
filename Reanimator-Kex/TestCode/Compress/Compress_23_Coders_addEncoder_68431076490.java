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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_68431076490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160695;
     Object enum258;

    public Coders_addEncoder_68431076490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160695 = newInstance(Class.forName("java.util.zip.DeflaterOutputStream"));
        Class<? extends Object> term161553 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term161552 = ((Class) term161553).getDeclaredField((String) "AES256SHA256");
        ((Field) term161552).setAccessible(true);
        enum258 = ((Field) term161552).get((Object) null);
        Class<? extends Object> term161881 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term161880 = ((Class) term161881).getDeclaredField((String) "BZIP2");
        ((Field) term161880).setAccessible(true);
        Object enum259 = ((Field) term161880).get((Object) null);
        Class<? extends Object> term162188 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term162187 = ((Class) term162188).getDeclaredField((String) "AES256SHA256");
        ((Field) term162187).setAccessible(true);
        Object enum260 = ((Field) term162187).get((Object) null);
        Object[] term160612 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term160977 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term161259 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term161551 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term160977, term160977.getClass(), "method", enum259);
        setElement(term160612, 0, term160977);
        setField(term161259, term161259.getClass(), "method", enum260);
        setField(term161259, term161259.getClass(), "coder", term161551);
        setElement(term160612, 1, term161259);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term160612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term160695;
        args[1] = enum258;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


