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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_addClass_59775528378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7776;

    public Element_addClass_59775528378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7798 = new HashMap();
        Set<Object> term7861 =  ((Map) term7798).keySet();
        HashSet term7797 = new HashSet((Collection<? extends Object>) term7861);
        ArrayList term7810 = new ArrayList();
        ((ArrayList) term7810).add((Object)null);
        ((ArrayList) term7810).add((Object)null);
        ((ArrayList) term7810).add((Object)null);
        ((ArrayList) term7810).add((Object)null);
        LinkedHashMap term7815 = new LinkedHashMap();
        term7776 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7777 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7814 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7777, term7777.getClass(), "tagName", "YQwoogpPyi");
        setBooleanField(term7777, term7777.getClass(), "isBlock", false);
        setBooleanField(term7777, term7777.getClass(), "formatAsBlock", true);
        setBooleanField(term7777, term7777.getClass(), "canContainBlock", false);
        setBooleanField(term7777, term7777.getClass(), "canContainInline", true);
        setBooleanField(term7777, term7777.getClass(), "empty", true);
        setBooleanField(term7777, term7777.getClass(), "selfClosing", true);
        setBooleanField(term7777, term7777.getClass(), "preserveWhitespace", false);
        setField(term7776, term7776.getClass(), "tag", term7777);
        setField(term7776, term7776.getClass(), "classNames", term7797);
        setField(term7776, term7776.getClass(), "parentNode", null);
        setField(term7776, term7776.getClass(), "childNodes", term7810);
        setField(term7814, term7814.getClass(), "attributes", term7815);
        setField(term7776, term7776.getClass(), "attributes", term7814);
        setField(term7776, term7776.getClass(), "baseUri", "PNdLRrSAIY");
        setIntField(term7776, term7776.getClass(), "siblingIndex", 628918458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nJnRIRiLZK";
        callMethod(klass, "addClass", argTypes, term7776, args);
    }

};


