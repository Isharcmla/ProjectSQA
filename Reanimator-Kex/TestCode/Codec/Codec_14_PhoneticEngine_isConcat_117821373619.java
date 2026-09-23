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

public class PhoneticEngine_isConcat_117821373619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4543;
     Object term12419;

    public PhoneticEngine_isConcat_117821373619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12427 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term12426 = ((Class) term12427).getDeclaredField((String) "ASHKENAZI");
        ((Field) term12426).setAccessible(true);
        Object enum40 = ((Field) term12426).get((Object) null);
        Class<? extends Object> term12686 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term12685 = ((Class) term12686).getDeclaredField((String) "APPROX");
        ((Field) term12685).setAccessible(true);
        Object enum41 = ((Field) term12685).get((Object) null);
        term4543 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term4543, term4543.getClass(), "lang", null);
        setField(term4543, term4543.getClass(), "nameType", enum40);
        setField(term4543, term4543.getClass(), "ruleType", enum41);
        setBooleanField(term4543, term4543.getClass(), "concat", false);
        setIntField(term4543, term4543.getClass(), "maxPhonemes", 1134449235);
        Class<? extends Object> term12936 = Class.forName((String) "org.apache.commons.codec.language.bm.NameType");
        Field term12935 = ((Class) term12936).getDeclaredField((String) "ASHKENAZI");
        ((Field) term12935).setAccessible(true);
        Object enum42 = ((Field) term12935).get((Object) null);
        Class<? extends Object> term13389 = Class.forName((String) "org.apache.commons.codec.language.bm.RuleType");
        Field term13388 = ((Class) term13389).getDeclaredField((String) "APPROX");
        ((Field) term13388).setAccessible(true);
        Object enum44 = ((Field) term13388).get((Object) null);
        term12419 = newInstance(Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine"));
        setField(term12419, term12419.getClass(), "lang", null);
        setField(term12419, term12419.getClass(), "nameType", enum42);
        setField(term12419, term12419.getClass(), "ruleType", enum44);
        setBooleanField(term12419, term12419.getClass(), "concat", false);
        setIntField(term12419, term12419.getClass(), "maxPhonemes", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConcat", argTypes, term4543, args);
        assertTrue(recursiveEquals(term4543, term12419));
    }

};


