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

public class Element_getElementsMatchingOwnText_210255518563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6181;

    public Element_getElementsMatchingOwnText_210255518563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6205 = new HashMap();
        Set<Object> term6276 =  ((Map) term6205).keySet();
        HashSet term6204 = new HashSet((Collection<? extends Object>) term6276);
        ArrayList term6225 = new ArrayList();
        ((ArrayList) term6225).add((Object)null);
        ((ArrayList) term6225).add((Object)null);
        LinkedHashMap term6230 = new LinkedHashMap();
        term6181 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6182 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6229 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6182, term6182.getClass(), "tagName", "IkfarsYNJO");
        setBooleanField(term6182, term6182.getClass(), "isBlock", true);
        setBooleanField(term6182, term6182.getClass(), "formatAsBlock", true);
        setBooleanField(term6182, term6182.getClass(), "canContainBlock", false);
        setBooleanField(term6182, term6182.getClass(), "canContainInline", false);
        setBooleanField(term6182, term6182.getClass(), "empty", false);
        setBooleanField(term6182, term6182.getClass(), "selfClosing", false);
        setBooleanField(term6182, term6182.getClass(), "preserveWhitespace", false);
        setBooleanField(term6182, term6182.getClass(), "formList", false);
        setBooleanField(term6182, term6182.getClass(), "formSubmit", true);
        setField(term6181, term6181.getClass(), "tag", term6182);
        setField(term6181, term6181.getClass(), "classNames", term6204);
        setField(term6181, term6181.getClass(), "parentNode", null);
        setField(term6181, term6181.getClass(), "childNodes", term6225);
        setField(term6229, term6229.getClass(), "attributes", term6230);
        setField(term6181, term6181.getClass(), "attributes", term6229);
        setField(term6181, term6181.getClass(), "baseUri", "rQjxAhisjm");
        setIntField(term6181, term6181.getClass(), "siblingIndex", -1697741339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZDhASPHjDG";
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term6181, args);
    }

};


