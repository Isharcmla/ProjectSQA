package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Whitelist_simpleText_39703007816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;
     Object term1131;

    public Whitelist_simpleText_39703007816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1165 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term1165, term1165.getClass(), "value", "u");
        HashMap term1133 = new HashMap();
        Set<Object> term1169 =  ((Map) term1133).keySet();
        HashSet term1132 = new HashSet((Collection<? extends Object>) term1169);
        HashMap term1149 = new HashMap();
        HashMap term1154 = new HashMap();
        HashMap term1159 = new HashMap();
        term1131 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1131, term1131.getClass(), "tagNames", term1132);
        setField(term1131, term1131.getClass(), "attributes", term1149);
        setField(term1131, term1131.getClass(), "enforcedAttributes", term1154);
        setField(term1131, term1131.getClass(), "protocols", term1159);
        setBooleanField(term1131, term1131.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "simpleText", argTypes, null, args);
        assertTrue(recursiveEquals(null, term1165));
        assertTrue(recursiveEquals(retValue, term1131));
    }

};


