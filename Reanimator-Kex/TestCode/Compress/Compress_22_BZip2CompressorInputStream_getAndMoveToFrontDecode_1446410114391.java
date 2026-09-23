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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487930;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487930 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term488090 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term487481 = (boolean[]) newBooleanArray(16);
        byte[] term487498 = (byte[]) newByteArray(16);
        byte[] term487515 = (byte[]) newByteArray(16);
        setIntField(term487930, term487930.getClass(), "bsLive", 40);
        setIntField(term487930, term487930.getClass(), "bsBuff", -2104598527);
        setIntField(term487930, term487930.getClass(), "origPtr", 0);
        setField(term488090, term488090.getClass(), "inUse", term487481);
        setField(term488090, term488090.getClass(), "recvDecodingTables_pos", null);
        setField(term488090, term488090.getClass(), "selector", term487498);
        setField(term488090, term488090.getClass(), "selectorMtf", term487515);
        setField(term487930, term487930.getClass(), "data", term488090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term487930, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


