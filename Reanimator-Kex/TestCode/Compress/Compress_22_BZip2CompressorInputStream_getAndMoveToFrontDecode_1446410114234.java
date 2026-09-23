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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176181;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176181 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term176341 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term174049 = (boolean[]) newBooleanArray(256);
        setIntField(term176181, term176181.getClass(), "bsLive", 56);
        setIntField(term176181, term176181.getClass(), "bsBuff", 1207959553);
        setIntField(term176181, term176181.getClass(), "origPtr", 0);
        setField(term176341, term176341.getClass(), "inUse", term174049);
        setField(term176341, term176341.getClass(), "recvDecodingTables_pos", null);
        setField(term176341, term176341.getClass(), "selector", null);
        setField(term176341, term176341.getClass(), "selectorMtf", null);
        setField(term176181, term176181.getClass(), "data", term176341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term176181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


