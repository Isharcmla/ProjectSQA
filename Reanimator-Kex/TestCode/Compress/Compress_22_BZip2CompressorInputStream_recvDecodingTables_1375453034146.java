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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71894;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71894 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term72054 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term71542 = (boolean[]) newBooleanArray(0);
        byte[] term71543 = (byte[]) newByteArray(0);
        Object term72108 = newInstance(Class.forName("java.io.PipedInputStream"));
        setField(term72054, term72054.getClass(), "inUse", term71542);
        setField(term72054, term72054.getClass(), "recvDecodingTables_pos", null);
        setField(term72054, term72054.getClass(), "selector", term71543);
        setField(term72054, term72054.getClass(), "selectorMtf", null);
        setField(term71894, term71894.getClass(), "data", term72054);
        setIntField(term71894, term71894.getClass(), "bsLive", 12);
        setIntField(term71894, term71894.getClass(), "bsBuff", 1925);
        setField(term71894, term71894.getClass(), "in", term72108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term71894, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


