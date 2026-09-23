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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85619;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85619 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term85779 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term85270 = (byte[]) newByteArray(64);
        byte[] term85335 = (byte[]) newByteArray(64);
        setIntField(term85619, term85619.getClass(), "bsLive", 27);
        setIntField(term85619, term85619.getClass(), "bsBuff", 2);
        setIntField(term85619, term85619.getClass(), "origPtr", 0);
        setField(term85779, term85779.getClass(), "inUse", null);
        setField(term85779, term85779.getClass(), "recvDecodingTables_pos", null);
        setField(term85779, term85779.getClass(), "selector", term85270);
        setField(term85779, term85779.getClass(), "selectorMtf", term85335);
        setField(term85619, term85619.getClass(), "data", term85779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term85619, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


