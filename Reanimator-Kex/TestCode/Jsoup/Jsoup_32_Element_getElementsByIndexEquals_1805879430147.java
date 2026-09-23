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

public class Element_getElementsByIndexEquals_1805879430147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5224;
     Object term5297;
     Object term29387;
     Object term29382;

    public Element_getElementsByIndexEquals_1805879430147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5246 = new HashMap();
        Set<Object> term29409 =  ((Map) term5246).keySet();
        HashSet term5245 = new HashSet((Collection<? extends Object>) term29409);
        ArrayList term5268 = new ArrayList();
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        LinkedHashMap term5273 = new LinkedHashMap();
        term5224 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5225 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5272 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5225, term5225.getClass(), "tagName", "TcuXODkzBV");
        setBooleanField(term5225, term5225.getClass(), "isBlock", true);
        setBooleanField(term5225, term5225.getClass(), "formatAsBlock", true);
        setBooleanField(term5225, term5225.getClass(), "canContainBlock", false);
        setBooleanField(term5225, term5225.getClass(), "canContainInline", false);
        setBooleanField(term5225, term5225.getClass(), "empty", true);
        setBooleanField(term5225, term5225.getClass(), "selfClosing", false);
        setBooleanField(term5225, term5225.getClass(), "preserveWhitespace", false);
        setField(term5224, term5224.getClass(), "tag", term5225);
        setField(term5224, term5224.getClass(), "classNames", term5245);
        setField(term5224, term5224.getClass(), "parentNode", null);
        setField(term5224, term5224.getClass(), "childNodes", term5268);
        setField(term5272, term5272.getClass(), "attributes", term5273);
        setField(term5224, term5224.getClass(), "attributes", term5272);
        setField(term5224, term5224.getClass(), "baseUri", "QpYltHAdyY");
        setIntField(term5224, term5224.getClass(), "siblingIndex", 1375330971);
        term5297 = new Integer(-478195677);
        HashMap term29392 = new HashMap();
        Set<Object> term29430 =  ((Map) term29392).keySet();
        HashSet term29391 = new HashSet((Collection<? extends Object>) term29430);
        ArrayList term29393 = new ArrayList();
        ((ArrayList) term29393).add((Object)null);
        ((ArrayList) term29393).add((Object)null);
        ((ArrayList) term29393).add((Object)null);
        ((ArrayList) term29393).add((Object)null);
        LinkedHashMap term29396 = new LinkedHashMap();
        term29387 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29388 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29395 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29388, term29388.getClass(), "tagName", "TcuXODkzBV");
        setBooleanField(term29388, term29388.getClass(), "isBlock", true);
        setBooleanField(term29388, term29388.getClass(), "formatAsBlock", true);
        setBooleanField(term29388, term29388.getClass(), "canContainBlock", false);
        setBooleanField(term29388, term29388.getClass(), "canContainInline", false);
        setBooleanField(term29388, term29388.getClass(), "empty", true);
        setBooleanField(term29388, term29388.getClass(), "selfClosing", false);
        setBooleanField(term29388, term29388.getClass(), "preserveWhitespace", false);
        setField(term29387, term29387.getClass(), "tag", term29388);
        setField(term29387, term29387.getClass(), "classNames", term29391);
        setField(term29387, term29387.getClass(), "parentNode", null);
        setField(term29387, term29387.getClass(), "childNodes", term29393);
        setField(term29395, term29395.getClass(), "attributes", term29396);
        setField(term29387, term29387.getClass(), "attributes", term29395);
        setField(term29387, term29387.getClass(), "baseUri", "QpYltHAdyY");
        setIntField(term29387, term29387.getClass(), "siblingIndex", 1375330971);
        ArrayList term29383 = new ArrayList();
        term29382 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term29382, term29382.getClass(), "contents", term29383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5297;
        Object retValue = callMethod(klass, "getElementsByIndexEquals", argTypes, term5224, args);
        assertTrue(recursiveEquals(term5224, term29387));
        assertTrue(recursiveEquals(term5297, -478195677));
        assertTrue(recursiveEquals(retValue, term29382));
    }

};


