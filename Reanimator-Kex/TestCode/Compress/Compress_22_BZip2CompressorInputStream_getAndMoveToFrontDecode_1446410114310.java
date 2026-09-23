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
import java.io.IOException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318292;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318292 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term318452 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term318070 = (byte[]) newByteArray(0);
        Object term318582 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumVerifyingInputStream"));
        setIntField(term318292, term318292.getClass(), "bsLive", 27);
        setIntField(term318292, term318292.getClass(), "bsBuff", 2);
        setIntField(term318292, term318292.getClass(), "origPtr", 0);
        setField(term318452, term318452.getClass(), "inUse", null);
        setField(term318452, term318452.getClass(), "recvDecodingTables_pos", null);
        setField(term318452, term318452.getClass(), "selector", term318070);
        setField(term318452, term318452.getClass(), "selectorMtf", null);
        setField(term318292, term318292.getClass(), "data", term318452);
        setField(term318292, term318292.getClass(), "in", term318582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term318292, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


