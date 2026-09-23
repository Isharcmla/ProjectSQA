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

public class PhoneticEngine_getRuleType_167159824120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3995;
     Object term13720;
     Object enum49;

    public PhoneticEngine_getRuleType_167159824120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13728 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term13727 = ((Class) term13728).getDeclaredField((String) "ASHKENAZI");
        ((Field) term13727).setAccessible(true);
        Object enum45 = ((Field) term13727).get((Object) null);
        Class<? extends Object> term13987 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term13986 = ((Class) term13987).getDeclaredField((String) "APPROX");
        ((Field) term13986).setAccessible(true);
        Object enum46 = ((Field) term13986).get((Object) null);
        term3995 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term3995, term3995.getClass(), "lang", null);
        setField(term3995, term3995.getClass(), "nameType", enum45);
        setField(term3995, term3995.getClass(), "ruleType", enum46);
        setBooleanField(term3995, term3995.getClass(), "concat", true);
        setIntField(term3995, term3995.getClass(), "maxPhonemes", -522618178);
        Class<? extends Object> term14238 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term14237 = ((Class) term14238).getDeclaredField((String) "ASHKENAZI");
        ((Field) term14237).setAccessible(true);
        Object enum47 = ((Field) term14237).get((Object) null);
        Class<? extends Object> term14522 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term14521 = ((Class) term14522).getDeclaredField((String) "APPROX");
        ((Field) term14521).setAccessible(true);
        Object enum48 = ((Field) term14521).get((Object) null);
        term13720 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term13720, term13720.getClass(), "lang", null);
        setField(term13720, term13720.getClass(), "nameType", enum47);
        setField(term13720, term13720.getClass(), "ruleType", enum48);
        setBooleanField(term13720, term13720.getClass(), "concat", true);
        setIntField(term13720, term13720.getClass(), "maxPhonemes", -522618178);
        Class<? extends Object> term14772 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term14771 = ((Class) term14772).getDeclaredField((String) "APPROX");
        ((Field) term14771).setAccessible(true);
        enum49 = ((Field) term14771).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRuleType", argTypes, term3995, args);
        assertTrue(recursiveEquals(term3995, term13720));
        assertTrue(recursiveEquals(retValue, enum49));
    }

};


