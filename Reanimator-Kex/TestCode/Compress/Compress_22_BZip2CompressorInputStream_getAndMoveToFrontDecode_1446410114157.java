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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82116;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82116 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term82276 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term81818 = (byte[]) newByteArray(0);
        setIntField(term82116, term82116.getClass(), "bsLive", 33);
        setIntField(term82116, term82116.getClass(), "bsBuff", 128);
        setIntField(term82116, term82116.getClass(), "origPtr", 0);
        setField(term82276, term82276.getClass(), "inUse", null);
        setField(term82276, term82276.getClass(), "recvDecodingTables_pos", term81818);
        setField(term82276, term82276.getClass(), "selector", term81818);
        setField(term82276, term82276.getClass(), "selectorMtf", term81818);
        setField(term82116, term82116.getClass(), "data", term82276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term82116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


