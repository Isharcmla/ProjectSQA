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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658175;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658175 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term658335 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term654115 = (boolean[]) newBooleanArray(627);
        byte[] term654743 = (byte[]) newByteArray(392);
        byte[] term655136 = (byte[]) newByteArray(627);
        byte[] term655764 = (byte[]) newByteArray(627);
        setIntField(term658175, term658175.getClass(), "bsLive", 47);
        setIntField(term658175, term658175.getClass(), "bsBuff", -2144333824);
        setIntField(term658175, term658175.getClass(), "origPtr", 0);
        setField(term658335, term658335.getClass(), "inUse", term654115);
        setField(term658335, term658335.getClass(), "recvDecodingTables_pos", term654743);
        setField(term658335, term658335.getClass(), "selector", term655136);
        setField(term658335, term658335.getClass(), "selectorMtf", term655764);
        setField(term658175, term658175.getClass(), "data", term658335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term658175, args);
    }

};


