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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516881;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516881 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term517041 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term514499 = (boolean[]) newBooleanArray(639);
        setField(term517041, term517041.getClass(), "inUse", term514499);
        setField(term517041, term517041.getClass(), "recvDecodingTables_pos", null);
        setField(term517041, term517041.getClass(), "selector", null);
        setField(term517041, term517041.getClass(), "selectorMtf", null);
        setField(term516881, term516881.getClass(), "data", term517041);
        setIntField(term516881, term516881.getClass(), "bsLive", 31);
        setIntField(term516881, term516881.getClass(), "bsBuff", -1137944576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term516881, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


