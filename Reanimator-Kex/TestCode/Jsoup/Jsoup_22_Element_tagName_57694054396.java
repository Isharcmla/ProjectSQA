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

public class Element_tagName_57694054396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300;
     Object term18499;
     Object term18448;

    public Element_tagName_57694054396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term322 = new HashMap();
        Set<Object> term18523 =  ((Map) term322).keySet();
        HashSet term321 = new HashSet((Collection<? extends Object>) term18523);
        ArrayList term330 = new ArrayList();
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        ((ArrayList) term330).add((Object)null);
        LinkedHashMap term335 = new LinkedHashMap();
        term300 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term301 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term334 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term301, term301.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term301, term301.getClass(), "isBlock", true);
        setBooleanField(term301, term301.getClass(), "formatAsBlock", true);
        setBooleanField(term301, term301.getClass(), "canContainBlock", true);
        setBooleanField(term301, term301.getClass(), "canContainInline", true);
        setBooleanField(term301, term301.getClass(), "empty", true);
        setBooleanField(term301, term301.getClass(), "selfClosing", true);
        setBooleanField(term301, term301.getClass(), "preserveWhitespace", false);
        setField(term300, term300.getClass(), "tag", term301);
        setField(term300, term300.getClass(), "classNames", term321);
        setField(term300, term300.getClass(), "parentNode", null);
        setField(term300, term300.getClass(), "childNodes", term330);
        setField(term334, term334.getClass(), "attributes", term335);
        setField(term300, term300.getClass(), "attributes", term334);
        setField(term300, term300.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term300, term300.getClass(), "siblingIndex", 1484323161);
        HashMap term18504 = new HashMap();
        Set<Object> term18554 =  ((Map) term18504).keySet();
        HashSet term18503 = new HashSet((Collection<? extends Object>) term18554);
        ArrayList term18505 = new ArrayList();
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        ((ArrayList) term18505).add((Object)null);
        LinkedHashMap term18508 = new LinkedHashMap();
        term18499 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18500 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18507 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18500, term18500.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term18500, term18500.getClass(), "isBlock", false);
        setBooleanField(term18500, term18500.getClass(), "formatAsBlock", true);
        setBooleanField(term18500, term18500.getClass(), "canContainBlock", true);
        setBooleanField(term18500, term18500.getClass(), "canContainInline", true);
        setBooleanField(term18500, term18500.getClass(), "empty", false);
        setBooleanField(term18500, term18500.getClass(), "selfClosing", false);
        setBooleanField(term18500, term18500.getClass(), "preserveWhitespace", false);
        setField(term18499, term18499.getClass(), "tag", term18500);
        setField(term18499, term18499.getClass(), "classNames", term18503);
        setField(term18499, term18499.getClass(), "parentNode", null);
        setField(term18499, term18499.getClass(), "childNodes", term18505);
        setField(term18507, term18507.getClass(), "attributes", term18508);
        setField(term18499, term18499.getClass(), "attributes", term18507);
        setField(term18499, term18499.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term18499, term18499.getClass(), "siblingIndex", 1484323161);
        HashMap term18470 = new HashMap();
        Set<Object> term18585 =  ((Map) term18470).keySet();
        HashSet term18469 = new HashSet((Collection<? extends Object>) term18585);
        ArrayList term18475 = new ArrayList();
        ((ArrayList) term18475).add((Object)null);
        ((ArrayList) term18475).add((Object)null);
        ((ArrayList) term18475).add((Object)null);
        ((ArrayList) term18475).add((Object)null);
        ((ArrayList) term18475).add((Object)null);
        ((ArrayList) term18475).add((Object)null);
        LinkedHashMap term18480 = new LinkedHashMap();
        term18448 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18449 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18479 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18449, term18449.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term18449, term18449.getClass(), "isBlock", false);
        setBooleanField(term18449, term18449.getClass(), "formatAsBlock", true);
        setBooleanField(term18449, term18449.getClass(), "canContainBlock", true);
        setBooleanField(term18449, term18449.getClass(), "canContainInline", true);
        setBooleanField(term18449, term18449.getClass(), "empty", false);
        setBooleanField(term18449, term18449.getClass(), "selfClosing", false);
        setBooleanField(term18449, term18449.getClass(), "preserveWhitespace", false);
        setField(term18448, term18448.getClass(), "tag", term18449);
        setField(term18448, term18448.getClass(), "classNames", term18469);
        setField(term18448, term18448.getClass(), "parentNode", null);
        setField(term18448, term18448.getClass(), "childNodes", term18475);
        setField(term18479, term18479.getClass(), "attributes", term18480);
        setField(term18448, term18448.getClass(), "attributes", term18479);
        setField(term18448, term18448.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term18448, term18448.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        Object retValue = callMethod(klass, "tagName", argTypes, term300, args);
        assertTrue(recursiveEquals(term300, term18499));
        assertTrue(recursiveEquals(retValue, term18448));
    }

};


