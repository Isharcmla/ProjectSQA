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
import java.lang.NullPointerException;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;
import java.util.LinkedHashMap;

public class PhoneticEngine_applyFinalRules_98950321172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26486;
     Object term26624;
     Object term26884;

    public PhoneticEngine_applyFinalRules_98950321172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26486 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        HashSet term26672 = new HashSet();
        ((HashSet) term26672).add((Object)null);
        ((HashSet) term26672).add((Object)null);
        term26624 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term26624, term26624.getClass(), "phonemes", term26672);
        term26884 = new LinkedHashMap();
        ((LinkedHashMap) term26884).put((Object)null, (Object)null);
        ((LinkedHashMap) term26884).put((Object)null, (Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term26624;
        args[1] = term26884;
        try {
            callMethod(klass, "applyFinalRules", argTypes, term26486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


