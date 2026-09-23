package org.apache.commons.lang.text;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_toStringBuffer_485917704339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15665;

    public StrBuilder_toStringBuffer_485917704339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15665 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term15666 = (char[]) newCharArray(32);
        setField(term15665, term15665.getClass(), "buffer", term15666);
        setIntField(term15665, term15665.getClass(), "size", -2131181468);
        setField(term15665, term15665.getClass(), "newLine", "PXdVZyoJyC");
        setField(term15665, term15665.getClass(), "nullText", "vLerpqavFM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStringBuffer", argTypes, term15665, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


