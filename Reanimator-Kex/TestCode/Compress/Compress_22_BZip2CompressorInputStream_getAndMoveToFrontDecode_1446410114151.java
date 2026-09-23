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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75966;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75966 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term76126 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term75657 = (byte[]) newByteArray(9);
        setIntField(term75966, term75966.getClass(), "bsLive", 31);
        setIntField(term75966, term75966.getClass(), "bsBuff", -2147483592);
        setIntField(term75966, term75966.getClass(), "origPtr", 0);
        setField(term76126, term76126.getClass(), "inUse", null);
        setField(term76126, term76126.getClass(), "recvDecodingTables_pos", term75657);
        setField(term76126, term76126.getClass(), "selector", term75657);
        setField(term76126, term76126.getClass(), "selectorMtf", term75657);
        setField(term75966, term75966.getClass(), "data", term76126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term75966, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


