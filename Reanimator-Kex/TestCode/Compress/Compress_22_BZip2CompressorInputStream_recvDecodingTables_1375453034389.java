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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480941;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480941 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term481101 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term477762 = (boolean[]) newBooleanArray(587);
        byte[] term478350 = (byte[]) newByteArray(416);
        byte[] term478767 = (byte[]) newByteArray(416);
        setField(term481101, term481101.getClass(), "inUse", term477762);
        setField(term481101, term481101.getClass(), "recvDecodingTables_pos", null);
        setField(term481101, term481101.getClass(), "selector", term478350);
        setField(term481101, term481101.getClass(), "selectorMtf", term478767);
        setField(term480941, term480941.getClass(), "data", term481101);
        setIntField(term480941, term480941.getClass(), "bsLive", 30);
        setIntField(term480941, term480941.getClass(), "bsBuff", -1642714608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term480941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


