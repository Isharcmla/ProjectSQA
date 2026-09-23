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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403383;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403383 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term403543 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term401944 = (byte[]) newByteArray(701);
        byte[] term402646 = (byte[]) newByteArray(320);
        byte[] term402967 = (byte[]) newByteArray(64);
        setIntField(term403383, term403383.getClass(), "bsLive", 54);
        setIntField(term403383, term403383.getClass(), "bsBuff", 436469760);
        setIntField(term403383, term403383.getClass(), "origPtr", 0);
        setField(term403543, term403543.getClass(), "inUse", null);
        setField(term403543, term403543.getClass(), "recvDecodingTables_pos", term401944);
        setField(term403543, term403543.getClass(), "selector", term402646);
        setField(term403543, term403543.getClass(), "selectorMtf", term402967);
        setField(term403383, term403383.getClass(), "data", term403543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term403383, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


