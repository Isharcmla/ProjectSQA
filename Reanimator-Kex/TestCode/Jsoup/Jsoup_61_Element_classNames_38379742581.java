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

public class Element_classNames_38379742581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6604;
     Object term6655;

    public Element_classNames_38379742581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6626 = new ArrayList();
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        ((ArrayList) term6626).add((Object)null);
        LinkedHashMap term6631 = new LinkedHashMap();
        term6604 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6605 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6630 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6605, term6605.getClass(), "tagName", "TKlccZUpjz");
        setBooleanField(term6605, term6605.getClass(), "isBlock", true);
        setBooleanField(term6605, term6605.getClass(), "formatAsBlock", true);
        setBooleanField(term6605, term6605.getClass(), "canContainInline", true);
        setBooleanField(term6605, term6605.getClass(), "empty", true);
        setBooleanField(term6605, term6605.getClass(), "selfClosing", true);
        setBooleanField(term6605, term6605.getClass(), "preserveWhitespace", true);
        setBooleanField(term6605, term6605.getClass(), "formList", true);
        setBooleanField(term6605, term6605.getClass(), "formSubmit", false);
        setField(term6604, term6604.getClass(), "tag", term6605);
        setField(term6604, term6604.getClass(), "parentNode", null);
        setField(term6604, term6604.getClass(), "childNodes", term6626);
        setField(term6630, term6630.getClass(), "attributes", term6631);
        setField(term6604, term6604.getClass(), "attributes", term6630);
        setField(term6604, term6604.getClass(), "baseUri", "YkZtEtthvz");
        setIntField(term6604, term6604.getClass(), "siblingIndex", 1041916673);
        HashMap term6656 = new HashMap();
        Set<Object> term6681 =  ((Map) term6656).keySet();
        term6655 = new HashSet((Collection<? extends Object>) term6681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term6655;
        callMethod(klass, "classNames", argTypes, term6604, args);
    }

};


