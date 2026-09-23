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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537713;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537713 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term537873 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term534808 = (boolean[]) newBooleanArray(512);
        byte[] term535321 = (byte[]) newByteArray(512);
        setField(term537873, term537873.getClass(), "inUse", term534808);
        setField(term537873, term537873.getClass(), "recvDecodingTables_pos", null);
        setField(term537873, term537873.getClass(), "selector", null);
        setField(term537873, term537873.getClass(), "selectorMtf", term535321);
        setField(term537713, term537713.getClass(), "data", term537873);
        setIntField(term537713, term537713.getClass(), "bsLive", 30);
        setIntField(term537713, term537713.getClass(), "bsBuff", -1642715136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term537713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


