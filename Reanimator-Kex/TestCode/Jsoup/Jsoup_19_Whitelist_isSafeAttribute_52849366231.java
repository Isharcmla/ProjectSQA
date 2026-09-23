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
import java.lang.Object;

public class Whitelist_isSafeAttribute_52849366231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28822;
     Object term29142;
     Object term29249;
     Object term29254;
     Object term29257;

    public Whitelist_isSafeAttribute_52849366231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28996 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term28996, term28996.getClass(), "value", null);
        HashMap term28870 = new HashMap();
        ((HashMap) term28870).put(term28996, term28996);
        term28822 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term28822, term28822.getClass(), "attributes", term28870);
        term29142 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term29142, term29142.getClass(), "key", "");
        term29249 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term29249, term29249.getClass(), "value", ":all");
        term29254 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term29254, term29254.getClass(), "key", "");
        setField(term29254, term29254.getClass(), "value", null);
        term29257 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term29257, term29257.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = null;
        args[2] = term29142;
        Object retValue = callMethod(klass, "isSafeAttribute", argTypes, term28822, args);
        assertTrue(recursiveEquals(term28822, term29249));
        assertTrue(recursiveEquals(term29142, term29257));
        assertTrue(recursiveEquals(retValue, false));
    }

};


