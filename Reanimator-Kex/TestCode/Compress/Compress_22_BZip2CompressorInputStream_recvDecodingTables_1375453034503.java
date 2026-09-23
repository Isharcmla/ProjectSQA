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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675294;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675294 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term675454 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term674883 = (boolean[]) newBooleanArray(0);
        byte[] term674884 = (byte[]) newByteArray(0);
        Object term675518 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setField(term675454, term675454.getClass(), "inUse", term674883);
        setField(term675454, term675454.getClass(), "recvDecodingTables_pos", term674884);
        setField(term675454, term675454.getClass(), "selector", null);
        setField(term675454, term675454.getClass(), "selectorMtf", null);
        setField(term675294, term675294.getClass(), "data", term675454);
        setIntField(term675294, term675294.getClass(), "bsLive", 12);
        setIntField(term675294, term675294.getClass(), "bsBuff", -2147481722);
        setField(term675294, term675294.getClass(), "in", term675518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term675294, args);
    }

};


