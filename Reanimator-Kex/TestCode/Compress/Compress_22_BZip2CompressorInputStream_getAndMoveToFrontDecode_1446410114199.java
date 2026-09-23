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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113370;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113370 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term113530 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term110795 = (boolean[]) newBooleanArray(776);
        byte[] term111572 = (byte[]) newByteArray(776);
        byte[] term112349 = (byte[]) newByteArray(776);
        setIntField(term113370, term113370.getClass(), "bsLive", 56);
        setIntField(term113370, term113370.getClass(), "bsBuff", 1207959552);
        setIntField(term113370, term113370.getClass(), "origPtr", 0);
        setField(term113530, term113530.getClass(), "inUse", term110795);
        setField(term113530, term113530.getClass(), "recvDecodingTables_pos", null);
        setField(term113530, term113530.getClass(), "selector", term111572);
        setField(term113530, term113530.getClass(), "selectorMtf", term112349);
        setField(term113370, term113370.getClass(), "data", term113530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term113370, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


