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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PhoneticEngine_applyFinalRules_98950321152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24282;
     Object term24420;
     Object term24528;
     Object term24720;
     Object term24721;
     Object term24725;
     Object term24702;

    public PhoneticEngine_applyFinalRules_98950321152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24282 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        HashSet term24468 = new HashSet();
        term24420 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term24420, term24420.getClass(), "phonemes", term24468);
        term24528 = new LinkedHashMap();
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        ((LinkedHashMap) term24528).put((Object)null, (Object)null);
        term24720 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term24720, term24720.getClass(), "lang", null);
        setField(term24720, term24720.getClass(), "nameType", null);
        setField(term24720, term24720.getClass(), "ruleType", null);
        setBooleanField(term24720, term24720.getClass(), "concat", false);
        setIntField(term24720, term24720.getClass(), "maxPhonemes", 0);
        HashMap term24723 = new HashMap();
        Set<Object> term24728 =  ((Map) term24723).keySet();
        HashSet term24722 = new HashSet((Collection<? extends Object>) term24728);
        term24721 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        setField(term24721, term24721.getClass(), "phonemes", term24722);
        term24725 = new LinkedHashMap();
        term24702 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder"));
        Object term24703 = newInstance(Class.forName("java.util.TreeSet"));
        Object term24704 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24705 = newInstance(Class.forName("org.apache.commons.codec.language.bm.Rule$Phoneme$1"));
        setField(term24704, term24704.getClass(), "comparator", term24705);
        setField(term24704, term24704.getClass(), "root", null);
        setIntField(term24704, term24704.getClass(), "size", 0);
        setIntField(term24704, term24704.getClass(), "modCount", 0);
        setField(term24704, term24704.getClass(), "entrySet", null);
        setField(term24704, term24704.getClass(), "navigableKeySet", null);
        setField(term24704, term24704.getClass(), "descendingMap", null);
        setField(term24704, term24704.getClass(), "keySet", null);
        setField(term24704, term24704.getClass(), "values", null);
        setField(term24703, term24703.getClass(), "m", term24704);
        setField(term24702, term24702.getClass(), "phonemes", term24703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term24420;
        args[1] = term24528;
        Object retValue = callMethod(klass, "applyFinalRules", argTypes, term24282, args);
        assertTrue(recursiveEquals(term24282, term24720));
        assertTrue(recursiveEquals(term24420, term24721));
        assertTrue(recursiveEquals(term24528, term24725));
        assertTrue(recursiveEquals(retValue, term24702));
    }

};


