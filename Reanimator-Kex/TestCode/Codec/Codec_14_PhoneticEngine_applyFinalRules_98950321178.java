package org.apache.commons.codec.language.bm;

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
import java.lang.ClassCastException;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;
import java.util.LinkedHashMap;

public class PhoneticEngine_applyFinalRules_98950321178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27872;
     Object term28010;
     Object term28498;

    public PhoneticEngine_applyFinalRules_98950321178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27872 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        Object term28278 = newInstance(Class.forName("org.apache.commons.codec.language.bm.Rule$Phoneme$1"));
        HashSet term28058 = new HashSet();
        ((HashSet) term28058).add(term28278);
        term28010 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term28010, term28010.getClass(), "phonemes", term28058);
        Object term28588 = newInstance(Class.forName("java.lang.Object"));
        term28498 = new LinkedHashMap();
        ((LinkedHashMap) term28498).put(term28588, term28588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term28010;
        args[1] = term28498;
        try {
            callMethod(klass, "applyFinalRules", argTypes, term27872, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


