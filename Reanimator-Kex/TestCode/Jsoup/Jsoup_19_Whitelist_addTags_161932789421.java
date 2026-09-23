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

public class Whitelist_addTags_161932789421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term24;
     Object term11486;
     Object term11489;
     Object term11456;

    public Whitelist_addTags_161932789421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        Set<Object> term11500 =  ((Map) term3).keySet();
        HashSet term2 = new HashSet((Collection<? extends Object>) term11500);
        HashMap term8 = new HashMap();
        HashMap term13 = new HashMap();
        HashMap term18 = new HashMap();
        term1 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1, term1.getClass(), "tagNames", term2);
        setField(term1, term1.getClass(), "attributes", term8);
        setField(term1, term1.getClass(), "enforcedAttributes", term13);
        setField(term1, term1.getClass(), "protocols", term18);
        setBooleanField(term1, term1.getClass(), "preserveRelativeLinks", false);
        term24 = (Object[]) newArray("java.lang.String", 5);
        setElement(term24, 0, "PAEBtnZtTD");
        setElement(term24, 1, "sjlJAEtRrb");
        setElement(term24, 2, "MuLcgQHgqz");
        setElement(term24, 3, "xxtlPwDYFs");
        setElement(term24, 4, "jJCZpVmanW");
        term11486 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term11486, term11486.getClass(), "value", "jJCZpVmanW");
        term11489 = (Object[]) newArray("java.lang.String", 5);
        setElement(term11489, 0, "PAEBtnZtTD");
        setElement(term11489, 1, "sjlJAEtRrb");
        setElement(term11489, 2, "MuLcgQHgqz");
        setElement(term11489, 3, "xxtlPwDYFs");
        setElement(term11489, 4, "jJCZpVmanW");
        HashMap term11458 = new HashMap();
        Set<Object> term11611 =  ((Map) term11458).keySet();
        HashSet term11457 = new HashSet((Collection<? extends Object>) term11611);
        HashMap term11470 = new HashMap();
        HashMap term11475 = new HashMap();
        HashMap term11480 = new HashMap();
        term11456 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term11456, term11456.getClass(), "tagNames", term11457);
        setField(term11456, term11456.getClass(), "attributes", term11470);
        setField(term11456, term11456.getClass(), "enforcedAttributes", term11475);
        setField(term11456, term11456.getClass(), "protocols", term11480);
        setBooleanField(term11456, term11456.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24;
        Object retValue = callMethod(klass, "addTags", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term11486));
        assertTrue(recursiveEquals(term24, term11489));
        assertTrue(recursiveEquals(retValue, term11456));
    }

};


