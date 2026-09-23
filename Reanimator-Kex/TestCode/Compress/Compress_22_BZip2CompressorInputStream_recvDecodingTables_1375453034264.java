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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235613;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235613 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term235773 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term233462 = (boolean[]) newBooleanArray(599);
        byte[] term234062 = (byte[]) newByteArray(599);
        byte[] term234662 = (byte[]) newByteArray(599);
        Object term235837 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setField(term235773, term235773.getClass(), "inUse", term233462);
        setField(term235773, term235773.getClass(), "recvDecodingTables_pos", term234062);
        setField(term235773, term235773.getClass(), "selector", term234662);
        setField(term235773, term235773.getClass(), "selectorMtf", null);
        setField(term235613, term235613.getClass(), "data", term235773);
        setIntField(term235613, term235613.getClass(), "bsLive", 12);
        setIntField(term235613, term235613.getClass(), "bsBuff", 1926);
        setField(term235613, term235613.getClass(), "in", term235837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term235613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


