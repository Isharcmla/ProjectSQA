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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625913;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625913 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term626073 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term624601 = (byte[]) newByteArray(986);
        byte[] term625588 = (byte[]) newByteArray(0);
        setIntField(term625913, term625913.getClass(), "bsLive", 38);
        setIntField(term625913, term625913.getClass(), "bsBuff", -2004872624);
        setIntField(term625913, term625913.getClass(), "origPtr", 0);
        setField(term626073, term626073.getClass(), "inUse", null);
        setField(term626073, term626073.getClass(), "recvDecodingTables_pos", term624601);
        setField(term626073, term626073.getClass(), "selector", term625588);
        setField(term626073, term626073.getClass(), "selectorMtf", null);
        setField(term625913, term625913.getClass(), "data", term626073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term625913, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


