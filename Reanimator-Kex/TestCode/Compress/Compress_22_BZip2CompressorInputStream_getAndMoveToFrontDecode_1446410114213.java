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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138706;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138706 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term138866 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term137934 = (byte[]) newByteArray(134);
        byte[] term138069 = (byte[]) newByteArray(134);
        byte[] term138204 = (byte[]) newByteArray(134);
        Object term138952 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        setIntField(term138706, term138706.getClass(), "bsLive", 37);
        setIntField(term138706, term138706.getClass(), "bsBuff", -2147480576);
        setIntField(term138706, term138706.getClass(), "origPtr", 0);
        setField(term138866, term138866.getClass(), "inUse", null);
        setField(term138866, term138866.getClass(), "recvDecodingTables_pos", term137934);
        setField(term138866, term138866.getClass(), "selector", term138069);
        setField(term138866, term138866.getClass(), "selectorMtf", term138204);
        setField(term138706, term138706.getClass(), "data", term138866);
        setField(term138706, term138706.getClass(), "in", term138952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term138706, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


