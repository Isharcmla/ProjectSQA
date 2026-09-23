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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590794;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590794 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term590954 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term587439 = (boolean[]) newBooleanArray(511);
        byte[] term587951 = (byte[]) newByteArray(518);
        byte[] term588470 = (byte[]) newByteArray(514);
        setField(term590954, term590954.getClass(), "inUse", term587439);
        setField(term590954, term590954.getClass(), "recvDecodingTables_pos", null);
        setField(term590954, term590954.getClass(), "selector", term587951);
        setField(term590954, term590954.getClass(), "selectorMtf", term588470);
        setField(term590794, term590794.getClass(), "data", term590954);
        setIntField(term590794, term590794.getClass(), "bsLive", 26);
        setIntField(term590794, term590794.getClass(), "bsBuff", -1444846974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term590794, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


