package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BitInputStream_close_190125753673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17187;

    public BitInputStream_close_190125753673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17187 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term17319 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term17447 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term17589 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder$1"));
        Object term17639 = newInstance(Class.forName("java.util.zip.Inflater"));
        setBooleanField(term17447, term17447.getClass(), "closed", false);
        setField(term17589, term17589.getClass(), "val$inflaterInputStream", null);
        setField(term17589, term17589.getClass(), "val$inflater", term17639);
        setField(term17447, term17447.getClass(), "input", term17589);
        setField(term17319, term17319.getClass(), "is", term17447);
        setField(term17187, term17187.getClass(), "in", term17319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term17187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


