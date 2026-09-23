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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290132;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290132 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term290292 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        Object term290344 = newInstance(Class.forName("java.io.DataInputStream"));
        setIntField(term290132, term290132.getClass(), "bsLive", 36);
        setIntField(term290132, term290132.getClass(), "bsBuff", 1826);
        setIntField(term290132, term290132.getClass(), "origPtr", 0);
        setField(term290292, term290292.getClass(), "inUse", null);
        setField(term290292, term290292.getClass(), "recvDecodingTables_pos", null);
        setField(term290292, term290292.getClass(), "selector", null);
        setField(term290292, term290292.getClass(), "selectorMtf", null);
        setField(term290132, term290132.getClass(), "data", term290292);
        setField(term290132, term290132.getClass(), "in", term290344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term290132, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


