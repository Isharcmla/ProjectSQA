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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136739;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136739 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term136899 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term134017 = (boolean[]) newBooleanArray(895);
        byte[] term134913 = (byte[]) newByteArray(128);
        byte[] term135042 = (byte[]) newByteArray(6);
        setField(term136899, term136899.getClass(), "inUse", term134017);
        setField(term136899, term136899.getClass(), "recvDecodingTables_pos", null);
        setField(term136899, term136899.getClass(), "selector", term134913);
        setField(term136899, term136899.getClass(), "selectorMtf", term135042);
        setField(term136739, term136739.getClass(), "data", term136899);
        setIntField(term136739, term136739.getClass(), "bsLive", 32);
        setIntField(term136739, term136739.getClass(), "bsBuff", 2019065856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term136739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


