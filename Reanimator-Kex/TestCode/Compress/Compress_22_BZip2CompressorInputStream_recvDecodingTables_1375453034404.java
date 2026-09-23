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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500573;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500573 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term500733 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term497720 = (boolean[]) newBooleanArray(895);
        byte[] term498616 = (byte[]) newByteArray(128);
        byte[] term498745 = (byte[]) newByteArray(128);
        setField(term500733, term500733.getClass(), "inUse", term497720);
        setField(term500733, term500733.getClass(), "recvDecodingTables_pos", null);
        setField(term500733, term500733.getClass(), "selector", term498616);
        setField(term500733, term500733.getClass(), "selectorMtf", term498745);
        setField(term500573, term500573.getClass(), "data", term500733);
        setIntField(term500573, term500573.getClass(), "bsLive", 17);
        setIntField(term500573, term500573.getClass(), "bsBuff", 61617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term500573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


