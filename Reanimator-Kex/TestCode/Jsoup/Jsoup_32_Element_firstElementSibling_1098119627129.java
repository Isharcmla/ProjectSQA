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

public class Element_firstElementSibling_1098119627129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3174;

    public Element_firstElementSibling_1098119627129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3196 = new HashMap();
        Set<Object> term20522 =  ((Map) term3196).keySet();
        HashSet term3195 = new HashSet((Collection<? extends Object>) term20522);
        ArrayList term3210 = new ArrayList();
        ((ArrayList) term3210).add((Object)null);
        LinkedHashMap term3215 = new LinkedHashMap();
        term3174 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3175 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3214 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3175, term3175.getClass(), "tagName", "dAldIGYAXV");
        setBooleanField(term3175, term3175.getClass(), "isBlock", false);
        setBooleanField(term3175, term3175.getClass(), "formatAsBlock", false);
        setBooleanField(term3175, term3175.getClass(), "canContainBlock", true);
        setBooleanField(term3175, term3175.getClass(), "canContainInline", true);
        setBooleanField(term3175, term3175.getClass(), "empty", true);
        setBooleanField(term3175, term3175.getClass(), "selfClosing", false);
        setBooleanField(term3175, term3175.getClass(), "preserveWhitespace", true);
        setField(term3174, term3174.getClass(), "tag", term3175);
        setField(term3174, term3174.getClass(), "classNames", term3195);
        setField(term3174, term3174.getClass(), "parentNode", null);
        setField(term3174, term3174.getClass(), "childNodes", term3210);
        setField(term3214, term3214.getClass(), "attributes", term3215);
        setField(term3174, term3174.getClass(), "attributes", term3214);
        setField(term3174, term3174.getClass(), "baseUri", "GNEmuHPNcU");
        setIntField(term3174, term3174.getClass(), "siblingIndex", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "firstElementSibling", argTypes, term3174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


