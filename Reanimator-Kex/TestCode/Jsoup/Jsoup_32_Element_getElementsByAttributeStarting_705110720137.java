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

public class Element_getElementsByAttributeStarting_705110720137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3934;
     Object term23618;
     Object term23613;

    public Element_getElementsByAttributeStarting_705110720137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3956 = new HashMap();
        Set<Object> term23643 =  ((Map) term3956).keySet();
        HashSet term3955 = new HashSet((Collection<? extends Object>) term23643);
        ArrayList term3961 = new ArrayList();
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        ((ArrayList) term3961).add((Object)null);
        LinkedHashMap term3966 = new LinkedHashMap();
        term3934 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3935 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3965 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3935, term3935.getClass(), "tagName", "MnovcqFhCl");
        setBooleanField(term3935, term3935.getClass(), "isBlock", true);
        setBooleanField(term3935, term3935.getClass(), "formatAsBlock", true);
        setBooleanField(term3935, term3935.getClass(), "canContainBlock", true);
        setBooleanField(term3935, term3935.getClass(), "canContainInline", true);
        setBooleanField(term3935, term3935.getClass(), "empty", true);
        setBooleanField(term3935, term3935.getClass(), "selfClosing", false);
        setBooleanField(term3935, term3935.getClass(), "preserveWhitespace", true);
        setField(term3934, term3934.getClass(), "tag", term3935);
        setField(term3934, term3934.getClass(), "classNames", term3955);
        setField(term3934, term3934.getClass(), "parentNode", null);
        setField(term3934, term3934.getClass(), "childNodes", term3961);
        setField(term3965, term3965.getClass(), "attributes", term3966);
        setField(term3934, term3934.getClass(), "attributes", term3965);
        setField(term3934, term3934.getClass(), "baseUri", "GGzwMoHZXC");
        setIntField(term3934, term3934.getClass(), "siblingIndex", 1876565163);
        HashMap term23623 = new HashMap();
        Set<Object> term23674 =  ((Map) term23623).keySet();
        HashSet term23622 = new HashSet((Collection<? extends Object>) term23674);
        ArrayList term23624 = new ArrayList();
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        ((ArrayList) term23624).add((Object)null);
        LinkedHashMap term23627 = new LinkedHashMap();
        term23618 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23619 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23626 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23619, term23619.getClass(), "tagName", "MnovcqFhCl");
        setBooleanField(term23619, term23619.getClass(), "isBlock", true);
        setBooleanField(term23619, term23619.getClass(), "formatAsBlock", true);
        setBooleanField(term23619, term23619.getClass(), "canContainBlock", true);
        setBooleanField(term23619, term23619.getClass(), "canContainInline", true);
        setBooleanField(term23619, term23619.getClass(), "empty", true);
        setBooleanField(term23619, term23619.getClass(), "selfClosing", false);
        setBooleanField(term23619, term23619.getClass(), "preserveWhitespace", true);
        setField(term23618, term23618.getClass(), "tag", term23619);
        setField(term23618, term23618.getClass(), "classNames", term23622);
        setField(term23618, term23618.getClass(), "parentNode", null);
        setField(term23618, term23618.getClass(), "childNodes", term23624);
        setField(term23626, term23626.getClass(), "attributes", term23627);
        setField(term23618, term23618.getClass(), "attributes", term23626);
        setField(term23618, term23618.getClass(), "baseUri", "GGzwMoHZXC");
        setIntField(term23618, term23618.getClass(), "siblingIndex", 1876565163);
        ArrayList term23614 = new ArrayList();
        term23613 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term23613, term23613.getClass(), "contents", term23614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpmgwHTgnG";
        Object retValue = callMethod(klass, "getElementsByAttributeStarting", argTypes, term3934, args);
        assertTrue(recursiveEquals(term3934, term23618));
        assertTrue(recursiveEquals(retValue, term23613));
    }

};


