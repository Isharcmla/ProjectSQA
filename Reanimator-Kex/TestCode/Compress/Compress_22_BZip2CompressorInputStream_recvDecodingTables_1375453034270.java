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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247921;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247921 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term248081 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term245535 = (boolean[]) newBooleanArray(512);
        byte[] term246048 = (byte[]) newByteArray(0);
        byte[] term246049 = (byte[]) newByteArray(0);
        setField(term248081, term248081.getClass(), "inUse", term245535);
        setField(term248081, term248081.getClass(), "recvDecodingTables_pos", null);
        setField(term248081, term248081.getClass(), "selector", term246048);
        setField(term248081, term248081.getClass(), "selectorMtf", term246049);
        setField(term247921, term247921.getClass(), "data", term248081);
        setIntField(term247921, term247921.getClass(), "bsLive", 31);
        setIntField(term247921, term247921.getClass(), "bsBuff", 1009516545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term247921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


