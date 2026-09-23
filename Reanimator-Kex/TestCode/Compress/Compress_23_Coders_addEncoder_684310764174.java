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

public class Coders_addEncoder_684310764174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507935;
     Object enum463;

    public Coders_addEncoder_684310764174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507935 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term508087 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term508191 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(term507935, term507935.getClass(), "out", term508087);
        setIntField(term507935, term507935.getClass(), "currentChar", 66);
        setIntField(term507935, term507935.getClass(), "runLength", 254);
        setIntField(term507935, term507935.getClass(), "last", -2147483648);
        setIntField(term507935, term507935.getClass(), "allowableBlockSize", -2147483648);
        setField(term507935, term507935.getClass(), "crc", term508191);
        Class<? extends Object> term511628 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term511627 = ((Class) term511628).getDeclaredField((String) "DEFLATE");
        ((Field) term511627).setAccessible(true);
        enum463 = ((Field) term511627).get((Object) null);
        Class<? extends Object> term511941 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term511940 = ((Class) term511941).getDeclaredField((String) "LZMA");
        ((Field) term511940).setAccessible(true);
        Object enum464 = ((Field) term511940).get((Object) null);
        Class<? extends Object> term512245 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term512244 = ((Class) term512245).getDeclaredField((String) "DEFLATE");
        ((Field) term512244).setAccessible(true);
        Object enum465 = ((Field) term512244).get((Object) null);
        Object[] term507774 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 128);
        Object term508473 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term508755 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term509047 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term508473, term508473.getClass(), "method", enum464);
        setElement(term507774, 0, term508473);
        setField(term508755, term508755.getClass(), "method", enum465);
        setField(term508755, term508755.getClass(), "coder", term509047);
        setElement(term507774, 1, term508755);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term507774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term507935;
        args[1] = enum463;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


