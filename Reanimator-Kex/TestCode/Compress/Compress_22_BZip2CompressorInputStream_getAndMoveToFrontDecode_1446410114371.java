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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443965;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443965 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term444125 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term443664 = (boolean[]) newBooleanArray(1);
        byte[] term443666 = (byte[]) newByteArray(1);
        byte[] term443668 = (byte[]) newByteArray(1);
        setIntField(term443965, term443965.getClass(), "bsLive", 48);
        setIntField(term443965, term443965.getClass(), "bsBuff", -1605828608);
        setIntField(term443965, term443965.getClass(), "origPtr", 0);
        setField(term444125, term444125.getClass(), "inUse", term443664);
        setField(term444125, term444125.getClass(), "recvDecodingTables_pos", null);
        setField(term444125, term444125.getClass(), "selector", term443666);
        setField(term444125, term444125.getClass(), "selectorMtf", term443668);
        setField(term443965, term443965.getClass(), "data", term444125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term443965, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


