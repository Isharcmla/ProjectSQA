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
import java.lang.NoClassDefFoundError;
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PhoneticEngine_encode_77135309216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2347;

    public PhoneticEngine_encode_77135309216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9801 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term9800 = ((Class) term9801).getDeclaredField((String) "ASHKENAZI");
        ((Field) term9800).setAccessible(true);
        Object enum30 = ((Field) term9800).get((Object) null);
        Class<? extends Object> term10060 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term10059 = ((Class) term10060).getDeclaredField((String) "APPROX");
        ((Field) term10059).setAccessible(true);
        Object enum31 = ((Field) term10059).get((Object) null);
        term2347 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term2347, term2347.getClass(), "lang", null);
        setField(term2347, term2347.getClass(), "nameType", enum30);
        setField(term2347, term2347.getClass(), "ruleType", enum31);
        setBooleanField(term2347, term2347.getClass(), "concat", true);
        setIntField(term2347, term2347.getClass(), "maxPhonemes", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.bm.Languages$LanguageSet");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = null;
        try {
            callMethod(klass, "encode", argTypes, term2347, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


