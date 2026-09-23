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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309663;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309663 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term309823 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term307302 = (boolean[]) newBooleanArray(511);
        byte[] term307814 = (byte[]) newByteArray(0);
        byte[] term307815 = (byte[]) newByteArray(0);
        setIntField(term309663, term309663.getClass(), "bsLive", 52);
        setIntField(term309663, term309663.getClass(), "bsBuff", -2046689280);
        setIntField(term309663, term309663.getClass(), "origPtr", 0);
        setField(term309823, term309823.getClass(), "inUse", term307302);
        setField(term309823, term309823.getClass(), "recvDecodingTables_pos", term307814);
        setField(term309823, term309823.getClass(), "selector", term307815);
        setField(term309823, term309823.getClass(), "selectorMtf", term307815);
        setField(term309663, term309663.getClass(), "data", term309823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term309663, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


