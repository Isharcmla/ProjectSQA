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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383037;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383037 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term383197 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term380704 = (boolean[]) newBooleanArray(511);
        setIntField(term383037, term383037.getClass(), "bsLive", 51);
        setIntField(term383037, term383037.getClass(), "bsBuff", 574619648);
        setIntField(term383037, term383037.getClass(), "origPtr", 0);
        setField(term383197, term383197.getClass(), "inUse", term380704);
        setField(term383197, term383197.getClass(), "recvDecodingTables_pos", null);
        setField(term383197, term383197.getClass(), "selector", null);
        setField(term383197, term383197.getClass(), "selectorMtf", null);
        setField(term383037, term383037.getClass(), "data", term383197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term383037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


