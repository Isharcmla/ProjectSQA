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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359436;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359436 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term359596 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term356544 = (boolean[]) newBooleanArray(511);
        byte[] term357056 = (byte[]) newByteArray(512);
        setField(term359596, term359596.getClass(), "inUse", term356544);
        setField(term359596, term359596.getClass(), "recvDecodingTables_pos", null);
        setField(term359596, term359596.getClass(), "selector", term357056);
        setField(term359596, term359596.getClass(), "selectorMtf", null);
        setField(term359436, term359436.getClass(), "data", term359596);
        setIntField(term359436, term359436.getClass(), "bsLive", 30);
        setIntField(term359436, term359436.getClass(), "bsBuff", 504759296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term359436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


