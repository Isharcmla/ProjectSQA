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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101945;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101945 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term102105 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term100837 = (boolean[]) newBooleanArray(256);
        byte[] term101094 = (byte[]) newByteArray(256);
        byte[] term101351 = (byte[]) newByteArray(256);
        setIntField(term101945, term101945.getClass(), "bsLive", 36);
        setIntField(term101945, term101945.getClass(), "bsBuff", -1475868894);
        setIntField(term101945, term101945.getClass(), "origPtr", 0);
        setField(term102105, term102105.getClass(), "inUse", term100837);
        setField(term102105, term102105.getClass(), "recvDecodingTables_pos", null);
        setField(term102105, term102105.getClass(), "selector", term101094);
        setField(term102105, term102105.getClass(), "selectorMtf", term101351);
        setField(term101945, term101945.getClass(), "data", term102105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term101945, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


