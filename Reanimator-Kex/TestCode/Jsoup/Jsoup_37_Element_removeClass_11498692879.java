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

public class Element_removeClass_11498692879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7690;

    public Element_removeClass_11498692879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7714 = new HashMap();
        Set<Object> term7773 =  ((Map) term7714).keySet();
        HashSet term7713 = new HashSet((Collection<? extends Object>) term7773);
        ArrayList term7722 = new ArrayList();
        ((ArrayList) term7722).add((Object)null);
        ((ArrayList) term7722).add((Object)null);
        LinkedHashMap term7727 = new LinkedHashMap();
        term7690 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7691 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7726 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7691, term7691.getClass(), "tagName", "ubaBUfLolu");
        setBooleanField(term7691, term7691.getClass(), "isBlock", false);
        setBooleanField(term7691, term7691.getClass(), "formatAsBlock", true);
        setBooleanField(term7691, term7691.getClass(), "canContainBlock", true);
        setBooleanField(term7691, term7691.getClass(), "canContainInline", true);
        setBooleanField(term7691, term7691.getClass(), "empty", false);
        setBooleanField(term7691, term7691.getClass(), "selfClosing", true);
        setBooleanField(term7691, term7691.getClass(), "preserveWhitespace", true);
        setBooleanField(term7691, term7691.getClass(), "formList", true);
        setBooleanField(term7691, term7691.getClass(), "formSubmit", false);
        setField(term7690, term7690.getClass(), "tag", term7691);
        setField(term7690, term7690.getClass(), "classNames", term7713);
        setField(term7690, term7690.getClass(), "parentNode", null);
        setField(term7690, term7690.getClass(), "childNodes", term7722);
        setField(term7726, term7726.getClass(), "attributes", term7727);
        setField(term7690, term7690.getClass(), "attributes", term7726);
        setField(term7690, term7690.getClass(), "baseUri", "pMfTuAFXxg");
        setIntField(term7690, term7690.getClass(), "siblingIndex", -2014576105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XCZmhkblRc";
        callMethod(klass, "removeClass", argTypes, term7690, args);
    }

};


