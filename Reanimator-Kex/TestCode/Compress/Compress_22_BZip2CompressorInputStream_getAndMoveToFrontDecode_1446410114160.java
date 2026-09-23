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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83333;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83333 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term83493 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term82975 = (byte[]) newByteArray(0);
        setIntField(term83333, term83333.getClass(), "bsLive", 37);
        setIntField(term83333, term83333.getClass(), "bsBuff", 11264);
        setIntField(term83333, term83333.getClass(), "origPtr", 0);
        setField(term83493, term83493.getClass(), "inUse", null);
        setField(term83493, term83493.getClass(), "recvDecodingTables_pos", term82975);
        setField(term83493, term83493.getClass(), "selector", term82975);
        setField(term83493, term83493.getClass(), "selectorMtf", null);
        setField(term83333, term83333.getClass(), "data", term83493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term83333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


