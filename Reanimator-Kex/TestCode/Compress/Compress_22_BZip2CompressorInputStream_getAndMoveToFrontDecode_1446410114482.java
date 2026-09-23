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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636867;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636867 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term637027 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term634304 = (boolean[]) newBooleanArray(743);
        byte[] term635048 = (byte[]) newByteArray(0);
        byte[] term635049 = (byte[]) newByteArray(0);
        setIntField(term636867, term636867.getClass(), "bsLive", 52);
        setIntField(term636867, term636867.getClass(), "bsBuff", -2071986132);
        setIntField(term636867, term636867.getClass(), "origPtr", 0);
        setField(term637027, term637027.getClass(), "inUse", term634304);
        setField(term637027, term637027.getClass(), "recvDecodingTables_pos", term635048);
        setField(term637027, term637027.getClass(), "selector", term635049);
        setField(term637027, term637027.getClass(), "selectorMtf", term635049);
        setField(term636867, term636867.getClass(), "data", term637027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term636867, args);
    }

};


