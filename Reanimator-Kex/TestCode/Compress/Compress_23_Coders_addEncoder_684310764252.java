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

public class Coders_addEncoder_684310764252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1029753;
     Object enum683;

    public Coders_addEncoder_684310764252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1029753 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1029823 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
        setField(term1029753, term1029753.getClass(), "out", term1029823);
        setIntField(term1029753, term1029753.getClass(), "currentChar", 0);
        Class<? extends Object> term1034233 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1034232 = ((Class) term1034233).getDeclaredField((String) "COPY");
        ((Field) term1034232).setAccessible(true);
        enum683 = ((Field) term1034232).get((Object) null);
        Class<? extends Object> term1034537 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1034536 = ((Class) term1034537).getDeclaredField((String) "BZIP2");
        ((Field) term1034536).setAccessible(true);
        Object enum684 = ((Field) term1034536).get((Object) null);
        Class<? extends Object> term1034844 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1034843 = ((Class) term1034844).getDeclaredField((String) "COPY");
        ((Field) term1034843).setAccessible(true);
        Object enum685 = ((Field) term1034843).get((Object) null);
        Object[] term1029592 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term1030105 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1030387 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1030679 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1030105, term1030105.getClass(), "method", enum684);
        setElement(term1029592, 0, term1030105);
        setField(term1030387, term1030387.getClass(), "method", enum685);
        setField(term1030387, term1030387.getClass(), "coder", term1030679);
        setElement(term1029592, 1, term1030387);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1029592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1029753;
        args[1] = enum683;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


