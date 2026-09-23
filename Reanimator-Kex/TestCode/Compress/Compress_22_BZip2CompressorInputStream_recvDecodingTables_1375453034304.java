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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305777;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305777 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term305937 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term302612 = (boolean[]) newBooleanArray(655);
        byte[] term303268 = (byte[]) newByteArray(352);
        byte[] term303621 = (byte[]) newByteArray(352);
        setField(term305937, term305937.getClass(), "inUse", term302612);
        setField(term305937, term305937.getClass(), "recvDecodingTables_pos", null);
        setField(term305937, term305937.getClass(), "selector", term303268);
        setField(term305937, term305937.getClass(), "selectorMtf", term303621);
        setField(term305777, term305777.getClass(), "data", term305937);
        setIntField(term305777, term305777.getClass(), "bsLive", 27);
        setIntField(term305777, term305777.getClass(), "bsBuff", -1815953404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term305777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


