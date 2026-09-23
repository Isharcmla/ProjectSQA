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

public class Element_children_1937405814106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;
     Object term11589;
     Object term11527;

    public Element_children_1937405814106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1193 = new HashMap();
        Set<Object> term11611 =  ((Map) term1193).keySet();
        HashSet term1192 = new HashSet((Collection<? extends Object>) term11611);
        ArrayList term1209 = new ArrayList();
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        ((ArrayList) term1209).add((Object)null);
        LinkedHashMap term1214 = new LinkedHashMap();
        term1169 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1170 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1170, term1170.getClass(), "tagName", "hCWPJQKpdc");
        setBooleanField(term1170, term1170.getClass(), "isBlock", true);
        setBooleanField(term1170, term1170.getClass(), "formatAsBlock", false);
        setBooleanField(term1170, term1170.getClass(), "canContainBlock", false);
        setBooleanField(term1170, term1170.getClass(), "canContainInline", true);
        setBooleanField(term1170, term1170.getClass(), "empty", true);
        setBooleanField(term1170, term1170.getClass(), "selfClosing", false);
        setBooleanField(term1170, term1170.getClass(), "preserveWhitespace", false);
        setBooleanField(term1170, term1170.getClass(), "formList", true);
        setBooleanField(term1170, term1170.getClass(), "formSubmit", false);
        setField(term1169, term1169.getClass(), "tag", term1170);
        setField(term1169, term1169.getClass(), "classNames", term1192);
        setField(term1169, term1169.getClass(), "parentNode", null);
        setField(term1169, term1169.getClass(), "childNodes", term1209);
        setField(term1213, term1213.getClass(), "attributes", term1214);
        setField(term1169, term1169.getClass(), "attributes", term1213);
        setField(term1169, term1169.getClass(), "baseUri", "OJJtVNPyKZ");
        setIntField(term1169, term1169.getClass(), "siblingIndex", -883034806);
        HashMap term11594 = new HashMap();
        Set<Object> term11632 =  ((Map) term11594).keySet();
        HashSet term11593 = new HashSet((Collection<? extends Object>) term11632);
        ArrayList term11595 = new ArrayList();
        ((ArrayList) term11595).add((Object)null);
        ((ArrayList) term11595).add((Object)null);
        ((ArrayList) term11595).add((Object)null);
        ((ArrayList) term11595).add((Object)null);
        ((ArrayList) term11595).add((Object)null);
        ((ArrayList) term11595).add((Object)null);
        LinkedHashMap term11598 = new LinkedHashMap();
        term11589 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11590 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11597 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11590, term11590.getClass(), "tagName", "hCWPJQKpdc");
        setBooleanField(term11590, term11590.getClass(), "isBlock", true);
        setBooleanField(term11590, term11590.getClass(), "formatAsBlock", false);
        setBooleanField(term11590, term11590.getClass(), "canContainBlock", false);
        setBooleanField(term11590, term11590.getClass(), "canContainInline", true);
        setBooleanField(term11590, term11590.getClass(), "empty", true);
        setBooleanField(term11590, term11590.getClass(), "selfClosing", false);
        setBooleanField(term11590, term11590.getClass(), "preserveWhitespace", false);
        setBooleanField(term11590, term11590.getClass(), "formList", true);
        setBooleanField(term11590, term11590.getClass(), "formSubmit", false);
        setField(term11589, term11589.getClass(), "tag", term11590);
        setField(term11589, term11589.getClass(), "classNames", term11593);
        setField(term11589, term11589.getClass(), "parentNode", null);
        setField(term11589, term11589.getClass(), "childNodes", term11595);
        setField(term11597, term11597.getClass(), "attributes", term11598);
        setField(term11589, term11589.getClass(), "attributes", term11597);
        setField(term11589, term11589.getClass(), "baseUri", "OJJtVNPyKZ");
        setIntField(term11589, term11589.getClass(), "siblingIndex", -883034806);
        ArrayList term11528 = new ArrayList();
        term11527 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term11527, term11527.getClass(), "contents", term11528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1169, args);
        assertTrue(recursiveEquals(term1169, term11589));
        assertTrue(recursiveEquals(retValue, term11527));
    }

};


