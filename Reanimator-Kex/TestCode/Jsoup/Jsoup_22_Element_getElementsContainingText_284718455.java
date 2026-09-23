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

public class Element_getElementsContainingText_284718455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5372;

    public Element_getElementsContainingText_284718455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5394 = new HashMap();
        Set<Object> term5457 =  ((Map) term5394).keySet();
        HashSet term5393 = new HashSet((Collection<? extends Object>) term5457);
        ArrayList term5406 = new ArrayList();
        ((ArrayList) term5406).add((Object)null);
        ((ArrayList) term5406).add((Object)null);
        ((ArrayList) term5406).add((Object)null);
        ((ArrayList) term5406).add((Object)null);
        LinkedHashMap term5411 = new LinkedHashMap();
        term5372 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5410 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5373, term5373.getClass(), "tagName", "lbmSGBwIiV");
        setBooleanField(term5373, term5373.getClass(), "isBlock", false);
        setBooleanField(term5373, term5373.getClass(), "formatAsBlock", false);
        setBooleanField(term5373, term5373.getClass(), "canContainBlock", true);
        setBooleanField(term5373, term5373.getClass(), "canContainInline", true);
        setBooleanField(term5373, term5373.getClass(), "empty", false);
        setBooleanField(term5373, term5373.getClass(), "selfClosing", false);
        setBooleanField(term5373, term5373.getClass(), "preserveWhitespace", false);
        setField(term5372, term5372.getClass(), "tag", term5373);
        setField(term5372, term5372.getClass(), "classNames", term5393);
        setField(term5372, term5372.getClass(), "parentNode", null);
        setField(term5372, term5372.getClass(), "childNodes", term5406);
        setField(term5410, term5410.getClass(), "attributes", term5411);
        setField(term5372, term5372.getClass(), "attributes", term5410);
        setField(term5372, term5372.getClass(), "baseUri", "ONcbPCQnHd");
        setIntField(term5372, term5372.getClass(), "siblingIndex", -478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AobDaplFLl";
        callMethod(klass, "getElementsContainingText", argTypes, term5372, args);
    }

};


