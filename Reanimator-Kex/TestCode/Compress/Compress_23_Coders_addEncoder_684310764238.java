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

public class Coders_addEncoder_684310764238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005191;
     Object enum639;

    public Coders_addEncoder_684310764238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1005191 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1005245 = newInstance(Class.forName("java.io.FileOutputStream"));
        Object term1005407 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        boolean[] term1004813 = (boolean[]) newBooleanArray(106);
        setField(term1005191, term1005191.getClass(), "out", term1005245);
        setIntField(term1005191, term1005191.getClass(), "currentChar", 66);
        setIntField(term1005191, term1005191.getClass(), "runLength", 254);
        setIntField(term1005191, term1005191.getClass(), "last", -2147483648);
        setIntField(term1005191, term1005191.getClass(), "allowableBlockSize", -2147483647);
        setField(term1005407, term1005407.getClass(), "inUse", term1004813);
        setField(term1005191, term1005191.getClass(), "data", term1005407);
        Class<? extends Object> term1007902 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1007901 = ((Class) term1007902).getDeclaredField((String) "LZMA");
        ((Field) term1007901).setAccessible(true);
        enum639 = ((Field) term1007901).get((Object) null);
        Class<? extends Object> term1008206 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1008205 = ((Class) term1008206).getDeclaredField((String) "COPY");
        ((Field) term1008205).setAccessible(true);
        Object enum640 = ((Field) term1008205).get((Object) null);
        Class<? extends Object> term1008510 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1008509 = ((Class) term1008510).getDeclaredField((String) "LZMA");
        ((Field) term1008509).setAccessible(true);
        Object enum641 = ((Field) term1008509).get((Object) null);
        Object[] term1005030 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 256);
        Object term1005689 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1005971 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1006263 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1005689, term1005689.getClass(), "method", enum640);
        setElement(term1005030, 0, term1005689);
        setField(term1005971, term1005971.getClass(), "method", enum641);
        setField(term1005971, term1005971.getClass(), "coder", term1006263);
        setElement(term1005030, 1, term1005971);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1005030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1005191;
        args[1] = enum639;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


