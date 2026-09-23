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

public class Coders_addEncoder_684310764168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499010;
     Object enum445;

    public Coders_addEncoder_684310764168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term499010 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term499162 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term499266 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(term499010, term499010.getClass(), "out", term499162);
        setIntField(term499010, term499010.getClass(), "currentChar", 0);
        setIntField(term499010, term499010.getClass(), "last", -1);
        setIntField(term499010, term499010.getClass(), "allowableBlockSize", -1);
        setIntField(term499266, term499266.getClass(), "globalCrc", 0);
        setField(term499010, term499010.getClass(), "crc", term499266);
        setIntField(term499010, term499010.getClass(), "blockCRC", 0);
        setIntField(term499010, term499010.getClass(), "combinedCRC", 0);
        Class<? extends Object> term501494 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term501493 = ((Class) term501494).getDeclaredField((String) "COPY");
        ((Field) term501493).setAccessible(true);
        enum445 = ((Field) term501493).get((Object) null);
        Class<? extends Object> term501798 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term501797 = ((Class) term501798).getDeclaredField((String) "DEFLATE");
        ((Field) term501797).setAccessible(true);
        Object enum446 = ((Field) term501797).get((Object) null);
        Class<? extends Object> term502111 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term502110 = ((Class) term502111).getDeclaredField((String) "COPY");
        ((Field) term502110).setAccessible(true);
        Object enum447 = ((Field) term502110).get((Object) null);
        Object[] term498849 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term499548 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term499830 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term500122 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term499548, term499548.getClass(), "method", enum446);
        setElement(term498849, 0, term499548);
        setField(term499830, term499830.getClass(), "method", enum447);
        setField(term499830, term499830.getClass(), "coder", term500122);
        setElement(term498849, 1, term499830);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term498849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term499010;
        args[1] = enum445;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


