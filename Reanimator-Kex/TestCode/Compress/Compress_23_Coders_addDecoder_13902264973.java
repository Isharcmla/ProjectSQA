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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Coders_addDecoder_13902264973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134947;

    public Coders_addDecoder_13902264973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134947 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term134341 = (byte[]) newByteArray(64);
        setField(term134947, term134947.getClass(), "decompressionMethodId", term134341);
        Class<? extends Object> term139847 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term139846 = ((Class) term139847).getDeclaredField((String) "LZMA");
        ((Field) term139846).setAccessible(true);
        Object enum228 = ((Field) term139846).get((Object) null);
        Class<? extends Object> term140151 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term140150 = ((Class) term140151).getDeclaredField((String) "BZIP2");
        ((Field) term140150).setAccessible(true);
        Object enum229 = ((Field) term140150).get((Object) null);
        Class<? extends Object> term140458 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term140457 = ((Class) term140458).getDeclaredField((String) "COPY");
        ((Field) term140457).setAccessible(true);
        Object enum230 = ((Field) term140457).get((Object) null);
        Class<? extends Object> term140762 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term140761 = ((Class) term140762).getDeclaredField((String) "AES256SHA256");
        ((Field) term140761).setAccessible(true);
        Object enum231 = ((Field) term140761).get((Object) null);
        Class<? extends Object> term141090 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term141089 = ((Class) term141090).getDeclaredField((String) "LZMA");
        ((Field) term141089).setAccessible(true);
        Object enum232 = ((Field) term141089).get((Object) null);
        Object[] term134816 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 5);
        Object term135071 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term135353 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term135635 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term135917 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term136199 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        setField(term135071, term135071.getClass(), "method", enum228);
        setElement(term134816, 0, term135071);
        setField(term135353, term135353.getClass(), "method", enum229);
        setElement(term134816, 1, term135353);
        setField(term135635, term135635.getClass(), "method", enum230);
        setElement(term134816, 2, term135635);
        setField(term135917, term135917.getClass(), "method", enum231);
        setElement(term134816, 3, term135917);
        setField(term136199, term136199.getClass(), "method", enum232);
        setElement(term134816, 4, term136199);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term134816);
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
        args[1] = term134947;
        args[2] = null;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


