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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class PhoneticEngine_applyFinalRules_98950321114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;
     Object term1238;
     Object term1256;
     Object term7688;
     Object term7695;
     Object term7698;
     Object term7652;

    public PhoneticEngine_applyFinalRules_98950321114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7700 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term7699 = ((Class) term7700).getDeclaredField((String) "GENERIC");
        ((Field) term7699).setAccessible(true);
        Object enum24 = ((Field) term7699).get((Object) null);
        Class<? extends Object> term7953 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term7952 = ((Class) term7953).getDeclaredField((String) "EXACT");
        ((Field) term7952).setAccessible(true);
        Object enum25 = ((Field) term7952).get((Object) null);
        term1203 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term1203, term1203.getClass(), "lang", null);
        setField(term1203, term1203.getClass(), "nameType", enum24);
        setField(term1203, term1203.getClass(), "ruleType", enum25);
        setBooleanField(term1203, term1203.getClass(), "concat", false);
        setIntField(term1203, term1203.getClass(), "maxPhonemes", 1162663216);
        HashMap term1240 = new HashMap();
        Set<Object> term8199 =  ((Map) term1240).keySet();
        HashSet term1239 = new HashSet((Collection<? extends Object>) term8199);
        term1238 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term1238, term1238.getClass(), "phonemes", term1239);
        term1256 = new LinkedHashMap();
        Class<? extends Object> term8201 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term8200 = ((Class) term8201).getDeclaredField((String) "GENERIC");
        ((Field) term8200).setAccessible(true);
        Object enum26 = ((Field) term8200).get((Object) null);
        Class<? extends Object> term8454 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term8453 = ((Class) term8454).getDeclaredField((String) "EXACT");
        ((Field) term8453).setAccessible(true);
        Object enum27 = ((Field) term8453).get((Object) null);
        term7688 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term7688, term7688.getClass(), "lang", null);
        setField(term7688, term7688.getClass(), "nameType", enum26);
        setField(term7688, term7688.getClass(), "ruleType", enum27);
        setBooleanField(term7688, term7688.getClass(), "concat", false);
        setIntField(term7688, term7688.getClass(), "maxPhonemes", 1162663216);
        HashMap term7697 = new HashMap();
        Set<Object> term8700 =  ((Map) term7697).keySet();
        HashSet term7696 = new HashSet((Collection<? extends Object>) term8700);
        term7695 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term7695, term7695.getClass(), "phonemes", term7696);
        term7698 = new LinkedHashMap();
        HashMap term7654 = new HashMap();
        Set<Object> term8701 =  ((Map) term7654).keySet();
        HashSet term7653 = new HashSet((Collection<? extends Object>) term8701);
        term7652 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term7652, term7652.getClass(), "phonemes", term7653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term1238;
        args[1] = term1256;
        Object retValue = callMethod(klass, "applyFinalRules", argTypes, term1203, args);
        assertTrue(recursiveEquals(term1203, term7688));
        assertTrue(recursiveEquals(term1238, term7695));
        assertTrue(recursiveEquals(term1256, term7698));
        assertTrue(recursiveEquals(retValue, term7652));
    }

};


