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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Node_getDeepChild_193408560263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public Node_getDeepChild_193408560263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term269 = new HashMap();
        Set<Object> term13585 =  ((Map) term269).keySet();
        HashSet term268 = new HashSet((Collection<? extends Object>) term13585);
        ArrayList term285 = new ArrayList();
        ((ArrayList) term285).add((Object)null);
        ((ArrayList) term285).add((Object)null);
        ((ArrayList) term285).add((Object)null);
        ((ArrayList) term285).add((Object)null);
        LinkedHashMap term290 = new LinkedHashMap();
        term247 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term248 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term248, term248.getClass(), "tagName", "uuaPigETmJ");
        setBooleanField(term248, term248.getClass(), "isBlock", false);
        setBooleanField(term248, term248.getClass(), "formatAsBlock", false);
        setBooleanField(term248, term248.getClass(), "canContainBlock", false);
        setBooleanField(term248, term248.getClass(), "canContainInline", false);
        setBooleanField(term248, term248.getClass(), "empty", true);
        setBooleanField(term248, term248.getClass(), "selfClosing", true);
        setBooleanField(term248, term248.getClass(), "preserveWhitespace", true);
        setField(term247, term247.getClass(), "tag", term248);
        setField(term247, term247.getClass(), "classNames", term268);
        setField(term247, term247.getClass(), "parentNode", null);
        setField(term247, term247.getClass(), "childNodes", term285);
        setField(term289, term289.getClass(), "attributes", term290);
        setField(term247, term247.getClass(), "attributes", term289);
        setField(term247, term247.getClass(), "baseUri", "hNxWaHcfhY");
        setIntField(term247, term247.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term247;
        try {
            callMethod(klass, "getDeepChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


