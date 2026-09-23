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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126209;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126209 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term126369 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term125096 = (byte[]) newByteArray(890);
        byte[] term125987 = (byte[]) newByteArray(0);
        setField(term126369, term126369.getClass(), "inUse", null);
        setField(term126369, term126369.getClass(), "recvDecodingTables_pos", term125096);
        setField(term126369, term126369.getClass(), "selector", term125987);
        setField(term126369, term126369.getClass(), "selectorMtf", null);
        setField(term126209, term126209.getClass(), "data", term126369);
        setIntField(term126209, term126209.getClass(), "bsLive", 4);
        setIntField(term126209, term126209.getClass(), "bsBuff", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term126209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


