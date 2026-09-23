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

public class Coders_addEncoder_684310764162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488194;
     Object enum429;

    public Coders_addEncoder_684310764162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488194 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term488346 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        setField(term488194, term488194.getClass(), "out", term488346);
        setIntField(term488194, term488194.getClass(), "currentChar", 66);
        setIntField(term488194, term488194.getClass(), "runLength", 254);
        Class<? extends Object> term491769 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term491768 = ((Class) term491769).getDeclaredField((String) "COPY");
        ((Field) term491768).setAccessible(true);
        enum429 = ((Field) term491768).get((Object) null);
        Class<? extends Object> term492073 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term492072 = ((Class) term492073).getDeclaredField((String) "DEFLATE");
        ((Field) term492072).setAccessible(true);
        Object enum430 = ((Field) term492072).get((Object) null);
        Class<? extends Object> term492386 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term492385 = ((Class) term492386).getDeclaredField((String) "COPY");
        ((Field) term492385).setAccessible(true);
        Object enum431 = ((Field) term492385).get((Object) null);
        Object[] term488033 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term488628 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term488910 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term489202 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term488628, term488628.getClass(), "method", enum430);
        setElement(term488033, 0, term488628);
        setField(term488910, term488910.getClass(), "method", enum431);
        setField(term488910, term488910.getClass(), "coder", term489202);
        setElement(term488033, 1, term488910);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term488033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term488194;
        args[1] = enum429;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


