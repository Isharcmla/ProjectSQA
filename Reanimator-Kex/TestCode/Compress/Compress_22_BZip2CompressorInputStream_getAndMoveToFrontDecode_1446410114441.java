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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562598;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562598 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term562758 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term559564 = (boolean[]) newBooleanArray(960);
        byte[] term560525 = (byte[]) newByteArray(192);
        Object term562826 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setIntField(term562598, term562598.getClass(), "bsLive", 55);
        setIntField(term562598, term562598.getClass(), "bsBuff", 806354945);
        setIntField(term562598, term562598.getClass(), "origPtr", 0);
        setField(term562758, term562758.getClass(), "inUse", term559564);
        setField(term562758, term562758.getClass(), "recvDecodingTables_pos", null);
        setField(term562758, term562758.getClass(), "selector", term560525);
        setField(term562758, term562758.getClass(), "selectorMtf", null);
        setField(term562598, term562598.getClass(), "data", term562758);
        setField(term562598, term562598.getClass(), "in", term562826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term562598, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


