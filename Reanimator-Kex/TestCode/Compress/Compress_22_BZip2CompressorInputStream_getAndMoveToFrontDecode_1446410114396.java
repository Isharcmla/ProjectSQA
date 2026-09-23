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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489702;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489702 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term489862 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term489335 = (byte[]) newByteArray(44);
        byte[] term489380 = (byte[]) newByteArray(44);
        setIntField(term489702, term489702.getClass(), "bsLive", 31);
        setIntField(term489702, term489702.getClass(), "bsBuff", 52);
        setIntField(term489702, term489702.getClass(), "origPtr", 0);
        setField(term489862, term489862.getClass(), "inUse", null);
        setField(term489862, term489862.getClass(), "recvDecodingTables_pos", term489335);
        setField(term489862, term489862.getClass(), "selector", term489380);
        setField(term489862, term489862.getClass(), "selectorMtf", null);
        setField(term489702, term489702.getClass(), "data", term489862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term489702, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


