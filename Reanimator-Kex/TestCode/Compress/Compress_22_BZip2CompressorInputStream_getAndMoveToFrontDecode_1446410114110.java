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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47931;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47931 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term48091 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setIntField(term47931, term47931.getClass(), "bsLive", 50);
        setIntField(term47931, term47931.getClass(), "bsBuff", -2130706176);
        setIntField(term47931, term47931.getClass(), "origPtr", 0);
        setField(term48091, term48091.getClass(), "inUse", null);
        setField(term48091, term48091.getClass(), "recvDecodingTables_pos", null);
        setField(term48091, term48091.getClass(), "selector", null);
        setField(term48091, term48091.getClass(), "selectorMtf", null);
        setField(term47931, term47931.getClass(), "data", term48091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term47931, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


