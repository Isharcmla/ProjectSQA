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

public class Coders_addEncoder_684310764251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1027056;
     Object enum680;

    public Coders_addEncoder_684310764251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1027056 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1027208 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1027370 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        boolean[] term1026612 = (boolean[]) newBooleanArray(169);
        Object term1027474 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(term1027056, term1027056.getClass(), "out", term1027208);
        setIntField(term1027056, term1027056.getClass(), "currentChar", 66);
        setIntField(term1027056, term1027056.getClass(), "runLength", 254);
        setIntField(term1027056, term1027056.getClass(), "last", -2147483648);
        setIntField(term1027056, term1027056.getClass(), "allowableBlockSize", -2147483647);
        setField(term1027370, term1027370.getClass(), "inUse", term1026612);
        setField(term1027056, term1027056.getClass(), "data", term1027370);
        setIntField(term1027474, term1027474.getClass(), "globalCrc", 0);
        setField(term1027056, term1027056.getClass(), "crc", term1027474);
        Class<? extends Object> term1032907 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1032906 = ((Class) term1032907).getDeclaredField((String) "COPY");
        ((Field) term1032906).setAccessible(true);
        enum680 = ((Field) term1032906).get((Object) null);
        Class<? extends Object> term1033211 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1033210 = ((Class) term1033211).getDeclaredField((String) "DEFLATE");
        ((Field) term1033210).setAccessible(true);
        Object enum681 = ((Field) term1033210).get((Object) null);
        Class<? extends Object> term1033524 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1033523 = ((Class) term1033524).getDeclaredField((String) "COPY");
        ((Field) term1033523).setAccessible(true);
        Object enum682 = ((Field) term1033523).get((Object) null);
        Object[] term1026895 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term1027756 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1028038 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1028330 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1027756, term1027756.getClass(), "method", enum681);
        setElement(term1026895, 0, term1027756);
        setField(term1028038, term1028038.getClass(), "method", enum682);
        setField(term1028038, term1028038.getClass(), "coder", term1028330);
        setElement(term1026895, 1, term1028038);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1026895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1027056;
        args[1] = enum680;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


