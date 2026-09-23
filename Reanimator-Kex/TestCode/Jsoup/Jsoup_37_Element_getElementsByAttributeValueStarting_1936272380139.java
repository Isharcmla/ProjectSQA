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

public class Element_getElementsByAttributeValueStarting_1936272380139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4395;
     Object term25468;
     Object term25463;

    public Element_getElementsByAttributeValueStarting_1936272380139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4419 = new HashMap();
        Set<Object> term25494 =  ((Map) term4419).keySet();
        HashSet term4418 = new HashSet((Collection<? extends Object>) term25494);
        ArrayList term4437 = new ArrayList();
        ((ArrayList) term4437).add((Object)null);
        ((ArrayList) term4437).add((Object)null);
        ((ArrayList) term4437).add((Object)null);
        ((ArrayList) term4437).add((Object)null);
        ((ArrayList) term4437).add((Object)null);
        ((ArrayList) term4437).add((Object)null);
        ((ArrayList) term4437).add((Object)null);
        LinkedHashMap term4442 = new LinkedHashMap();
        term4395 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4396 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4441 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4396, term4396.getClass(), "tagName", "QITgiBrmfj");
        setBooleanField(term4396, term4396.getClass(), "isBlock", false);
        setBooleanField(term4396, term4396.getClass(), "formatAsBlock", true);
        setBooleanField(term4396, term4396.getClass(), "canContainBlock", false);
        setBooleanField(term4396, term4396.getClass(), "canContainInline", false);
        setBooleanField(term4396, term4396.getClass(), "empty", false);
        setBooleanField(term4396, term4396.getClass(), "selfClosing", false);
        setBooleanField(term4396, term4396.getClass(), "preserveWhitespace", false);
        setBooleanField(term4396, term4396.getClass(), "formList", false);
        setBooleanField(term4396, term4396.getClass(), "formSubmit", true);
        setField(term4395, term4395.getClass(), "tag", term4396);
        setField(term4395, term4395.getClass(), "classNames", term4418);
        setField(term4395, term4395.getClass(), "parentNode", null);
        setField(term4395, term4395.getClass(), "childNodes", term4437);
        setField(term4441, term4441.getClass(), "attributes", term4442);
        setField(term4395, term4395.getClass(), "attributes", term4441);
        setField(term4395, term4395.getClass(), "baseUri", "RjNoEywJbC");
        setIntField(term4395, term4395.getClass(), "siblingIndex", -1968847291);
        HashMap term25473 = new HashMap();
        Set<Object> term25535 =  ((Map) term25473).keySet();
        HashSet term25472 = new HashSet((Collection<? extends Object>) term25535);
        ArrayList term25474 = new ArrayList();
        ((ArrayList) term25474).add((Object)null);
        ((ArrayList) term25474).add((Object)null);
        ((ArrayList) term25474).add((Object)null);
        ((ArrayList) term25474).add((Object)null);
        ((ArrayList) term25474).add((Object)null);
        ((ArrayList) term25474).add((Object)null);
        ((ArrayList) term25474).add((Object)null);
        LinkedHashMap term25477 = new LinkedHashMap();
        term25468 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25469 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25476 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25469, term25469.getClass(), "tagName", "QITgiBrmfj");
        setBooleanField(term25469, term25469.getClass(), "isBlock", false);
        setBooleanField(term25469, term25469.getClass(), "formatAsBlock", true);
        setBooleanField(term25469, term25469.getClass(), "canContainBlock", false);
        setBooleanField(term25469, term25469.getClass(), "canContainInline", false);
        setBooleanField(term25469, term25469.getClass(), "empty", false);
        setBooleanField(term25469, term25469.getClass(), "selfClosing", false);
        setBooleanField(term25469, term25469.getClass(), "preserveWhitespace", false);
        setBooleanField(term25469, term25469.getClass(), "formList", false);
        setBooleanField(term25469, term25469.getClass(), "formSubmit", true);
        setField(term25468, term25468.getClass(), "tag", term25469);
        setField(term25468, term25468.getClass(), "classNames", term25472);
        setField(term25468, term25468.getClass(), "parentNode", null);
        setField(term25468, term25468.getClass(), "childNodes", term25474);
        setField(term25476, term25476.getClass(), "attributes", term25477);
        setField(term25468, term25468.getClass(), "attributes", term25476);
        setField(term25468, term25468.getClass(), "baseUri", "RjNoEywJbC");
        setIntField(term25468, term25468.getClass(), "siblingIndex", -1968847291);
        ArrayList term25464 = new ArrayList();
        term25463 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term25463, term25463.getClass(), "contents", term25464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "RTTvrwwhou";
        args[1] = "lRORwXipuk";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4395, args);
        assertTrue(recursiveEquals(term4395, term25468));
        assertTrue(recursiveEquals(retValue, term25463));
    }

};


