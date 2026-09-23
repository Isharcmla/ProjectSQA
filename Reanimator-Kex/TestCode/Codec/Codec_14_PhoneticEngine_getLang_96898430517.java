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

public class PhoneticEngine_getLang_96898430517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2917;
     Object term10342;

    public PhoneticEngine_getLang_96898430517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10350 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term10349 = ((Class) term10350).getDeclaredField((String) "GENERIC");
        ((Field) term10349).setAccessible(true);
        Object enum32 = ((Field) term10349).get((Object) null);
        Class<? extends Object> term10616 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term10615 = ((Class) term10616).getDeclaredField((String) "EXACT");
        ((Field) term10615).setAccessible(true);
        Object enum33 = ((Field) term10615).get((Object) null);
        term2917 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term2917, term2917.getClass(), "lang", null);
        setField(term2917, term2917.getClass(), "nameType", enum32);
        setField(term2917, term2917.getClass(), "ruleType", enum33);
        setBooleanField(term2917, term2917.getClass(), "concat", true);
        setIntField(term2917, term2917.getClass(), "maxPhonemes", -1339778481);
        Class<? extends Object> term10874 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term10873 = ((Class) term10874).getDeclaredField((String) "GENERIC");
        ((Field) term10873).setAccessible(true);
        Object enum34 = ((Field) term10873).get((Object) null);
        Class<? extends Object> term11127 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term11126 = ((Class) term11127).getDeclaredField((String) "EXACT");
        ((Field) term11126).setAccessible(true);
        Object enum35 = ((Field) term11126).get((Object) null);
        term10342 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term10342, term10342.getClass(), "lang", null);
        setField(term10342, term10342.getClass(), "nameType", enum34);
        setField(term10342, term10342.getClass(), "ruleType", enum35);
        setBooleanField(term10342, term10342.getClass(), "concat", true);
        setIntField(term10342, term10342.getClass(), "maxPhonemes", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLang", argTypes, term2917, args);
        assertTrue(recursiveEquals(term2917, term10342));
        assertTrue(recursiveEquals(retValue, null));
    }

};


