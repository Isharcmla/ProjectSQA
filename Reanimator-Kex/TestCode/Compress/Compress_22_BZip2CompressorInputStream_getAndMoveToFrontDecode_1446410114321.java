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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366435;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366435 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term366595 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term364390 = (boolean[]) newBooleanArray(256);
        setIntField(term366435, term366435.getClass(), "bsLive", 54);
        setIntField(term366435, term366435.getClass(), "bsBuff", 301990048);
        setIntField(term366435, term366435.getClass(), "origPtr", 0);
        setField(term366595, term366595.getClass(), "inUse", term364390);
        setField(term366595, term366595.getClass(), "recvDecodingTables_pos", null);
        setField(term366595, term366595.getClass(), "selector", null);
        setField(term366595, term366595.getClass(), "selectorMtf", null);
        setField(term366435, term366435.getClass(), "data", term366595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term366435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


