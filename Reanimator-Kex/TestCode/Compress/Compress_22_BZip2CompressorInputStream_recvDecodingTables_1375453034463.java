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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608458;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608458 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term608618 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term606090 = (boolean[]) newBooleanArray(256);
        byte[] term606347 = (byte[]) newByteArray(256);
        setField(term608618, term608618.getClass(), "inUse", term606090);
        setField(term608618, term608618.getClass(), "recvDecodingTables_pos", null);
        setField(term608618, term608618.getClass(), "selector", term606347);
        setField(term608618, term608618.getClass(), "selectorMtf", null);
        setField(term608458, term608458.getClass(), "data", term608618);
        setIntField(term608458, term608458.getClass(), "bsLive", 29);
        setIntField(term608458, term608458.getClass(), "bsBuff", 252379140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term608458, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


