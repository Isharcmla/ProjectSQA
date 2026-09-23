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
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.bm.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class PhoneticEngine_getMaxPhonemes_39155214921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5091;
     Object term15021;

    public PhoneticEngine_getMaxPhonemes_39155214921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15029 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term15028 = ((Class) term15029).getDeclaredField((String) "ASHKENAZI");
        ((Field) term15028).setAccessible(true);
        Object enum50 = ((Field) term15028).get((Object) null);
        Class<? extends Object> term15288 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term15287 = ((Class) term15288).getDeclaredField((String) "APPROX");
        ((Field) term15287).setAccessible(true);
        Object enum51 = ((Field) term15287).get((Object) null);
        term5091 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term5091, term5091.getClass(), "lang", null);
        setField(term5091, term5091.getClass(), "nameType", enum50);
        setField(term5091, term5091.getClass(), "ruleType", enum51);
        setBooleanField(term5091, term5091.getClass(), "concat", true);
        setIntField(term5091, term5091.getClass(), "maxPhonemes", -883034806);
        Class<? extends Object> term15538 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term15537 = ((Class) term15538).getDeclaredField((String) "ASHKENAZI");
        ((Field) term15537).setAccessible(true);
        Object enum52 = ((Field) term15537).get((Object) null);
        Class<? extends Object> term15797 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term15796 = ((Class) term15797).getDeclaredField((String) "APPROX");
        ((Field) term15796).setAccessible(true);
        Object enum53 = ((Field) term15796).get((Object) null);
        term15021 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term15021, term15021.getClass(), "lang", null);
        setField(term15021, term15021.getClass(), "nameType", enum52);
        setField(term15021, term15021.getClass(), "ruleType", enum53);
        setBooleanField(term15021, term15021.getClass(), "concat", true);
        setIntField(term15021, term15021.getClass(), "maxPhonemes", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxPhonemes", argTypes, term5091, args);
        assertTrue(recursiveEquals(term5091, term15021));
        assertTrue(recursiveEquals(retValue, -883034806));
    }

};


