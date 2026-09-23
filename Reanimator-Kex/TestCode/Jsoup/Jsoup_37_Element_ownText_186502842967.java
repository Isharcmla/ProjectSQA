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

public class Element_ownText_186502842967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6571;
     Object term6629;

    public Element_ownText_186502842967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6595 = new HashMap();
        Set<Object> term6659 =  ((Map) term6595).keySet();
        HashSet term6594 = new HashSet((Collection<? extends Object>) term6659);
        ArrayList term6600 = new ArrayList();
        ((ArrayList) term6600).add((Object)null);
        LinkedHashMap term6605 = new LinkedHashMap();
        term6571 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6572 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6604 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6572, term6572.getClass(), "tagName", "YSrFKQQwXE");
        setBooleanField(term6572, term6572.getClass(), "isBlock", true);
        setBooleanField(term6572, term6572.getClass(), "formatAsBlock", false);
        setBooleanField(term6572, term6572.getClass(), "canContainBlock", false);
        setBooleanField(term6572, term6572.getClass(), "canContainInline", true);
        setBooleanField(term6572, term6572.getClass(), "empty", false);
        setBooleanField(term6572, term6572.getClass(), "selfClosing", false);
        setBooleanField(term6572, term6572.getClass(), "preserveWhitespace", false);
        setBooleanField(term6572, term6572.getClass(), "formList", false);
        setBooleanField(term6572, term6572.getClass(), "formSubmit", false);
        setField(term6571, term6571.getClass(), "tag", term6572);
        setField(term6571, term6571.getClass(), "classNames", term6594);
        setField(term6571, term6571.getClass(), "parentNode", null);
        setField(term6571, term6571.getClass(), "childNodes", term6600);
        setField(term6604, term6604.getClass(), "attributes", term6605);
        setField(term6571, term6571.getClass(), "attributes", term6604);
        setField(term6571, term6571.getClass(), "baseUri", "EAIAAStlTz");
        setIntField(term6571, term6571.getClass(), "siblingIndex", 2098647989);
        term6629 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6630 = (byte[]) newByteArray(16);
        setField(term6629, term6629.getClass(), "value", term6630);
        setByteField(term6629, term6629.getClass(), "coder", (byte) 47);
        setIntField(term6629, term6629.getClass(), "count", 1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6629;
        callMethod(klass, "ownText", argTypes, term6571, args);
    }

};


