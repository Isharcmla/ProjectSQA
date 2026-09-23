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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296020;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296020 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term296180 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term293686 = (boolean[]) newBooleanArray(383);
        byte[] term294070 = (byte[]) newByteArray(64);
        byte[] term294135 = (byte[]) newByteArray(0);
        setIntField(term296020, term296020.getClass(), "bsLive", 55);
        setIntField(term296020, term296020.getClass(), "bsBuff", -1341128704);
        setIntField(term296020, term296020.getClass(), "origPtr", 0);
        setField(term296180, term296180.getClass(), "inUse", term293686);
        setField(term296180, term296180.getClass(), "recvDecodingTables_pos", term294070);
        setField(term296180, term296180.getClass(), "selector", term294135);
        setField(term296180, term296180.getClass(), "selectorMtf", term294135);
        setField(term296020, term296020.getClass(), "data", term296180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term296020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


