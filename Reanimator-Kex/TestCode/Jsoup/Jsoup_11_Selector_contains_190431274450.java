package org.jsoup.select;

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
import java.lang.NullPointerException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.lang.Boolean;

public class Selector_contains_190431274450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2359;
     Object term2467;

    public Selector_contains_190431274450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2383 = new ArrayList();
        ((ArrayList) term2383).add((Object)null);
        ((ArrayList) term2383).add((Object)null);
        ((ArrayList) term2383).add((Object)null);
        ((ArrayList) term2383).add((Object)null);
        ArrayList term2387 = new ArrayList();
        ((ArrayList) term2387).add((Object)null);
        ArrayList term2391 = new ArrayList();
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        ((ArrayList) term2391).add((Object)null);
        HashMap term2398 = new HashMap();
        Set<Object> term9233 =  ((Map) term2398).keySet();
        HashSet term2397 = new HashSet((Collection<? extends Object>) term9233);
        ArrayList term2404 = new ArrayList();
        ((ArrayList) term2404).add((Object)null);
        ((ArrayList) term2404).add((Object)null);
        ((ArrayList) term2404).add((Object)null);
        ((ArrayList) term2404).add((Object)null);
        LinkedHashMap term2409 = new LinkedHashMap();
        LinkedHashMap term2429 = new LinkedHashMap();
        Set<Object> term9244 =  ((Map) term2429).keySet();
        LinkedHashSet term2428 = new LinkedHashSet((Collection<? extends Object>) term9244);
        term2359 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term2360 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2361 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2408 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term2465 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2361, term2361.getClass(), "tagName", "iAOFcXaLSf");
        setBooleanField(term2361, term2361.getClass(), "knownTag", false);
        setBooleanField(term2361, term2361.getClass(), "isBlock", false);
        setBooleanField(term2361, term2361.getClass(), "formatAsBlock", false);
        setBooleanField(term2361, term2361.getClass(), "canContainBlock", true);
        setBooleanField(term2361, term2361.getClass(), "canContainInline", true);
        setBooleanField(term2361, term2361.getClass(), "optionalClosing", false);
        setBooleanField(term2361, term2361.getClass(), "empty", true);
        setBooleanField(term2361, term2361.getClass(), "selfClosing", false);
        setBooleanField(term2361, term2361.getClass(), "preserveWhitespace", false);
        setField(term2361, term2361.getClass(), "ancestors", term2383);
        setField(term2361, term2361.getClass(), "excludes", term2387);
        setField(term2361, term2361.getClass(), "ignoreEndTags", term2391);
        setBooleanField(term2361, term2361.getClass(), "directDescendant", false);
        setBooleanField(term2361, term2361.getClass(), "limitChildren", true);
        setField(term2360, term2360.getClass(), "tag", term2361);
        setField(term2360, term2360.getClass(), "classNames", term2397);
        setField(term2360, term2360.getClass(), "parentNode", null);
        setField(term2360, term2360.getClass(), "childNodes", term2404);
        setField(term2408, term2408.getClass(), "attributes", term2409);
        setField(term2360, term2360.getClass(), "attributes", term2408);
        setField(term2360, term2360.getClass(), "baseUri", "VfmNFpEuax");
        setIntField(term2360, term2360.getClass(), "siblingIndex", 941650513);
        setField(term2359, term2359.getClass(), "root", term2360);
        setField(term2359, term2359.getClass(), "elements", term2428);
        setField(term2359, term2359.getClass(), "query", "wCurppnDSA");
        setField(term2465, term2465.getClass(), "queue", null);
        setIntField(term2465, term2465.getClass(), "pos", 0);
        setField(term2359, term2359.getClass(), "tq", term2465);
        term2467 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2467;
        try {
            callMethod(klass, "contains", argTypes, term2359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


