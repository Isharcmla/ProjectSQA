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

public class BZip2CompressorInputStream_recvDecodingTables_137545303468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24645;

    public BZip2CompressorInputStream_recvDecodingTables_137545303468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24645 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term24805 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setField(term24805, term24805.getClass(), "inUse", null);
        setField(term24805, term24805.getClass(), "recvDecodingTables_pos", null);
        setField(term24805, term24805.getClass(), "selector", null);
        setField(term24805, term24805.getClass(), "selectorMtf", null);
        setField(term24645, term24645.getClass(), "data", term24805);
        setIntField(term24645, term24645.getClass(), "bsLive", 12);
        setIntField(term24645, term24645.getClass(), "bsBuff", 536872838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term24645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


