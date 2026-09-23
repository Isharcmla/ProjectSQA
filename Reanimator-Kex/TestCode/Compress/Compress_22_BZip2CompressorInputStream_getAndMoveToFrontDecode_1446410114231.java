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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170542;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170542 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term170702 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term168078 = (boolean[]) newBooleanArray(635);
        byte[] term168714 = (byte[]) newByteArray(28);
        setIntField(term170542, term170542.getClass(), "bsLive", 52);
        setIntField(term170542, term170542.getClass(), "bsBuff", 75497476);
        setIntField(term170542, term170542.getClass(), "origPtr", 0);
        setField(term170702, term170702.getClass(), "inUse", term168078);
        setField(term170702, term170702.getClass(), "recvDecodingTables_pos", null);
        setField(term170702, term170702.getClass(), "selector", null);
        setField(term170702, term170702.getClass(), "selectorMtf", term168714);
        setField(term170542, term170542.getClass(), "data", term170702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term170542, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


