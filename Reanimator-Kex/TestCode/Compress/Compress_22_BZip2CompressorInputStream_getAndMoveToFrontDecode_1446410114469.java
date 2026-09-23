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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617769;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617769 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term617929 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term615166 = (boolean[]) newBooleanArray(751);
        setIntField(term617769, term617769.getClass(), "bsLive", 54);
        setIntField(term617769, term617769.getClass(), "bsBuff", -1845493753);
        setIntField(term617769, term617769.getClass(), "origPtr", 0);
        setField(term617929, term617929.getClass(), "inUse", term615166);
        setField(term617929, term617929.getClass(), "recvDecodingTables_pos", null);
        setField(term617929, term617929.getClass(), "selector", null);
        setField(term617929, term617929.getClass(), "selectorMtf", null);
        setField(term617769, term617769.getClass(), "data", term617929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term617769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


