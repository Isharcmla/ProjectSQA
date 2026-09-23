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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284900;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284900 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term285060 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term282084 = (boolean[]) newBooleanArray(874);
        byte[] term282959 = (byte[]) newByteArray(128);
        setIntField(term284900, term284900.getClass(), "bsLive", 55);
        setIntField(term284900, term284900.getClass(), "bsBuff", 603979792);
        setIntField(term284900, term284900.getClass(), "origPtr", 0);
        setField(term285060, term285060.getClass(), "inUse", term282084);
        setField(term285060, term285060.getClass(), "recvDecodingTables_pos", null);
        setField(term285060, term285060.getClass(), "selector", null);
        setField(term285060, term285060.getClass(), "selectorMtf", term282959);
        setField(term284900, term284900.getClass(), "data", term285060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term284900, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


