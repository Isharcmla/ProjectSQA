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

public class Coders_addEncoder_684310764215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum578;

    public Coders_addEncoder_684310764215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term969093 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term969092 = ((Class) term969093).getDeclaredField((String) "AES256SHA256");
        ((Field) term969092).setAccessible(true);
        enum578 = ((Field) term969092).get((Object) null);
        Class<? extends Object> term969421 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term969420 = ((Class) term969421).getDeclaredField((String) "DEFLATE");
        ((Field) term969420).setAccessible(true);
        Object enum579 = ((Field) term969420).get((Object) null);
        Class<? extends Object> term969734 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term969733 = ((Class) term969734).getDeclaredField((String) "BZIP2");
        ((Field) term969733).setAccessible(true);
        Object enum580 = ((Field) term969733).get((Object) null);
        Class<? extends Object> term970041 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term970040 = ((Class) term970041).getDeclaredField((String) "AES256SHA256");
        ((Field) term970040).setAccessible(true);
        Object enum581 = ((Field) term970040).get((Object) null);
        Object[] term967829 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 4);
        Object term968125 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term968407 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term968689 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term968967 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.LZMA2Decoder"));
        Object term969091 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term968125, term968125.getClass(), "method", enum579);
        setElement(term967829, 0, term968125);
        setField(term968407, term968407.getClass(), "method", enum580);
        setElement(term967829, 1, term968407);
        setField(term968689, term968689.getClass(), "method", enum581);
        setField(term968689, term968689.getClass(), "coder", term968967);
        setElement(term967829, 2, term968689);
        setElement(term967829, 3, term969091);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term967829);
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
        args[1] = enum578;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


