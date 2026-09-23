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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106363;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106363 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term106523 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term105882 = (boolean[]) newBooleanArray(32);
        byte[] term105915 = (byte[]) newByteArray(32);
        byte[] term105948 = (byte[]) newByteArray(32);
        setIntField(term106363, term106363.getClass(), "bsLive", 49);
        setIntField(term106363, term106363.getClass(), "bsBuff", -2067789824);
        setIntField(term106363, term106363.getClass(), "origPtr", 0);
        setField(term106523, term106523.getClass(), "inUse", term105882);
        setField(term106523, term106523.getClass(), "recvDecodingTables_pos", null);
        setField(term106523, term106523.getClass(), "selector", term105915);
        setField(term106523, term106523.getClass(), "selectorMtf", term105948);
        setField(term106363, term106363.getClass(), "data", term106523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term106363, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


