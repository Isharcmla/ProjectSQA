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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504647;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term504647 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term504807 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term501890 = (boolean[]) newBooleanArray(895);
        byte[] term502786 = (byte[]) newByteArray(0);
        setIntField(term504647, term504647.getClass(), "bsLive", 54);
        setIntField(term504647, term504647.getClass(), "bsBuff", 301989896);
        setIntField(term504647, term504647.getClass(), "origPtr", 0);
        setField(term504807, term504807.getClass(), "inUse", term501890);
        setField(term504807, term504807.getClass(), "recvDecodingTables_pos", term502786);
        setField(term504807, term504807.getClass(), "selector", term502786);
        setField(term504807, term504807.getClass(), "selectorMtf", null);
        setField(term504647, term504647.getClass(), "data", term504807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term504647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


