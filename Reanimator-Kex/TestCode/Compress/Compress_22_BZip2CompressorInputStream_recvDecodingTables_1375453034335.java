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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379532;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379532 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term379692 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term376703 = (boolean[]) newBooleanArray(398);
        byte[] term377102 = (byte[]) newByteArray(608);
        setField(term379692, term379692.getClass(), "inUse", term376703);
        setField(term379692, term379692.getClass(), "recvDecodingTables_pos", null);
        setField(term379692, term379692.getClass(), "selector", term377102);
        setField(term379692, term379692.getClass(), "selectorMtf", null);
        setField(term379532, term379532.getClass(), "data", term379692);
        setIntField(term379532, term379532.getClass(), "bsLive", 27);
        setIntField(term379532, term379532.getClass(), "bsBuff", 63094913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term379532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


