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

public class Coders_addEncoder_684310764133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294820;
     Object enum350;

    public Coders_addEncoder_684310764133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294820 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term294914 = newInstance(Class.forName("org.tukaani.xz.UncompressedLZMA2OutputStream"));
        Object term295018 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term295134 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BlockSort"));
        Object term295296 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        byte[] term294460 = (byte[]) newByteArray(12);
        setField(term294820, term294820.getClass(), "out", term294914);
        setIntField(term294820, term294820.getClass(), "currentChar", 0);
        setIntField(term294820, term294820.getClass(), "last", -697237494);
        setIntField(term294820, term294820.getClass(), "allowableBlockSize", -697237494);
        setIntField(term295018, term295018.getClass(), "globalCrc", 0);
        setField(term294820, term294820.getClass(), "crc", term295018);
        setIntField(term294820, term294820.getClass(), "blockCRC", 0);
        setIntField(term294820, term294820.getClass(), "combinedCRC", 0);
        setIntField(term295134, term295134.getClass(), "workLimit", 0);
        setIntField(term295134, term295134.getClass(), "workDone", 0);
        setBooleanField(term295134, term295134.getClass(), "firstAttempt", false);
        setField(term294820, term294820.getClass(), "blockSorter", term295134);
        setByteElement(term294460, 0, (byte) 65);
        setByteElement(term294460, 1, (byte) 69);
        setByteElement(term294460, 2, (byte) 83);
        setByteElement(term294460, 3, (byte) 50);
        setByteElement(term294460, 4, (byte) 53);
        setByteElement(term294460, 5, (byte) 54);
        setByteElement(term294460, 6, (byte) 83);
        setByteElement(term294460, 7, (byte) 72);
        setByteElement(term294460, 8, (byte) 65);
        setByteElement(term294460, 9, (byte) 50);
        setByteElement(term294460, 10, (byte) 53);
        setByteElement(term294460, 11, (byte) 54);
        setField(term295296, term295296.getClass(), "block", term294460);
        setField(term294820, term294820.getClass(), "data", term295296);
        Class<? extends Object> term297583 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term297582 = ((Class) term297583).getDeclaredField((String) "COPY");
        ((Field) term297582).setAccessible(true);
        enum350 = ((Field) term297582).get((Object) null);
        Class<? extends Object> term297887 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term297886 = ((Class) term297887).getDeclaredField((String) "DEFLATE");
        ((Field) term297886).setAccessible(true);
        Object enum351 = ((Field) term297886).get((Object) null);
        Class<? extends Object> term298200 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term298199 = ((Class) term298200).getDeclaredField((String) "COPY");
        ((Field) term298199).setAccessible(true);
        Object enum352 = ((Field) term298199).get((Object) null);
        Object[] term294659 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 64);
        Object term295578 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term295860 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term296152 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term295578, term295578.getClass(), "method", enum351);
        setElement(term294659, 0, term295578);
        setField(term295860, term295860.getClass(), "method", enum352);
        setField(term295860, term295860.getClass(), "coder", term296152);
        setElement(term294659, 1, term295860);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term294659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term294820;
        args[1] = enum350;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


