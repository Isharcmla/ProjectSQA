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

public class Whitelist_isSafeTag_69231882026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522;
     Object term12654;

    public Whitelist_isSafeTag_69231882026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term524 = new HashMap();
        Set<Object> term12659 =  ((Map) term524).keySet();
        HashSet term523 = new HashSet((Collection<? extends Object>) term12659);
        HashMap term529 = new HashMap();
        HashMap term534 = new HashMap();
        HashMap term539 = new HashMap();
        term522 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term522, term522.getClass(), "tagNames", term523);
        setField(term522, term522.getClass(), "attributes", term529);
        setField(term522, term522.getClass(), "enforcedAttributes", term534);
        setField(term522, term522.getClass(), "protocols", term539);
        setBooleanField(term522, term522.getClass(), "preserveRelativeLinks", true);
        term12654 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term12654, term12654.getClass(), "value", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "isSafeTag", argTypes, term522, args);
        assertTrue(recursiveEquals(term522, term12654));
    }

};


