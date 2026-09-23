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

public class Coders_addEncoder_684310764186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528527;
     Object enum499;

    public Coders_addEncoder_684310764186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528527 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term528679 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term528783 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term528945 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        setField(term528527, term528527.getClass(), "out", term528679);
        setIntField(term528527, term528527.getClass(), "currentChar", 0);
        setIntField(term528527, term528527.getClass(), "last", -1);
        setIntField(term528527, term528527.getClass(), "allowableBlockSize", -1);
        setIntField(term528783, term528783.getClass(), "globalCrc", 0);
        setField(term528527, term528527.getClass(), "crc", term528783);
        setIntField(term528527, term528527.getClass(), "blockCRC", 0);
        setIntField(term528527, term528527.getClass(), "combinedCRC", 0);
        setField(term528527, term528527.getClass(), "data", term528945);
        Class<? extends Object> term753520 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term753519 = ((Class) term753520).getDeclaredField((String) "COPY");
        ((Field) term753519).setAccessible(true);
        enum499 = ((Field) term753519).get((Object) null);
        Class<? extends Object> term753824 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term753823 = ((Class) term753824).getDeclaredField((String) "DEFLATE");
        ((Field) term753823).setAccessible(true);
        Object enum500 = ((Field) term753823).get((Object) null);
        Class<? extends Object> term754137 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term754136 = ((Class) term754137).getDeclaredField((String) "COPY");
        ((Field) term754136).setAccessible(true);
        Object enum501 = ((Field) term754136).get((Object) null);
        Object[] term528366 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 256);
        Object term529227 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term529509 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term529801 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term529227, term529227.getClass(), "method", enum500);
        setElement(term528366, 0, term529227);
        setField(term529509, term529509.getClass(), "method", enum501);
        setField(term529509, term529509.getClass(), "coder", term529801);
        setElement(term528366, 1, term529509);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term528366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term528527;
        args[1] = enum499;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


