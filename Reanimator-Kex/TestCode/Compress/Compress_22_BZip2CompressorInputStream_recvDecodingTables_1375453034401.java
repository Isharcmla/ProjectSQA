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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494715;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494715 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term494875 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term492346 = (boolean[]) newBooleanArray(512);
        Object term494973 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setField(term494875, term494875.getClass(), "inUse", term492346);
        setField(term494875, term494875.getClass(), "recvDecodingTables_pos", null);
        setField(term494875, term494875.getClass(), "selector", null);
        setField(term494875, term494875.getClass(), "selectorMtf", null);
        setField(term494715, term494715.getClass(), "data", term494875);
        setIntField(term494715, term494715.getClass(), "bsLive", 29);
        setIntField(term494715, term494715.getClass(), "bsBuff", 252379137);
        setField(term494715, term494715.getClass(), "in", term494973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term494715, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


