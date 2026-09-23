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

public class Element_hasClass_65056046977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7666;

    public Element_hasClass_65056046977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7688 = new HashMap();
        Set<Object> term7755 =  ((Map) term7688).keySet();
        HashSet term7687 = new HashSet((Collection<? extends Object>) term7755);
        ArrayList term7704 = new ArrayList();
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        ((ArrayList) term7704).add((Object)null);
        LinkedHashMap term7709 = new LinkedHashMap();
        term7666 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7667 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7708 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7667, term7667.getClass(), "tagName", "itAUCFhZhq");
        setBooleanField(term7667, term7667.getClass(), "isBlock", false);
        setBooleanField(term7667, term7667.getClass(), "formatAsBlock", true);
        setBooleanField(term7667, term7667.getClass(), "canContainBlock", true);
        setBooleanField(term7667, term7667.getClass(), "canContainInline", false);
        setBooleanField(term7667, term7667.getClass(), "empty", false);
        setBooleanField(term7667, term7667.getClass(), "selfClosing", true);
        setBooleanField(term7667, term7667.getClass(), "preserveWhitespace", true);
        setField(term7666, term7666.getClass(), "tag", term7667);
        setField(term7666, term7666.getClass(), "classNames", term7687);
        setField(term7666, term7666.getClass(), "parentNode", null);
        setField(term7666, term7666.getClass(), "childNodes", term7704);
        setField(term7708, term7708.getClass(), "attributes", term7709);
        setField(term7666, term7666.getClass(), "attributes", term7708);
        setField(term7666, term7666.getClass(), "baseUri", "CRAUqtVBkU");
        setIntField(term7666, term7666.getClass(), "siblingIndex", 1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DddqUYfomL";
        callMethod(klass, "hasClass", argTypes, term7666, args);
    }

};


