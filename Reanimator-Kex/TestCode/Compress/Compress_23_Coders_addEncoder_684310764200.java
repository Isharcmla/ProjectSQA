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

public class Coders_addEncoder_684310764200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term773377;
     Object enum535;

    public Coders_addEncoder_684310764200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term773377 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term773529 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term773633 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        Object term773749 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BlockSort"));
        setField(term773377, term773377.getClass(), "out", term773529);
        setIntField(term773377, term773377.getClass(), "currentChar", 0);
        setIntField(term773377, term773377.getClass(), "last", 1708008928);
        setIntField(term773377, term773377.getClass(), "allowableBlockSize", 1708008928);
        setIntField(term773633, term773633.getClass(), "globalCrc", 0);
        setField(term773377, term773377.getClass(), "crc", term773633);
        setIntField(term773377, term773377.getClass(), "blockCRC", 0);
        setIntField(term773377, term773377.getClass(), "combinedCRC", 0);
        setIntField(term773749, term773749.getClass(), "workLimit", 0);
        setIntField(term773749, term773749.getClass(), "workDone", 0);
        setBooleanField(term773749, term773749.getClass(), "firstAttempt", false);
        setField(term773377, term773377.getClass(), "blockSorter", term773749);
        setField(term773377, term773377.getClass(), "data", null);
        Class<? extends Object> term775953 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term775952 = ((Class) term775953).getDeclaredField((String) "LZMA");
        ((Field) term775952).setAccessible(true);
        enum535 = ((Field) term775952).get((Object) null);
        Class<? extends Object> term776257 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term776256 = ((Class) term776257).getDeclaredField((String) "BZIP2");
        ((Field) term776256).setAccessible(true);
        Object enum536 = ((Field) term776256).get((Object) null);
        Class<? extends Object> term776564 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term776563 = ((Class) term776564).getDeclaredField((String) "LZMA");
        ((Field) term776563).setAccessible(true);
        Object enum537 = ((Field) term776563).get((Object) null);
        Object[] term773216 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coders$CoderId", 2);
        Object term774031 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term774313 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$CoderId"));
        Object term774605 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder"));
        setField(term774031, term774031.getClass(), "method", enum536);
        setElement(term773216, 0, term774031);
        setField(term774313, term774313.getClass(), "method", enum537);
        setField(term774313, term774313.getClass(), "coder", term774605);
        setElement(term773216, 1, term774313);
        setField(null, Class.forName("org.apache.commons.compress.archivers.sevenz.Coders"), "coderTable", term773216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term773377;
        args[1] = enum535;
        args[2] = null;
        try {
            callMethod(klass, "addEncoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


