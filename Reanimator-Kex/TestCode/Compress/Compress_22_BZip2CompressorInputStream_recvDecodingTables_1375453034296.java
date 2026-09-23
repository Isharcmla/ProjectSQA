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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293005;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293005 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term293165 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term290694 = (boolean[]) newBooleanArray(515);
        setField(term293165, term293165.getClass(), "inUse", term290694);
        setField(term293165, term293165.getClass(), "recvDecodingTables_pos", null);
        setField(term293165, term293165.getClass(), "selector", null);
        setField(term293165, term293165.getClass(), "selectorMtf", null);
        setField(term293005, term293005.getClass(), "data", term293165);
        setIntField(term293005, term293005.getClass(), "bsLive", 32);
        setIntField(term293005, term293005.getClass(), "bsBuff", 2019037312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term293005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


