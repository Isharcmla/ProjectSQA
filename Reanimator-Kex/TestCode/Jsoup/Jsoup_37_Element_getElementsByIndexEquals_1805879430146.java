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
import java.lang.Integer;

public class Element_getElementsByIndexEquals_1805879430146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5328;
     Object term5403;
     Object term29574;
     Object term29569;

    public Element_getElementsByIndexEquals_1805879430146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5352 = new HashMap();
        Set<Object> term29596 =  ((Map) term5352).keySet();
        HashSet term5351 = new HashSet((Collection<? extends Object>) term29596);
        ArrayList term5374 = new ArrayList();
        ((ArrayList) term5374).add((Object)null);
        ((ArrayList) term5374).add((Object)null);
        ((ArrayList) term5374).add((Object)null);
        ((ArrayList) term5374).add((Object)null);
        LinkedHashMap term5379 = new LinkedHashMap();
        term5328 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5329 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5378 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5329, term5329.getClass(), "tagName", "TcuXODkzBV");
        setBooleanField(term5329, term5329.getClass(), "isBlock", true);
        setBooleanField(term5329, term5329.getClass(), "formatAsBlock", false);
        setBooleanField(term5329, term5329.getClass(), "canContainBlock", true);
        setBooleanField(term5329, term5329.getClass(), "canContainInline", true);
        setBooleanField(term5329, term5329.getClass(), "empty", false);
        setBooleanField(term5329, term5329.getClass(), "selfClosing", true);
        setBooleanField(term5329, term5329.getClass(), "preserveWhitespace", false);
        setBooleanField(term5329, term5329.getClass(), "formList", false);
        setBooleanField(term5329, term5329.getClass(), "formSubmit", true);
        setField(term5328, term5328.getClass(), "tag", term5329);
        setField(term5328, term5328.getClass(), "classNames", term5351);
        setField(term5328, term5328.getClass(), "parentNode", null);
        setField(term5328, term5328.getClass(), "childNodes", term5374);
        setField(term5378, term5378.getClass(), "attributes", term5379);
        setField(term5328, term5328.getClass(), "attributes", term5378);
        setField(term5328, term5328.getClass(), "baseUri", "QpYltHAdyY");
        setIntField(term5328, term5328.getClass(), "siblingIndex", 1375330971);
        term5403 = new Integer(-478195677);
        HashMap term29579 = new HashMap();
        Set<Object> term29617 =  ((Map) term29579).keySet();
        HashSet term29578 = new HashSet((Collection<? extends Object>) term29617);
        ArrayList term29580 = new ArrayList();
        ((ArrayList) term29580).add((Object)null);
        ((ArrayList) term29580).add((Object)null);
        ((ArrayList) term29580).add((Object)null);
        ((ArrayList) term29580).add((Object)null);
        LinkedHashMap term29583 = new LinkedHashMap();
        term29574 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29575 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29582 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29575, term29575.getClass(), "tagName", "TcuXODkzBV");
        setBooleanField(term29575, term29575.getClass(), "isBlock", true);
        setBooleanField(term29575, term29575.getClass(), "formatAsBlock", false);
        setBooleanField(term29575, term29575.getClass(), "canContainBlock", true);
        setBooleanField(term29575, term29575.getClass(), "canContainInline", true);
        setBooleanField(term29575, term29575.getClass(), "empty", false);
        setBooleanField(term29575, term29575.getClass(), "selfClosing", true);
        setBooleanField(term29575, term29575.getClass(), "preserveWhitespace", false);
        setBooleanField(term29575, term29575.getClass(), "formList", false);
        setBooleanField(term29575, term29575.getClass(), "formSubmit", true);
        setField(term29574, term29574.getClass(), "tag", term29575);
        setField(term29574, term29574.getClass(), "classNames", term29578);
        setField(term29574, term29574.getClass(), "parentNode", null);
        setField(term29574, term29574.getClass(), "childNodes", term29580);
        setField(term29582, term29582.getClass(), "attributes", term29583);
        setField(term29574, term29574.getClass(), "attributes", term29582);
        setField(term29574, term29574.getClass(), "baseUri", "QpYltHAdyY");
        setIntField(term29574, term29574.getClass(), "siblingIndex", 1375330971);
        ArrayList term29570 = new ArrayList();
        term29569 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term29569, term29569.getClass(), "contents", term29570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5403;
        Object retValue = callMethod(klass, "getElementsByIndexEquals", argTypes, term5328, args);
        assertTrue(recursiveEquals(term5328, term29574));
        assertTrue(recursiveEquals(term5403, -478195677));
        assertTrue(recursiveEquals(retValue, term29569));
    }

};


