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

public class Coders_addEncoder_684310764253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057273;
     Object enum686;

    public Coders_addEncoder_684310764253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1057273 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1057425 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term1057587 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        boolean[] term1035326 = (boolean[]) newBooleanArray(160);
        Object term1057691 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setField(term1057273, term1057273.getClass(), "out", term1057425);
        setIntField(term1057273, term1057273.getClass(), "currentChar", 66);
        setIntField(term1057273, term1057273.getClass(), "runLength", 1073741834);
        setIntField(term1057273, term1057273.getClass(), "last", -2147483648);
        setIntField(term1057273, term1057273.getClass(), "allowableBlockSize", -2147483647);
        setField(term1057587, term1057587.getClass(), "inUse", term1035326);
        setField(term1057273, term1057273.getClass(), "data", term1057587);
        setIntField(term1057691, term1057691.getClass(), "globalCrc", 6856720);
        setField(term1057273, term1057273.getClass(), "crc", term1057691);
        Class<? extends Object> term1058709 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1058708 = ((Class) term1058709).getDeclaredField((String) "DEFLATE");
        ((Field) term1058708).setAccessible(true);
        enum686 = ((Field) term1058708).get((Object) null);
        Class<? extends Object> term1059022 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1059021 = ((Class) term1059022).getDeclaredField((String) "AES256SHA256");
        ((Field) term1059021).setAccessible(true);
        Object enum687 = ((Field) term1059021).get((Object) null);
        Class<? extends Object> term1059350 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term1059349 = ((Class) term1059350).getDeclaredField((String) "DEFLATE");
        ((Field) term1059349).setAccessible(true);
        Object enum688 = ((Field) term1059349).get((Object) null);
        Object[] term1057111 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term1057973 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1058255 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term1058547 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term1057973, term1057973.getClass(), "method", enum687);
        setElement(term1057111, 0, term1057973);
        setField(term1058255, term1058255.getClass(), "method", enum688);
        setField(term1058255, term1058255.getClass(), "coder", term1058547);
        setElement(term1057111, 1, term1058255);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term1057111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1057273;
        args[1] = enum686;
        args[2] = null;
        callMethod(klass, "addEncoder", argTypes, null, args);
    }

};


