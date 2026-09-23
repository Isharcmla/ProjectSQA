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

public class Selector_contains_190431274453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2339;
     Object term2449;

    public Selector_contains_190431274453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2363 = new ArrayList();
        ((ArrayList) term2363).add((Object)null);
        ((ArrayList) term2363).add((Object)null);
        ((ArrayList) term2363).add((Object)null);
        ((ArrayList) term2363).add((Object)null);
        ArrayList term2367 = new ArrayList();
        ((ArrayList) term2367).add((Object)null);
        ArrayList term2371 = new ArrayList();
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        ((ArrayList) term2371).add((Object)null);
        HashMap term2378 = new HashMap();
        Set<Object> term9394 =  ((Map) term2378).keySet();
        HashSet term2377 = new HashSet((Collection<? extends Object>) term9394);
        ArrayList term2384 = new ArrayList();
        ((ArrayList) term2384).add((Object)null);
        ((ArrayList) term2384).add((Object)null);
        ((ArrayList) term2384).add((Object)null);
        ((ArrayList) term2384).add((Object)null);
        LinkedHashMap term2389 = new LinkedHashMap();
        LinkedHashMap term2409 = new LinkedHashMap();
        Set<Object> term9405 =  ((Map) term2409).keySet();
        LinkedHashSet term2408 = new LinkedHashSet((Collection<? extends Object>) term9405);
        term2339 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term2340 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2341 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2388 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term2447 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2341, term2341.getClass(), "tagName", "EgSgEFIyyN");
        setBooleanField(term2341, term2341.getClass(), "knownTag", false);
        setBooleanField(term2341, term2341.getClass(), "isBlock", false);
        setBooleanField(term2341, term2341.getClass(), "formatAsBlock", false);
        setBooleanField(term2341, term2341.getClass(), "canContainBlock", true);
        setBooleanField(term2341, term2341.getClass(), "canContainInline", true);
        setBooleanField(term2341, term2341.getClass(), "optionalClosing", false);
        setBooleanField(term2341, term2341.getClass(), "empty", true);
        setBooleanField(term2341, term2341.getClass(), "selfClosing", false);
        setBooleanField(term2341, term2341.getClass(), "preserveWhitespace", false);
        setField(term2341, term2341.getClass(), "ancestors", term2363);
        setField(term2341, term2341.getClass(), "excludes", term2367);
        setField(term2341, term2341.getClass(), "ignoreEndTags", term2371);
        setBooleanField(term2341, term2341.getClass(), "directDescendant", false);
        setBooleanField(term2341, term2341.getClass(), "limitChildren", true);
        setField(term2340, term2340.getClass(), "tag", term2341);
        setField(term2340, term2340.getClass(), "classNames", term2377);
        setField(term2340, term2340.getClass(), "parentNode", null);
        setField(term2340, term2340.getClass(), "childNodes", term2384);
        setField(term2388, term2388.getClass(), "attributes", term2389);
        setField(term2340, term2340.getClass(), "attributes", term2388);
        setField(term2340, term2340.getClass(), "baseUri", "FnEkAHBfyV");
        setIntField(term2340, term2340.getClass(), "siblingIndex", 941650513);
        setField(term2339, term2339.getClass(), "root", term2340);
        setField(term2339, term2339.getClass(), "elements", term2408);
        setField(term2339, term2339.getClass(), "query", "mxVLTgCwki");
        setField(term2447, term2447.getClass(), "queue", null);
        setIntField(term2447, term2447.getClass(), "pos", 0);
        setField(term2339, term2339.getClass(), "tq", term2447);
        term2449 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2449;
        try {
            callMethod(klass, "contains", argTypes, term2339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


