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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211174;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211174 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term211334 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term208403 = (boolean[]) newBooleanArray(894);
        byte[] term209298 = (byte[]) newByteArray(128);
        setField(term211334, term211334.getClass(), "inUse", term208403);
        setField(term211334, term211334.getClass(), "recvDecodingTables_pos", null);
        setField(term211334, term211334.getClass(), "selector", null);
        setField(term211334, term211334.getClass(), "selectorMtf", term209298);
        setField(term211174, term211174.getClass(), "data", term211334);
        setIntField(term211174, term211174.getClass(), "bsLive", 21);
        setIntField(term211174, term211174.getClass(), "bsBuff", 985856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term211174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


