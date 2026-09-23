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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451580;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451580 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term451740 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term449690 = (boolean[]) newBooleanArray(521);
        byte[] term450212 = (byte[]) newByteArray(521);
        byte[] term450734 = (byte[]) newByteArray(521);
        setIntField(term451580, term451580.getClass(), "bsLive", 39);
        setIntField(term451580, term451580.getClass(), "bsBuff", -2147471264);
        setIntField(term451580, term451580.getClass(), "origPtr", 0);
        setField(term451740, term451740.getClass(), "inUse", term449690);
        setField(term451740, term451740.getClass(), "recvDecodingTables_pos", null);
        setField(term451740, term451740.getClass(), "selector", term450212);
        setField(term451740, term451740.getClass(), "selectorMtf", term450734);
        setField(term451580, term451580.getClass(), "data", term451740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term451580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


