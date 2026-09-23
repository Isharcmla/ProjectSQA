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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791067;
     Object enum564;

    public Coders_addEncoder_684310764210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791067 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        byte[] term790841 = (byte[]) newByteArray(0);
        setField(term791067, term791067.getClass(), "oneByte", term790841);
        Class<? extends Object> term792595 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term792594 = ((Class) term792595).getDeclaredField((String) "BZIP2");
        ((Field) term792594).setAccessible(true);
        enum564 = ((Field) term792594).get((Object) null);
        Class<? extends Object> term792902 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term792901 = ((Class) term792902).getDeclaredField((String) "BZIP2");
        ((Field) term792901).setAccessible(true);
        Object enum565 = ((Field) term792901).get((Object) null);
        Object[] term790924 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 1);
        Object term791349 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term791641 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term791349, term791349.getClass(), "method", enum565);
        setField(term791349, term791349.getClass(), "coder", term791641);
        setElement(term790924, 0, term791349);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term790924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term791067;
        args[1] = enum564;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


