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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555061;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555061 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term555221 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term554810 = (boolean[]) newBooleanArray(0);
        setIntField(term555061, term555061.getClass(), "bsLive", 29);
        setIntField(term555061, term555061.getClass(), "bsBuff", 33554444);
        setIntField(term555061, term555061.getClass(), "origPtr", 0);
        setField(term555221, term555221.getClass(), "inUse", term554810);
        setField(term555221, term555221.getClass(), "recvDecodingTables_pos", null);
        setField(term555221, term555221.getClass(), "selector", null);
        setField(term555221, term555221.getClass(), "selectorMtf", null);
        setField(term555061, term555061.getClass(), "data", term555221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term555061, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


