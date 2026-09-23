package org.apache.commons.compress.compressors;

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
import static org.apache.commons.compress.compressors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CompressorStreamFactory_createCompressorInputStream_82037788483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31708;
     Object term31866;

    public CompressorStreamFactory_createCompressorInputStream_82037788483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31708 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        term31866 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        Object term32022 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge"));
        setField(term31866, term31866.getClass(), "streamBridge", term32022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term31866;
        try {
            callMethod(klass, "createCompressorInputStream", argTypes, term31708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


