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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_nextElementSibling_1527392136126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3071;
     Object term20025;

    public Element_nextElementSibling_1527392136126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3095 = new HashMap();
        Set<Object> term20047 =  ((Map) term3095).keySet();
        HashSet term3094 = new HashSet((Collection<? extends Object>) term20047);
        ArrayList term3113 = new ArrayList();
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        ((ArrayList) term3113).add((Object)null);
        LinkedHashMap term3118 = new LinkedHashMap();
        term3071 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3072 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3117 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3072, term3072.getClass(), "tagName", "lZIgPZPgTu");
        setBooleanField(term3072, term3072.getClass(), "isBlock", false);
        setBooleanField(term3072, term3072.getClass(), "formatAsBlock", false);
        setBooleanField(term3072, term3072.getClass(), "canContainBlock", true);
        setBooleanField(term3072, term3072.getClass(), "canContainInline", true);
        setBooleanField(term3072, term3072.getClass(), "empty", true);
        setBooleanField(term3072, term3072.getClass(), "selfClosing", true);
        setBooleanField(term3072, term3072.getClass(), "preserveWhitespace", true);
        setBooleanField(term3072, term3072.getClass(), "formList", false);
        setBooleanField(term3072, term3072.getClass(), "formSubmit", true);
        setField(term3071, term3071.getClass(), "tag", term3072);
        setField(term3071, term3071.getClass(), "classNames", term3094);
        setField(term3071, term3071.getClass(), "parentNode", null);
        setField(term3071, term3071.getClass(), "childNodes", term3113);
        setField(term3117, term3117.getClass(), "attributes", term3118);
        setField(term3071, term3071.getClass(), "attributes", term3117);
        setField(term3071, term3071.getClass(), "baseUri", "VDokbsCuqq");
        setIntField(term3071, term3071.getClass(), "siblingIndex", 1193880199);
        HashMap term20030 = new HashMap();
        Set<Object> term20068 =  ((Map) term20030).keySet();
        HashSet term20029 = new HashSet((Collection<? extends Object>) term20068);
        ArrayList term20031 = new ArrayList();
        ((ArrayList) term20031).add((Object)null);
        ((ArrayList) term20031).add((Object)null);
        ((ArrayList) term20031).add((Object)null);
        ((ArrayList) term20031).add((Object)null);
        ((ArrayList) term20031).add((Object)null);
        ((ArrayList) term20031).add((Object)null);
        LinkedHashMap term20034 = new LinkedHashMap();
        term20025 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20026 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20033 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20026, term20026.getClass(), "tagName", "lZIgPZPgTu");
        setBooleanField(term20026, term20026.getClass(), "isBlock", false);
        setBooleanField(term20026, term20026.getClass(), "formatAsBlock", false);
        setBooleanField(term20026, term20026.getClass(), "canContainBlock", true);
        setBooleanField(term20026, term20026.getClass(), "canContainInline", true);
        setBooleanField(term20026, term20026.getClass(), "empty", true);
        setBooleanField(term20026, term20026.getClass(), "selfClosing", true);
        setBooleanField(term20026, term20026.getClass(), "preserveWhitespace", true);
        setBooleanField(term20026, term20026.getClass(), "formList", false);
        setBooleanField(term20026, term20026.getClass(), "formSubmit", true);
        setField(term20025, term20025.getClass(), "tag", term20026);
        setField(term20025, term20025.getClass(), "classNames", term20029);
        setField(term20025, term20025.getClass(), "parentNode", null);
        setField(term20025, term20025.getClass(), "childNodes", term20031);
        setField(term20033, term20033.getClass(), "attributes", term20034);
        setField(term20025, term20025.getClass(), "attributes", term20033);
        setField(term20025, term20025.getClass(), "baseUri", "VDokbsCuqq");
        setIntField(term20025, term20025.getClass(), "siblingIndex", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextElementSibling", argTypes, term3071, args);
        assertTrue(recursiveEquals(term3071, term20025));
        assertTrue(recursiveEquals(retValue, null));
    }

};


