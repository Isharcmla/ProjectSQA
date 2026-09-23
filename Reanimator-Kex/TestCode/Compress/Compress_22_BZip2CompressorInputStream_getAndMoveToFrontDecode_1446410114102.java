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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40757;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40757 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term40917 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term39464 = (byte[]) newByteArray(794);
        byte[] term40259 = (byte[]) newByteArray(192);
        byte[] term40452 = (byte[]) newByteArray(66);
        setIntField(term40757, term40757.getClass(), "bsLive", 49);
        setIntField(term40757, term40757.getClass(), "bsBuff", -2134900704);
        setIntField(term40757, term40757.getClass(), "origPtr", 0);
        setField(term40917, term40917.getClass(), "inUse", null);
        setField(term40917, term40917.getClass(), "recvDecodingTables_pos", term39464);
        setField(term40917, term40917.getClass(), "selector", term40259);
        setField(term40917, term40917.getClass(), "selectorMtf", term40452);
        setField(term40757, term40757.getClass(), "data", term40917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term40757, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


