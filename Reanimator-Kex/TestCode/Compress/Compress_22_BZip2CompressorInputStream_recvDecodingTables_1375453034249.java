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
import java.io.IOException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201822;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201822 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term201982 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term200017 = (boolean[]) newBooleanArray(841);
        byte[] term200859 = (byte[]) newByteArray(330);
        byte[] term201190 = (byte[]) newByteArray(330);
        Object term202036 = newInstance(Class.forName("java.io.PipedInputStream"));
        setField(term201982, term201982.getClass(), "inUse", term200017);
        setField(term201982, term201982.getClass(), "recvDecodingTables_pos", term200859);
        setField(term201982, term201982.getClass(), "selector", term201190);
        setField(term201982, term201982.getClass(), "selectorMtf", null);
        setField(term201822, term201822.getClass(), "data", term201982);
        setIntField(term201822, term201822.getClass(), "bsLive", 9);
        setIntField(term201822, term201822.getClass(), "bsBuff", 240);
        setField(term201822, term201822.getClass(), "in", term202036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term201822, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


