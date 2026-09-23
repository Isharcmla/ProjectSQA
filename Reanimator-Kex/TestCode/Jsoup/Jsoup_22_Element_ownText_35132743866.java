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

public class Element_ownText_35132743866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6535;

    public Element_ownText_35132743866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6557 = new HashMap();
        Set<Object> term6601 =  ((Map) term6557).keySet();
        HashSet term6556 = new HashSet((Collection<? extends Object>) term6601);
        ArrayList term6562 = new ArrayList();
        ((ArrayList) term6562).add((Object)null);
        LinkedHashMap term6567 = new LinkedHashMap();
        term6535 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6536 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6566 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6536, term6536.getClass(), "tagName", "YSrFKQQwXE");
        setBooleanField(term6536, term6536.getClass(), "isBlock", false);
        setBooleanField(term6536, term6536.getClass(), "formatAsBlock", false);
        setBooleanField(term6536, term6536.getClass(), "canContainBlock", false);
        setBooleanField(term6536, term6536.getClass(), "canContainInline", false);
        setBooleanField(term6536, term6536.getClass(), "empty", false);
        setBooleanField(term6536, term6536.getClass(), "selfClosing", true);
        setBooleanField(term6536, term6536.getClass(), "preserveWhitespace", false);
        setField(term6535, term6535.getClass(), "tag", term6536);
        setField(term6535, term6535.getClass(), "classNames", term6556);
        setField(term6535, term6535.getClass(), "parentNode", null);
        setField(term6535, term6535.getClass(), "childNodes", term6562);
        setField(term6566, term6566.getClass(), "attributes", term6567);
        setField(term6535, term6535.getClass(), "attributes", term6566);
        setField(term6535, term6535.getClass(), "baseUri", "EAIAAStlTz");
        setIntField(term6535, term6535.getClass(), "siblingIndex", 2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ownText", argTypes, term6535, args);
    }

};


