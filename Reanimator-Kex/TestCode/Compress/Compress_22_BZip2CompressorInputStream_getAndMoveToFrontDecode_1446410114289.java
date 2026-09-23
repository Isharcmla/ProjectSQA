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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281563;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281563 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term281723 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term281186 = (boolean[]) newBooleanArray(0);
        setIntField(term281563, term281563.getClass(), "bsLive", 38);
        setIntField(term281563, term281563.getClass(), "bsBuff", -2147477504);
        setIntField(term281563, term281563.getClass(), "origPtr", 0);
        setField(term281723, term281723.getClass(), "inUse", term281186);
        setField(term281723, term281723.getClass(), "recvDecodingTables_pos", null);
        setField(term281723, term281723.getClass(), "selector", null);
        setField(term281723, term281723.getClass(), "selectorMtf", null);
        setField(term281563, term281563.getClass(), "data", term281723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term281563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


