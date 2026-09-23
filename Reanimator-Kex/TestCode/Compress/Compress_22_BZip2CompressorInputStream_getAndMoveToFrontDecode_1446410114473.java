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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630778;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term630778 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term630938 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setIntField(term630778, term630778.getClass(), "bsLive", 55);
        setIntField(term630778, term630778.getClass(), "bsBuff", 810090496);
        setIntField(term630778, term630778.getClass(), "origPtr", 0);
        setField(term630938, term630938.getClass(), "inUse", null);
        setField(term630938, term630938.getClass(), "recvDecodingTables_pos", null);
        setField(term630938, term630938.getClass(), "selector", null);
        setField(term630938, term630938.getClass(), "selectorMtf", null);
        setField(term630778, term630778.getClass(), "data", term630938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term630778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


