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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328153;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328153 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term328313 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term325935 = (boolean[]) newBooleanArray(896);
        byte[] term326832 = (byte[]) newByteArray(896);
        byte[] term327729 = (byte[]) newByteArray(0);
        setIntField(term328153, term328153.getClass(), "bsLive", 48);
        setIntField(term328153, term328153.getClass(), "bsBuff", -2141191168);
        setIntField(term328153, term328153.getClass(), "origPtr", 0);
        setField(term328313, term328313.getClass(), "inUse", term325935);
        setField(term328313, term328313.getClass(), "recvDecodingTables_pos", term326832);
        setField(term328313, term328313.getClass(), "selector", term327729);
        setField(term328313, term328313.getClass(), "selectorMtf", null);
        setField(term328153, term328153.getClass(), "data", term328313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term328153, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


