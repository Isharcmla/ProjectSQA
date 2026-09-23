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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245012;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245012 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term245172 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term244606 = (byte[]) newByteArray(0);
        setIntField(term245012, term245012.getClass(), "bsLive", 39);
        setIntField(term245012, term245012.getClass(), "bsBuff", 14391);
        setIntField(term245012, term245012.getClass(), "origPtr", 0);
        setField(term245172, term245172.getClass(), "inUse", null);
        setField(term245172, term245172.getClass(), "recvDecodingTables_pos", null);
        setField(term245172, term245172.getClass(), "selector", term244606);
        setField(term245172, term245172.getClass(), "selectorMtf", null);
        setField(term245012, term245012.getClass(), "data", term245172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term245012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


