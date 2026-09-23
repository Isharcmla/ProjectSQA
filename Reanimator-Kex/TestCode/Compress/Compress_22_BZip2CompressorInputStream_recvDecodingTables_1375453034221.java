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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150439;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150439 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term150599 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term150201 = (byte[]) newByteArray(8);
        byte[] term150210 = (byte[]) newByteArray(0);
        setField(term150599, term150599.getClass(), "inUse", null);
        setField(term150599, term150599.getClass(), "recvDecodingTables_pos", term150201);
        setField(term150599, term150599.getClass(), "selector", term150210);
        setField(term150599, term150599.getClass(), "selectorMtf", null);
        setField(term150439, term150439.getClass(), "data", term150599);
        setIntField(term150439, term150439.getClass(), "bsLive", 4);
        setIntField(term150439, term150439.getClass(), "bsBuff", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term150439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


