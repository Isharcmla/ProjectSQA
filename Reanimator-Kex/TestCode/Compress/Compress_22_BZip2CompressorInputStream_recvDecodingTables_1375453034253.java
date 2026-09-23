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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212689;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212689 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term212849 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term212359 = (byte[]) newByteArray(6);
        byte[] term212366 = (byte[]) newByteArray(0);
        byte[] term212367 = (byte[]) newByteArray(0);
        setField(term212849, term212849.getClass(), "inUse", null);
        setField(term212849, term212849.getClass(), "recvDecodingTables_pos", term212359);
        setField(term212849, term212849.getClass(), "selector", term212366);
        setField(term212849, term212849.getClass(), "selectorMtf", term212367);
        setField(term212689, term212689.getClass(), "data", term212849);
        setIntField(term212689, term212689.getClass(), "bsLive", 10);
        setIntField(term212689, term212689.getClass(), "bsBuff", -2147483167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term212689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


