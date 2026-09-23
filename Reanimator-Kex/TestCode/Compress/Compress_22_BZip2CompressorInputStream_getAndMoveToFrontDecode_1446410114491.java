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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650897;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term650897 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term651057 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term648424 = (boolean[]) newBooleanArray(610);
        byte[] term649035 = (byte[]) newByteArray(0);
        setIntField(term650897, term650897.getClass(), "bsLive", 53);
        setIntField(term650897, term650897.getClass(), "bsBuff", -922746800);
        setIntField(term650897, term650897.getClass(), "origPtr", 0);
        setField(term651057, term651057.getClass(), "inUse", term648424);
        setField(term651057, term651057.getClass(), "recvDecodingTables_pos", null);
        setField(term651057, term651057.getClass(), "selector", null);
        setField(term651057, term651057.getClass(), "selectorMtf", term649035);
        setField(term650897, term650897.getClass(), "data", term651057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term650897, args);
    }

};


