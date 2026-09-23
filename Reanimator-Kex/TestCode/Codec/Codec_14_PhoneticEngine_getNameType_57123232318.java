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

public class PhoneticEngine_getNameType_57123232318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3452;
     Object term11373;
     Object enum43;

    public PhoneticEngine_getNameType_57123232318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11381 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term11380 = ((Class) term11381).getDeclaredField((String) "SEPHARDIC");
        ((Field) term11380).setAccessible(true);
        Object enum36 = ((Field) term11380).get((Object) null);
        Class<? extends Object> term11640 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term11639 = ((Class) term11640).getDeclaredField((String) "RULES");
        ((Field) term11639).setAccessible(true);
        Object enum37 = ((Field) term11639).get((Object) null);
        term3452 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term3452, term3452.getClass(), "lang", null);
        setField(term3452, term3452.getClass(), "nameType", enum36);
        setField(term3452, term3452.getClass(), "ruleType", enum37);
        setBooleanField(term3452, term3452.getClass(), "concat", true);
        setIntField(term3452, term3452.getClass(), "maxPhonemes", 1725571209);
        Class<? extends Object> term11887 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term11886 = ((Class) term11887).getDeclaredField((String) "SEPHARDIC");
        ((Field) term11886).setAccessible(true);
        Object enum38 = ((Field) term11886).get((Object) null);
        Class<? extends Object> term12173 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term12172 = ((Class) term12173).getDeclaredField((String) "RULES");
        ((Field) term12172).setAccessible(true);
        Object enum39 = ((Field) term12172).get((Object) null);
        term11373 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term11373, term11373.getClass(), "lang", null);
        setField(term11373, term11373.getClass(), "nameType", enum38);
        setField(term11373, term11373.getClass(), "ruleType", enum39);
        setBooleanField(term11373, term11373.getClass(), "concat", true);
        setIntField(term11373, term11373.getClass(), "maxPhonemes", 1725571209);
        Class<? extends Object> term12996 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term12992 = ((Class) term12996).getDeclaredField((String) "SEPHARDIC");
        ((Field) term12992).setAccessible(true);
        enum43 = ((Field) term12992).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNameType", argTypes, term3452, args);
        assertTrue(recursiveEquals(term3452, term11373));
        assertTrue(recursiveEquals(retValue, enum43));
    }

};


