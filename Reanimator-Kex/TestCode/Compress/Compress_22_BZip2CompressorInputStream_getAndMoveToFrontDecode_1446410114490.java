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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646722;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646722 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term646882 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term644754 = (boolean[]) newBooleanArray(768);
        byte[] term645523 = (byte[]) newByteArray(768);
        byte[] term646292 = (byte[]) newByteArray(0);
        setIntField(term646722, term646722.getClass(), "bsLive", 56);
        setIntField(term646722, term646722.getClass(), "bsBuff", 1620180992);
        setIntField(term646722, term646722.getClass(), "origPtr", 0);
        setField(term646882, term646882.getClass(), "inUse", term644754);
        setField(term646882, term646882.getClass(), "recvDecodingTables_pos", term645523);
        setField(term646882, term646882.getClass(), "selector", term646292);
        setField(term646882, term646882.getClass(), "selectorMtf", null);
        setField(term646722, term646722.getClass(), "data", term646882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term646722, args);
    }

};


