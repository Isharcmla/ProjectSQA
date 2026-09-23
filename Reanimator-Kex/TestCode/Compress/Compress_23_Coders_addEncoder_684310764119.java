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

public class Coders_addEncoder_684310764119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271951;
     Object enum310;

    public Coders_addEncoder_684310764119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271951 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term272005 = newInstance(Class.forName("java.io.FileOutputStream"));
        Object term272109 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(term271951, term271951.getClass(), "out", term272005);
        setIntField(term271951, term271951.getClass(), "currentChar", 0);
        setIntField(term271951, term271951.getClass(), "last", -2147483648);
        setIntField(term271951, term271951.getClass(), "allowableBlockSize", -2147483648);
        setField(term271951, term271951.getClass(), "crc", term272109);
        Class<? extends Object> term274347 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term274346 = ((Class) term274347).getDeclaredField((String) "AES256SHA256");
        ((Field) term274346).setAccessible(true);
        enum310 = ((Field) term274346).get((Object) null);
        Class<? extends Object> term274675 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term274674 = ((Class) term274675).getDeclaredField((String) "DEFLATE");
        ((Field) term274674).setAccessible(true);
        Object enum311 = ((Field) term274674).get((Object) null);
        Class<? extends Object> term274988 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term274987 = ((Class) term274988).getDeclaredField((String) "AES256SHA256");
        ((Field) term274987).setAccessible(true);
        Object enum312 = ((Field) term274987).get((Object) null);
        Object[] term271790 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term272391 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term272673 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term272965 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term272391, term272391.getClass(), "method", enum311);
        setElement(term271790, 0, term272391);
        setField(term272673, term272673.getClass(), "method", enum312);
        setField(term272673, term272673.getClass(), "coder", term272965);
        setElement(term271790, 1, term272673);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term271790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term271951;
        args[1] = enum310;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


