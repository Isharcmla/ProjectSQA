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

public class Coders_addEncoder_684310764222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978469;
     Object enum593;

    public Coders_addEncoder_684310764222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978469 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term978533 = newInstance(Class.forName("org.tukaani.xz.XZOutputStream"));
        Object term978637 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term978799 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        boolean[] term978188 = (boolean[]) newBooleanArray(0);
        setField(term978469, term978469.getClass(), "out", term978533);
        setIntField(term978469, term978469.getClass(), "currentChar", 0);
        setIntField(term978469, term978469.getClass(), "last", -1);
        setIntField(term978469, term978469.getClass(), "allowableBlockSize", -1);
        setIntField(term978637, term978637.getClass(), "globalCrc", 0);
        setField(term978469, term978469.getClass(), "crc", term978637);
        setIntField(term978469, term978469.getClass(), "blockCRC", 0);
        setIntField(term978469, term978469.getClass(), "combinedCRC", 0);
        setField(term978799, term978799.getClass(), "inUse", term978188);
        setField(term978469, term978469.getClass(), "data", term978799);
        Class<? extends Object> term981074 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term981073 = ((Class) term981074).getDeclaredField((String) "DEFLATE");
        ((Field) term981073).setAccessible(true);
        enum593 = ((Field) term981073).get((Object) null);
        Class<? extends Object> term981387 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term981386 = ((Class) term981387).getDeclaredField((String) "LZMA");
        ((Field) term981386).setAccessible(true);
        Object enum594 = ((Field) term981386).get((Object) null);
        Class<? extends Object> term981691 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term981690 = ((Class) term981691).getDeclaredField((String) "DEFLATE");
        ((Field) term981690).setAccessible(true);
        Object enum595 = ((Field) term981690).get((Object) null);
        Object[] term978308 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 64);
        Object term979081 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term979363 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term979655 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term979081, term979081.getClass(), "method", enum594);
        setElement(term978308, 0, term979081);
        setField(term979363, term979363.getClass(), "method", enum595);
        setField(term979363, term979363.getClass(), "coder", term979655);
        setElement(term978308, 1, term979363);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term978308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term978469;
        args[1] = enum593;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


