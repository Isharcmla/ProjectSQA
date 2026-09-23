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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510222;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510222 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term510382 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term509794 = (boolean[]) newBooleanArray(32);
        byte[] term509827 = (byte[]) newByteArray(32);
        byte[] term509860 = (byte[]) newByteArray(32);
        setIntField(term510222, term510222.getClass(), "bsLive", 35);
        setIntField(term510222, term510222.getClass(), "bsBuff", 576);
        setIntField(term510222, term510222.getClass(), "origPtr", 0);
        setField(term510382, term510382.getClass(), "inUse", term509794);
        setField(term510382, term510382.getClass(), "recvDecodingTables_pos", null);
        setField(term510382, term510382.getClass(), "selector", term509827);
        setField(term510382, term510382.getClass(), "selectorMtf", term509860);
        setField(term510222, term510222.getClass(), "data", term510382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term510222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


