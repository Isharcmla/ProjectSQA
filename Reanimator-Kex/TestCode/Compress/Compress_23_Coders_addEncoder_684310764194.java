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
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764006;
     Object enum521;

    public Coders_addEncoder_684310764194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764006 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term764158 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term764320 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        boolean[] term763735 = (boolean[]) newBooleanArray(0);
        setField(term764006, term764006.getClass(), "out", term764158);
        setIntField(term764006, term764006.getClass(), "currentChar", 66);
        setIntField(term764006, term764006.getClass(), "runLength", 254);
        setIntField(term764006, term764006.getClass(), "last", -2147483648);
        setIntField(term764006, term764006.getClass(), "allowableBlockSize", -2147483647);
        setField(term764320, term764320.getClass(), "inUse", term763735);
        setField(term764006, term764006.getClass(), "data", term764320);
        Class<? extends Object> term766591 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term766590 = ((Class) term766591).getDeclaredField((String) "AES256SHA256");
        ((Field) term766590).setAccessible(true);
        enum521 = ((Field) term766590).get((Object) null);
        Class<? extends Object> term766919 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term766918 = ((Class) term766919).getDeclaredField((String) "LZMA");
        ((Field) term766918).setAccessible(true);
        Object enum522 = ((Field) term766918).get((Object) null);
        Class<? extends Object> term767223 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term767222 = ((Class) term767223).getDeclaredField((String) "AES256SHA256");
        ((Field) term767222).setAccessible(true);
        Object enum523 = ((Field) term767222).get((Object) null);
        Object[] term763845 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term764602 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term764884 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term765176 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term764602, term764602.getClass(), "method", enum522);
        setElement(term763845, 0, term764602);
        setField(term764884, term764884.getClass(), "method", enum523);
        setField(term764884, term764884.getClass(), "coder", term765176);
        setElement(term763845, 1, term764884);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term763845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term764006;
        args[1] = enum521;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


