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
import java.lang.String;
import java.lang.Object;

public class PhoneticEngine_encode_32596427015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1782;

    public PhoneticEngine_encode_32596427015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8951 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term8950 = ((Class) term8951).getDeclaredField((String) "SEPHARDIC");
        ((Field) term8950).setAccessible(true);
        Object enum28 = ((Field) term8950).get((Object) null);
        Class<? extends Object> term9210 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term9209 = ((Class) term9210).getDeclaredField((String) "RULES");
        ((Field) term9209).setAccessible(true);
        Object enum29 = ((Field) term9209).get((Object) null);
        term1782 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term1782, term1782.getClass(), "lang", null);
        setField(term1782, term1782.getClass(), "nameType", enum28);
        setField(term1782, term1782.getClass(), "ruleType", enum29);
        setBooleanField(term1782, term1782.getClass(), "concat", false);
        setIntField(term1782, term1782.getClass(), "maxPhonemes", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        try {
            callMethod(klass, "encode", argTypes, term1782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


