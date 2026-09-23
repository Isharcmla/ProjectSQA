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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_144641011496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38077;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_144641011496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38077 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term38237 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term37880 = (byte[]) newByteArray(0);
        byte[] term37881 = (byte[]) newByteArray(0);
        setIntField(term38077, term38077.getClass(), "bsLive", 25);
        setIntField(term38077, term38077.getClass(), "bsBuff", -2147483648);
        setIntField(term38077, term38077.getClass(), "origPtr", 0);
        setField(term38237, term38237.getClass(), "inUse", null);
        setField(term38237, term38237.getClass(), "recvDecodingTables_pos", null);
        setField(term38237, term38237.getClass(), "selector", term37880);
        setField(term38237, term38237.getClass(), "selectorMtf", term37881);
        setField(term38077, term38077.getClass(), "data", term38237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term38077, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


