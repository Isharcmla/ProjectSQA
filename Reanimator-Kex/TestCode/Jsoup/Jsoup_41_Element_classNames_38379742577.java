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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Element_classNames_38379742577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6417;
     Object term6469;

    public Element_classNames_38379742577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6440 = new ArrayList();
        LinkedHashMap term6445 = new LinkedHashMap();
        term6417 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6418 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6444 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6418, term6418.getClass(), "tagName", "uXYcXVYJZM");
        setBooleanField(term6418, term6418.getClass(), "isBlock", false);
        setBooleanField(term6418, term6418.getClass(), "formatAsBlock", false);
        setBooleanField(term6418, term6418.getClass(), "canContainBlock", false);
        setBooleanField(term6418, term6418.getClass(), "canContainInline", false);
        setBooleanField(term6418, term6418.getClass(), "empty", false);
        setBooleanField(term6418, term6418.getClass(), "selfClosing", false);
        setBooleanField(term6418, term6418.getClass(), "preserveWhitespace", false);
        setBooleanField(term6418, term6418.getClass(), "formList", true);
        setBooleanField(term6418, term6418.getClass(), "formSubmit", true);
        setField(term6417, term6417.getClass(), "tag", term6418);
        setField(term6417, term6417.getClass(), "parentNode", null);
        setField(term6417, term6417.getClass(), "childNodes", term6440);
        setField(term6444, term6444.getClass(), "attributes", term6445);
        setField(term6417, term6417.getClass(), "attributes", term6444);
        setField(term6417, term6417.getClass(), "baseUri", "UimMMORkzd");
        setIntField(term6417, term6417.getClass(), "siblingIndex", -227365013);
        HashMap term6470 = new HashMap();
        Set<Object> term6495 =  ((Map) term6470).keySet();
        term6469 = new HashSet((Collection<? extends Object>) term6495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term6469;
        callMethod(klass, "classNames", argTypes, term6417, args);
    }

};


