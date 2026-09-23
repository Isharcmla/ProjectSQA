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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60551;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60551 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term60711 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term58724 = (boolean[]) newBooleanArray(514);
        byte[] term59239 = (byte[]) newByteArray(514);
        byte[] term59754 = (byte[]) newByteArray(514);
        setIntField(term60551, term60551.getClass(), "bsLive", 37);
        setIntField(term60551, term60551.getClass(), "bsBuff", -2147480000);
        setIntField(term60551, term60551.getClass(), "origPtr", 0);
        setField(term60711, term60711.getClass(), "inUse", term58724);
        setField(term60711, term60711.getClass(), "recvDecodingTables_pos", null);
        setField(term60711, term60711.getClass(), "selector", term59239);
        setField(term60711, term60711.getClass(), "selectorMtf", term59754);
        setField(term60551, term60551.getClass(), "data", term60711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term60551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


