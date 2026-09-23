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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438187;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438187 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term438347 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term435258 = (boolean[]) newBooleanArray(511);
        byte[] term435770 = (byte[]) newByteArray(512);
        Object term438481 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnshrinkingInputStream"));
        setIntField(term438187, term438187.getClass(), "bsLive", 56);
        setIntField(term438187, term438187.getClass(), "bsBuff", 1207959552);
        setIntField(term438187, term438187.getClass(), "origPtr", 0);
        setField(term438347, term438347.getClass(), "inUse", term435258);
        setField(term438347, term438347.getClass(), "recvDecodingTables_pos", null);
        setField(term438347, term438347.getClass(), "selector", term435770);
        setField(term438347, term438347.getClass(), "selectorMtf", null);
        setField(term438187, term438187.getClass(), "data", term438347);
        setField(term438187, term438187.getClass(), "in", term438481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term438187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


