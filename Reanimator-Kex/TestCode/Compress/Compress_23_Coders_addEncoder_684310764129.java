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

public class Coders_addEncoder_684310764129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287365;
     Object enum338;

    public Coders_addEncoder_684310764129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287365 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term287517 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term287621 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term287737 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BlockSort"));
        Object term287899 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data"));
        setField(term287365, term287365.getClass(), "out", term287517);
        setIntField(term287365, term287365.getClass(), "currentChar", 0);
        setIntField(term287365, term287365.getClass(), "last", 0);
        setIntField(term287365, term287365.getClass(), "allowableBlockSize", 0);
        setIntField(term287621, term287621.getClass(), "globalCrc", 0);
        setField(term287365, term287365.getClass(), "crc", term287621);
        setIntField(term287365, term287365.getClass(), "blockCRC", 0);
        setIntField(term287365, term287365.getClass(), "combinedCRC", 0);
        setField(term287365, term287365.getClass(), "blockSorter", term287737);
        setField(term287365, term287365.getClass(), "data", term287899);
        Class<? extends Object> term290102 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term290101 = ((Class) term290102).getDeclaredField((String) "LZMA");
        ((Field) term290101).setAccessible(true);
        enum338 = ((Field) term290101).get((Object) null);
        Class<? extends Object> term290406 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term290405 = ((Class) term290406).getDeclaredField((String) "COPY");
        ((Field) term290405).setAccessible(true);
        Object enum339 = ((Field) term290405).get((Object) null);
        Class<? extends Object> term290710 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term290709 = ((Class) term290710).getDeclaredField((String) "LZMA");
        ((Field) term290709).setAccessible(true);
        Object enum340 = ((Field) term290709).get((Object) null);
        Object[] term287204 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term288181 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term288463 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term288755 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term288181, term288181.getClass(), "method", enum339);
        setElement(term287204, 0, term288181);
        setField(term288463, term288463.getClass(), "method", enum340);
        setField(term288463, term288463.getClass(), "coder", term288755);
        setElement(term287204, 1, term288463);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term287204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term287365;
        args[1] = enum338;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


