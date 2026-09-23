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
import java.io.IOException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368693;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368693 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term368853 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        Object term368947 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeInputStream"));
        setIntField(term368693, term368693.getClass(), "bsLive", 38);
        setIntField(term368693, term368693.getClass(), "bsBuff", 6144);
        setIntField(term368693, term368693.getClass(), "origPtr", 0);
        setField(term368853, term368853.getClass(), "inUse", null);
        setField(term368853, term368853.getClass(), "recvDecodingTables_pos", null);
        setField(term368853, term368853.getClass(), "selector", null);
        setField(term368853, term368853.getClass(), "selectorMtf", null);
        setField(term368693, term368693.getClass(), "data", term368853);
        setField(term368693, term368693.getClass(), "in", term368947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term368693, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


