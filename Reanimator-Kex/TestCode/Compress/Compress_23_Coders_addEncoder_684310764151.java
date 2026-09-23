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

public class Coders_addEncoder_684310764151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332471;
     Object enum397;

    public Coders_addEncoder_684310764151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332471 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term332623 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(term332471, term332471.getClass(), "out", term332623);
        setIntField(term332471, term332471.getClass(), "currentChar", -1);
        Class<? extends Object> term474261 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term474260 = ((Class) term474261).getDeclaredField((String) "AES256SHA256");
        ((Field) term474260).setAccessible(true);
        enum397 = ((Field) term474260).get((Object) null);
        Class<? extends Object> term474589 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term474588 = ((Class) term474589).getDeclaredField((String) "COPY");
        ((Field) term474588).setAccessible(true);
        Object enum398 = ((Field) term474588).get((Object) null);
        Class<? extends Object> term474893 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term474892 = ((Class) term474893).getDeclaredField((String) "AES256SHA256");
        ((Field) term474892).setAccessible(true);
        Object enum399 = ((Field) term474892).get((Object) null);
        Object[] term332310 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term332905 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term333187 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term333479 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term332905, term332905.getClass(), "method", enum398);
        setElement(term332310, 0, term332905);
        setField(term333187, term333187.getClass(), "method", enum399);
        setField(term333187, term333187.getClass(), "coder", term333479);
        setElement(term332310, 1, term333187);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term332310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term332471;
        args[1] = enum397;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


