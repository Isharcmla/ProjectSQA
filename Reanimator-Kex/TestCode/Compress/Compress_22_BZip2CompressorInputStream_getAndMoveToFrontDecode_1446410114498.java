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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666313;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666313 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term666473 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term664867 = (boolean[]) newBooleanArray(764);
        byte[] term665632 = (byte[]) newByteArray(256);
        setIntField(term666313, term666313.getClass(), "bsLive", 56);
        setIntField(term666313, term666313.getClass(), "bsBuff", 1224998912);
        setIntField(term666313, term666313.getClass(), "origPtr", 0);
        setField(term666473, term666473.getClass(), "inUse", term664867);
        setField(term666473, term666473.getClass(), "recvDecodingTables_pos", null);
        setField(term666473, term666473.getClass(), "selector", term665632);
        setField(term666473, term666473.getClass(), "selectorMtf", null);
        setField(term666313, term666313.getClass(), "data", term666473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term666313, args);
    }

};


