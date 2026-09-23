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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601330;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601330 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term601490 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term598646 = (boolean[]) newBooleanArray(768);
        byte[] term599415 = (byte[]) newByteArray(224);
        setIntField(term601330, term601330.getClass(), "bsLive", 40);
        setIntField(term601330, term601330.getClass(), "bsBuff", -2147459040);
        setIntField(term601330, term601330.getClass(), "origPtr", 0);
        setField(term601490, term601490.getClass(), "inUse", term598646);
        setField(term601490, term601490.getClass(), "recvDecodingTables_pos", term599415);
        setField(term601490, term601490.getClass(), "selector", null);
        setField(term601490, term601490.getClass(), "selectorMtf", null);
        setField(term601330, term601330.getClass(), "data", term601490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term601330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


