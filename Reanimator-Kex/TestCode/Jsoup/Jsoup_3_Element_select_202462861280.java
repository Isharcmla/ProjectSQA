package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_select_202462861280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1285;
     Object term11054;
     Object term11049;

    public Element_select_202462861280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1307 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1307, term1307.getClass(), "tagName", null);
        setBooleanField(term1307, term1307.getClass(), "isBlock", true);
        setBooleanField(term1307, term1307.getClass(), "canContainBlock", false);
        setBooleanField(term1307, term1307.getClass(), "canContainInline", true);
        setBooleanField(term1307, term1307.getClass(), "optionalClosing", false);
        setBooleanField(term1307, term1307.getClass(), "empty", false);
        setBooleanField(term1307, term1307.getClass(), "preserveWhitespace", true);
        setField(term1307, term1307.getClass(), "ancestors", null);
        ArrayList term1305 = new ArrayList();
        ((ArrayList) term1305).add(term1307);
        HashMap term1317 = new HashMap();
        Set<Object> term11081 =  ((Map) term1317).keySet();
        HashSet term1316 = new HashSet((Collection<? extends Object>) term11081);
        ArrayList term1335 = new ArrayList();
        ((ArrayList) term1335).add((Object)null);
        ((ArrayList) term1335).add((Object)null);
        ((ArrayList) term1335).add((Object)null);
        ((ArrayList) term1335).add((Object)null);
        ((ArrayList) term1335).add((Object)null);
        LinkedHashMap term1340 = new LinkedHashMap();
        term1285 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1286 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1339 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1286, term1286.getClass(), "tagName", "kVEZMHmRtR");
        setBooleanField(term1286, term1286.getClass(), "isBlock", false);
        setBooleanField(term1286, term1286.getClass(), "canContainBlock", false);
        setBooleanField(term1286, term1286.getClass(), "canContainInline", true);
        setBooleanField(term1286, term1286.getClass(), "optionalClosing", false);
        setBooleanField(term1286, term1286.getClass(), "empty", false);
        setBooleanField(term1286, term1286.getClass(), "preserveWhitespace", true);
        setField(term1286, term1286.getClass(), "ancestors", term1305);
        setField(term1285, term1285.getClass(), "tag", term1286);
        setField(term1285, term1285.getClass(), "classNames", term1316);
        setField(term1285, term1285.getClass(), "parentNode", null);
        setField(term1285, term1285.getClass(), "childNodes", term1335);
        setField(term1339, term1339.getClass(), "attributes", term1340);
        setField(term1285, term1285.getClass(), "attributes", term1339);
        setField(term1285, term1285.getClass(), "baseUri", "XJJNClzHRf");
        Object term11060 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11060, term11060.getClass(), "tagName", null);
        setBooleanField(term11060, term11060.getClass(), "isBlock", true);
        setBooleanField(term11060, term11060.getClass(), "canContainBlock", false);
        setBooleanField(term11060, term11060.getClass(), "canContainInline", true);
        setBooleanField(term11060, term11060.getClass(), "optionalClosing", false);
        setBooleanField(term11060, term11060.getClass(), "empty", false);
        setBooleanField(term11060, term11060.getClass(), "preserveWhitespace", true);
        setField(term11060, term11060.getClass(), "ancestors", null);
        ArrayList term11058 = new ArrayList();
        ((ArrayList) term11058).add(term11060);
        HashMap term11062 = new HashMap();
        Set<Object> term11112 =  ((Map) term11062).keySet();
        HashSet term11061 = new HashSet((Collection<? extends Object>) term11112);
        ArrayList term11063 = new ArrayList();
        ((ArrayList) term11063).add((Object)null);
        ((ArrayList) term11063).add((Object)null);
        ((ArrayList) term11063).add((Object)null);
        ((ArrayList) term11063).add((Object)null);
        ((ArrayList) term11063).add((Object)null);
        LinkedHashMap term11066 = new LinkedHashMap();
        term11054 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11055 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11065 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11055, term11055.getClass(), "tagName", "kVEZMHmRtR");
        setBooleanField(term11055, term11055.getClass(), "isBlock", false);
        setBooleanField(term11055, term11055.getClass(), "canContainBlock", false);
        setBooleanField(term11055, term11055.getClass(), "canContainInline", true);
        setBooleanField(term11055, term11055.getClass(), "optionalClosing", false);
        setBooleanField(term11055, term11055.getClass(), "empty", false);
        setBooleanField(term11055, term11055.getClass(), "preserveWhitespace", true);
        setField(term11055, term11055.getClass(), "ancestors", term11058);
        setField(term11054, term11054.getClass(), "tag", term11055);
        setField(term11054, term11054.getClass(), "classNames", term11061);
        setField(term11054, term11054.getClass(), "parentNode", null);
        setField(term11054, term11054.getClass(), "childNodes", term11063);
        setField(term11065, term11065.getClass(), "attributes", term11066);
        setField(term11054, term11054.getClass(), "attributes", term11065);
        setField(term11054, term11054.getClass(), "baseUri", "XJJNClzHRf");
        ArrayList term11050 = new ArrayList();
        term11049 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term11049, term11049.getClass(), "contents", term11050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HDaezxQfQR";
        Object retValue = callMethod(klass, "select", argTypes, term1285, args);
        assertTrue(recursiveEquals(term1285, term11054));
        assertTrue(recursiveEquals(retValue, term11049));
    }

};


