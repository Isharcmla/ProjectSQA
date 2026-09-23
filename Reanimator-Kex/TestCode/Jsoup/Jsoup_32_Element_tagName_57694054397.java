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

public class Element_tagName_57694054397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300;
     Object term9887;
     Object term9836;

    public Element_tagName_57694054397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term322 = new HashMap();
        Set<Object> term9911 =  ((Map) term322).keySet();
        HashSet term321 = new HashSet((Collection<? extends Object>) term9911);
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
        HashMap term9892 = new HashMap();
        Set<Object> term9942 =  ((Map) term9892).keySet();
        HashSet term9891 = new HashSet((Collection<? extends Object>) term9942);
        ArrayList term9893 = new ArrayList();
        ((ArrayList) term9893).add((Object)null);
        ((ArrayList) term9893).add((Object)null);
        ((ArrayList) term9893).add((Object)null);
        ((ArrayList) term9893).add((Object)null);
        ((ArrayList) term9893).add((Object)null);
        ((ArrayList) term9893).add((Object)null);
        LinkedHashMap term9896 = new LinkedHashMap();
        term9887 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9888 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9895 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9888, term9888.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term9888, term9888.getClass(), "isBlock", false);
        setBooleanField(term9888, term9888.getClass(), "formatAsBlock", true);
        setBooleanField(term9888, term9888.getClass(), "canContainBlock", true);
        setBooleanField(term9888, term9888.getClass(), "canContainInline", true);
        setBooleanField(term9888, term9888.getClass(), "empty", false);
        setBooleanField(term9888, term9888.getClass(), "selfClosing", false);
        setBooleanField(term9888, term9888.getClass(), "preserveWhitespace", false);
        setField(term9887, term9887.getClass(), "tag", term9888);
        setField(term9887, term9887.getClass(), "classNames", term9891);
        setField(term9887, term9887.getClass(), "parentNode", null);
        setField(term9887, term9887.getClass(), "childNodes", term9893);
        setField(term9895, term9895.getClass(), "attributes", term9896);
        setField(term9887, term9887.getClass(), "attributes", term9895);
        setField(term9887, term9887.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term9887, term9887.getClass(), "siblingIndex", 1484323161);
        HashMap term9858 = new HashMap();
        Set<Object> term9973 =  ((Map) term9858).keySet();
        HashSet term9857 = new HashSet((Collection<? extends Object>) term9973);
        ArrayList term9863 = new ArrayList();
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        ((ArrayList) term9863).add((Object)null);
        LinkedHashMap term9868 = new LinkedHashMap();
        term9836 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9837 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9867 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9837, term9837.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term9837, term9837.getClass(), "isBlock", false);
        setBooleanField(term9837, term9837.getClass(), "formatAsBlock", true);
        setBooleanField(term9837, term9837.getClass(), "canContainBlock", true);
        setBooleanField(term9837, term9837.getClass(), "canContainInline", true);
        setBooleanField(term9837, term9837.getClass(), "empty", false);
        setBooleanField(term9837, term9837.getClass(), "selfClosing", false);
        setBooleanField(term9837, term9837.getClass(), "preserveWhitespace", false);
        setField(term9836, term9836.getClass(), "tag", term9837);
        setField(term9836, term9836.getClass(), "classNames", term9857);
        setField(term9836, term9836.getClass(), "parentNode", null);
        setField(term9836, term9836.getClass(), "childNodes", term9863);
        setField(term9867, term9867.getClass(), "attributes", term9868);
        setField(term9836, term9836.getClass(), "attributes", term9867);
        setField(term9836, term9836.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term9836, term9836.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        Object retValue = callMethod(klass, "tagName", argTypes, term300, args);
        assertTrue(recursiveEquals(term300, term9887));
        assertTrue(recursiveEquals(retValue, term9836));
    }

};


