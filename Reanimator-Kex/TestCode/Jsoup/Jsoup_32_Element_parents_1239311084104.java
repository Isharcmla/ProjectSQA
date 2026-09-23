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

public class Element_parents_1239311084104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term953;
     Object term11033;
     Object term10835;

    public Element_parents_1239311084104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term975 = new HashMap();
        Set<Object> term11055 =  ((Map) term975).keySet();
        HashSet term974 = new HashSet((Collection<? extends Object>) term11055);
        ArrayList term995 = new ArrayList();
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        LinkedHashMap term1000 = new LinkedHashMap();
        term953 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term954 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term999 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term954, term954.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term954, term954.getClass(), "isBlock", false);
        setBooleanField(term954, term954.getClass(), "formatAsBlock", false);
        setBooleanField(term954, term954.getClass(), "canContainBlock", true);
        setBooleanField(term954, term954.getClass(), "canContainInline", false);
        setBooleanField(term954, term954.getClass(), "empty", false);
        setBooleanField(term954, term954.getClass(), "selfClosing", true);
        setBooleanField(term954, term954.getClass(), "preserveWhitespace", false);
        setField(term953, term953.getClass(), "tag", term954);
        setField(term953, term953.getClass(), "classNames", term974);
        setField(term953, term953.getClass(), "parentNode", null);
        setField(term953, term953.getClass(), "childNodes", term995);
        setField(term999, term999.getClass(), "attributes", term1000);
        setField(term953, term953.getClass(), "attributes", term999);
        setField(term953, term953.getClass(), "baseUri", "BKLfkLiZTH");
        setIntField(term953, term953.getClass(), "siblingIndex", -1339778481);
        HashMap term11038 = new HashMap();
        Set<Object> term11076 =  ((Map) term11038).keySet();
        HashSet term11037 = new HashSet((Collection<? extends Object>) term11076);
        ArrayList term11039 = new ArrayList();
        ((ArrayList) term11039).add((Object)null);
        ((ArrayList) term11039).add((Object)null);
        ((ArrayList) term11039).add((Object)null);
        ((ArrayList) term11039).add((Object)null);
        ((ArrayList) term11039).add((Object)null);
        ((ArrayList) term11039).add((Object)null);
        LinkedHashMap term11042 = new LinkedHashMap();
        term11033 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11034 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11041 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11034, term11034.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term11034, term11034.getClass(), "isBlock", false);
        setBooleanField(term11034, term11034.getClass(), "formatAsBlock", false);
        setBooleanField(term11034, term11034.getClass(), "canContainBlock", true);
        setBooleanField(term11034, term11034.getClass(), "canContainInline", false);
        setBooleanField(term11034, term11034.getClass(), "empty", false);
        setBooleanField(term11034, term11034.getClass(), "selfClosing", true);
        setBooleanField(term11034, term11034.getClass(), "preserveWhitespace", false);
        setField(term11033, term11033.getClass(), "tag", term11034);
        setField(term11033, term11033.getClass(), "classNames", term11037);
        setField(term11033, term11033.getClass(), "parentNode", null);
        setField(term11033, term11033.getClass(), "childNodes", term11039);
        setField(term11041, term11041.getClass(), "attributes", term11042);
        setField(term11033, term11033.getClass(), "attributes", term11041);
        setField(term11033, term11033.getClass(), "baseUri", "BKLfkLiZTH");
        setIntField(term11033, term11033.getClass(), "siblingIndex", -1339778481);
        ArrayList term10836 = new ArrayList();
        term10835 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term10835, term10835.getClass(), "contents", term10836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term953, args);
        assertTrue(recursiveEquals(term953, term11033));
        assertTrue(recursiveEquals(retValue, term10835));
    }

};


