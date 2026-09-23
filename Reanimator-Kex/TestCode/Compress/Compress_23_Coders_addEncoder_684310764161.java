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
import java.lang.String;
import java.lang.Object;

public class Coders_addEncoder_684310764161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486096;
     Object enum426;

    public Coders_addEncoder_684310764161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term486096 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Class<? extends Object> term490426 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term490425 = ((Class) term490426).getDeclaredField((String) "COPY");
        ((Field) term490425).setAccessible(true);
        enum426 = ((Field) term490425).get((Object) null);
        Class<? extends Object> term490730 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term490729 = ((Class) term490730).getDeclaredField((String) "LZMA2");
        ((Field) term490729).setAccessible(true);
        Object enum427 = ((Field) term490729).get((Object) null);
        Class<? extends Object> term491037 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term491036 = ((Class) term491037).getDeclaredField((String) "COPY");
        ((Field) term491036).setAccessible(true);
        Object enum428 = ((Field) term491036).get((Object) null);
        Object[] term485935 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term486378 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term486660 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term486952 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term486378, term486378.getClass(), "method", enum427);
        setElement(term485935, 0, term486378);
        setField(term486660, term486660.getClass(), "method", enum428);
        setField(term486660, term486660.getClass(), "coder", term486952);
        setElement(term485935, 1, term486660);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term485935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term486096;
        args[1] = enum426;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


