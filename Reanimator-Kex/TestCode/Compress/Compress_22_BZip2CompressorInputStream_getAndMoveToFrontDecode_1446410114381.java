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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468511;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468511 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term468671 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term466349 = (boolean[]) newBooleanArray(327);
        setIntField(term468511, term468511.getClass(), "bsLive", 52);
        setIntField(term468511, term468511.getClass(), "bsBuff", 75497476);
        setIntField(term468511, term468511.getClass(), "origPtr", 0);
        setField(term468671, term468671.getClass(), "inUse", term466349);
        setField(term468671, term468671.getClass(), "recvDecodingTables_pos", null);
        setField(term468671, term468671.getClass(), "selector", null);
        setField(term468671, term468671.getClass(), "selectorMtf", null);
        setField(term468511, term468511.getClass(), "data", term468671);
        setField(term468511, term468511.getClass(), "in", term468511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term468511, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


