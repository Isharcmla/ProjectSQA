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

public class Element_classNames_77861729275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7280;

    public Element_classNames_77861729275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7304 = new HashMap();
        Set<Object> term7361 =  ((Map) term7304).keySet();
        HashSet term7303 = new HashSet((Collection<? extends Object>) term7361);
        ArrayList term7322 = new ArrayList();
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        ((ArrayList) term7322).add((Object)null);
        LinkedHashMap term7327 = new LinkedHashMap();
        term7280 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7281 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7326 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7281, term7281.getClass(), "tagName", "IbxeAMwLVt");
        setBooleanField(term7281, term7281.getClass(), "isBlock", false);
        setBooleanField(term7281, term7281.getClass(), "formatAsBlock", true);
        setBooleanField(term7281, term7281.getClass(), "canContainBlock", true);
        setBooleanField(term7281, term7281.getClass(), "canContainInline", false);
        setBooleanField(term7281, term7281.getClass(), "empty", true);
        setBooleanField(term7281, term7281.getClass(), "selfClosing", true);
        setBooleanField(term7281, term7281.getClass(), "preserveWhitespace", false);
        setBooleanField(term7281, term7281.getClass(), "formList", false);
        setBooleanField(term7281, term7281.getClass(), "formSubmit", true);
        setField(term7280, term7280.getClass(), "tag", term7281);
        setField(term7280, term7280.getClass(), "classNames", term7303);
        setField(term7280, term7280.getClass(), "parentNode", null);
        setField(term7280, term7280.getClass(), "childNodes", term7322);
        setField(term7326, term7326.getClass(), "attributes", term7327);
        setField(term7280, term7280.getClass(), "attributes", term7326);
        setField(term7280, term7280.getClass(), "baseUri", "PNzNzzjSXM");
        setIntField(term7280, term7280.getClass(), "siblingIndex", -461771056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term7280, args);
    }

};


