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

public class Element_classNames_38379742577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7513;
     Object term7586;

    public Element_classNames_38379742577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7535 = new HashMap();
        Set<Object> term7602 =  ((Map) term7535).keySet();
        HashSet term7534 = new HashSet((Collection<? extends Object>) term7602);
        ArrayList term7557 = new ArrayList();
        ((ArrayList) term7557).add((Object)null);
        ((ArrayList) term7557).add((Object)null);
        ((ArrayList) term7557).add((Object)null);
        ((ArrayList) term7557).add((Object)null);
        ((ArrayList) term7557).add((Object)null);
        ((ArrayList) term7557).add((Object)null);
        LinkedHashMap term7562 = new LinkedHashMap();
        term7513 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7561 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7514, term7514.getClass(), "tagName", "mrMGwoRgVY");
        setBooleanField(term7514, term7514.getClass(), "isBlock", true);
        setBooleanField(term7514, term7514.getClass(), "formatAsBlock", false);
        setBooleanField(term7514, term7514.getClass(), "canContainBlock", false);
        setBooleanField(term7514, term7514.getClass(), "canContainInline", false);
        setBooleanField(term7514, term7514.getClass(), "empty", false);
        setBooleanField(term7514, term7514.getClass(), "selfClosing", true);
        setBooleanField(term7514, term7514.getClass(), "preserveWhitespace", false);
        setField(term7513, term7513.getClass(), "tag", term7514);
        setField(term7513, term7513.getClass(), "classNames", term7534);
        setField(term7513, term7513.getClass(), "parentNode", null);
        setField(term7513, term7513.getClass(), "childNodes", term7557);
        setField(term7561, term7561.getClass(), "attributes", term7562);
        setField(term7513, term7513.getClass(), "attributes", term7561);
        setField(term7513, term7513.getClass(), "baseUri", "ubaBUfLolu");
        setIntField(term7513, term7513.getClass(), "siblingIndex", 1296895584);
        HashMap term7587 = new HashMap();
        Set<Object> term7613 =  ((Map) term7587).keySet();
        term7586 = new HashSet((Collection<? extends Object>) term7613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7586;
        callMethod(klass, "classNames", argTypes, term7513, args);
    }

};


