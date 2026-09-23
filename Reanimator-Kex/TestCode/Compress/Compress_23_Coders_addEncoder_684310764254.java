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
import java.lang.Object;
import java.lang.String;

public class Coders_addEncoder_684310764254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1122774;
     Object enum689;

    public Coders_addEncoder_684310764254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1122774 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1122844 = newInstance(Class.forName("org.tukaani.xz.BlockOutputStream"));
        Object term1123006 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        boolean[] term1059769 = (boolean[]) newBooleanArray(496);
        Object term1123110 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(term1122774, term1122774.getClass(), "out", term1122844);
        setIntField(term1122774, term1122774.getClass(), "currentChar", 66);
        setIntField(term1122774, term1122774.getClass(), "runLength", 268435456);
        setIntField(term1122774, term1122774.getClass(), "last", -2147483648);
        setIntField(term1122774, term1122774.getClass(), "allowableBlockSize", -2147483647);
        setBooleanElement(term1059769, 0, true);
        setBooleanElement(term1059769, 1, true);
        setField(term1123006, term1123006.getClass(), "inUse", term1059769);
        setField(term1122774, term1122774.getClass(), "data", term1123006);
        setIntField(term1123110, term1123110.getClass(), "globalCrc", 5486116);
        setField(term1122774, term1122774.getClass(), "crc", term1123110);
        Class<? extends Object> term1124464 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1124463 = ((Class) term1124464).getDeclaredField((String) "DEFLATE");
        ((Field) term1124463).setAccessible(true);
        enum689 = ((Field) term1124463).get((Object) null);
        Class<? extends Object> term1124777 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1124776 = ((Class) term1124777).getDeclaredField((String) "AES256SHA256");
        ((Field) term1124776).setAccessible(true);
        Object enum690 = ((Field) term1124776).get((Object) null);
        Class<? extends Object> term1125105 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1125104 = ((Class) term1125105).getDeclaredField((String) "DEFLATE");
        ((Field) term1125104).setAccessible(true);
        Object enum691 = ((Field) term1125104).get((Object) null);
        Object[] term1122612 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 32);
        Object term1123392 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1123674 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1123966 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1123392, term1123392.getClass(), "method", enum690);
        setElement(term1122612, 0, term1123392);
        setField(term1123674, term1123674.getClass(), "method", enum691);
        setField(term1123674, term1123674.getClass(), "coder", term1123966);
        setElement(term1122612, 1, term1123674);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1122612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1122774;
        args[1] = enum689;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


