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
import java.lang.NullPointerException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343906;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343906 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term344066 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term340188 = (boolean[]) newBooleanArray(890);
        byte[] term341079 = (byte[]) newByteArray(552);
        byte[] term341632 = (byte[]) newByteArray(552);
        Object term344130 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setField(term344066, term344066.getClass(), "inUse", term340188);
        setField(term344066, term344066.getClass(), "recvDecodingTables_pos", null);
        setField(term344066, term344066.getClass(), "selector", term341079);
        setField(term344066, term344066.getClass(), "selectorMtf", term341632);
        setField(term343906, term343906.getClass(), "data", term344066);
        setIntField(term343906, term343906.getClass(), "bsLive", 12);
        setIntField(term343906, term343906.getClass(), "bsBuff", 1926);
        setField(term343906, term343906.getClass(), "in", term344130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term343906, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


