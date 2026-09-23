package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672838;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672838 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term672998 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term672496 = (boolean[]) newBooleanArray(28);
        byte[] term672525 = (byte[]) newByteArray(28);
        byte[] term672554 = (byte[]) newByteArray(28);
        Object term673126 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term672998, term672998.getClass(), "inUse", term672496);
        setField(term672998, term672998.getClass(), "recvDecodingTables_pos", term672525);
        setField(term672998, term672998.getClass(), "selector", term672554);
        setField(term672998, term672998.getClass(), "selectorMtf", null);
        setField(term672838, term672838.getClass(), "data", term672998);
        setIntField(term672838, term672838.getClass(), "bsLive", 6);
        setIntField(term672838, term672838.getClass(), "bsBuff", -2147287024);
        setField(term672838, term672838.getClass(), "in", term673126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term672838, args);
    }

};


